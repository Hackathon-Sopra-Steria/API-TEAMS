package com.hackathon.teams.controller;

import com.hackathon.teams.exception.PersonNotFoundException;
import com.hackathon.teams.model.dto.ErrorDTO;

public interface ExceptionHandlerController {
    public ErrorDTO studentNotFoundException(PersonNotFoundException ex);

    public ErrorDTO serverException(Exception ex);
}
