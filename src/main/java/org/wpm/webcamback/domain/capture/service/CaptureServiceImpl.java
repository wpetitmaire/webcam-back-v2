package org.wpm.webcamback.domain.capture.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.domain.capture.exception.CaptureException;
import org.wpm.webcamback.domain.capture.entity.Capture;
import org.wpm.webcamback.infrastructure.capture.exception.RaspberryException;

@Service
@Slf4j
@RequiredArgsConstructor
public class CaptureServiceImpl implements CaptureService {

    final RaspberryService raspberryService;

    @Override
    public Capture takeANewCapture() throws CaptureException {
        try {
            return Capture.fromAbsolutePath(raspberryService.takeCapture());
        } catch (RaspberryException e) {
            throw new CaptureException(e.getMessage(), e.getCause());
        }
    }
}
