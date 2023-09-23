package org.wpm.webcamback.capture.infrastructure.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wpm.webcamback.capture.domain.service.RaspberryService;
import org.wpm.webcamback.capture.infrastructure.helpers.CommandLineServiceImpl;

@Configuration
@RequiredArgsConstructor
public class RaspberryConfiguration {

    @Bean
    RaspberryService raspberryService(@Value("${raspberry.mock}") Boolean mock) {
        return mock ? new RaspberryMockService() : new RaspberryServiceImpl(new CommandLineServiceImpl());
    }
}
