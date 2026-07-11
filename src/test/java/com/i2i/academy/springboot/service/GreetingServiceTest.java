package com.i2i.academy.springboot.service;

import com.i2i.academy.springboot.model.Greeting;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link GreetingService}.
 */
class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void greetsNamedRecipient() {
        Greeting greeting = service.greet("Ada");
        assertThat(greeting.getContent()).isEqualTo("Welcome to i2i Academy, Ada!");
        assertThat(greeting.getId()).isPositive();
        assertThat(greeting.getTimestamp()).isNotNull();
    }

    @Test
    void fallsBackToGuestForBlankName() {
        Greeting greeting = service.greet("   ");
        assertThat(greeting.getContent()).isEqualTo("Welcome to i2i Academy, Guest!");
    }

    @Test
    void assignsUniqueIncrementingIds() {
        long first = service.greet("A").getId();
        long second = service.greet("B").getId();
        assertThat(second).isGreaterThan(first);
    }
}
