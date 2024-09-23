plugins {
    kotlin("jvm") version "2.0.0"
}

group = "package.cxx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-core:3.0.0-beta-2")
    implementation("io.ktor:ktor-server-cio:3.0.0-beta-2")
    implementation("io.ktor:ktor-server-html-builder:3.0.0-beta-2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:2.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.9.1")
    implementation("io.ktor:ktor-serialization-jvm:2.3.9")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-css:1.0.0-pre.790")
    implementation("io.ktor:ktor-server-core:3.0.0-beta-2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}