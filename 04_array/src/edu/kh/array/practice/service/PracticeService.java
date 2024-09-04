package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {

		// 배열 선언 및 할당
		int[] arr = new int[9];

		// 짝수번째 인덱스 값의 합
		int sum = 0;

		// 배열 값 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) { // 짝수 인덱스 반복
				sum += arr[i];
			}
		}
		System.out.println();

		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {

		int[] arr = new int[9];

		// 짝수번째 인덱스 값의 합
		int sum = 0;

		// 배열 값 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

			if (i % 2 == 1) { // 짝수 인덱스 반복 i = i +2
				sum += arr[i];
			}
		}
		System.out.println();

		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");

		int[] arr = new int[sc.nextInt()];

		// 배열 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
		System.out.println("검색할 값 : ");
		int search = sc.nextInt();

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) { // 검색 일치
				System.out.println("인덱스 : " + i);
				flag = false; // 찾았다면 flag를 false로 변경
				break;
			}
		}

		if (flag) { // 못찾았다.
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	public void practice5() {
		// 1. 사용자에게 문자열 입력받기

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next(); // 공백 포함하려면 nextLine()

		// 2. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 먼저 사용자가 입력한 문자열(str)의 길이만큼의 char 배열을 할당.
		char[] arr = new char[str.length()];

		int count = 0; // 같은 글자 개수를 세기 위한 변수

		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. 문자 입력받기 (검색할 문자)
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		// 4. 검색할 문자가 문자열에 몇개가 들어가 있는가, 어느 인덱스에 있는가

		System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스) : ");

		// 인덱스마다 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
				System.out.print(i + " "); // 해당되는 인덱스 이어서 출력해주기

				count++; // count 1 증가
			}
		}

		System.out.println(ch + "개수 : " + count);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("총합 : " + sum);
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) :");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			if (i >= 8) {
				arr[i] = '*';
			} else {
				arr[i] = str.charAt(i);
			}
		}

		System.out.println(arr);
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) {
				System.out.print("다시 입력하세요.");
			} else {

				// 입력받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];

				int num = 0; // arr 배열에 대입될 값

				for (int i = 0; i < arr.length; i++) {

					// 요소에 값 대입
					if (i <= arr.length / 2) { // 중간 이전까지 -> 증가
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}

					// 각 요소에 대입된 값 출력
					// 출력시, 추가(단, 마지막 제외)
					if (i == arr.length - 1) {
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}
				} // for문 끝

				break; // while 반복 멈춤
			}

		}

	}
	
	

	public void practice9() {

		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1); // 1~ 10

			arr[i] = random;

			System.out.print(arr[i] + " ");
		}

	}
	
	

	public void practice10() {

		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1); // 1~ 10

			arr[i] = random;

			System.out.print(arr[i] + " ");
		}

		// 최고 , 최저
		int max = 1; //최소값을 담아줄 변수
		int min = 10;

		for (int i = 0; i < arr.length; i++) {

			// 최고점 비교
			if (arr[i] > max) { // 해당 인덱스 값이 max보다 큰경우
				max = arr[i]; // 해당 값을 max 변수에 담아줌
			}

			// 최저점 비교
			if (arr[i] < min) { // 해당 인덱스 값이 min보다 작은 경우
				min = arr[i]; // 해당 값을 min 변수에 담아줌
			}

		}

		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	
	

	public void practice11() {

		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1); // 1~ 10

			arr[i] = random;

			// System.out.print( arr[i] + " ");

			for (int x = 0; x < i; x++) { // 중복 제거용 for 문

				if (random == arr[x]) {

					i--;

					break;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}
	
	
	

	public void practice12() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			int random = (int) (Math.random() * 45 + 1);

			lotto[i] = random;

			for (int x = 0; x < i; x++) {

				if (random == lotto[x]) {

					i--;

					break;
				}
			}

		}
		// 결과 출력
		System.out.println("오늘의 번호");
		System.out.println(Arrays.toString(lotto));
	}
	
	
	

	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		int count = 0; // 문자 개수 세기

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			// char 배열에 문자열의 문자들을 하나씩 저장


		}
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			
			boolean flag = true; // 중복 체크용0
			
			for(int j=0; j<i; j++) {
				
				if(arr[i] == arr[j]) {
					flag = false; // 중복 발생 시
					break;
				}
				
			}
			if(flag) {
				if(i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " +arr[i]);
				}
				
				
				// 중복아닐때만 count 수 늘리기
				count++;
			}
		}

	
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
	
	

	public void practice14() {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를  입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[input];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();

		}

		while (true) {

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String userInput = sc.next();

			if (userInput.equals("Y") || userInput.equals("y")) { // yes ( Y)
				System.out.print("더 입력하고 싶은 개수 : ");
				int plusInput = sc.nextInt();

				// arr 길이에 + input 새로운 배열의 길이

				// 새로 값을 입력받을 배열 생성 -> 기존 배열 크기 + 추가 입력 개수
				String[] copyArr = Arrays.copyOf(arr, arr.length + plusInput);

				// 입력한 새로운 값 출력
				// 배열 복사 + 새로운 문자열 입력받기
				for (int i = 0; i < copyArr.length; i++) {
					System.out.print((i + 1) + "번째 문자열 : ");

					sc.nextLine(); // 개행 문자 처리
					copyArr[i] = sc.next();

					arr = copyArr;

				}

			} else if (userInput.equals("N") || userInput.equals("n")) { // no (N)

				System.out.print(Arrays.toString(arr)); // 입력 값 전체 출력 !

				break;

			} else { // 다른 것을 입력

				System.out.println("잘못 입력하셨습니다.");

				continue;
			}

		}

	}

}


