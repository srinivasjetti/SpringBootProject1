package com.jsp.customerdatamanagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.customerdatamanagement.Entity.BankAccount;
import com.jsp.customerdatamanagement.Repository.BankDAO;

@Service
public class BankService {
	@Autowired
	private BankDAO dao;
	
	public List<BankAccount> getAllBankAccounts() {
		return dao.getAllBankAccounts();
	}
	
	public BankAccount updateBankAccount(BankAccount bank) {
		return dao.updateBankAccount(bank);
	}
	
	public BankAccount getByBankById(int id) {
		return dao.getByBankById(id);
	}
	public BankAccount deleteByAccountById(int id) {
		
		return dao.deleteByAccountById(id);
	}
	public List<BankAccount> getByName(String name) {
		return dao.getByName(name);
	}
	
	

}
