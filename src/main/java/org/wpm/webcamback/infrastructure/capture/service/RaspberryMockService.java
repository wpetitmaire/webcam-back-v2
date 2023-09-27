package org.wpm.webcamback.infrastructure.capture.service;

import org.springframework.beans.factory.annotation.Value;
import org.wpm.webcamback.domain.capture.service.RaspberryService;
import org.wpm.webcamback.infrastructure.capture.exception.RaspberryException;

public class RaspberryMockService implements RaspberryService {

    private static final String LAST_CAPTURE_FILE_NAME = "lastCapture.jpg";

    @Value("${raspberry.photo.location}")
    private String capturesLocation;

    @Override
    public String takeCapture() throws RaspberryException {
        return capturesLocation + LAST_CAPTURE_FILE_NAME;
    }
}
