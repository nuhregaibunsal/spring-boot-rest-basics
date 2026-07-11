package com.i2i.academy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the i2i Academy Spring Boot assignment.
 *
 * <p>Bootstraps the embedded Tomcat server and the Spring application context.
 * Once started, the web service is available at {@code http://localhost:8080}.
 */
@SpringBootApplication
public class SpringBootAcademyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAcademyApplication.class, args);
    }
}
