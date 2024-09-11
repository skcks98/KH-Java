package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre;
	
	public Novel() {}

	
	
	
	// 매개
	public Novel(String title, String author, String genre) {
		super(title,author);
		this.genre = genre;
	}




	// GETTER/SETTER
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void displayInfo() {
		System.out.print("[소설] 제목 : " +  getTitle() + " / ");
		System.out.print("저자 : " +  getAuthor()+ " / ");
		System.out.print("장르 : " +  getGenre() );
	}
}
