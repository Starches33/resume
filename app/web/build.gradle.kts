plugins {
    id("ctag-monolith-web")
}

dependencies {
    implementation(project(":app:domain"))

    implementation(Dependencies.SPRING_BOOT_THYMELEAF)
}
