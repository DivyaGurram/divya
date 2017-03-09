package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.Person;
import com.tek.dao.PersonDaoImpl;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonDaoImpl personDao;

	public Person getPerson(String id) {
		return personDao.getPerson(id);
	}

	public List<Person> getAllPersons() {
		return personDao.getAllPersons();
	}

	public void deletePerson(String id) {
		personDao.deletePerson(id);
	}

	public void savePerson(Person person) {

	}

}
