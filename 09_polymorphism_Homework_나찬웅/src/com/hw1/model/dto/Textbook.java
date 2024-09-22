package com.hw1.model.dto;

public class Textbook extends Book{
	
	private String subject;
	
	
	
	public Textbook() {}

	
	// 매개
	public Textbook(String title, String author, String subject) {
		super(title,subject);
		this.subject = subject;
	}

	
	// GETTER/SETTER
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void displayInfo() {
		System.out.print("\n[전문 서적] 제목 : " +  getTitle() + " / ");
		System.out.print("저자 : " +  getAuthor() + " / ");
		System.out.print("과목 : " +  getSubject());
	}
	

}
