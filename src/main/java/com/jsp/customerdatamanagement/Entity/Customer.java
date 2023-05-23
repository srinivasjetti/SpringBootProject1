package com.jsp.customerdatamanagement.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jsp.customerdatamanagement.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "customer_info")
public class Customer implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	private String email;
	
	public Customer(CustomerDTO dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}

}
