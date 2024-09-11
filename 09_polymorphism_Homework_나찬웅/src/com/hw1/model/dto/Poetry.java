package com.hw1.model.dto;

public class Poetry extends Book{
	
	private int numberOfPoems;
	
	// 기본
	public Poetry() {}

	
	// 매개
	public Poetry(String title, String author, int numberOfPoems) {
		super(title,author);
		this.numberOfPoems = numberOfPoems;
	}

	
	// GETTER/SETTER
	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}

	
	@Override
	public void displayInfo() {
		System.out.print("\n[시집] 제목 : " +  getTitle() + " / ");
		System.out.print("저자 : " +  getAuthor() + " / ");
		System.out.print("시 수 : " +  getNumberOfPoems());
	}
	
	
}
