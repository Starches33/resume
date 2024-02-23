plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.5.31"
}

dependencies {
    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin:3.2.1")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.1.4")
    implementation(kotlin("stdlib"))
}
repositories {
    mavenCentral()
}