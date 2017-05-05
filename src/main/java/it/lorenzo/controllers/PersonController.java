package it.lorenzo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.lorenzo.models.Person;
import it.lorenzo.services.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPerson(@RequestBody Person person) {

		personService.create(person);
	}

	@RequestMapping(value = "/findPerson/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findPerson(@PathVariable(value = "id") long id) {

		return personService.search(id);
	}

	@RequestMapping(value = "/updatePerson", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePerson(@RequestBody Person person) {
		personService.update(person);
	}

	@RequestMapping(value = "/removePerson", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void removePerson(@RequestBody Person person) {
	personService.remove(person);
	}
}
