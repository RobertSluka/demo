package com.example.demo.services;

import com.example.demo.database.PersonDB;
import com.example.demo.database.SchoolDB;
import com.example.demo.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.model.Person;

import java.util.List;


@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDB personDB;

    @Autowired
    SchoolDB schoolDB;

    @Override
    public String toString() {
        return "PersonContainer{" +
                "people="+
                '}';
    }

    @Override
    public Person addPersonToTable(Person person) {
        return personDB.save(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return personDB.findAll();
    }

    @Override
    public void deletePerson(int id) {
        personDB.deleteById(id);
    }

    @Override
    public School getPersonsSchoolById(int school_id) {
        return schoolDB.findById(school_id).get();
    }

    @Override
    public List<Person> findPeopleBySchoolId(int id) {
        return personDB.findPeopleBySchoolId(id);
    }

}
