package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	// 기본
	public Student() {}

	
	// 매개
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age,height,weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	
	// 게터/세터
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String information() {
		return  super.information() + " 학년 : " + grade + " / " + "전공 : " + major;
		
	}

}
