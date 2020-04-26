package com.domesama.demo.Services;

import com.domesama.demo.Models.MockUpData;
import com.domesama.demo.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonServices {
    private final MockUpData mockUpData;

    @Autowired
    public PersonServices(MockUpData mockUpData){
        this.mockUpData = mockUpData;
    }
    List<Person> getPersonDetails(){
        return mockUpData.getPersonDetails();
    }
    void addPerson(Person person){
        mockUpData.addPerson(person);
    }
}
