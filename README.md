# Demo Spring Boot Application

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-green.svg)
![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3.8.5-yellow.svg)

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [License](#license)

## Overview

The **Demo Spring Boot Application** is a starter project built with [Spring Boot](https://spring.io/projects/spring-boot) 3.4.1. It leverages [Thymeleaf](https://www.thymeleaf.org/) for server-side rendering of HTML templates and includes essential dependencies for web development and testing.

This project serves as a foundation for building robust and scalable web applications, providing a structured setup with commonly used components.

## Features

- **Spring Boot 3.4.1**: Streamlines the development of production-ready applications.
- **Thymeleaf Integration**: Facilitates dynamic HTML generation with server-side templating.
- **Spring Web**: Enables building RESTful web services and MVC web applications.
- **Spring Boot DevTools**: Enhances the development experience with features like automatic restarts.
- **Logging with Logback**: Configured for efficient logging management.
- **Testing Support**: Includes dependencies for writing and executing tests.

## Prerequisites

Before setting up the project, ensure you have the following installed on your machine:

- **Java Development Kit (JDK) 17**: [Download JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Apache Maven**: [Install Maven](https://maven.apache.org/install.html)

You can verify the installations by running:

```bash
java -version
mvn -version
```

## Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/template-springboot-starter.git
   cd template-springboot-starter
   ```

2. **Build the Project**

   Use Maven to compile the project and resolve dependencies.

   ```bash
   mvn clean install
   ```

   This command will generate the necessary `.jar` files and compile the source code.

## Running the Application

You can run the application using Maven or the generated `.jar` file.

### Using Maven

```bash
mvn spring-boot:run
```

### Using the Executable JAR

After building the project, navigate to the `target` directory and run the JAR file.

```bash
java -jar target/Demo-0.0.1-SNAPSHOT.jar
```

The application will start on [http://localhost:8080](http://localhost:8080) by default.

## Testing

The project includes a sample test class located at `src/test/java/com/example/demo/InternshipApplicationTests.java`.

To execute the tests, run:

```bash
mvn test
```

Test reports will be available in the `target/surefire-reports` directory.

## Project Structure

```
template-springboot-starter/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/example/demo
│   │   │       ├── controller
│   │   │       │   └── LoginController.java
│   │   │       ├── dao
│   │   │       ├── DemoApplication.java
│   │   │       ├── entity
│   │   │       └── model
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   ├── logback-spring.xml
│   │   │   ├── static
│   │   │   │   ├── css
│   │   │   │   ├── images
│   │   │   │   ├── js
│   │   │   │   └── plugins
│   │   │   └── templates
│   │   └── webapp
│   │       └── Login.html
│   └── test
│       └── java
│           └── com/example/demo
│               └── InternshipApplicationTests.java
└── target
    ├── classes
    ├── Demo-0.0.1-SNAPSHOT.jar
    └── ... (other build directories and files)
```

- **`src/main/java`**: Contains the main application source code.
- **`src/main/resources`**: Holds configuration files, static assets, and templates.
- **`src/test/java`**: Includes test classes.
- **`target`**: Generated after building the project, contains compiled classes and packaged applications.

## Configuration

### application.properties

Located at `src/main/resources/application.properties`, this file contains application-specific configurations. You can customize settings such as server port, database connections, and more.

### logback-spring.xml

Located at `src/main/resources/logback-spring.xml`, this file configures Logback for logging purposes. You can define log levels, appenders, and log formats here.

## License

This project is licensed under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).