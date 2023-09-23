package org.wpm.webcamback.capture.usecase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.capture.domain.entity.Capture;
import org.wpm.webcamback.capture.domain.exception.CaptureException;
import org.wpm.webcamback.capture.domain.service.CaptureService;

@Service
@Slf4j
@RequiredArgsConstructor
public class TakeCaptureUseCase {

    final CaptureService captureService;

    public Capture takeNewCapture() throws CaptureException {
        return captureService.takeANewCapture();
    }

}
