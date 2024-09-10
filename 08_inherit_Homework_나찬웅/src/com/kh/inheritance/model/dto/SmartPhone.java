package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone{
	
	private String operatingSystem;
	private int storageCapacity; // 스토리지 공간 크기

	// 기본
	public SmartPhone() { }
	
	
	
	// 매개
	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand,model,year,price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	// 게터/세터
	public String getOperatingSystem() {
		return operatingSystem;
	}



	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}



	public int getStorageCapacity() {
		return storageCapacity;
	}



	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		
		System.out.println("Operating System : " + operatingSystem );
		System.out.println("Storage Capacity : " + storageCapacity +"GB");
	}

	
	
	
}
