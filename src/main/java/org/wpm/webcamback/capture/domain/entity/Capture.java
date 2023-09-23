package org.wpm.webcamback.capture.domain.entity;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.time.LocalDateTime.now;

public record Capture(String path, LocalDateTime creationTime, String name) {

    public static Capture fromAbsolutePath(String absolutePath) {
        List<String> list = Arrays.stream(absolutePath.split("/")).collect(Collectors.toList());
        String filename = list.remove(list.size() - 1);

        return new Capture(format("%s/", String.join("/", list)), now(), filename);
    }

    public String absolutePath() {
        return path+name;
    }

    public File fileFromPath() {
        return new File(absolutePath());
    }

}
