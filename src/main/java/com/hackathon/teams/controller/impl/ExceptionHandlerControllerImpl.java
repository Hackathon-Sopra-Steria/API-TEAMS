package com.hackathon.teams.controller.impl;

import com.hackathon.teams.controller.ExceptionHandlerController;
import com.hackathon.teams.exception.PersonNotFoundException;
import com.hackathon.teams.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerControllerImpl implements ExceptionHandlerController {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(PersonNotFoundException.class)
    public ErrorDTO studentNotFoundException(PersonNotFoundException ex) {
        return ErrorDTO.builder()
                .status(HttpStatus.NOT_FOUND)
                .message(ex.getMessage())
                .build();
    }

    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorDTO serverException(Exception ex) {
        return ErrorDTO.builder()
                .status(HttpStatus.NOT_FOUND)
                .message(ex.getMessage())
                .build();
    }
}
