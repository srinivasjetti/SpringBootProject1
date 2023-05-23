package com.jsp.customerdatamanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.customerdatamanagement.Entity.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer>{
	

}
