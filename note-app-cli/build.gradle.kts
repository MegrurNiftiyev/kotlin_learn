plugins {
    kotlin("jvm") version "2.3.21"
    kotlin("plugin.serialization") version "2.1.0"
}

group = "com.megrur.niftiyev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}