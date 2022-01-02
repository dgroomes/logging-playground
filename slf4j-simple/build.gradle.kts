plugins {
    java
    application
}

val slf4jVersion = "1.7.32" // SLF4J releases: http://www.slf4j.org/news.html

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("org.slf4j:slf4j-simple:$slf4jVersion")
}

application {
    mainClass.set("dgroomes.loggingplayground.slf4jsimple.Main")
}
