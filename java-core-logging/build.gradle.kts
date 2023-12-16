plugins {
    java
    application
}

val customLogSysProp = "-Djava.util.logging.config.file=custom-logging.properties"

tasks {
    startScripts {
        defaultJvmOpts = listOf(customLogSysProp)
    }

    run.invoke {
        jvmArgs = listOf(customLogSysProp)
    }
}

application {
    mainClass.set("dgroomes.loggingplayground.javacorelogging.Main")
}
