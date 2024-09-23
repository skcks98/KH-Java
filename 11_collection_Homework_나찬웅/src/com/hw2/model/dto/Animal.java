package com.hw2.model.dto;

public abstract class Animal {

	protected String name;
	
	// 기본
	public Animal() {}

	
	// 매개
	public Animal(String name) {
		super();
		this.name = name;
	}

	
	// GETTER / SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public abstract void sound(); // 추상 메서드
	
	
}
