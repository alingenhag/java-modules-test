package com.lingenhag.test.persistence.impl;

import com.lingenhag.test.model.api.person.Person;
import org.junit.jupiter.api.Test;

import static com.lingenhag.test.model.api.person.PersonFactory.person;

public class PersonRepositoryImplTest {

    @Test
    void shouldPersistPerson() {
        Person person = person("John", "Rambo");
        PersonRepositoryImpl personRepository = new PersonRepositoryImpl();
        personRepository.persist(person);
    }
}