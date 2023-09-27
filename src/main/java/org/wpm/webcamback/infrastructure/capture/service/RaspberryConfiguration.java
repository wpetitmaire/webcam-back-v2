package org.wpm.webcamback.infrastructure.capture.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wpm.webcamback.domain.capture.service.RaspberryService;
import org.wpm.webcamback.infrastructure.capture.helpers.CommandLineServiceImpl;

@Configuration
@RequiredArgsConstructor
public class RaspberryConfiguration {

    @Bean
    RaspberryService raspberryService(@Value("${raspberry.mock}") Boolean mock) {
        return mock ? new RaspberryMockService() : new RaspberryServiceImpl(new CommandLineServiceImpl());
    }
}
