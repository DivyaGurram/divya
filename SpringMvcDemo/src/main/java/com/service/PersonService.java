package com.service;

import java.util.List;

import com.tek.Person;

public interface PersonService {

	public Person getPerson(String id);

	public List<Person> getAllPersons();

	public void deletePerson(String id);

	public void savePerson(Person person);

}
