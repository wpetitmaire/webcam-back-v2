package org.wpm.webcamback.infrastructure.capture.helpers.service;

import org.wpm.webcamback.infrastructure.capture.helpers.CommandLineException;

public interface CommandLineService {
    void runScript(String scriptPath, String scriptName) throws CommandLineException;
}
