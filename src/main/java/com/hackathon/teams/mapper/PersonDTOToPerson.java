package com.hackathon.teams.mapper;

import com.hackathon.teams.model.dto.PersonDTO;
import com.hackathon.teams.model.entity.Person;

public class PersonDTOToPerson {
    public static Person map(PersonDTO personDTO) {
        return Person.builder()
                .id(personDTO.getId())
                .idUser(personDTO.getIdUser())
                .idWorkerType(personDTO.getIdWorkerType())
                .email(personDTO.getEmail())
                .firstName(personDTO.getFirstName())
                .lastName(personDTO.getLastName())
                .urlPhoto(personDTO.getUrlPhoto())
                .build();
    }
}
