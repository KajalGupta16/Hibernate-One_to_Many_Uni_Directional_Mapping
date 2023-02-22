package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kajal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person updateById(Person person) {
		Person person2 = entityManager.find(Person.class, person.getId());
		if (person2 != null) {
			person2.setName(person.getName());
			person2.setEmail(person.getEmail());
			person2.setBankAccounts(person.getBanks());
			entityTransaction.begin();
			entityManager.merge(person2);
			entityTransaction.commit();
		}
		return person;
	}

	public Person getById(Person person) {
		return entityManager.find(Person.class, person.getId());
//		if(person2!=null) {
//			System.out.println(person2.getId());
//			System.out.println(person2.getName());
//			System.out.println(person2.getEmail());
//		}
	}
	
	public void deleteById(Person person) {
	Person person2=	entityManager.find(Person.class, person.getId());
	if(person2!=null) {
		entityTransaction.begin();
		entityManager.remove(person2);
		entityTransaction.commit();
	}
	}
}
