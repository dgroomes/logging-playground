val slf4jVersion = "1.7.30" // releases: http://www.slf4j.org/news.html
val logbackVersion = "1.2.3" // releases: http://logback.qos.ch/download.html
val junitJupiterVersion = "5.6.2" // releases: https://junit.org/junit5/docs/current/release-notes/index.html

subprojects {
    apply(plugin = "java")
    apply(plugin = "application")
    repositories {
        mavenCentral()
    }

    dependencies {
        "implementation"("org.slf4j:slf4j-api:$slf4jVersion")

        "testImplementation"("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    }

    tasks {
        withType(Test::class.java) {
            useJUnitPlatform()

            testLogging {
                showStandardStreams = true
                exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            }
        }
    }
}

project(":slf4j-simple") {
    configure<ApplicationPluginConvention> {
        mainClassName = "dgroomes.loggingplayground.slf4jsimple.Main"
    }

    dependencies {
        "implementation"("org.slf4j:slf4j-simple:$slf4jVersion")
    }
}

project(":logback-filters") {
    configure<ApplicationPluginConvention> {
        mainClassName = "dgroomes.loggingplayground.logbackfilters.Main"
    }

    dependencies {
        "implementation"("ch.qos.logback:logback-classic:$logbackVersion")
    }
}
