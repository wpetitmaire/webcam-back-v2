package org.wpm.webcamback.capture.infrastructure.output.exceptions;

public class CaptureNotFoundException extends RuntimeException {
    public CaptureNotFoundException(String capturePath) {
        super("Capture not found : " + capturePath);
    }
}
