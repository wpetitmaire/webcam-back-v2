package org.wpm.webcamback.capture.domain.service;

import org.wpm.webcamback.capture.domain.exception.CaptureException;

public interface CaptureService {
    String takeANewCapture() throws CaptureException;
}
