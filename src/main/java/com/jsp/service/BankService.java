package com.jsp.service;

import java.util.ArrayList;

import com.jsp.dao.BankDao;
import com.jsp.dao.PersonDao;
import com.jsp.dto.Bank;
import com.jsp.dto.Person;

public class BankService {
	BankDao bankDao = new BankDao();
	PersonDao personDao = new PersonDao();

	public void testSave(ArrayList<Bank> ba, Person p) {
		bankDao.testSave(ba, p);
	}

	public Bank updateById(Bank bank) {
		return bankDao.updateById(bank);
	}

	public void deleteById(Bank bank, Person person) {
		Person person2 = personDao.getById(person);
		person2.setBankAccounts(null);
		personDao.updateById(person2);
		bankDao.deleteById(bank);
	}

	public void getById(Bank bank) {
		bankDao.getById(bank);
	}

	public void getAll(Bank bank) {
		bankDao.getAll(bank);
	}
}
