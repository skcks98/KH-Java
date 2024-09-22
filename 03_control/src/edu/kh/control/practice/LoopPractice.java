package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice { // 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	// 문제 1
	public void practice1() {
		
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number >= 1) {
			for(int i=1; i<= number; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}		
	}
	

	
	public void practice2() {
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number >= 1) {
			for(int i=number; i>= 1; i--) {
				System.out.print(i  +" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}		
	}
	
	
	
	public void practice3() {
		
		System.out.println("정수를 하나 입력하세요 : ");
		int number = sc.nextInt();
		
		int sum =0;
		
		
		for(int i=0; i<number; i++) {
			sum += (i + 1);
			
			System.out.print(i + 1);
			if(i + 1 == number) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
			
			System.out.print(sum);
		}	
	}
	
	
	
	public void practice4() {
		System.out.println("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		int num1,num2;
		
		if(input1 < 1 || input2 <1) 
			System.out.println("1이상의 숫자를 입력해주세요.");
		 else {
			if(input1 < input2) {
				num1 = input1;
				num2 = input2;
			} else {
				num1 = input2;
				num2 = input1;
			}
			for(int i= num1; i<=num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void practice5() {
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("=====" + input +"단 =====");
		for(int i=0; i<=9; i++) {
			
				System.out.println(input + " * " + (i+1) + " = " + input*(i+1));
			
		}
	}
	
	
	public void practice6() {
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
		} else {
			for(int i=input; i<=9; i++) {
				System.out.println("==== "+ i +"단 ====");
			}
		}
	}
	
	
	public void practice7() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex. 정수 입력 : 4
		 *
		 **
		 ***
		 ****
		 * 
		 * - 행(row)은 입력한 input만큼 - 열(col)은 현재행(row)만 반복
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print("*");

			}

			System.out.println(); // 한 행의 모든 열 출력 끝나면 줄바꿈(다음행)

		}

	}

	public void practice8() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex. 정수 입력 : 4
		 ****
		 ***
		 **
		 * 
		 * 
		 * - 행(row)은 입력한 input 만큼 반복 (단, 안쪽 for문을 생각해서 1씩 감소하는 형태로 작성.) - 열(col)은 1부터
		 * 현재행(row) 범위만큼 반복
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = input; row >= 1; row--) {
			// 내가 입력한 input 값을 row에 대입하여 반복할때마다 1씩 감소
			// 4 3 2 1..

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public void practice9() {

		/*
		 * 
		 * 정수 입력 : 4
		 *
		 **
		 ***
		 ****
		 * 
		 * 
		 * - 공백 부분이 input 보다 1 작은수에서 시작하여 1씩 감소하는것 처럼 보임
		 * 
		 * - * 부분은 현재행(row)만큼 찍힌것으로 보임
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {

			// 공백 부분 입력할 for문
			for (int i = input - 1; i >= row; i--) {
				System.out.print(" ");
			}

			// 현재 row만큼 반복하여 * 출력해줄 for문
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public void practice10() {

		/*
		 * 
		 * 정수 입력 : 3
		 *
		 **
		 *** (여기까지 위쪽삼각형)
		 **
		 *
		 * 
		 * - 위쪽삼각형 : 행(row)은 input 만큼 반복, 열(col)은 현재행(row)만큼 반복 - 아래삼각형 : 행(row)은
		 * input보다 1작은수에서부터 1씩 감소하며 반복 열(col)은 현재행(row)만큼 반복
		 * 
		 * 두개 합치기!
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 위쪽삼각형
		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println(); // 줄바꿈
		}

		// 아랫쪽삼각형
		for (int row = input - 1; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println(); // 줄바꿈
		}

	}

	public void practice11() {

		/*
		 * 
		 * 정수 입력 : 4 // 왼쪽에서부터 공백 포함 // input(4) + row(1) - 1 == 4 -> 한 행에 열(col)이 4번
		 * 반복하여 공백이나 * 찍음 // input(4) + row(2) - 1 == 5 -> 한 행에 열(col)이 5번 // input(4) +
		 * row(3) - 1 == 6 -> 한 행에 열(col)이 6번 // input(4) + row(4) - 1 == 7 -> 한 행에
		 * 열(col)이 7번
		 * 
		 * 
		 * - " " 규칙 : input - row 값이 col 이상일 때 - "*" 규칙 : col이 더 클 때 (1행 : 공백규칙 ->
		 * input(4) - row(1) ==> 3 >= col(1,2,3,4) col이 4 일 때 false 이므로 * 찍힘
		 * 
		 * (2행 : input(4) - row(2) ==> 2 >= col(1,2,3,4,5) col이 3,4,5 일때 false 이므로 * 찍힘
		 * 
		 * (3행 : input(4) - row(3) ==> 1 >= col(1,2,3,4,5,6) col이 2,3,4,5,6 일때 false 이므로
		 * * 찍힘
		 * 
		 * (4행 : input(4) - row(4) ==> 0 >= col(1,2,3,4,5,6,7) col이 1,2,3,4,5,6,7 일때
		 * false 이므로 * 찍힘(공백찍힐일 없음)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 4일때

		// 1부터 시작해서 input 까지 1씩 증가
		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= input + row - 1; col++) {
				// [1-1턴] 1 <= (4 + 1 - 1) 4
				// [1-2턴] 2 <= 4
				// [1-3턴] 3 <= 4
				// [1-4턴] 4 <= 4
				// ------------------------
				// [2-1턴] 1 <= (4 + 2 - 1) 5
				// [2-2턴] 2 <= 5
				// [2-3턴] 3 <= 5
				// [2-4턴] 4 <= 5
				// [2-5턴] 5 <= 5

				if (input - row >= col) { // 공백 조건
					// [1-1턴] (4 - 1) 3 >= 1 (true) " " 출력
					// [1-2턴] 3 >= 2 (true) " " 출력
					// [1-3턴] 3 >= 3 (true) " " 출력
					// [1-4턴] 3 >= 4 (false) "*" 출력
					// ---------------------------------
					// [2-1턴] (4 - 2) 2 >= 1 (true) " " 출력
					// [2-2턴] (4 - 2) 2 >= 2 (true) " " 출력
					// [2-3턴] (4 - 2) 2 >= 3 (false) "*" 출력
					// [2-4턴] (4 - 2) 2 >= 4 (false) "*" 출력
					// [2-5턴] (4 - 2) 2 >= 5 (false) "*" 출력

					System.out.print(" ");

				} else { // * 조건
					System.out.print("*");
				}

			}

			System.out.println();
			// [1-5턴] col이 5가 되면서 안쪽 for문 false로 줄바꿈하고 바깥for문 다시감

		}

	}

	public void practice12() {

		/*
		 * 
		 * 정수 입력 : 5
		 *****
		 * * * *
		 *****
		 * 
		 * - input == row(행) - 1행과 input행은 "*" 출력 - 1열과 input열은 "*" 출력
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= input; col++) {

				// 첫 번째 / 마지막 행, 첫 번째, 마지막 열 * 출력
				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");

				} else { // 나머지는 공백 출력
					System.out.print(" ");

				}
			}

			System.out.println();

		}

	}

	public void practice13() {
		/*
		 * 
		 * 1부터 사용자에게 입력 받은 수까지 중에서 1) 2와 3의 배수를 모두 출력하고 2) 2와 3의 공배수의 개수를 출력하세요.
		 * 
		 * ex) 자연수 하나를 입력하세요 : 15 2 3 4 6 8 9 10 12 14 15 count : 2
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= input; i++) {

			// 2의 배수 또는 3의 배수인 경우 출력
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");

				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다.
				if (i % 2 == 0 && i % 3 == 0) {
					// 갯수세기
					count++;
				}

			}

		}

		System.out.println("\ncount : " + count);

	}
}