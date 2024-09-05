package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {


	Hero hero1 = new Hero("이구역짱","전사",200,20,1,0);
	Hero hero2 = new Hero("Zi존위자드","마법사",100,100,1,0);
	
	//전사
	System.out.println("========캐릭터 생성=========");
	System.out.println("전사 직업으로 " + hero1.getNickname() + "님이 생성되었습니다.");
	
	System.out.printf("\n현재 레벨 : %d", hero1.getLevel());
	System.out.printf("\n현재 hp : %d", hero1.getHp());
	System.out.printf("\n현재 mp : %d", hero1.getMp());
	System.out.printf("\n현재 경험치 : %.1f", hero1.getExp());
	
	//법사
	System.out.println("========캐릭터 생성=========");
	System.out.println("마법사 직업으로 " + hero2.getNickname() + "님이 생성되었습니다.");
	
	System.out.printf("\n현재 레벨 : %d", hero2.getLevel());
	System.out.printf("\n현재 hp : %d", hero2.getHp());
	System.out.printf("\n현재 mp : %d", hero2.getMp());
	System.out.printf("\n현재 경험치 : %.1f", hero2.getExp());
	
	
	System.out.println("========이구역짱 시점=========");
	System.out.println(hero1.getNickname() +"은/는 공격을 했다!!! 현재 경험치 : " + hero1.getExp());
	
	}
}
