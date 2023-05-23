package com.jsp.customerdatamanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.customerdatamanagement.Entity.Person;
import com.jsp.customerdatamanagement.Service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService service;

	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {
		return service.save(person);
	}

	@PutMapping("/person")
	public Person updatePerson(@RequestBody Person person) {
		return service.updatePerson(person);
	}

	@GetMapping("/person")
	public List<Person> getAllPersons() {
		return service.getAllPersons();
	}

	@GetMapping("/person/{id}")
	public Person getById(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@DeleteMapping("/person")
	public Person deleteById(@RequestParam("id") int id) {
		return service.deleteById(id);
	}

	
}
