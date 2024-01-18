plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.protobuf) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ktlint) apply false
    `java-library`
    `maven-publish`
}

group = "com.apexnova"

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/apexnova-vc/proto")
            credentials {
                username = "dongming-shen"
                password = "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"
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
                groupId = "com.apexnova"
                artifactId = "protos"
                version = "0.0.1"
        }
    }
}

// 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

// todo: maybe use variants / configurations to do both stub & stub-lite here

// Note: We use the java-library plugin to get the protos into the artifact for this subproject
// because there doesn't seem to be an better way.

java {
    sourceSets.getByName("main").resources.srcDir("src/main/proto")
}
