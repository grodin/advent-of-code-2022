import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.7.21"
  application
}

group = "com.omricat"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

application {
  mainClass.set("com.omricat.adventofcode.y2022.util.Runner")
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
