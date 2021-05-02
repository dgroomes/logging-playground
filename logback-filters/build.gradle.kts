plugins {
    java
    application
}

val slf4jVersion = "1.7.30" // releases: http://www.slf4j.org/news.html
val logbackVersion = "1.2.3" // releases: http://logback.qos.ch/download.html
val junitJupiterVersion = "5.6.2" // releases: https://junit.org/junit5/docs/current/release-notes/index.html

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
}

tasks {
    withType(Test::class.java) {
        useJUnitPlatform()

        testLogging {
            showStandardStreams = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }



    withType(Test::class.java) {
        jvmArgs = listOf("-Dlogback.configurationFile=logback.xml")
        useJUnitPlatform()
    }

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
