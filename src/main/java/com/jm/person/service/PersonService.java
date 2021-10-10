package com.jm.person.service;

import com.jm.person.dao.entity.Person;
import com.jm.person.dao.repository.PersonRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService implements CrudService<Person, Integer>
{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person save(Person toSave)
    {
        return personRepository.save(toSave);
    }

    @Override
    public Person update(Person toUpdate, Integer id) throws NotFoundException
    {
        Optional<Person> personById = personRepository.findById(id);

        if (personById.isPresent())
        {
            toUpdate.setId(id);
            return personRepository.save(toUpdate);
        }

        throw new NotFoundException("A person with id " + id + " not exists");
    }

    @Override
    public List<Person> findAll()
    {
        return personRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) throws NotFoundException
    {
        if (personRepository.findById(id).isPresent())
        {
            personRepository.deleteById(id);
            return;
        }

        throw new NotFoundException("A person with id " + id + " not exists");
    }
}
