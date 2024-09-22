package edu.kh.oop.practice.model.vo;

public class Book {

	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	public Book() { } // 기본 생성자  단축키 (ctrl + space + enter)
	
	
	// 매개변수 - alt + shift + s -> Generate Constructor using Fields -> generate
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	
	
	
	// 도서명
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// 가격
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 할인율
	
	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	// 저자명
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	// toString 메서드
	// 어노테이션 : 컴파일러용 주석
	
	@Override  
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}
	
	
	
	
	
}
