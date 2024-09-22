package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary; // 급여
	private String dept; // 부서
	
	// 기본
	public Employee() {}

	
	// 매개
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age,height,weight);
		
		// name을 가지고 뭔가 할거임
		this.name = name;
		
		this.salary = salary;
		this.dept = dept;
	}
	
	
	
	// 게터/세터
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	@Override
	public String information() {
		return super.information() +  " 급여 : " + salary + " / " + "부서 : " + dept;
		
	}
	
}
