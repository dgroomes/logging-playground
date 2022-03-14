plugins {
    java
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

val slf4jVersion = "1.7.36" // SLF4J releases: http://www.slf4j.org/news.html
val logbackVersion = "1.2.11" // Logback releases: http://logback.qos.ch/download.html

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
}

tasks {
    named<CreateStartScripts>("startScripts") {
        defaultJvmOpts = listOf("-Dlogback.configurationFile=logback.xml")
    }

    named<JavaExec>("run") {
        jvmArgs = listOf("-Dlogback.configurationFile=logback.xml")
    }
}

application {
    mainClass.set("dgroomes.loggingplayground.logbackfilters.Main")
}
