package com.lingenhag.test.model.api.person;

import static com.lingenhag.test.model.impl.person.PersonBuilder.newPerson;

public class PersonFactory {
    private PersonFactory() {
    }

    public static Person person(String forename, String surname) {
        return newPerson(forename, surname).build();
    }
}
