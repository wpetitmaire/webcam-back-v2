package org.wpm.webcamback.capture.usecase;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wpm.webcamback.BackApplication;
import org.wpm.webcamback.domain.capture.service.CaptureService;
import org.wpm.webcamback.domain.capture.entity.Capture;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BackApplication.class)
class TakeCaptureUseCaseTest {

    @Autowired
    CaptureService captureService;

    @SneakyThrows
    @Test
    void shouldReturnPhotoPath() {
        Capture capture = captureService.takeANewCapture();
        assertThat(capture.absolutePath()).isEqualTo("/Users/willy/raspberry_apps/photo/captures/lastCapture.jpg");
    }

}