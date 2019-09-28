package com.hackathon.teams.exception;

public class PersonNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -8554803052263417462L;

    public PersonNotFoundException(final String message){
        super(message);
    }
}
