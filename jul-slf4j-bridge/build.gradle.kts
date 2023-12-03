plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.slf4j.api)
    implementation(libs.slf4j.simple)
    implementation(libs.slf4j.jul)
}

application {
    mainClass.set("dgroomes.jul_slf4j_bridge.Main")
}
