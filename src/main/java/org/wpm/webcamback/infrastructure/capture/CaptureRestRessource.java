package org.wpm.webcamback.infrastructure.capture;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.wpm.webcamback.domain.capture.exception.CaptureException;
import org.wpm.webcamback.usecase.capture.TakeCaptureUseCase;

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
    public @ResponseBody byte[] getNewCapture() throws IOException, CaptureException {
        log.info("getNewCapture");
        File file = takeCaptureUseCase.takeNewCapture().fileFromPath();
        InputStream fileInputStream = new FileInputStream(file);
        return IOUtils.toByteArray(fileInputStream);
    }

}
