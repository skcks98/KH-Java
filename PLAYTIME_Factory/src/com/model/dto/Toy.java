package com.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {
	private String name; // 장난감 이름
	private int age; // 사용 가능 연령
	private int price; // 가격
	private String color; // 색상
	private String manufactureDate; // 제조일(문자열로 표현 - 20240222)
	private Set<String> materials; // 재료 (중복되지 않는 값으로 저장)

	// 기본 생성자
	public Toy() {}

	
	
	// 매개 변수 생성자
	public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
	}

	
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}


	// toString
	@Override
	public String toString() {
		return "Toy [장난감이름 : " + name + " / 사용연령 :" + age + " / 가격 : " + price + " / 색상 : " + color + " / 제조년월일 : "
				+ manufactureDate + " / 사용재료 : " + materials + "]";
	}


	// hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}


	// equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
	
	
	
	
}
