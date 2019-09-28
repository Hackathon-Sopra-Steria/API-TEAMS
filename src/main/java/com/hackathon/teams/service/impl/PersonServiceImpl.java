package com.hackathon.teams.service.impl;

import com.hackathon.teams.mapper.PersonDTOToPerson;
import com.hackathon.teams.mapper.PersonToPersonDTO;
import com.hackathon.teams.model.dto.PersonDTO;
import com.hackathon.teams.model.entity.Person;
import com.hackathon.teams.repository.PersonRepository;
import com.hackathon.teams.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    private final Logger LOG = LoggerFactory.getLogger(PersonServiceImpl.class);
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(final PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;
    }

    public List<PersonDTO> getAll() {
        List<Person> personIterable = personRepository.findAll();
        return (personIterable
                .stream()
                .map(PersonToPersonDTO::map)
                .collect(Collectors.toList()));
    }

    public PersonDTO getPerson(Integer id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            return PersonToPersonDTO.map(optionalPerson.get());
        }
        LOG.error("Person with {} not found", id);
        //throw new PersonNotFoundException(String.format("Person with id %d not found", id));
        return null;
    }

    public PersonDTO savePerson(PersonDTO personDTO) {
        return PersonToPersonDTO.map(
                personRepository.save(
                        PersonDTOToPerson.map(personDTO)));
    }

    public PersonDTO updatePerson(PersonDTO personDTO, Integer id) {
        return PersonToPersonDTO.map(
                personRepository.saveAndFlush(
                        PersonDTOToPerson.map(personDTO)));
    }

    public String removePerson(Integer id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            personRepository.deleteById(id);
            LOG.info("Person with id {} NOT found and NOT deleted", id);
            return String.format("Person with id %d removed", id);
        }
        LOG.info("Person with id {} NOT found and NOT deleted", id);
        return String.format("Person with id %d NOT found and NOT deleted", id);

    }
}
