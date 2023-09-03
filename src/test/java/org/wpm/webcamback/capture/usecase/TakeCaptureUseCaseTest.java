package org.wpm.webcamback.capture.usecase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wpm.webcamback.BackApplication;
import org.wpm.webcamback.capture.domain.service.PhotoService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BackApplication.class)
class TakeCaptureUseCaseTest {

    @Autowired
    PhotoService photoService;

    @Test
    void shouldReturnPhotoPath() {
        String photoPath = photoService.takeANewPhoto();

        assertThat(photoPath).isEqualTo("/Users/willy/raspberry_apps/photo/captures/biere.jpg");
    }

}