package com.project.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.project.model.dto.SoccerPlayer;

public class SoccerService {
	private Scanner sc = new Scanner(System.in);
	private List<SoccerPlayer> playerList = new ArrayList<SoccerPlayer>(); // 선수단 리스트
	private List<SoccerPlayer> transferList = new ArrayList<SoccerPlayer>(); // 이적 명단

	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set

	// 기본 생성자
	public SoccerService() {
		playerList.add(new SoccerPlayer("FW", "모하메드 살라", 11, 31, "이집트"));
		playerList.add(new SoccerPlayer("FW", "디오구 조타", 20, 27, "포르투칼"));
		playerList.add(new SoccerPlayer("FW", "루이스 디아스", 7, 26, "콜롬비아"));
		playerList.add(new SoccerPlayer("FW", "다르윈 누녜스", 9, 25, "우루과이"));
		playerList.add(new SoccerPlayer("FW", "코디 각포", 18, 25, "네덜란드"));
		playerList.add(new SoccerPlayer("FW", "하비 엘리엇", 19, 21, "잉글랜드"));
		
		
		playerList.add(new SoccerPlayer("MF", "도미닉 소보슬라이", 8, 22, "헝가리"));
		playerList.add(new SoccerPlayer("MF", "맥 알리스터", 10, 25, "아르헨티나"));
		playerList.add(new SoccerPlayer("MF", "라이언 흐라벤베르흐", 38, 21, "네덜란드"));
		playerList.add(new SoccerPlayer("MF", "엔도 와타루", 3, 31, "일본"));
		playerList.add(new SoccerPlayer("MF", "라이언 흐라벤베르흐", 38, 21, "네덜란드"));
		playerList.add(new SoccerPlayer("MF", "커티스 존스", 17, 23, "잉글랜드"));
		
		
		
		playerList.add(new SoccerPlayer("DF", "앤드류 로버트슨", 26, 29, "스코틀랜드"));
		playerList.add(new SoccerPlayer("DF", "이브라힘 코나테", 5, 25, "프랑스"));
		playerList.add(new SoccerPlayer("DF", "페어질 반다이크", 4, 33, "네덜란드"));
		playerList.add(new SoccerPlayer("DF", "트렌트 알렉산더 아놀드", 66, 25, "잉글랜드"));
		playerList.add(new SoccerPlayer("DF", "조 고메즈", 2, 27, "잉글랜드"));
		playerList.add(new SoccerPlayer("DF", "자렐 콴사", 78, 21, "잉글랜드"));
		playerList.add(new SoccerPlayer("DF", "코너 브래들리", 84, 21, "잉글랜드"));
		
		
		playerList.add(new SoccerPlayer("GK", "알리송 베케르", 1, 30, "브라질"));
		playerList.add(new SoccerPlayer("GK", "퀴빈 켈러허", 62, 25, "아일랜드"));

	}

	/**
	 * 메뉴 출력 메서드
	 */
	public void displayMenu() {

		int menuNum = 0;

		do {
			System.out.println("\n[LiverPool FC 선수단 관리 프로그램]\n");
			System.out.println("1. 선수단 전체 조회");
			System.out.println("2. 새로운 선수 영입");
			System.out.println("3. 선수 정보 수정");
			System.out.println("4. 선수 방출");

			System.out.print("선택 : ");

			try {
				menuNum = sc.nextInt();
				sc.nextLine();

				System.out.println();

				switch (menuNum) {
				case 1:
					SelectAllPlayer();
					break;
				case 2:
					AddPlayer();
					break;
				case 3:
					UpdatePlayer();
					break;
				case 4:
					ReleasePlayer();
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
	 * 전체 선수단 조회 (SELECT)
	 */
	public void SelectAllPlayer() {
		System.out.println("<전체 선수단 목록>");

		for (SoccerPlayer player : playerList) {
			System.out.println(player);
		}

	}

	/**
	 * 선수 영입(추가) (CREATE)
	 */
	public void AddPlayer() throws Exception {
		System.out.println("<선수 영입>");

		System.out.print("포지션 : ");
		String position = sc.nextLine();

		System.out.print("선수 이름 :");
		String name = sc.nextLine();

		System.out.print("등번호 : ");
		int backNumber = sc.nextInt();

		// 같은 등번호가 존재할 때
		for (SoccerPlayer existingNum : playerList) {
			if (existingNum.getBackNumber() == backNumber) {
				System.out.println("이미 같은 등번호가 존재합니다.");
				return;
			}
		}

		System.out.print("나이 :");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("국적 : ");
		String nationality = sc.nextLine();

		SoccerPlayer newPlayer = new SoccerPlayer(position, name, backNumber, age, nationality);
		playerList.add(newPlayer);
		System.out.println("새로운 선수가 영입되었습니다. 환영해주세요!");

	}

	/**
	 * 선수 정보 수정 (Update)
	 */
	public void UpdatePlayer() {
		System.out.println("<선수 정보 수정>");

		System.out.print("수정할 선수의 이름을 입력하세요 : ");
		String name = sc.nextLine();

		// 해당 선수 찾기
		boolean flag = false;
		for (SoccerPlayer player : playerList) {

			if (player.getName().equals(name)) {

				flag = true;

				int choice;

				do {
					System.out.println("\n1. 포지션");
					System.out.println("2. 등번호");
					System.out.println("3. 나이");
					System.out.println("0. 수정 종료");

					System.out.println("\n어떤 정보를 수정하시겠습니까?");

					choice = sc.nextInt();
					sc.nextLine();

					switch (choice) {
					
					case 1:
						System.out.println("<포지션 수정>");
						System.out.println("수정할 포지션을 입력하세요 : ");
						
						String position = sc.nextLine();
						
						player.setPosition(position);
					
						System.out.println("수정 완료");
						break;
						
					case 2:
						System.out.println("<등번호 수정>");
						System.out.println("수정할 등번호를 입력하세요 : ");
						
						int backNumber = sc.nextInt();
						
						// 등번호 중복 체크
						boolean check = false;
						for(SoccerPlayer existingNum : playerList) {
							// 자신과 다른 선수의 등번호를 비교
							if(existingNum !=  player && existingNum.getBackNumber() == backNumber) {
								check = true;
								break;
							}
						}
						
						if(check) { // 이미 등번호 존재
							System.out.println("이미 존재하는 등번호입니다. 다른 번호를 입력해주세요.");
						} else {
							player.setBackNumber(backNumber);
							System.out.println("수정 완료");
						}
						break;
						
					case 3:
						System.out.println("<나이 수정>");
						System.out.println("수정할 나이를 입력하세요 : ");
						
						int age = sc.nextInt();
						
						player.setAge(age);
					
						System.out.println("수정 완료");
						break;
						
					case 0: break;
					default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;
					
					}
					if (!flag) {
				        System.out.println("해당 선수의 이름이 존재하지 않습니다.");
				 }

				} while (choice != 0);
				break;
				
			}
			 
		}

	}
	
	
	public void ReleasePlayer() {
		System.out.println("<선수 방출>");
		
		System.out.println("방출할 선수를 입력하세요 : ");
		String name = sc.nextLine();
		
		for(SoccerPlayer player : playerList) {
			if(player.getName().equals(name)) {
				playerList.remove(player);
				System.out.println("선수가 방출되었습니다.");
				return;
			}
		}
		System.out.println("해당 선수를 찾을 수 없습니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
