package org.wpm.webcamback.domain.capture.service;

import org.wpm.webcamback.infrastructure.capture.exception.RaspberryException;

public interface RaspberryService {
    String takeCapture() throws RaspberryException;
}
