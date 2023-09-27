package org.wpm.webcamback.infrastructure.capture.exception;

public class CaptureNotFoundException extends RuntimeException {
    public CaptureNotFoundException(String capturePath) {
        super("Capture not found : " + capturePath);
    }
}