/* 문제 14 다른 버전
   public void practice14() {
		 // 1. 첫 배열 크기 지정
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("배열의 크기를 입력하시오 : ");
		 int size = sc.nextInt();
		 sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
		 
		 String[] arr = new String[size];
		 
		 // 2. 첫 배열에 저장할 문자열 입력받기
		 for(int i = 0; i < arr.length; i++) {
			 
			 System.out.print((i+1) + "번째 문자열 : ");
			 arr[i] = sc.nextLine();
			 
		 }
		 
		 // 3. 반복이 시작되는 구간부터 무한반복하는 while 작성하여 내부에 종료조건 만들어서 break
		 while(true) {
			 System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			 char ch = sc.nextLine().charAt(0);
			 
			 // 4. 값을 더 입력할 경우
			 if(ch == 'y' || ch == 'Y') {
				 
				 // 5. 더 입력받을 개수 입력 받기
				 System.out.print("더 입력하고 싶은 개수 : ");
				 int addSize = sc.nextInt();
				 sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				 
				 // 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				 String[] newArr = new String[arr.length + addSize];
				 
				 // 7. 배열 복사 + 새로운 문자열 입력받기
				 for(int i = 0; i < newArr.length; i++) {
					 
					 if(i < arr.length ) { // 인덱스의 크기가 기존배열보다 작을 경우
						 newArr[i] = arr[i]; // 기존 배열 요소 값 복사
						 
					 } else { // 인덱스 크기가 기존 배열보다 클 경우 새로운 입력 받기
						 System.out.print((i+1) + "번째 문자열 : ");
						 newArr[i] = sc.nextLine();
					 }
					 
					 
				 }
				 
				 // 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				 arr = newArr;
				 
				 
			 } else if(ch == 'n' || ch == 'N') { // 값을 더 입력하지 않은 경우
				 break; // while 반복문 종료
				 
			 } else { // 잘못 입력한 경우
				 System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			 }
			 
			 
		 }
		 
		 
		 
		 // 10. 배열값 모두 출력
		 System.out.println(Arrays.toString(arr));
		 
		 
		 
	 }
}
*/


