package org.wpm.webcamback.usecase.capture;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.domain.capture.entity.Capture;
import org.wpm.webcamback.domain.capture.exception.CaptureException;
import org.wpm.webcamback.domain.capture.service.CaptureService;

@Service
@Slf4j
@RequiredArgsConstructor
public class TakeCaptureUseCase {

    final CaptureService captureService;

    public Capture takeNewCapture() throws CaptureException {
        return captureService.takeANewCapture();
    }

}
