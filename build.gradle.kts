import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.sino"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.4.0")
    implementation("org.jetbrains.kotlin:kotlin-scripting-common:1.4.0")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm:1.4.0")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host:1.4.0")
    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}