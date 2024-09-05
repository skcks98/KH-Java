package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
	// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
	// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력

	// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
	// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력

	// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
	// 7) 할인된 가격 = 가격 - (가격 * 할인율)
	
	
	public void practice() {
		
		Book book1 = new Book();
		
		Book book2 = new Book("자바의정석", 30000, 0.2, "남궁성" );
		
		
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        // 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
        book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
//		System.out.printf("%s / %d / %.1f / %s\n", book1.getTitle(), book1.getPrice(),
//				book1.getDiscountRate(), book1.getAuthor());
//		
//		System.out.printf("%s / %d / %.1f / %s\n", book2.getTitle(), book2.getPrice(),
//				book2.getDiscountRate(), book2.getAuthor());
		
		
		System.out.println("=========================");
		System.out.println("수정된 결과 확인");
		
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		System.out.println(book1.toString());
		
//		System.out.printf("%s / %d / %.1f / %s\n", book1.getTitle(), book1.getPrice(),
//				book1.getDiscountRate(), book1.getAuthor());

		
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		
		int discountPrice1 = (int)(book1.getPrice() - (book1.getPrice() * book1.getDiscountRate()));
		
		int discountPrice2 = (int)(book1.getPrice() - (book2.getPrice() * book2.getDiscountRate()));
		
		
		
		System.out.println("=========================");
		
		System.out.printf("\n도서명 : %s", book1.getTitle());
		System.out.printf("\n할인된 가격 : %d", discountPrice1);
		System.out.printf("\n도서명 : %s", book2.getTitle());
		System.out.printf("\n할인된 가격 : %d", discountPrice2);
		
	}
	
	
	

	
	
	
}
