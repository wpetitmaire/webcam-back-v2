package org.wpm.webcamback.capture.infrastructure.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.capture.domain.service.RaspberryService;

@Service
@Slf4j
@RequiredArgsConstructor
public class RaspberryServiceImpl implements RaspberryService {

    final CommandLineService commandLineService;

    @Override
    public String takePhoto() {
        return commandLineService.getFilePath("test.png");
    }
}
