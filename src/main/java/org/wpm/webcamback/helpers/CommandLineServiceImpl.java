package org.wpm.webcamback.helpers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wpm.webcamback.helpers.service.CommandLineService;

import java.io.IOException;

import static java.lang.String.format;

@Service
@Slf4j
public class CommandLineServiceImpl implements CommandLineService {

    @Override
    public boolean runScript(String scriptPath, String scriptName) throws CommandLineException {
        log.info("run script {}{}", scriptPath, scriptName);

        try {
            Process process = Runtime.getRuntime().exec(format("%s/%s", scriptPath, scriptName));
            return process.waitFor() == 0;
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
