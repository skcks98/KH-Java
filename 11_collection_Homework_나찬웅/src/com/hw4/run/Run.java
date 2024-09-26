package com.hw4.run;

import java.util.ArrayList;

import com.hw4.model.dto.Student;

public class Run {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
		for(int i=0; i< list.size(); i++) {
			Student s = list.get(i);
			
			System.out.println(s.getName() + " 학생의 점수 : " + s.getScore() + "점 ");
			//System.out.print(s.getName());
			//System.out.println(s.getScore());
			
			//System.out.println(s);
		
		}
		
		
//		for(Student stdList : list) {
//
//			
//			System.out.println(stdList.getName() +"," + stdList.getScore());
//		}
	}

}
