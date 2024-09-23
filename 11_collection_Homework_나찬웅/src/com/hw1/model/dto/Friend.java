package com.hw1.model.dto;

public class Friend {

	private String name;
	
	// 기본
	public Friend() {}

	// 매개
	public Friend(String name) {
		super();
		this.name = name;
	}

	
	// GETTER/SETTER
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pickLeader() {
		
		System.out.println( name + "가 떡잎 방범대 대장이다!");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
