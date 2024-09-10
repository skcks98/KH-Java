package com.hw3.model.vo;


public class Product {

	private int pId;  // 제품 번호
	private String pName;  // 제품명
	private int price;  // 제품 가격
	private double tax;  // 제품 세금
	
	
	
	public Product() {} // 기본생성자



	// 매개변수 생성자
	public Product(int pId, String pName, int price, double tax) {
		
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}


	
	
	
	// Getter/ Setter

	public int getpId() {
		return pId;
	}



	public void setpId(int pId) {
		this.pId = pId;
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public double getTax() {
		return tax;
	}



	public void setTax(double tax) {
		this.tax = tax;
	}



	
	public String information() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", tax=" + tax + "]";
	}
	

	
}
