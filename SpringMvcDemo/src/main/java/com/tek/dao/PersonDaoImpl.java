package com.tek.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tek.Person;


@Repository
public class PersonDaoImpl implements PersonDAO {

	Map<String, Person> personMap = new HashMap<String, Person>();


	public Person getPerson(String id) {

		return personMap.get(id);
	}


	public List<Person> getAllPersons() {
		List<Person> al = new ArrayList<Person>();
		for (Map.Entry<String, Person> entry : personMap.entrySet()) {
			Person p = entry.getValue();
			al.add(p);
		}

		return al;

	}


	public void deletePerson(String id) {
		personMap.remove(id);

	}


	public void savePerson(Person person) {
		
		personMap.put(person.getId(), person);
	}

}
