plugins {
    kotlin("multiplatform") version "1.5.31" apply false
    id("org.jetbrains.compose") version "1.0.0-beta5" apply false
}

// Fix webpack error
rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin::class.java) {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().versions.webpackCli.version = "4.9.0"
}