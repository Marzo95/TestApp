package it.lorenzo.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.lorenzo.models.Person;

@Component
@Transactional
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	SessionFactory session;
	
	@Override
	public Person search(long id) {
    Person find=session.getCurrentSession().find(Person.class, id);	
	return find;
	}

	@Override
	public boolean create(Person person) {
		session.getCurrentSession().persist(person);
		session.getCurrentSession().flush();
		return true;
	}

	@Override
	public boolean remove(Person person) {
		session.getCurrentSession().remove(person);
		return true;
	}

	@Override
	public boolean update(Person person) {
		session.getCurrentSession().merge(person);
		return false;
	}

}
