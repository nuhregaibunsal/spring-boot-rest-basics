package com.i2i.academy.springboot.controller;

import com.i2i.academy.springboot.model.Greeting;
import com.i2i.academy.springboot.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * JSON greeting API backed by {@link GreetingService}.
 *
 * <p>Example: {@code GET /api/greeting?name=Ada} returns a JSON document with a
 * unique id, the greeting content, and a timestamp.
 */
@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/api/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "Guest") String name) {
        return greetingService.greet(name);
    }
}
