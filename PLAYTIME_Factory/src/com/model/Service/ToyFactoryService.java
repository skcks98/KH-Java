package com.model.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.model.dto.Toy;

public class ToyFactoryService {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>(); 
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> materialMap = new HashMap<Integer, String>(); 
	// 재료가 저장되어있는 map 
	
	// -> 장난감 객체 생성 시 재료 부분은 가변인자 또는 
	// List.of() 또는 Arrays.asList() 사용 할 수 있음
	
	// 기본 생성자
	public ToyFactoryService() {
		materialMap.put(1,"면직물");
		materialMap.put(2,"플라스틱");
		materialMap.put(3,"유리");
		materialMap.put(4,"고무");
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", new HashSet<>(List.of("면직물","고무")) ));
		toySet.add(new Toy("허기위시", 5, 12000, "파란색", "19940312", new HashSet<>(List.of("면직물","플라스틱")) ));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", new HashSet<>(List.of("면직물","플라스틱")) ));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", new HashSet<>(List.of("면직물","플라스틱") )));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", new HashSet<>(List.of("면직물","플라스틱","고무")) ));
		
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
					removeToy();
					break;
				case 4:
					sortByDate();
					break;
				case 5:
					GroupByAge();
					break;
				case 6:
					addMaterial();
					break;
				case 7:
					removeMaterial();
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
	
	




	/**
	 *  장난감 조회 (완)
	 */
	public void selectAllToy() {
		System.out.println("<전체 장난감 목록>");
		
		for(Toy toy : toySet) {
			System.out.println(toy);
		}
	}
	
	
	
	/**
	 *  장난감 추가 (미완)
	 */
	public void addNewToy() throws InputMismatchException {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String toyName = sc.nextLine();
		
		sc.nextLine();
		
		// 이름 중복 체크
		//처음에 장난감 이름을 먼저 받고 검사 후 같은 이름의 장난감이 없다면 추가 입력받도록 함
		//이미 존재한다면 이미 같은 이름을 가진 장난감이 존재한다는 메세지 띄우고 메서드 종료.

		for(Toy toy : toySet) {
			if(toy.getName().equals(toyName)) {
			System.out.println("같은 이름의 장난감이 존재합니다.");
			return;
			}
		}
		
		
		System.out.print("사용 가능 연령 : ");
		int toyAge = sc.nextInt();
		
		System.out.print("가격 : ");
		int toyPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String toyColor = sc.nextLine();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String toyManufactureDate = sc.nextLine();
		
	
		
		// 재료 선택
		Set<String> materials = new HashSet<>();
		
		System.out.println("사용가능한 재료 목록 :");
		for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		
		
		while(true){
			System.out.println("재료를 입력하세요(종료하면 'q'를 입력하세요) : ");
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("q")) {
				System.out.println("새로운 장난감이 추가되었습니다.");
				break;
			}
			
			if(materialMap.containsValue(input)) {
				materials.add(input);
			} else {
				System.out.println("잘못된 재료명 입니다,");
			}
			
			Toy newToy = new Toy(toyName,toyAge,toyPrice,toyColor,toyManufactureDate,materials);
			
			toySet.add(newToy);
			
			
			
		}
		
		
	}
	
	
	
	
	
	/**
	 *  장난감 제거 (미완)
	 */
	public void removeToy() throws InputMismatchException {
		
		System.out.println("삭제할 장난감의 이름을 입력하세요 : ");
		
		
		String toyName = sc.nextLine();
		sc.nextLine();
		
		
		for(Toy toy : toySet) {
			if (toy.getName().equals(toyName)) {
				toySet.remove(toy);
				System.out.println("장난감이 삭제되었습니다.");
				return;
			}
		}
		
		System.out.println("해당 장난감을 찾을 수 없습니다.");
		
		
		
	}

	
	
	
	/**
	 * 장난감 제조일 순으로 조회하기 (완)
	 */
	public void sortByDate() {
		
		// set을 list로 변환
		List<Toy> toyList = new ArrayList<>(toySet);
		
		// Comparator 사용 List 정렬
		Comparator<Toy> dateComparator = Comparator.comparing(Toy::getManufactureDate);
		Collections.sort(toyList, dateComparator);
		
		for(Toy toy : toyList) {
			System.out.println(toy);
		}
	}

	
	
	

	/**
	 * 연령별 사용 가능한 장난감 리스트 조회하기
	 */
	public void GroupByAge() {
		
		List<Toy> toyList = new ArrayList<>(toySet);
		toyList.sort(Comparator.comparingInt(Toy::getAge));
		
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		
		for(Toy toy : toyList) {
			System.out.println( toy);
		}
		
		
	}



	




	/**
	 * 
	 *** 재료 추가/ 재료 제거에서 현재 등록된 재료 목록 출력할 땐 entrySet() 이용해보기 ***

		Set<Map.Entry<K,V>> Map.entrySet()

	 * 재료 추가
	 */
	public void addMaterial() throws InputMismatchException {
	 System.out.println("<재료 추가>");
	 System.out.println("---현재 등록된 재료---");
	 
	// 현재 등록된 재료 출력
	for (Map.Entry<Integer, String> entry : materialMap.entrySet()) {
	    System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	 
	 System.out.println("-----------------------");
	 System.out.print("재료 고유번호(Key) 입력 : ");
	 int KeyNum = sc.nextInt();
	 
	 sc.nextLine();
	 
	 System.out.print("재료명 입력 : ");
	 String materials = sc.nextLine();
	 
	 if(materialMap.containsKey(KeyNum)) {
		 System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
		 System.out.println("덮어쓰시겠습니까? (Y/N) : ");
		 
		 String answer = sc.nextLine();
		 
		 if(answer.equalsIgnoreCase("Y")) {
			 materialMap.put(KeyNum, materials);
			 System.out.println("성공적으로 덮어쓰기 완료");
		 } else {
			 System.out.println("재료 추가 취소");
		 }
	 }   else { // 덮어쓰지 않고 새로운 장난감 등록 시
		 
		 materialMap.put(KeyNum, materials);
		 System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		 
			
	 
	 
	 }
	
	}

	
	

	/**
	 * 재료 제거
	 */
	public void removeMaterial() throws InputMismatchException { 
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
