package com.i2i.academy.springboot.model;

import java.time.Instant;

/**
 * Immutable response payload returned by the greeting API.
 *
 * @param id        monotonically increasing identifier for the greeting
 * @param content   the rendered greeting text
 * @param timestamp the moment the greeting was produced
 */
public class Greeting {

    private final long id;
    private final String content;
    private final Instant timestamp;

    public Greeting(long id, String content, Instant timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
