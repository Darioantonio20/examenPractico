package com.examenpractico.app.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examenpractico.app.models.Person;
import com.examenpractico.app.services.PersonService;
import java.util.List;

@RestController
@RequestMapping("/api/persons")

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Long> createPerson(@RequestBody Person person) {
        Long personId = personService.createPerson(person);
        return new ResponseEntity<>(personId, HttpStatus.CREATED);
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Person> getPerson(@PathVariable Long identifier) {
        Person person = personService.getPerson(identifier);
        if (person != null) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> persons = personService.getAllPersons();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }
}
