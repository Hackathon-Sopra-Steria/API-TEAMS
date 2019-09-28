package com.hackathon.teams.model.dto;

import com.hackathon.teams.controller.impl.ExceptionHandlerControllerImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDTO {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandlerControllerImpl.class);
    private String code;
    private HttpStatus status;
    private String message;

}
