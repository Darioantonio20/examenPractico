package com.examenpractico.app.services;
import org.springframework.stereotype.Service;
import com.examenpractico.app.models.Person;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final List<Person> persons = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public Long createPerson(Person person) {
        person.setIdentifier(currentId);
        currentId++;
        persons.add(person);
        return person.getIdentifier();
    }

    @Override
    public Person getPerson(Long identifier) {
        return persons.stream()
                .filter(person -> person.getIdentifier().equals(identifier))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }
}
