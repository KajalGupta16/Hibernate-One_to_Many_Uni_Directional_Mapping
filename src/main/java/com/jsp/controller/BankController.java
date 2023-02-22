package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dto.Bank;
import com.jsp.dto.Person;
import com.jsp.service.BankService;

public class BankController {
	public static void main(String[] args) {
		BankService bankService = new BankService();

		Bank bank = new Bank();

		Bank b1 = new Bank();
		b1.setBranch("nsp");
		b1.setName("boi");

		Bank b2 = new Bank();
		b2.setName("canara");
		b2.setBranch("goa");

//		Bank b3 = new Bank();
//		b3.setName("axis");
//		b3.setBranch("malad");

		ArrayList<Bank> al = new ArrayList<Bank>();
//		al.add(b3);
		al.add(b2);
		al.add(b1);

		Person p1 = new Person();
		p1.setName("achal");
		p1.setEmail("achal@gmail.com");
		p1.setBankAccounts(al);
		p1.setId(1);

		// to save
		// bankService.testSave(al, p1);

		// to update by id
//		 bank.setId(2);
//		 bank.setBranch("virar");
//		 bank.setName("ICICI");
//		 bankService.updateById(bank);

		// to delete by id
//		bank.setId(3);
//		bankService.deleteById(bank, p1);

		// to get by id
		// bankService.getById(bank);

		// to get all
		// bankService.getAll(bank);
	}
}
