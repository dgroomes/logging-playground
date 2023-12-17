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

val logbackSystemProp = "-Dlogback.configurationFile=logback.xml"

tasks {
    startScripts {
        defaultJvmOpts = listOf(logbackSystemProp)
    }

    run.invoke {
        jvmArgs = listOf(logbackSystemProp)
    }
}

application {
    mainClass.set("dgroomes.loggingplayground.logbackfilters.Main")
}
