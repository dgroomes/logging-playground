plugins {
    java
    application
}

tasks {
    startScripts {
        defaultJvmOpts = listOf("-Djava.util.logging.config.file=custom-logging.properties")
    }
}

application {
    mainClass.set("dgroomes.java_core_logging.Main")
}
