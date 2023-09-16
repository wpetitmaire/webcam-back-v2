package org.wpm.webcamback.helpers.service;

import org.wpm.webcamback.helpers.CommandLineException;

public interface CommandLineService {
    boolean runScript(String scriptPath, String scriptName) throws CommandLineException;
}
