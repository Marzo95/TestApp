package it.lorenzo.DAO;

import it.lorenzo.models.Person;

public interface PersonDAO {
	
	Person search(long id);

	boolean create(Person person);

	boolean remove(Person person);

	boolean update(Person person);

}
