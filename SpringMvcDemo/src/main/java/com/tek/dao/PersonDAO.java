package com.tek.dao;

import java.util.List;

import com.tek.Person;

public interface PersonDAO {

	public Person getPerson(String id);

	public List<Person> getAllPersons();

	public void deletePerson(String id);

	public void savePerson(Person person);

}
