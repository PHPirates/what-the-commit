plugins {
    // Java support
    id("java")
    // Kotlin support
//    id("org.jetbrains.kotlin.jvm") version "1.7.10"
    // Gradle IntelliJ Plugin
    id("org.jetbrains.intellij") version "1.9.0"
}

group = "com.eclectide.intellij"
version = "1.3"

// Configure project's dependencies
repositories {
    mavenCentral()
}

// Set the JVM language level used to compile sources and generate files - Java 11 is required since 2020.3
//kotlin {
//    jvmToolchain {
//        languageVersion.set(JavaLanguageVersion.of(11))
//    }
//}

intellij {
    updateSinceUntilBuild.set(false)
    sameSinceUntilBuild.set(true)
    version.set("2022.2")
}