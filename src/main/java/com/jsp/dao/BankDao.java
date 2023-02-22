package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Bank;
import com.jsp.dto.Person;

public class BankDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kajal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void testSave(ArrayList<Bank> ba, Person p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}

	public Bank updateById(Bank bank) {
		Bank bank1 = entityManager.find(Bank.class, bank.getId());
		if (bank1 != null) {
			bank1.setName(bank.getName());
			bank1.setBranch(bank.getBranch());
			entityTransaction.begin();
			entityManager.merge(bank1);
			entityTransaction.commit();
		}
		return bank1;
	}

	public void deleteById(Bank bank) {
		Bank bank2 = entityManager.find(Bank.class, bank.getId());
		if (bank2 != null) {
			entityTransaction.begin();
			entityManager.remove(bank2);
			entityTransaction.commit();
		}
	}

	public void getById(Bank bank) {
		Bank bank2 = entityManager.find(Bank.class, bank.getId());
		if (bank2 != null) {
			System.out.println(bank2.getId());
			System.out.println(bank2.getName());
			System.out.println(bank2.getBranch());
		}
	}

	public void getAll(Bank bank) {
		String sql = "select e from Bank e";
		Query q = entityManager.createQuery(sql);

		List<Bank> banks = q.getResultList();
		for (Bank bank2 : banks) {
			System.out.println("========================================");
			System.out.println(bank2.getId());
			System.out.println(bank2.getName());
			System.out.println(bank2.getBranch());

		}
	}
}