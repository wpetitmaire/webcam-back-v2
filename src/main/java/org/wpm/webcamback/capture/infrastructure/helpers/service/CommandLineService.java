package org.wpm.webcamback.capture.infrastructure.helpers.service;

import org.wpm.webcamback.capture.infrastructure.helpers.CommandLineException;

public interface CommandLineService {
    boolean runScript(String scriptPath, String scriptName) throws CommandLineException;
}
