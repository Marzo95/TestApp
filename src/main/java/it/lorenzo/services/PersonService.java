package it.lorenzo.services;

import it.lorenzo.models.Person;

public interface PersonService {
	
	public Person search(long id);

	public boolean create(Person person);

	public boolean remove(Person person);

	public boolean update(Person person);

}
