package com.hackathon.teams.controller;

import com.hackathon.teams.model.dto.PersonDTO;

import java.util.List;

public interface PersonController {

    List<PersonDTO> getAll();

    PersonDTO getPerson(Integer id);

    PersonDTO savePerson(PersonDTO personDTO);

    PersonDTO updatePerson(PersonDTO personDTO, Integer id);

    String removePerson(Integer id);
}
