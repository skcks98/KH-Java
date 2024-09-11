package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;

public interface ManagementSystem {

	public abstract void addPerson(Person person);
	
	public abstract void removePerson(String id);
	
	public abstract void displayAllPersons();
	
}
