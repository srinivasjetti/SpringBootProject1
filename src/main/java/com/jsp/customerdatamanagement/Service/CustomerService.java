package com.jsp.customerdatamanagement.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.customerdatamanagement.Entity.Customer;
import com.jsp.customerdatamanagement.Repository.CustomerDAO;
import com.jsp.customerdatamanagement.dto.CustomerDTO;
import com.jsp.customerdatamanagement.dto.ResponseStructure;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO dao;

	public ResponseStructure<Customer> saveCustomer(CustomerDTO dto) {
//		Customer cus = new Customer(dto);
		 Customer customer = dao.saveCustomer(dto);
		 ResponseStructure<Customer> rs = new ResponseStructure<>();
		 rs.setData(customer);
		 rs.setStatusCode(HttpStatus.OK.value());
		 rs.setMessage("Customer data saved Successfully");
		 rs.setTimeStatp(LocalDateTime.now());
		 return rs;
		
		
	}

	public ResponseStructure<Customer> updateCustomer(CustomerDTO dto) {
		Customer cus = dao.saveCustomer(dto);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStatp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}

	public ResponseStructure<List<Customer>> getAllCustomerData() {
		List<Customer> list = dao.getAllCustomerData();
		ResponseStructure<List<Customer>> rs = new ResponseStructure<>();
		if (list.size() != 0) {
			rs.setData(list);
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setTimeStatp(LocalDateTime.now());
			rs.setMessage("Customer Entry Found in database");
		}else {
			rs.setData(null);
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setTimeStatp(LocalDateTime.now());
			rs.setMessage("Not Customer Entry Found in database");
		}
		return rs;
	}

	public Customer getDataById(int id) {
		return dao.getCustomerById(id);
	}

	public Customer deleteDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}

	public List<Customer> getCustomerByName(String name) {
		return dao.getCustomerByName(name);
	}

	public List<Customer> validateCustomer(String name, String email) {
		return dao.validateCustomer(name, email);
	}
}
