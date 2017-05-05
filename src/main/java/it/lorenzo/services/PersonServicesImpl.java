package it.lorenzo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lorenzo.DAO.PersonDAO;
import it.lorenzo.models.Person;

@Service
@Transactional
public class PersonServicesImpl implements PersonService {

	@Autowired
	PersonDAO personDao;
	@Override
	public Person search(long id) {
		return personDao.search(id);
	}

	@Override
	public boolean create(Person person) {
		return personDao.create(person);
	}

	@Override
	public boolean remove(Person person) {
		return personDao.remove(person);
	}

	@Override
	public boolean update(Person person) {
		return personDao.update(person);
	}

}
