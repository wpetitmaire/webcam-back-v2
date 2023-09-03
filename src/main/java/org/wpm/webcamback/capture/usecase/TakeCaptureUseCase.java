package org.wpm.webcamback.capture.usecase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.capture.domain.service.PhotoService;

@Service
@Slf4j
@RequiredArgsConstructor
public class TakeCaptureUseCase {

    final PhotoService photoService;

    public String takeNewCapture() {
        return photoService.takeANewPhoto();
    }

}
