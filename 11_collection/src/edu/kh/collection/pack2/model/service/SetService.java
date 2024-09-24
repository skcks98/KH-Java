package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

	/* Set(집합, 주머니)
	 * - 기본적으로 순서를 유지하지 않음
	 * 	(index 없음! -> get() 메서드가 없음)
	 * 
	 * - 중복 데이터 저장 X (같은 객체가 들어오면 덮어쓰기)
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet(대표) : 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 3. TreeSet : 자동정렬되는 Set
	 * 
	 * 
	 * */
	
	
	public void method1() {
		// HashSet 객체 생성
		
		Set<String> set = new HashSet<String>();
		//Set<String> set = new LinkedHashSet<String>();
		//Set<String> set = new TreeSet<String>();
		
		// 다형성 중 업캐스팅 적용
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set);
		// HashSet 순서유지 X
		// LinkedHashSet 순서유지 O
		// TreeSet 자동 정렬 O
		
		
		// 중복 저장 확인 -> 중복 저장 X 확인
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println(set);
		
		
		// null도 중복 X 확인
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set); // null 1회 출력
		
		
		// 2. int size() : Set에 저장된 객체의 수 반환
		System.out.println("set.size() : " + set.size());
		
		
		// 3. boolean remove(E e) : 
		// 전달받은 매개변수 e를 Set에서 제거
		// 제거 성공 true, 없으면 false 
		
		System.out.println(set.remove("배달의민족"));
		System.out.println(set.remove("유플러스"));
		System.out.println(set); 
		
		
		// 4. boolean contains(E e) :
		// 전달받은 e가 Set에 있으면 true, 없으면 false
		System.out.println("쿠팡 있는지 검사 : " + set.contains("쿠팡"));
		System.out.println("삼성 있는지 검사 : " + set.contains("삼성"));
		System.out.println(set); 
		
		
		// 5. void clear() : Set에 저장된 내용을 모두 삭제
		set.clear();
		
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println(set.isEmpty());
		System.out.println(set);
	
	}
	
	
	
	/** alt + shift + j
	 * 
	 * 
	 * - Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1. Iterator
	 * 2. LIst로변화ㅣ
	 * 3. 향상된 for문
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");

		// 1. Iterator 활용
		
		
		Iterator <String> it =set.iterator();
		
		
		// boolean Iterator.hasnnext
		
		System.out.println("[Iterator]");
		while(it.hasNext()) {
			
			
			String temp = it.next();
			System.out.println(temp);
		}
		
		
		System.out.println("===========================================");
		
		System.out.println("[List로 변환]");
		
		
		// set에 저장된 객체를 이용해서 List 를
		
		
		
		
	

		
		
		System.out.println("===========================================");
		System.out.println("[향상된 for문]");
		
		for (String snack : set){
			System.out.println(snack);
		}
			
		}
		
	
	
	
	
	/** 
	 * 직접 만든 클래스(Per를 이용해 만든 객체를
	 * Set에 저장 
	 */
	public void method3() {
		
		Person p1 = new Person("홍길동",25,'남');
		Person p2 = new Person("홍길동",25,'남');
		Person p3 = new Person("홍길동",30,'남');
		Person p4 = new Person("김길순",20,'여');
		
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		System.out.println("---------------------------");
		
		for(Person p : personSet) {
			System.out.println(p);
		}
		
		
		System.out.println("---------------------------");
		
		// hashcode() : 객체 식별 번호를 반환
		// 같은 필드 값을 가진 객체는 번호가 같다!
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		// A.equals(B) : A와 B가 가지고 있는 필드값이 같다면 true
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		//***********************************************************
		// Hash라는 단어가 포함된 컬렉션 이용 시
		// hashCode(), equals() 오버라이딩 필수적으로 진행해야 한다!!!
		//***********************************************************
		
	}
		
	
	
	/**
	 * TreeSet 이용한 로또번호 생성기
	 * -> 기본 오름차순 정렬
	 * - 전제조건 : 저장되는 객체는 Comparable 인터페이스 상속이 필수!
	 * -> Integer는 Comparable 상속 되어있음
	 */
	public void method4() {
		
		// 난수 생성
		// 1) Math.random()
		// 2) Random.nextInt()
		
		// 랜덤 객체 생성
		Random random = new Random();
		
		// Integer를 저장할 TreeSet 객체 생성
		// Integer(객체, Wrapper class) <==> int (기본자료형)
		Set<Integer> lotto = new TreeSet<Integer>();
		
		// lotto에 저장된 값이 6개 미만이면 반복
		// == 6개 멈춤
		while(lotto.size() < 6) { 
			
			lotto.add(random.nextInt(45) + 1); // 1 ~ 45
			
			System.out.println(lotto);
			
		}
		
	}
	
	
	/** 로또 번호 생성기
	 * 금액을 입력받아 (천원 단위)
	 * 1000원 당 1회씩 번호를 생성해서 List에 저장한 후
	 * 생성 종료 시 한 번에 출력
	 * 
	 * <pre>
	 * 금액 입력 : 3000 
	 * 
	 * 1회 : [11,23,45,6,21,44]
	 * 2회 : [1,3,4,6,2,41]
	 * 3회 : [17,22,35,45,28,4]
	 * 
	 * 
	 * </pre>
	 * 
	 */
	public void lottoNumberGenerator() {
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력 : ");
		int num = sc.nextInt();
		
		// 생성된 로또 번호 묶음(TreeSet)을 저장할 List
		List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
		
		// 랜덤 객체 생성
		Random random = new Random();
		
		int roudns = num / 1000;
		
		// for문 반복될때마가 새로운 treeSet 객체 생성
		for(int i=0; i<roudns ; i++) {
			
			Set<Integer> lottoSet = new TreeSet<Integer>();
			
			// lotto에 저장된 값이 6개 미만이면 반복
			// == 6개 멈춤
			while(lottoSet.size() < 6) { 
				
				lottoSet.add(random.nextInt(45) + 1); // 1 ~ 45
			}
			
			lottoList.add(lottoSet); // List에 Set을 추가
		}
		
		// 출력용 반복문
		for(int i=0; i<lottoList.size(); i++) {
			System.out.println((i+1) + "회 : " + lottoList.get(i));
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
