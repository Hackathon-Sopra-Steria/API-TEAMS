package com.hackathon.teams.service;

import com.hackathon.teams.model.dto.PersonDTO;

import java.util.List;

public interface PersonService {

    List<PersonDTO> getAll();

    PersonDTO getPerson(Integer id);

    PersonDTO savePerson(PersonDTO personDTO);

    PersonDTO updatePerson(PersonDTO personDTO, Integer id);

    String removePerson(Integer id);

}
