package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	Scanner sc = new Scanner(System.in);

	private List<Book> bookList = new ArrayList<Book>(); // 도서리스트
	private List<Book> bookMarkList = new ArrayList<Book>(); // 즐겨찾기

	// 기본 생성자
	public BookService() {
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));

	}

	/**
	 * 메뉴 출력용 메서드
	 */
	public void displayMenu() {
		int menuNum = 0; // 메뉴 선택용 변수

		do {
			System.out.println("\n===도서 목록 프로그램===\n");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴를 입력하세요 : ");

			try {

				menuNum = sc.nextInt();
				System.out.println();

				switch (menuNum) {
				case 1:
					addBook();
					break;
				case 2:
					selectAllBook();
					break;
				case 3:
					updateBook();
					break;
				case 4:
					removeBook();
					break;
				case 5:
					addBookMark();
					break;
				case 6:
					removeBookMark();
					break;
				case 7:
					selectBookMark();
					break;
				case 8:
					recommendBook();
					break;
				case 0:
					System.out.println("프로그램 종료..");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}

			} catch (Exception e) {
				// 예외 클래스의 최상위 클래
				System.out.println("\nerror: 입력형식이 유효하지 않습니다. 다시 시도해주세요");
				e.printStackTrace(); // 예외추적
				
				sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거

				menuNum = -1; // 첫 반복 시 잘못입력하는 경우
				// menuNum이 0을 가지고 있어 종료되는데,
				// 이를 방지하기 위해 임의값 -1 대입

			}

		} while (menuNum != 0);

	}

	
	

	/**
	 * 도서 등록 메서드
	 */
	public void addBook() {
		System.out.println("===== 도서 등록 =====");

		System.out.print("도서 번호 : ");
		int bookId = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 처리

		System.out.print("도서 제목 : ");
		String bookName = sc.nextLine();

		System.out.print("도서 저자 : ");
		String bookAuthor = sc.nextLine();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 처리

		System.out.print("도서 출판사 : ");
		String publisher = sc.next();

		Book newBook = new Book(bookId, bookName, bookAuthor, price, publisher);
		bookList.add(newBook);
		
		System.out.println("도서 등록 완료 : " + newBook.toString());

	}
	
	

	public void selectAllBook() {
		System.out.println("===== 도서 목록 조회 =====");

		if (bookList.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
	}
	
	

	public void updateBook() {
		System.out.println("===== 도서 수정 =====");

		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookId = sc.nextInt();
		sc.nextLine();

		// 해당 도서 찾기
		boolean flag = false;
		for (Book book : bookList) {
			if (book.getBookId() == bookId) {
				flag = true;

				int choice;

				do {
					System.out.println("\n1. 도서명");
					System.out.println("2. 도서 저자");
					System.out.println("3. 도서 가격");
					System.out.println("4. 도서 출판사");
					System.out.println("0. 수정 종료");

					System.out.println("\n어떤 정보를 수정하시겠습니까?");

					choice = sc.nextInt();
					sc.nextLine();

					switch (choice) {

					case 1:
						System.out.println("=====도서 제목 수정=====");
						System.out.println("수정할 도서 제목을 입력하세요 : ");

						String title = sc.nextLine();
						
						book.setBookName(title);

						System.out.println("수정 완료");
						break;

					case 2:
						System.out.println("=====도서 저자 수정=====");
						System.out.println("수정할 도서 저자를 입력하세요 : ");

						String writer = sc.nextLine();
						book.setBookAuthor(writer);

						System.out.println("수정 완료");
						break;

					case 3:
						System.out.println("=====도서 가격 수정=====");
						System.out.println("수정할 도서 가격을 입력하세요 : ");

						int price = sc.nextInt();
						book.setPrice(price);

						System.out.println("수정 완료");
						break;

					case 4:
						System.out.println("=====도서 출판사 수정=====");
						System.out.println("수정할 도서 출판사를 입력하세요 : ");

						String publisher = sc.nextLine();
						book.setPublisher(publisher);

						System.out.println("수정 완료");
						break;
						
					case 0: break;
					default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;

					}

				} while (choice != 0);
				break;
			}
		}

	}
	
	

	public void removeBook() {
		System.out.println("===== 도서 삭제 =====");

		System.out.print("삭제할 도서 번호를 입력하세요 : ");
		int bookId = sc.nextInt();
		sc.nextLine();

		for (Book book : bookList) {
			if (book.getBookId() == bookId) {
				bookList.remove(book);
				System.out.println("도서가 삭제되었습니다.");
				return;
			}
		}
		System.out.println("해당 번호를 찾을수 없습니다.");

	}
	
	

	public void addBookMark() {
		System.out.println("===== 즐겨찾기 추가 =====");

		System.out.print("즐겨찾기에 추가할 도서 번호를 입력하세요 : ");
		int bookId = sc.nextInt();
		sc.nextLine();

		for (Book book : bookList) {
			if (book.getBookId() == bookId) {
				bookMarkList.add(book);
				System.out.println("즐겨찾기에 추가되었습니다.");
				return;
			}
		}
		System.out.println("해당 번호가 없습니다.");

	}

	
	
	public void selectBookMark() {
		System.out.println("===== 즐겨찾기 조회 =====");

	

		if(bookMarkList.isEmpty()) {
			System.out.println("조회할 도서가 없습니다.");
		} else {
			for (Book book : bookMarkList) {
				System.out.println(book);
			}
		}


	}
	
	

	public void removeBookMark() {
		System.out.println("===== 즐겨찾기 삭제 =====");

		System.out.print("즐겨찾기에 삭제할 도서 번호를 입력하세요 : ");
		int bookId = sc.nextInt();
		sc.nextLine();

		for (Book book : bookMarkList) {
			if (book.getBookId() == bookId) {
				bookMarkList.remove(book);
				System.out.println("즐겨찾기에서 삭제되었습니다.");
				return;
			}
		}
		System.out.println("해당 번호가 없습니다.");
	}
	
	
	
	public void recommendBook() {
		System.out.println("===== 추천 도서 =====");
		

		// 랜덤 객체 생성
		Random random = new Random();
		
		int randomBook = random.nextInt(bookList.size());
		
		Book recommendBook = bookList.get(randomBook);
		
		System.out.println("추천도서는 : " + recommendBook);
	}
	
	
	
	
	
	
	
	
	
	
	

}
