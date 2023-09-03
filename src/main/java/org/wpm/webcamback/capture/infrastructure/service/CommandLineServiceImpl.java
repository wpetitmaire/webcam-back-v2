package org.wpm.webcamback.capture.infrastructure.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommandLineServiceImpl implements CommandLineService{

    @Value("${raspberry.photo.location}")
    private String photosLocation;

    @Override
    public String getFilePath(String filename) {
        return photosLocation + "biere.jpg";
    }
}
