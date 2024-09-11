package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Company implements ManagementSystem {
	
	
	private Employee[] employees;
    private int employeeCount;

    public Company(int size) {
        employees = new Employee[size];
        employeeCount = 0;
    }
	
	
	@Override
	public void addPerson(Person person) {
		if(person instanceof Employee && Employee) {
			employeeCount++;
		} else {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		
	}

	@Override
	public void displayAllPersons() {
		
		
	}

}
