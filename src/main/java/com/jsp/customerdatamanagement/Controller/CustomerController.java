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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.customerdatamanagement.Entity.Customer;
import com.jsp.customerdatamanagement.Service.CustomerService;
import com.jsp.customerdatamanagement.dto.CustomerDTO;
import com.jsp.customerdatamanagement.dto.ResponseStructure;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@PostMapping("/customer")
	public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody CustomerDTO dto) {
		return service.saveCustomer(dto);
	}
	
	@PutMapping("/customer") //put for updating the data
	public @ResponseBody ResponseStructure<Customer> updateCustomer( @RequestBody CustomerDTO dto) {
		return service.updateCustomer(dto);
	}
	
	@GetMapping("/customer")
	public  @ResponseBody ResponseStructure<List<Customer>> getAllCustomerData() {
		return service.getAllCustomerData();
	}
    
	@GetMapping("/customer/{id}")  //we can use path variable  to get data with same url
	public @ResponseBody Customer getCustomerById(@PathVariable("id") int id) {
		return service.getDataById(id);
	}
	
	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteCustomerById( @RequestParam("id") int id) {
		return service.deleteDataById(id);
	}

	@GetMapping("/customerbyname/{name}")
	public  @ResponseBody List<Customer> getCustomerByName(@PathVariable("name") String name) {
		return service.getCustomerByName(name);
	}
	
	@PostMapping("/validatecustomer")
	public @ResponseBody List<Customer> validateCustomer(@RequestParam("name") String name,@RequestParam("email") String email){
		return service.validateCustomer(name, email);
	}
}
