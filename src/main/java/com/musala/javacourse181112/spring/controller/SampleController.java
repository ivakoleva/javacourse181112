package com.musala.javacourse181112.spring.controller;

import com.musala.javacourse181112.spring.dto.PersonDTO;
import com.musala.javacourse181112.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Iva Koleva on 31.01.2019
 */
@RestController//("/sample")
//@Scope
public class SampleController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/hi")
    public String hi() {
        return "Hi :) :)";
    }

    @RequestMapping("/person")
    public PersonDTO personIndex0() {
        return personService.populatePersonDTOList().get(0);
    }

    @RequestMapping("/find-person")
    public PersonDTO findPerson(final @RequestParam("name") String name,
                                final HttpServletRequest request) {
        // request could be injected by Spring
        return personService.populatePersonDTOList().stream()
                .filter(personDTO -> personDTO.getName().equals(name))
                .findAny().orElse(null);
    }

    @RequestMapping("/person/{id}")
    public PersonDTO person(final @PathVariable("id") Long id) {
        return personService.populatePersonDTOList().stream()
                .filter(personDTO -> personDTO.getId().equals(id))
                .findAny().orElse(null);
    }
}
