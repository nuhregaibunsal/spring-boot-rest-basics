package com.i2i.academy.springboot.service;

import com.i2i.academy.springboot.model.Greeting;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Builds personalised {@link Greeting} objects.
 *
 * <p>Keeps a simple in-memory counter so each greeting carries a unique id,
 * demonstrating a stateful Spring-managed singleton bean.
 */
@Service
public class GreetingService {

    private static final String TEMPLATE = "Welcome to i2i Academy, %s!";

    private final AtomicLong counter = new AtomicLong();

    /**
     * Produce a greeting for the given name.
     *
     * @param name the recipient's name; blank values fall back to "Guest"
     * @return a freshly built greeting
     */
    public Greeting greet(String name) {
        String recipient = (name == null || name.isBlank()) ? "Guest" : name.strip();
        String content = String.format(TEMPLATE, recipient);
        return new Greeting(counter.incrementAndGet(), content, Instant.now());
    }
}
