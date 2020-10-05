package com.example.projetapp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class exceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler() {
        return "errors";
    }
}
