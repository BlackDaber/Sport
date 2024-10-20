plugins {
    java
    id ("org.springframework.boot") version "3.3.0"
    id ("io.spring.dependency-management") version "1.1.0"
}

group = "gg.blackdaber"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // ----- spring -----
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    // ----- database -----
    implementation("org.postgresql:postgresql:42.6.0")
    // TODO: add spring security dependency

    // ----- other -----
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    // ----- tests -----
    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
}

tasks {
    jar {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE

        from(configurations.runtimeClasspath.get().map {
            if (it.isDirectory) it else zipTree(it)
        })

        enabled = true
    }

    bootJar {
        enabled = false
    }

    withType(JavaCompile::class) {
        options.compilerArgs.add("--enable-preview")
        options.encoding = "UTF-8"
    }

    test {
        useJUnitPlatform()
        jvmArgs("--enable-preview")
    }
}