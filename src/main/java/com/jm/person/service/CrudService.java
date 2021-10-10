package com.jm.person.service;

import javassist.NotFoundException;

import java.util.List;

public interface CrudService<T, ID>
{
    T save(T toSave);
    T update(T toUpdate, ID id) throws NotFoundException;
    List<T> findAll();
    void deleteById(ID id) throws NotFoundException;
}
