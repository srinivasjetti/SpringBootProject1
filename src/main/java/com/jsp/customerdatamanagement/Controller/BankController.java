package com.jsp.customerdatamanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.customerdatamanagement.Entity.BankAccount;
import com.jsp.customerdatamanagement.Service.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService service;

	@GetMapping("/account")
	public List<BankAccount> getAllBankAccounts() {
		return service.getAllBankAccounts();
	}
	
	@PutMapping("/accounts")
	public BankAccount updateBankAccount(@RequestBody BankAccount bank) {
		return service.updateBankAccount(bank);
	}
	
	@GetMapping("/accounts/{id}")
	public BankAccount getByBankById(@PathVariable("id") int id) {
		return service.getByBankById(id);
	}
	@DeleteMapping("/accounts")
	public BankAccount deleteByAccountById(int id) {
		return service.deleteByAccountById(id);
	}
	@GetMapping("/accounts")
	public List<BankAccount> getByName(@RequestParam("name") String name) {
		return service.getByName(name);
	}
}
