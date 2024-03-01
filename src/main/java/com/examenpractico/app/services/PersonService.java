package com.examenpractico.app.services;
import com.examenpractico.app.models.Person;
import java.util.List;

public interface PersonService {
    Long createPerson(Person person);
    Person getPerson(Long identifier);
    List<Person> getAllPersons();
}