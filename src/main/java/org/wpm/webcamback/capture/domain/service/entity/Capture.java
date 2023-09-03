package org.wpm.webcamback.capture.domain.service.entity;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public record Capture(String path, LocalDateTime creationTime, String name) {

    public Capture(String path, String filename) {
        this(path, now(), filename);
    }


}
