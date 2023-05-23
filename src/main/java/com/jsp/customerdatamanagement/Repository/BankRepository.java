package com.jsp.customerdatamanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.customerdatamanagement.Entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer> {
	
	List<BankAccount> findByName(String name);

}
