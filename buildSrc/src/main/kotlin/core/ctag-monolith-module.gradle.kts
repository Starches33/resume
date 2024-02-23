plugins {
    id("ctag-monolith")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}

tasks.withType<Test> {
    testLogging.events("PASSED", "SKIPPED", "FAILED")

    useJUnitPlatform()
}

dependencies {

//    implementation(Dependencies.SPRING_BOOT_WEB)

    implementation(Dependencies.COMMONS_COLLECTIONS)
    implementation(Dependencies.COMMONS_LANG)

    compileOnly(Dependencies.LOMBOK)
    annotationProcessor(Dependencies.LOMBOK)

    implementation(Dependencies.MAP_STRUCT)
    annotationProcessor(Dependencies.MAP_STRUCT_PROC)
    implementation(Dependencies.LOMBOK_MAP)

    testImplementation(Dependencies.SPRING_BOOT_TEST)
}