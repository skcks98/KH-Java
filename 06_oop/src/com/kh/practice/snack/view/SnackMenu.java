package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	// 메서드
	public void menu() {
		
		System.out.print("스낵류를 입력하세요.\n");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		// 입력받은 정보를 컨트롤러의 saveData 메서드를 통해 저장
		System.out.print(scr.saveData(kind, name, flavor, numOf, price));
		
		
		
		System.out.print("\n저장한 정보를 확인하시겠습니까?(y/n) : ");
		// 문자 하나를 입력받아 일치하는 문자가 일치하는지 확인
		char ch = sc.next().charAt(0);
		
		
		if(ch == 'Y' || ch == 'y') { // yes
			System.out.print(scr.confirmData()); 
			
		} else if (ch =='N' || ch =='n'){  // no
			System.out.print("프로그램 종료");
			
		} else {
			System.out.print("잘못 입력하셨습니다. (y/n 중에 입력해주세요)");
		}
		
		
		
	}
	

}
