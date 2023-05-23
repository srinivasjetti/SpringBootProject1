package com.jsp.customerdatamanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.customerdatamanagement.Entity.Person;

@Repository
public class PersonDAO {
	@Autowired
	private PersonRepository repository;
	
	public Person save(Person person) {
		return repository.save(person);
	}
	
	public Person updatePerson(Person person) {
		return repository.save(person);
	}
	
	public List<Person> getAllPersons() {
		return repository.findAll();
	}
	
	public Person getPersonById(int id) {
		return repository.findById(id).orElse(new Person());
	}
	
	public Person deleteById(int id) {
		Person per = getPersonById(id);
		if (per.getId() != 404)
			repository.deleteById(id);
		
		return per;
	}
	
	

}
