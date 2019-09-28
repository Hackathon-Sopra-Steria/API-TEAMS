package com.hackathon.teams.controller.impl;

import com.hackathon.teams.controller.PersonController;
import com.hackathon.teams.model.dto.PersonDTO;
import com.hackathon.teams.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/teams")
public class PersonControllerImpl implements PersonController {

    private PersonService personService;

    @Autowired
    public PersonControllerImpl(final PersonService personService) {
        super();
        this.personService = personService;
    }

    @GetMapping("/all")
    public List<PersonDTO> getAll() {
        return personService.getAll();
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable Integer id) {
        return personService.getPerson(id);
    }

    @PostMapping
    public PersonDTO savePerson(@RequestBody PersonDTO person) {
        return personService.savePerson(person);
    }

    @PutMapping("/{id}")
    public PersonDTO updatePerson(@RequestBody PersonDTO person, @PathVariable Integer id) {
        return personService.updatePerson(person, id);
    }

    @DeleteMapping("/{id}")
    public String removePerson(@PathVariable Integer id) {
        return personService.removePerson(id);
    }
}
