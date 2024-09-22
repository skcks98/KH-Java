package com.hw2.model.dto;

public class Prisoner extends Person{
	
	private String crime;

	
	// 기본
	public Prisoner() {}


	
	// 매개
	public Prisoner(String id, String name, String crime) {
		super();
		this.id = id;
		this.name =name;
		this.crime = crime;
	}
	
	
	
	
	// GETTER/SETTER
	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}
	
	public String getInfo() {
		return "ID : " + getId() + " , "  + "이름 : " + getName() + " , " + 
				"죄목 : " + getCrime();
	}
	
}
