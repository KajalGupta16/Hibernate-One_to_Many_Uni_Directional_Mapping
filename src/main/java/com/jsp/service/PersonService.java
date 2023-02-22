package com.jsp.service;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
 PersonDao personDao=new PersonDao();
	public Person updateById(Person person) {
		return personDao.updateById(person);
	}
	
	public void getById(Person person) {
		personDao.getById(person);
	}
	
	public void deleteById(Person person) {
		personDao.deleteById(person);
	}
}
