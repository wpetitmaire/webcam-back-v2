package org.wpm.webcamback.infrastructure.capture.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class CaptureExceptionAdvice {


    @ResponseBody
    @ExceptionHandler(CaptureNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    String captureNotFoundException(CaptureNotFoundException exception) {
        return exception.getMessage();
    }
}
