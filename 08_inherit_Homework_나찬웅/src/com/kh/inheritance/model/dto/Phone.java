package com.kh.inheritance.model.dto;

public class Phone {
	
	private String brand;
	private String model;
	private int year;
	private int price;
	
	// 기본
	public Phone() {}

	// 매개 변수
	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// 메서드
	// getter/setter
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	


	public void printInfo() {
		System.out.println("Brand : " + getBrand());
		System.out.println("Model : " + getModel());
		System.out.println("Year : " + getYear());
		System.out.println("Price : " + getPrice() +"원");
		
	}

}
