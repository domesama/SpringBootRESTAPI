package com.domesama.demo.Services;

import com.domesama.demo.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonAPIServices {
    private final PersonServices personServices;

    @Autowired
    public PersonAPIServices(PersonServices personServices){
        this.personServices = personServices;
    }

     List<Person> getPersonDetails(){
        return personServices.getPersonDetails();
    }

    void addPerson(Person person){
        personServices.addPerson(person);
    }
}
