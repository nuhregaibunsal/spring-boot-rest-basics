package com.i2i.academy.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Serves the landing endpoints of the service.
 *
 * <p>These plain-text endpoints satisfy the assignment requirement of a simple
 * "Welcome to i2i Academy" controller reachable at {@code http://localhost:8080}.
 */
@RestController
public class WelcomeController {

    /**
     * Root endpoint. Returns a friendly welcome banner.
     *
     * @return the welcome message
     */
    @GetMapping("/")
    public String home() {
        return "Welcome to i2i Academy!";
    }

    /**
     * Classic health-style greeting used to confirm the app is running.
     *
     * @return a short hello message
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! The i2i Academy Spring Boot service is up and running.";
    }
}
