package com.hackathon.teams.mapper;

import com.hackathon.teams.model.dto.PersonDTO;
import com.hackathon.teams.model.entity.Person;

public class PersonToPersonDTO {
    public static PersonDTO map(Person person) {
        return PersonDTO.builder()
                .id(person.getId())
                .idUser(person.getIdUser())
                .idWorkerType(person.getIdWorkerType())
                .email(person.getEmail())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .urlPhoto(person.getUrlPhoto())
                .build();
    }
}
