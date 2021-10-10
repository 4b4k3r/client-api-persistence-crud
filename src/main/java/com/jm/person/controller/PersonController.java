package com.jm.person.controller;

import com.jm.person.dao.entity.Person;
import com.jm.person.service.PersonService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController
{
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> findAll()
    {
        return personService.findAll();
    }

    @PostMapping
    public Person save(@RequestBody @Validated Person person)
    {
        return personService.save(person);
    }

    @PutMapping(path = "/{personId}")
    public Person update(@RequestBody @Validated Person person, @PathVariable Integer personId) throws NotFoundException
    {
        return personService.update(person, personId);
    }

    @DeleteMapping(path = "/{personId}")
    public void deleteById(@PathVariable Integer personId) throws NotFoundException
    {
        personService.deleteById(personId);
    }
}
