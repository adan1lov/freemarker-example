pluginManagement {
    plugins {
        val kotlinJvmVersion: String by settings
        val dependencyManagementVersion: String by settings
        val springBootVersion: String by settings
        kotlin("jvm") version kotlinJvmVersion
        kotlin("plugin.spring") version kotlinJvmVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
        id("org.springframework.boot") version springBootVersion
    }
}

include("app")
