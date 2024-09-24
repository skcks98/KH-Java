package com.hw3.model.dto;

public class Book {
	
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private int price;
	private String publisher;
	
	
	// 기본
	public Book() {}


	// 매개 변수
	public Book(int bookId, String bookName, String bookAuthor, int price, String publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.publisher = publisher;
	}

	
	
	// Getter / Setter
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	
	
	// toString
	@Override
	public String toString() {
		return bookId + "번 도서 : " + "[도서제목 : " + bookName + " / 도서저자 : " + bookAuthor + " / 도서가격 : " + price
				+ " / 출판사 : " + publisher + "]";
	}
	
	
	
	
	

}
