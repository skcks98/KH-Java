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
		super();
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
	public void attack(exp:double) {
		this.exp += exp;
        System.out.println(nickname + "가 공격했습니다. 현재 경험치: " + this.exp);
        
        if(exp>=300) {
        	level++;
        	exp--;
        	System.out.println("레벨이 1 올랐습니다! 현재 레벨 : " + level);
        }
		
	}
	
	
	
	
	// dash
	public void dash() {
		if(mp>=0) {
			
		}
		
		
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return nickname + "/" + job  + "/" + hp  + "/" + mp  + "/" + level  + "/" + exp;
	}

	
	
	
	
	
	
	
	
	
	
}
