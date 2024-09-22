package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	private String region;
	private char gender;
	private int score;
	
	// 기본
	public Student() {}
	

	// 매개
	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
	}

	
	// Getter/Setter
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


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	// toString 오버라이딩
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", score="
				+ score + "]";
	}


	@Override
	public int compareTo(Student other) {
		// compareTo() : 객체를 정렬하기 위해 사용하는 메서드
		// 두 객체를 비교하고 그 겨롸로 정수를 반환함
		// 현재 객체의 값과 다른 객체의 값을 비교
		 
		// 현재 객체 나이 - 다른객체 나이 -> 비교
		// 값이 양수면 현재 객체가 더 크다
		// 음수면 더 작다.
		
		return this.age - other.age; // 나이를 오름차순 정렬
		//return other.age - this.age; // 나이를 내림차순 정렬
	}
	
	
	
	
	
	
}
