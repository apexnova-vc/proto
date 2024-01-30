plugins {
    `java-library`
    `maven-publish`
}

group = "com.apexnova"
version = findProperty("version")

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/apexnova-vc/proto")
            credentials {
                username = findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
                password = findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
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