package com.musala.javacourse181112.spring.service;

import com.musala.javacourse181112.basics.Gender;
import com.musala.javacourse181112.spring.dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 31.01.2019
 */
@Service
public class PersonService {

    public List<PersonDTO> populatePersonDTOList() {
        final List<PersonDTO> personDTOList = new ArrayList<>();

        final PersonDTO personDTO1 = new PersonDTO();
        personDTO1.setId(1l);
        personDTO1.setName("Ivan Ivanov");
        personDTO1.setGender(Gender.MALE);

        final PersonDTO personDTO2 = new PersonDTO();
        personDTO2.setId(2l);
        personDTO2.setName("Maria Ivanova");
        personDTO2.setGender(Gender.FEMALE);

        personDTOList.add(personDTO1);
        personDTOList.add(personDTO2);
        return personDTOList;
    }
}
