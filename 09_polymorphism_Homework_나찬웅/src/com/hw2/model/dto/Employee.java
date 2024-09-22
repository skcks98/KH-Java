package com.hw2.model.dto;

public class Employee extends Person{
	
	private String position;
	
	
	// 기본
	public Employee() {}

	
	// 매개
	public Employee(String id, String name, String position) {
		super();
		this.id = id;
		this.name =name;
		this.position = position;
	}


	// GETTER/SETTER
	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public String getInfo() {
		return "ID : " + getId() + " , "  + "이름 : " + getName() + " , " + 
	"직책 : " + getPosition();
	}
	
}
