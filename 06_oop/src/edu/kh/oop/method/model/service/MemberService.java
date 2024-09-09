package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	
	// 속성(필드)
	
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; // 가입한 회원의 정보를 저장할 변수
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	
	
	
	
	// 기능 (생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("=====회원 정보 관리 프로그램=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : readMemberInfo(); break;
			case 4 : updateMemberInfo(); break;
			case 0 :  System.out.println("프로그램 종료.."); break;
			default:  System.out.println("잘못 입력하셨습니다.. 메뉴에 있는 번호만 입력해주세요!");
			
			}
			
		} while(menuNum != 0); // menuNum이 0이면 반복 종료 
		
		
	}
	
	
	// 회원가입 기능
	public String signUp() {
			
		System.out.println("\n******회원가입******");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
				
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPW2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지않으면 회원가입 실패
		
		if(memberPw.equals(memberPW2)) { // 일치 O
			
			 memberInfo = new Member(memberId,memberPw,memberName,memberAge);
			
			
			return "회원가입 성공!!";
			
		} else { // 일치 X
			return "회원가입 실패!! (비밀번호 불일치)";
		}
	}
	
	
	
			
	// 로그인 기능
	public String login() {

		System.out.println("\n******로그인******");
		
		// 회원가입 했는지 확인
		// == memberInfo가 객체를 참조하고 있는지 확인 (null 인지 아닌지 확인)
		
		if(memberInfo == null) { // 회원가입 안한 경우
			// null : 아무것도 참조하고 있지 않음.
			
			return "회원가입부터 진행해주세요!";
		} 
		
		// 회원가입 했다면, 로그인 기능 수행
		
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
				
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		
		// 회원ㄱ 가입 정보(memberInfo)가 참조하는 Member객체에 
		// 저장된 아이디, 비밀번호가
		// 입력한 아이디, 비밀번호와 같으면 "로그인 성공"
		// 같지 않으면 "아이디 또는 비밀번호 불일치" 리턴
		
		if(memberId.equals(memberInfo.getMemberId())) {
			// 로그인하려고 입력받은 memberId와
			// memberInfo 필드에서 참조중인 Member객체의 memberId가 같은지 확인
			// &&
			// 로그인하려고 입력받은 memberPw와
			// memberInfo 필드에서 참조중인 Member객체의 mempberPw가 같은지 확인
			
			//loginMember에 memberInfo가 참조하고 있는 객체의 주소 대입
			loginMember = memberInfo ;
			// 얕은 복사
			
			// 회원가입 정보를 loginMember에 대입하여
			// 어떤 회원이 로그인 했는지를 구분할수 있게 함
			return loginMember.getMemberName() + "님 환영합니다.";
			
		} else {
			
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
			// return : 현재 메서드를 종료하고 함수를 호출한 쪽으로 되돌아가는 것
			// return 값 : 현재 메서드를 종료하고, 함수를 호출한 쪽으로 값을 가지고 되돌아 가는 것
		}
		
		
	
	}
			
	// 회원 정보 조회 기능
	// 로그인을 했나 안했나 따져보기
	// 로그인했으면? 현재 로그인한 사람의 정보를 저장하고 있는 객체에서
	// 정보 꺼내오기(이름,아이디,나이)
	// 로그인 안했으면? 로그인후 이용하라
	
	public void readMemberInfo() {
		System.out.println("\n******회원 정보 조회******");
		
		if(loginMember == null) {
			System.out.println("로그인 후 이용하세요");
		} else { // 로그인시
			System.out.println("이름 : " + loginMember.getMemberName() );
			System.out.println("아이디 : " + loginMember.getMemberId() );
			System.out.println("나이 : " + loginMember.getMemberAge() );
		}
		
		/*String str = "이름 : " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge() + "세";
		
		return str; */
		
	}
	
			
			
	// 회원 정보 수정 기능
			
	public void updateMemberInfo() {
		System.out.println("\n******회원 정보 수정******");
		
		if(loginMember == null) {
			System.out.println("로그인 후 이용하세요");
		} else { // 로그인 상태 - 수정
			
			System.out.print("수정할 이름 : ");
			String newName = sc.next();
			
			System.out.print("수정할 나이 : ");
			int newAge = sc.nextInt();
			
			System.out.print("비밀번호 입력 : ");
			String inputPw = sc.next();
			
			if(inputPw.equals(loginMember.getMemberPw())) {
				loginMember.setMemberName(newName);
				loginMember.setMemberAge(newAge);
			}
			
//			loginMember.setMemberName(newName);
//			loginMember.setMemberAge(newAge);
			
			System.out.println("회원 정보가 수정되었습니다!");
			
		}
		
	}
		
	
}
