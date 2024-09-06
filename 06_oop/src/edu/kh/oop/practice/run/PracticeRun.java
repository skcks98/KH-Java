package edu.kh.oop.practice.run;

import java.util.Scanner;

import edu.kh.oop.abstraction.model.service.BookService;
import edu.kh.oop.abstraction.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BookService service = new BookService();
		//service.practice();
		
		// 클래스 안에 생성자가 하나도 없다면
		// 컴파일러가 기본 생성자는 자동으로 만들어줌
		// -> 그래서 우리가 BookService() 이렇게 가능함
		// -> 생성자가 하나라도 있으면 기본 생성자 자동으로 생성 x
		// -> 
		
		
		
		
		
		HeroService service2 = new HeroService();
		
		service2.practice();
	}

}


