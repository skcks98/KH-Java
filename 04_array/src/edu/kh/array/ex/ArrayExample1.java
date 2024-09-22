package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 { // 예제 작성용
 
	/*
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불려지고
	 * 	구분은 index를 이용함. (index는 0부터 시작하는 정수)
	 * 
	 
	 * */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여.
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10이라는 값을 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : "+ num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//-------------------------------------------------------------------
		
		
		// 배열 선언
		int[] arr; // int arr[];
		// Stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// *(중요) : 해당 변수는 참조형으로 주소값만을 저장할 수 있다. 
		
		// 배열 할당
		arr = new int[3];
		
		// new : "new 연산자"라고 하며 
		// 		Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당.
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 3칸짜리 int[] 을 생성(할당)
		
		// arr = new int[3];
		// int[] int[] -> 같은 자료형 == 연산 가능
		
		System.out.println("arr : " + arr); // [I@68fb2c38 - 주소
		
		// Heap 영역에 생성된 공간은 절대 비어있을 수 없다!
		// JVM 기본값이 들어가져 있다.
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		System.out.println(arr[0]); // 0
		System.out.println(arr[1]); // 0
		System.out.println(arr[2]); // 0
		
		// 배열 요소 값 대입
		arr[0] =10;
		arr[1] =50;
		arr[2] =1000;
		
		System.out.println(arr[0]); // 10
		System.out.println(arr[1]); // 50
		System.out.println(arr[2]); // 1000
		
		
		
		// [10, 50, 1000] 실제로 arr 배열이 가진 모든 요소의 값을 알고싶다면..
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		// arr[0~3] JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		// arr[4] = 5000;  java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 배열의 인덱스 범위 벗어남 : 길이가 4칸짜리 배열인데, 없는 인덱스 번호인 4에 접근하려해서
	
		
		
		// 배열의 길이 (몇칸인가 ?) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열과 for문
		for(int i =0; i<arr.length; i++) {
			// i-> 0 1 2 3 
			System.out.printf("arr[%d]의 저장된 값 : %d\n", i, arr[i]);
		}
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력: 175.8
		// 2번 키 입력: 183.5
		// ...
		// 5번 키 입력: 168.1
		
		// 평균 175.05cm
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		// double[] 자료형 참조변수 height를 stack 영역에 생성하고
		// height에 heap 영역에 새로 생성된 double 5칸 짜리 배열의 주소를 대입
		
		for(int i= 0; i<height.length; i++) {
			//0 1 2 3 4
			System.out.print( (i+1) +"번 키 입력 : ");
			height[i] = sc.nextDouble();
			
		}
		System.out.println();
		
		double sum = 0; // 합계 저장용 변수
		
		for(int i=0; i< height.length; i++) {
			sum += height[i]; // 배열의 각 인덱스에 저장된 값을 sum에 누적
			
		}
		System.out.printf("\n평균 : %.2f cm",sum/height.length);
		
	}
	
	
	public void ex4() {
		// 입력받은 인원수 만큼 점수를 입력받아 배열에 저장
		// 입력이 완료되면, 점수 합계,평균,최고점,최저점 출력
		
		//ex)
		//입력 받을 인원 수 : 4
		// 1번 점수 : 100
		// 2번 점수 : 30
		// 2번 점수 : 20
		// 2번 점수 : 10
		// 2번 점수 : 70
		
		// 합계 : 230
		// 평균 : 56
		// 최고점 : 100
		// 최저점 : 10
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("입력 받을 인원 수 :  ");
		
		int input = sc.nextInt();
		
		// 배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 인원수 크기만큼(input)
		
		int[] score = new int[input];
		
		// 합계 저장용 변수
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			// 0 1 2 3 
			System.out.print( (i+1) + "번 점수 입력 : " ); // 1 2 3 4 
			score[i] = sc.nextInt();
			// score[0] = 100;
			// score[1] = 50;
			// score[2] = 30;
			// score[3] = 90;
			sum += score[i];
		}
		
		//================================
		
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			
			// 최고점 비교
			if(score[i] > max) {
				max = score[i];
			} 
			
			
			// 최저점 비교
			if(score[i] < min) {
				min = score[i];
			} 
			
		}
		
		
		System.out.println("합계 : " +sum);
		System.out.printf("평균 : %.2f\n", (double)sum/score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}
	
	
	
	public void ex5() {
		
		char[] arr = new char[5];
		
		//[A,B,C,D,E]
		for(int i=0; i<arr.length; i++) {
			// 0 1 2 3 4 
			
			arr[i] = (char)('A' + i);
		}
		
		
		
		// && Arrays 클래스
		// 자바에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		// Arrays.toString() : 모든 요소 값을 출력
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2)); // [0, 0 ,0 ,0]
		// int형 배열 4칸 짜리 생성 후 각 인덱스에 값을 대입하지 않았으므로
		// jw에 의해 int형 기본값인 0 으로 초기화 되어있음
		
		boolean[] arr3 = new boolean[4];
		System.out.println(Arrays.toString(arr3)); //[false, true]
		
		String[] arr4 =  new String[3];
		System.out.println(Arrays.toString(arr4)); // [null, null, null]
		
		
		// 배열 선언과 동시에 초기화
				char[] arr5 = {'A', 'B', 'C', 'D', 'E'};
				// { } 중괄호는 배열의 리터럴 표기법
				
				System.out.println(Arrays.toString(arr5));
		}
	
	
	
	
	
	
	public void ex6() {
		// 점심 메뉴 뽑기 프로그램
		
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		
		System.out.println("오늘 점심 메뉴 : " + arr[ (int)(Math.random() * 6)]);
		//0 1 2 3 4 5 
				
	}
	
	public void ex7() {
		// 배열을 이용한 검색
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		
		// 신호를 나타내기 위한 변수
		// flag == false : 일치하는 값이 존재하지 않음
		// flag == true : 일치하는 값이 존재한다
		
		
		boolean flag = false; // 검사전에는 없다고 가정
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == input) {
				System.out.println(i+ "번째 인덱스에 존재");
				flag = true; // 일치하는 값이 있으므로 true 로 변셩
			} 
		}
		
		// flag 상태를 검사
		// flag 가  false 라면 if 조건식이 false 이므로 수행되지 않음
		// -> ! (NOT 연산자 : 부정 논리 연산자) 붙여줌으로써 true 로 변경하여
		// {} 안에 있는 코드를 수행하게 함.
		
		if(!flag) { 
			System.out.println("존재하지 않음");
		}
		
		
	}
	
	public void ex8() {
		
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		/*
		 * 과일 입력 : 아보카도
		 * 5번 인덱스에 존재
		 * 
		 * 
		 * 과일 입력 : 수박
		 * 존재하지 않음
		 * 
		 * */
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].equals(input)) {
				System.out.println(i+ "번째 인덱스에 존재");
				flag = true; 
			} 
		}
		
		if(!flag) { 
			System.out.println("존재하지 않음");
		}	
		
	}
	
	public void ex9() {
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하지는 확인
		// 3. 단, 일치하는 문자 없을경우 "존재하지 않습니다" 출력
		/*
		 * 
		 * ex)
		 *  문자열 입력 : hello
			[h, e, l, l, o]
			검색할 문자 입력 : l
			2개 있음
		 *
		 *
		 * */
				
		// [사용해야하는 기술, 기능]
		// 1) 배열 검색
		// 2) String.length()  : 문자열의 길이
		//   ex) "Hello".length() -> 5
				
		// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		//   ex) "Hello".charAt(1)  ->  'e'
		//		 01234	
				
		// 4 ) count (숫자세기)

	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("문자열 입력 : "); // hello
		String input = sc.nextLine();
		
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		char[] arr = new char[input.length()];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
			// arr[0] = 'h'
			// arr[1] = 'e'
			// arr[2] = 'l'
			// arr[3] = 'l'
			// arr[4] = 'o'
			// char 배열에 문자열의 문자들을 하나씩 저장
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		System.out.print("검색할 문자 입력 : "); 
		char ch = sc.next().charAt(0);
		// sc.next() -> String 형
		// String.charAt(0) -> String의 0번째 인덱스 문자 하나를 추출해서 char 형태로 반환
		// "h" -> 'h'
		
		int count = 0; // 같은 글자 개수를 세기 위한 변수
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { 
				count++;
				// arr[i] 값과 검색할 문자 ch 가 같은경우
				// 카운트를 늘려라!
			}
		}
		if(count > 0) {
			System.out.println(count + "개 있음");
		} else {
			// 3. 단, 일치하는 문자 없을 경우 "존재하지 않음" 출력
			System.out.println("존재하지 않음");
		}
	}
	

	
}

