package com.lingenhag.test.persistence.impl;

import com.lingenhag.test.model.api.person.Person;
import com.lingenhag.test.model.api.person.PersonFactory;
import com.lingenhag.test.persistence.api.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public void persist(Person person) {
        System.out.println("Forename: " + person.getForename() + "Surename: " + person.getSurname());
    }

    @Override
    public Person load(int id) {
        return PersonFactory.person("la", "lo");
    }
}
