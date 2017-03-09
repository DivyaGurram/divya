package com.tek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.PersonServiceImpl;

@Controller
public class HelloController {

	@Autowired
	PersonServiceImpl personService;

	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> get(@PathVariable("id") String pId) {
		Person p = personService.getPerson(pId);
		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}

	@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<Person> ByName(@PathVariable("name") String pName) {
		return new ResponseEntity<Person>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Person> getAll() {
		return new ResponseEntity<Person>(HttpStatus.OK);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Person> save(@RequestBody Person person) {
		personService.savePerson(person);
		return new ResponseEntity<Person>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Person> delete(@PathVariable("id") String personId) {

		Person p = personService.getPerson(personId);
		if (p != null) {
			personService.deletePerson(personId);
			return new ResponseEntity<Person>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Person update(@RequestBody Person person) {
		return null;
	}

	@RequestMapping(value = "/dummy", method = RequestMethod.GET)
	public ResponseEntity<Person> getDummy() {
		System.out.println("dummy called..");
		Person p = new Person();
		p.setId("2");
		p.setName("divya");
		p.setcity("Duluth");

		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}
}
