package org.wpm.webcamback.domain.capture.service;

import org.wpm.webcamback.domain.capture.entity.Capture;
import org.wpm.webcamback.domain.capture.exception.CaptureException;

public interface CaptureService {
    Capture takeANewCapture() throws CaptureException;
}
