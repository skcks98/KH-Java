package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	
	private boolean hasPhysicalKeyBoard;

	// 기본
	public BasicPhone() {}
	

	// 매개
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyBoard) {
		super(brand,model,year,price);
		this.hasPhysicalKeyBoard = hasPhysicalKeyBoard;
	}
	
	
	// 게터/세터
	public boolean isHasPhysicalKeyBoard() {
		return hasPhysicalKeyBoard;
	}


	public void setHasPhysicalKeyBoard(boolean hasPhysicalKeyBoard) {
		this.hasPhysicalKeyBoard = hasPhysicalKeyBoard;
	}
	

	public void checkKeyboard() {
		
		if(hasPhysicalKeyBoard) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
	}
	
	
}
