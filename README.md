# i2i Academy — Spring Boot

A small REST web service built as the **i2i Academy** Spring Boot assignment. It
demonstrates how to bootstrap a professional Java application with Spring Boot,
organize it into clear layers (controller / service / model), expose REST
endpoints, and cover them with automated tests.

## Tech stack

| | |
|---|---|
| Language | Java 11 |
| Framework | Spring Boot 2.7.18 |
| Build tool | Apache Maven |
| Server | Embedded Tomcat (port `8080`) |
| Testing | JUnit 5, Spring MVC Test, AssertJ |

## Project structure

```
src/
├── main/
│   ├── java/com/i2i/academy/springboot/
│   │   ├── SpringBootAcademyApplication.java   # Application entry point
│   │   ├── controller/
│   │   │   ├── WelcomeController.java           # "/" and "/hello" plain-text endpoints
│   │   │   └── GreetingController.java          # "/api/greeting" JSON endpoint
│   │   ├── service/
│   │   │   └── GreetingService.java             # Business logic for greetings
│   │   └── model/
│   │       └── Greeting.java                    # Response payload
│   └── resources/
│       └── application.properties               # App & server configuration
└── test/
    └── java/com/i2i/academy/springboot/         # Unit & web-layer tests
```

## Endpoints

| Method | Path | Description | Example response |
|--------|------|-------------|------------------|
| `GET` | `/` | Welcome banner | `Welcome to i2i Academy!` |
| `GET` | `/hello` | Health-style greeting | `Hello, World! The i2i Academy Spring Boot service is up and running.` |
| `GET` | `/api/greeting?name=Ada` | Personalised JSON greeting | `{ "id": 1, "content": "Welcome to i2i Academy, Ada!", "timestamp": "..." }` |
| `GET` | `/actuator/health` | Service health check | `{ "status": "UP", ... }` |

## Running locally

Requirements: **JDK 11+** and **Maven 3.6+**.

```bash
# Run the application
mvn spring-boot:run

# The service starts on http://localhost:8080
curl http://localhost:8080/
curl "http://localhost:8080/api/greeting?name=Nuh"
```

Build an executable jar:

```bash
mvn clean package
java -jar target/springboot-1.0.0.jar
```

## Running the tests

```bash
mvn test
```

## Notes

- Uses Spring Boot 2.7.x because the target runtime ships with **Java 11**
  (Spring Boot 3.x requires Java 17+).
- Configuration lives in `src/main/resources/application.properties`.
- This repository contains **only source code and configuration**, in line with
  the assignment's portfolio guidelines.
