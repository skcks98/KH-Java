package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
	
		// SmartPhone 객체 생성
		SmartPhone sPhone = new SmartPhone("Samsung","Galaxy s20",2020,1200000,"Android",128);
		
		// 사용자정의 자료형 참조변수명
		sPhone.printInfo();
		
		System.out.println("=============================================================================");
		
		// BasicPhone 객체 생성
		BasicPhone bPhone = new BasicPhone("Nokia","3310",2000,100000,true);
		bPhone.printInfo();
		bPhone.checkKeyboard();
	}

}
