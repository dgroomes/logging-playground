plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.slf4j.api)
    implementation(libs.logback.classic)
}

tasks {
    startScripts {
        defaultJvmOpts = listOf("-Dlogback.configurationFile=logback.xml")
    }
}

application {
    mainClass.set("dgroomes.logback_filters.Main")
}
