package com.lingenhag.test.model.impl.person;

import com.lingenhag.test.model.api.person.Person;

public class PersonBuilder {

    private PersonImpl person;

    private PersonBuilder(String forename, String surname) {
        this.person = new PersonImpl(forename, surname);
    }

    public static PersonBuilder newPerson(String forename, String surname) {
        return new PersonBuilder(forename, surname);
    }

    public Person build() {
        return this.person;
    }
}
