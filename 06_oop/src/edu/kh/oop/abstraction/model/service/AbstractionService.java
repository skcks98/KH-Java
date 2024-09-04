package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형처럼 사용된다.
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고도 부른다!!! *
		
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "1234567-1234567";
		p1.address = "서울시 중구 남대문로 120 그레이츠 청계 3층 E 강의장";
		p1.phone = "010-1234-5678";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		
		
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠 청계 3층 E 강의장");
		p1.setPhone("010-1234-5678");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		
		// 본인 객체
		// People 클래스 이용해 chanwoong
		
		People chanwoong = new People();
		
		chanwoong.setName("나찬웅");
		chanwoong.setGender('남');
		chanwoong.setpNo("123456-1234567");
		chanwoong.setAddress("서울시 성북구 장위동 꿈의숲아이파크");
		chanwoong.setPhone("010-8561-4509");
		chanwoong.setAge(27);
		
		System.out.println(chanwoong.getName());
		System.out.println(chanwoong.getGender());
		System.out.println(chanwoong.getpNo());
		System.out.println(chanwoong.getAddress());
		System.out.println(chanwoong.getPhone());
		System.out.println(chanwoong.getAge());
		
	}

}