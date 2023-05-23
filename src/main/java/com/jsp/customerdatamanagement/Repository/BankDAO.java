package com.jsp.customerdatamanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.customerdatamanagement.Entity.BankAccount;

@Repository
public class BankDAO {

	@Autowired
	 private BankRepository repository;
	
	public List<BankAccount> getAllBankAccounts() {
		return repository.findAll();
	}
	
	public BankAccount updateBankAccount(BankAccount bank) {
		return repository.save(bank);
	}
	
	public BankAccount getByBankById(int id) {
		return repository.findById(id).orElse(new BankAccount());
	}
	public BankAccount deleteByAccountById(int id) {
		BankAccount bank = getByBankById(id);
		if(bank.getPId()!=404) {
			repository.deleteById(id);
		}
		return bank;
	}
	public List<BankAccount> getByName(String name) {
		return repository.findByName(name);
	}
	
	
	
}
