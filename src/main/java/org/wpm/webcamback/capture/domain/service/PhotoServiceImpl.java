package org.wpm.webcamback.capture.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService{

    final RaspberryService raspberryService;

    @Override
    public String takeANewPhoto() {
        log.info("taking new photo");

       return raspberryService.takePhoto();
    }
}
