plugins {
    java
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

val customLogSysProp = "-Djava.util.logging.config.file=custom-logging.properties"

tasks {
    named<CreateStartScripts>("startScripts") {
        defaultJvmOpts = listOf(customLogSysProp)
    }

    named<JavaExec>("run") {
        jvmArgs = listOf(customLogSysProp)
    }
}

application {
    mainClass.set("dgroomes.loggingplayground.javacorelogging.Main")
}
