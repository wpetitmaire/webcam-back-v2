package org.wpm.webcamback.capture.domain.service;

import org.wpm.webcamback.capture.domain.entity.Capture;
import org.wpm.webcamback.capture.domain.exception.CaptureException;

public interface CaptureService {
    Capture takeANewCapture() throws CaptureException;
}
