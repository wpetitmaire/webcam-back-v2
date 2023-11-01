package org.wpm.webcamback.infrastructure.capture.jobs;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.usecase.capture.TakeCaptureUseCase;

@Component
@Slf4j
@RequiredArgsConstructor
public class JobCapture {

    private final TakeCaptureUseCase takeCaptureUseCase;

    @Scheduled(fixedRate = 1000)
    public void takeCapture() {
        log.info("-->NOUVELLE CAPTURE");
    }
}
