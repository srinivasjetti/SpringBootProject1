package com.jsp.customerdatamanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.customerdatamanagement.Entity.Customer;
import com.jsp.customerdatamanagement.dto.CustomerDTO;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomer(CustomerDTO dto) {
		Customer cus = new Customer(dto);
		
		return repository.save(cus);
	}

	public List<Customer> getAllCustomerData() {
		return repository.findAll();
	}

	public Customer getCustomerById(int id) {
		return repository.findById(id).orElse(
				new Customer(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
	}

	public Customer deleteCustomerDataById(int id) {
		Customer customer = getCustomerById(id);
		if (customer.getId() != 404)
			repository.deleteById(id);
		
		return customer;
	}
	
	public List<Customer> getCustomerByName(String name) {
		 return repository.findByName(name);
	}
   
	public List<Customer> validateCustomer(String name,String email) {
		return repository.validateCustomer(name, email);
	}
}
