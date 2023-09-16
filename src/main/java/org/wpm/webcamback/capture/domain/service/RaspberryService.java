package org.wpm.webcamback.capture.domain.service;

import org.wpm.webcamback.capture.infrastructure.exception.RaspberryException;

public interface RaspberryService {
    String takeCapture() throws RaspberryException;
}
