package org.wpm.webcamback.capture.infrastructure;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.wpm.webcamback.capture.usecase.TakeCaptureUseCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/capture")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class CaptureRestRessource {

    final TakeCaptureUseCase takeCaptureUseCase;

    @GetMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getNewCapture() throws IOException {
        File file = new File("/Users/willy/raspberry_apps/photo/captures/biere.jpg");
        InputStream fileInputStream = new FileInputStream(file);
        return IOUtils.toByteArray(fileInputStream);
    }

}
