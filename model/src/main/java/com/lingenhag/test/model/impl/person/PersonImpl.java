package com.lingenhag.test.model.impl.person;

import com.lingenhag.test.model.api.person.Person;

public class PersonImpl implements Person {

    private final String forename;
    private final String surname;

    public PersonImpl(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    @Override
    public String getForename() {
        return forename;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
