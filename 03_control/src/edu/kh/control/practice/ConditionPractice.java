package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	// 문제 1
	public void practice1() {
		
		System.out.print("숫자를 한개 입력하세요 : ");
		
		int input = sc.nextInt();
		
		String result;
		
		if(input % 2 != 0) {
			result = "홀수입니다";
		} else {
			if  (input < 0) {
				result = "양수만 입력해주세요";
			} else {
				result = "짝수입니다.";
			}
		}
		System.out.println(result);
	}
	
	
	// 문제2
	public void practice2() {
			
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english; // 합계
		
		double avg = sum / 3.0;
		
		if(korean >=40 && math >= 40 && english >=40 && avg >= 60) { // 합격
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다,합격입니다!");
			
		} else { // 불합격
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("불합격입니다..");
		}
	}
	
	
	// 문제3
	public void practice3() {
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
			
		default: System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
		
	}
	
	
	
	// 문제4
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		String result = null;
		
		double BMI = weight / (height * height); 
		
		if(BMI < 18.5) {
			result = "저체중";
		} else if (BMI < 23) {
			result = "정상체중";
		} else if( BMI < 25) {
			result = "과체중";
		} else if( BMI < 30) {
			result = "비만";
		} else if(BMI >= 30) {
			result = "고도 비만";
		}
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(result);
	}
	
	
	// 문제5
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		int exam1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int exam2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int report = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int attendance = sc.nextInt();
		
		System.out.print("=================== 결과 =================\n");
		

		 exam1 *= 0.2;
		 exam2 *=  0.3;
		 report *= 0.3;
		
		
		
		if(attendance <= 20 * (1-0.3)) { // 14번 이하 출석시
			System.out.println("Fail [출석 횟수 부족] (" +(int)attendance + "/20)");
			
		} else { // 출석 만족시
			System.out.printf("중간 고사 점수(20) : %.1f \n", exam1);
			System.out.printf("기말 고사 점수(20) : %.1f \n", exam2);
			System.out.printf("과제 점수(30) : %1.f \n", report);
			System.out.printf("출석 횟수(20) :  %1.f \n", attendance);
			
			double total = exam1 + exam2 + report + attendance;
			
			System.out.printf("총점 : %1.f \n", total);
			
			if(total >= 70) {
				System.out.printf("PASS");
			} else {
				System.out.printf("Fail");
			}
		} 
		
		
	}
	
}
