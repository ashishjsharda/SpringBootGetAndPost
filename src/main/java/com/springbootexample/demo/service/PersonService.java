package com.springbootexample.demo.service;

import com.springbootexample.demo.dao.PersonDao;
import com.springbootexample.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;
    public int addPerson(Person person)
    {
        return personDao.insertPerson(person);
    }

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public List<Person> getAllPeople()
    {
        return personDao.selectAllPeople();
    }
}
