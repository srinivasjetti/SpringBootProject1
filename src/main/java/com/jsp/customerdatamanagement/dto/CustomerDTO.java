package com.jsp.customerdatamanagement.dto;

import java.io.Serializable;

import com.jsp.customerdatamanagement.Entity.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO implements Serializable { //it is transfer data between the classes

	private int id;
	private String name;
	private String email;
	
	
	
	public CustomerDTO(Customer customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}
}
