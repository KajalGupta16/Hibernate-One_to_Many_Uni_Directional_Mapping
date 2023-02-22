package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class PersonController {
public static void main(String[] args) {
	PersonService personService=new PersonService();
	
	Person person=new  Person();
	person.setId(1);
	//to update by id
	//personService.updateById(person);
	
	//to get by id
	//personService.getById(person);
	
	//to delete by id
	personService.deleteById(person);
}
}
