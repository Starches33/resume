FROM gradle:8.5-jdk21 as build-stage
WORKDIR /build
COPY . /build
RUN gradle build
RUN ls -lah . app/build/libs


FROM eclipse-temurin:21-jre-alpine AS build-release-stage

EXPOSE 8080

WORKDIR /

COPY --from=build-stage /build/app/build/libs/app.jar /app

ENTRYPOINT [ "java", "-jar", "/app" ]