package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		// Friend 객체만 넣을 수 있는 ArrayList 객체 생성
		ArrayList<Friend> LeaderList = new ArrayList<>();
		
		// 떡잎 방범대 멤버 객체 생성 후 ArrayList에 추가
		
		LeaderList.add(new Friend("짱구"));
		LeaderList.add(new Friend("철수"));
		LeaderList.add(new Friend("유리"));
		LeaderList.add(new Friend("훈이"));
		LeaderList.add(new Friend("맹구"));
		
		
		// 랜덤 객체 생성
		Random random = new Random();
		
		
		int randomLeader = random.nextInt(LeaderList.size());
		
		Friend DNLeader = LeaderList.get(randomLeader);
		DNLeader.pickLeader();

	}

}
