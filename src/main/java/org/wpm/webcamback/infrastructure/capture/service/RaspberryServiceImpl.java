package org.wpm.webcamback.infrastructure.capture.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.wpm.webcamback.domain.capture.service.RaspberryService;
import org.wpm.webcamback.infrastructure.capture.exception.RaspberryException;
import org.wpm.webcamback.infrastructure.capture.helpers.CommandLineException;
import org.wpm.webcamback.infrastructure.capture.helpers.service.CommandLineService;

//@Service
@Slf4j
@RequiredArgsConstructor
public class RaspberryServiceImpl implements RaspberryService {

    private static final String LAST_CAPTURE_FILE_NAME = "lastCapture.jpg";

    @Value("${raspberry.photo.location}")
    private String capturesLocation;

    @Value("${raspberry.scripts.location}")
    private String scriptsLocations;

    @Value("${raspberry.scripts.capture.name}")
    private String captureScriptName;

    final CommandLineService commandLineService;

    @Override
    public String takeCapture() throws RaspberryException {
        try {
            commandLineService.runScript(scriptsLocations, captureScriptName);
            return capturesLocation + LAST_CAPTURE_FILE_NAME;
        } catch (CommandLineException e) {
            throw new RaspberryException(e.getMessage(), e.getCause());
        }
    }
}
