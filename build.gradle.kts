plugins {
    `java-library`
    `maven-publish`
}

group = "com.apexnova"
version = findProperty("version") as String ?? "0.0.1"

// Only publish from github action
publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/apexnova-vc/proto")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}

java {
    sourceSets.getByName("main").resources.srcDir("src/main/proto")
    withJavadocJar()
    withSourcesJar()
}