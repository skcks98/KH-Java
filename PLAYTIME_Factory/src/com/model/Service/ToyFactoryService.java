package com.model.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new Toy("허기위시", 5, 12000, "파란색", "19940312", addMaterials(1, 4)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 4)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 4)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

		// 현재 제작된 장난감

		// 1. 일반 배열 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",addMaterials(new
		// int[] {1,4}))));

		// 2. List.of() 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색",
		// "19950805",addMaterials(List.of(1,4)))); -> [1,4]

		// 3. Arrays.asList() 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색",
		// "19950805",addMaterials(Arrays.asList(1,4))));

	}

	public Set<String> addMaterials(Integer... materials)/* (List<Integer> materials) */ {

		// 매개변수로 전달받은 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();

		for (Integer materialKey : materials) {

			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(value)을 가져와서
			// addedMaterials에 추가
			String materialValue = materialMap.get(materialKey);

			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null

			if (materialValue != null) { // 재료 목록에 있을 때
				addedMaterials.add(materialValue);
			}
		}

		return addedMaterials;
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
					removeMaterialByName();
					break;

				case 0:
					System.out.println("프로그램 종료..");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}

			} catch (Exception e) {
				System.out.println("\nerror: 입력형식이 유효하지 않습니다. 다시 시도해주세요");
				e.printStackTrace();

				sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거

				menuNum = -1; // 첫 반복 시 잘못입력하는 경우
				// menuNum이 0을 가지고 있어 종료되는데,
				// 이를 방지하기 위해 임의값 -1 대입

			}

		} while (menuNum != 0);

	}

	/**
	 * 장난감 조회 (완)
	 */
	public void selectAllToy() {
		System.out.println("<전체 장난감 목록>");

		for (Toy toy : toySet) {
			System.out.println(toy);
		}
	}

	/**
	 * 장난감 추가 (완)
	 */
	public void addNewToy() throws Exception {
		System.out.println("<새로운 장난감 추가>");

		System.out.print("장난감 이름 : ");
		String toyName = sc.nextLine();

		sc.nextLine();

		// 이름 중복 체크
		// 처음에 장난감 이름을 먼저 받고 검사 후 같은 이름의 장난감이 없다면 추가 입력받도록 함
		// 이미 존재한다면 이미 같은 이름을 가진 장난감이 존재한다는 메세지 띄우고 메서드 종료.

		for (Toy existingToy : toySet) {
			if (existingToy.getName().equals(toyName)) {
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
		Set<String> materials = new HashSet<String>();

		System.out.println("사용가능한 재료 목록 :");
		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// [1=면직물, 2=플라스틱, 3=유리, 4=고무]
		// set <Entry<K, V> Map.entrySet() : key=value 한 쌍으로 이뤄진 Entry 객체를
		// set 객체로 반환
		// Entry.getKey() : Entry 객체의 key 반환
		// Entry.getValue() : Entry 객체의 value 반환

		while (true) {
			System.out.println("재료를 입력하세요(종료하면 'q'를 입력하세요) : ");

			try {
				String input = sc.next();

				if (input.equalsIgnoreCase("q")) {
					System.out.println("새로운 장난감이 추가되었습니다.");
					break;

				}

				// String 형인 input을 int형 정수값으로 변환(Integer Wrapper 클래스 이용)

				int materialKey = Integer.parseInt(input); // "1" => 1
				String material = materialMap.get(materialKey); // 입력받은 재료고유번호로
				// map에 저장된 재료명(value)를 얻어옴

				if (material != null) { // 있는 재료일 때

					// materials Set객체에 해당 재료명이 존재하는지
					if (materials.contains(material)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요");

					} else {
						materials.add(material);
						System.out.println("재료가 추가되었습니다 : " + material);
					}

				} else { // 재료명이 null -> 없는 재료고유번호를 입력했다는 의미
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				}

			} catch (NumberFormatException e) { // 재료번호 입력시 숫자나 q 가 아닌 경우 예외처리 바로함
				System.out.println("숫자를 입력하거나 q를 입력하세요.");

			}

		}

		Toy newToy = new Toy(toyName, toyAge, toyPrice, toyColor, toyManufactureDate, materials);
		// 추가할 재요 저장된 새로운 Set 객체
		toySet.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다.");

	}

	/**
	 * 장난감 제거 (미완)
	 */
	public void removeToy() throws Exception {

		System.out.println("삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.nextLine();

		boolean flag = false;

		for (Toy toy : toySet) {

			if (toy.getName().equals(toyName)) {
				toySet.remove(toy);

				flag = true;

				return;
				// 1. 효율 향상을 위해 break;
				// 2. 순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생
				// -> 예외 방지 및 효율을 위해서 작성
			}
		}

		if (flag) {
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("해당 장난감을 찾을 수 없습니다.");
		}

	}

	/**
	 * 장난감 제조일 순으로 조회하기 (완)
	 */
	public void sortByDate() {
		System.out.println("<제조일 순으로 장난감을 정렬>");

		// set을 list로 변환
		List<Toy> toyList = new ArrayList<Toy>(toySet);

		// Comparator 사용 List 정렬
		Comparator<Toy> dateComparator = Comparator.comparing(Toy::getManufactureDate);
		Collections.sort(toyList, dateComparator);

		int index = 1;
		for (Toy toy : toyList) {
			System.out.println(index + "." + toy);
			index++;
		}
	}

	/**
	 * 연령별 사용 가능한 장난감 리스트 조회하기
	 */
	public void GroupByAge() { // Map< K(연령), V(List) >
		System.out.println("<연령별로 사용 가능한 장난감>");

		Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		// toysByAge라는 이름의 새로운 Map 생성
		// -> 연령을 key로 지정하고, 해당 연령을 가진 장난감 List를 value 로 가정
		// { K : V, K : V, ...}
		// -> {5 : ["키시미시", "허기워기"], 8 : ["캣냅", "마미롱레그"] , 12 : ["파피"] }
		// 컬렉션은 내가 원하는대로 막 쓸수 있음

		for (Toy toy : toySet) {
			int age = toy.getAge(); // 현재 Toy객체가 가진 나이 얻어오기

			toysByAge.putIfAbsent(age, new ArrayList<Toy>());
			// putIfAbsent() : Map에서 제공하는 메서드로,
			// 해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함
			// -> Map에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성하여 추가

			toysByAge.get(age).add(toy);
			// toysByAge.get(age) -> age(k) 에 맞는 Value 반환 -> List
			// List.add(toy) -> 전달된 toy 객체를 List에 추가
			// [연령 : 5]

		}

		/*
		 * -> toysByAge (Map) : { 5 : ["키시미시", "허기워기"], 8 : ["캣냅", "마미롱레그"], 12 : ["파피"]
		 * }
		 * 
		 * toysByAge.entrySet() (Set) :
		 * 
		 * 
		 */

		for (Entry<Integer, List<Toy>> entry : toysByAge.entrySet()) {

			int age = entry.getKey(); // 해당 entry의 key(나이)를 얻어옴
			List<Toy> toyList = entry.getValue();// 해당 entry의 value를 얻어옴

			System.out.println("[연령 :" + age + "세]");

			int index = 1;
			for (Toy toy : toyList) {
				System.out.println(index + "." + toy);
				index++;
			}

		}

	}

	/**
	 * 
	 *** 재료 추가/ 재료 제거에서 현재 등록된 재료 목록 출력할 땐 entrySet() 이용해보기 ***
	 * 
	 * Set<Map.Entry<K,V>> Map.entrySet()
	 * 
	 * 재료 추가
	 */
	public void addMaterial() throws Exception {
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료---");

		// 현재 등록된 재료 출력
		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("-----------------------");
		System.out.print("재료 고유번호(Key) 입력 : ");
		int KeyNum = sc.nextInt();

		System.out.print("재료명 입력 : ");
		String materials = sc.next();

		if (materialMap.containsKey(KeyNum)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.println("덮어쓰시겠습니까? (Y/N) : ");

			String answer = sc.nextLine();

			if (answer.equalsIgnoreCase("Y")) { // equalsIgnoreCase : 대문자인지 소문자인지 구분하지 않고 문자열 값 자체만 비교
				materialMap.put(KeyNum, materials); // 같은 key로 추가 시 value 덮어쓰기함
				System.out.println("성공적으로 덮어쓰기 완료");
			} else {
				System.out.println("재료 추가 취소");
			}
		} else { // 덮어쓰지 않고 새로운 장난감 등록 시

			materialMap.put(KeyNum, materials);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");

		}

	}

	/**
	 * 재료명으로 제거
	 */
	public void removeMaterialByName() throws Exception {

		System.out.println("<재료 삭제>");
		System.out.println("---현재 등록된 재료--->");

		// 현재 등록된 재료 출력
		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("-------------------------------------------");

		System.out.println("삭제할 재료명 입력 : ");
		String materialName = sc.next();

		boolean flag = false;

		for (Entry<Integer, String> entry : materialMap.entrySet()) {

			if (entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());

				System.out.println("재료 : '" + materialName + "'가 성공적으로 제거되었습니다.");
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}

	}

}
