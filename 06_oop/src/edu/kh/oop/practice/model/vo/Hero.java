package edu.kh.oop.practice.model.vo;

public class Hero {

	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public Hero() { // 기본
		
	}
	
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}

	
	// 게터/세터
	
	// 닉네임
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	// 직업
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	// hp
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	
	// mp
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	
	// level
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// exp
	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	
	
	// attack
	public void attack(double exp) {
		this.exp += exp;
		
        System.out.printf("'%s' 은/는 공격을 했다! 현재 경험치: %.1f\n", nickname, this.exp ); // this.exp 경험치 누적
        
        if(this.exp>=300) {
        	this.level++;
        	
        	System.out.println("레벨이 올랐습니다! 현재 레벨 : " + level);
        }
		
	}
	
	
	
	
	// dash
	public void dash() {
		
		if(mp<=0) {
			System.out.println("(마력 부족) 더 이상 대시할 수 없어요~!"); // this.mp 마나 누적
	        
			
		} else {
			mp -= 10;
			System.out.printf("'%s'의 엄청 빠른 대시!! 남은 마력 : %d\n",nickname,  this.mp);
		}
		
		
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return  "현재 레벨 : " + level + "\n"+  "현재 hp : " + hp +"\n"+ "현재 mp : "+ mp + "\n"+ "현재 exp : " +exp;
	}

	
	/*
	  	"===='%s'님의 정보=======\n"
				+ "-현재 레벨 : %d\n"
				+ "-현재 hp : %d\n"
				+ "-현재 mp : %d\n"
				+ "-현재 exp : %.1f\n";
	 */
	
	
	
}
