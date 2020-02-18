package com.lingenhag.test.persistence.api;

import com.lingenhag.test.model.api.person.Person;

public interface PersonRepository {

    void persist(Person person);
    Person load(int id);
}
