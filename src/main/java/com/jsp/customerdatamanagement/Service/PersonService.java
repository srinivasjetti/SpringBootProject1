package com.jsp.customerdatamanagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.customerdatamanagement.Entity.Person;
import com.jsp.customerdatamanagement.Repository.PersonDAO;

@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;
	
	public Person save(Person person) {
		return dao.save(person);
	}
	
	public Person updatePerson(Person person) {
		return dao.updatePerson(person);
	}

	
	public List<Person> getAllPersons() {
		return dao.getAllPersons();
	}
	
	public Person getById(int id) {
		return dao.getPersonById(id);
	}
	
	public Person deleteById(int id) {
		return dao.deleteById(id);
	}
	

}
