package com.domesama.demo.Models;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class MockUpData {

    private static final List<Person> person = new ArrayList<>();

    static {
        person.add(new Person(UUID.randomUUID(), "Dome", "hahayes@gmail.com"));
        person.add(new Person(UUID.randomUUID(), "Nice", "verynice@gmail.com"));
    }

    public List<Person> getPersonDetails() {
        return person;
    }
    public void addPerson(Person nice){
        person.add( new Person(UUID.randomUUID(), nice.getName(), nice.getEmail()));
    }
}
