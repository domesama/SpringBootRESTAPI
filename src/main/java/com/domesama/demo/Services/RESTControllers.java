package com.domesama.demo.Services;

import com.domesama.demo.Models.Person;
import com.domesama.demo.Services.PersonAPIServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RESTControllers {

    private final PersonAPIServices personAPIServices;

    @Autowired
    public RESTControllers(PersonAPIServices personAPIServices) {
        this.personAPIServices = personAPIServices;
    }

    @GetMapping("/getDetails")
    public List<Person> hahayes(){
        return personAPIServices.getPersonDetails();
    }

    @PostMapping("/sendDetail")
    public void addPerson(@RequestBody Person person){
        personAPIServices.addPerson(person);
    }
}
