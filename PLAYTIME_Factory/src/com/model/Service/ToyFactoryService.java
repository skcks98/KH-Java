package com.model.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.model.dto.Toy;

public class ToyFactoryService {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>(); 
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> materialMap = new HashMap<Integer, String>(); 
	// 재료가 저장되어있는 map 
	
	// 기본 생성자
	public ToyFactoryService() {
		materialMap.put(1,"면직물");
		materialMap.put(2,"플라스틱");
		materialMap.put(3,"유리");
		materialMap.put(4,"고무");
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", new HashSet<String>() ));
		toySet.add(new Toy("허기위시", 5, 12000, "파란색", "19940312", new HashSet<String>() ));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", new HashSet<String>() ));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", new HashSet<String>() ));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", new HashSet<String>() ));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 메뉴 출력 메서드
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("\n<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 메뉴 종료 ");
			
			System.out.println("선택 : ");
			
			try {
				menuNum = sc.nextInt();
				System.out.println();

				switch (menuNum) {
				case 1:
					selectAllToy();
					break;
				case 2:
					addNewToy();
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;
				
				case 0:
					System.out.println("프로그램 종료..");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}

			} catch (InputMismatchException e) {
				System.out.println("\nerror: 입력형식이 유효하지 않습니다. 다시 시도해주세요");

				sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거

				menuNum = -1; // 첫 반복 시 잘못입력하는 경우
				// menuNum이 0을 가지고 있어 종료되는데,
				// 이를 방지하기 위해 임의값 -1 대입

			}
			
		} while(menuNum != 0);
	
			
		
	}
	
	
	
	







	public void selectAllToy() {
		System.out.println("<전체 장난감 목록>");
		
		for(Toy toy : toySet) {
			System.out.println(toy);
		}
	}
	
	
	
	
	public void addNewToy() {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String ToyName = sc.nextLine();
		
		// 이름 중복 체크
		//처음에 장난감 이름을 먼저 받고 검사 후 같은 이름의 장난감이 없다면 추가 입력받도록 함
		//이미 존재한다면 이미 같은 이름을 가진 장난감이 존재한다는 메세지 띄우고 메서드 종료.

		for(Toy toy : toySet) {
			if(toy.getName().equals(ToyName));
			System.out.println("같은 이름의 장난감이 존재합니다.");
			return;
		}
		
		
		System.out.print("사용 가능 연령 : ");
		int ToyAge = sc.nextInt();
		
		System.out.print("가격 : ");
		int ToyPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String ToyColor = sc.nextLine();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String ToyManufactureDate = sc.nextLine();
		
	
		
		
		Set<String> materials = new HashSet<String>();
		String input;
		System.out.println("사용가능한 재료 목록 :");
		
		
		
		
		System.out.println("재료를 입력하세요(종료하면 'q'를 입력하세요.");
		
		
		System.out.println("새로운 장난감이 추가되었습니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
