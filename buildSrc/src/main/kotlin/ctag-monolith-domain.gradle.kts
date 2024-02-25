plugins {
    id("ctag-monolith-module")
}

dependencies {
    implementation(Dependencies.SPRING_BOOT_JPA)

    implementation(Dependencies.COMMONS_COLLECTIONS)
    implementation(Dependencies.COMMONS_LANG)

    implementation(Dependencies.LIQUIBASE)
    runtimeOnly(Dependencies.POSTGRESQL)

    testImplementation(Dependencies.SPRING_BOOT_TEST)
}
