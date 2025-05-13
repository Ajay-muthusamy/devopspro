package com.example.display.controller;

import com.example.display.model.Person;
import com.example.display.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/check")
    public String helloWorld(){
      return "Hello world...i have successfully implement the cicd-piple";
    }

    @GetMapping("/api/veryhappy")
    public String Happy(){
        return "Hello world...i have successfully  the cicd-piple";
    }
}
