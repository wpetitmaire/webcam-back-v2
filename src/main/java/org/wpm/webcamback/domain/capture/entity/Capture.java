package org.wpm.webcamback.domain.capture.entity;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.time.LocalDateTime.now;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public record Capture(String path, LocalDateTime creationTime, String name) {

    public static Capture fromAbsolutePath(String absolutePath) {
        List<String> list = stream(absolutePath.split("/")).collect(toList());
        String filename = list.remove(list.size() - 1);

        return new Capture(format("%s/", join("/", list)), now(), filename);
    }

    public String absolutePath() {
        return path+name;
    }

    public File fileFromPath() {
        return new File(absolutePath());
    }

}
