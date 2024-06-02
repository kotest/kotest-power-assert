import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
  kotlin("jvm") version "2.0.0"
//  kotlin("multiplatform") version "2.0.0"
  kotlin("plugin.power-assert") version "2.0.0"
}

repositories {
  mavenCentral()
  mavenLocal()
  maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
  implementation(kotlin("test-junit"))
  implementation("io.kotest:kotest-assertions-core-jvm:5.9.0")
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
powerAssert {
  functions = listOf("io.kotest.powerassert.shouldBe")
}