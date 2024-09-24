package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		

		// Zoo 객체 생성
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Tiger("호랑이"));
		zoo.addAnimal(new Monkey("원숭이"));
		zoo.displayMenu();
		
		
//		// 동물원 메뉴 출력 입력한 값대로 코드 수행
//		while(true) {
//			System.out.println("****** KH 동물원 ******");
//			System.out.println("원하는 작업을 선택하세요 :");
//			System.out.println("1. 동물들의 울음소리 듣기");
//			System.out.println("2. 종료");
//			
//			System.out.println("선택 : ");
//			int num = sc.nextInt();
//			
//			
//			if(num == 1) {
//				zoo.showAnimals();
//				
//			} else if(num == 2) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//				
//			} else {
//				System.out.println("올바르지 않은 번호입니다.");
//			}
//			
//			
//		}
		
		
		
	}

}
