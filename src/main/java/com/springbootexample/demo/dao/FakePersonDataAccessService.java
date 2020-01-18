package com.springbootexample.demo.dao;

import com.springbootexample.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static List<Person> db=new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id,person.getName()));
        return 0;
    }

    @Override
    public int insertPerson(Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return db;
    }
}
