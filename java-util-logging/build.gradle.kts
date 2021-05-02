plugins {
    java
    application
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
    mainClass.set("dgroomes.loggingplayground.javautillogging.Main")
}
