package org.wpm.webcamback.capture.infrastructure.helpers;

import lombok.extern.slf4j.Slf4j;
import org.wpm.webcamback.capture.infrastructure.helpers.service.CommandLineService;

import java.io.IOException;

import static java.lang.String.format;

@Slf4j
public class CommandLineServiceImpl implements CommandLineService {

    @Override
    public void runScript(String scriptPath, String scriptName) throws CommandLineException {
        log.info("run script {}{}", scriptPath, scriptName);

        try {
            Process process = Runtime.getRuntime().exec(format("%s/%s", scriptPath, scriptName));
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            throw new CommandLineException(
                format(
                    "L'exécution du script %s/%s a échoué : %s",
                    scriptPath,
                    scriptName,
                    e.getMessage()
                ),
                e.getCause()
            );
        }
    }
}
