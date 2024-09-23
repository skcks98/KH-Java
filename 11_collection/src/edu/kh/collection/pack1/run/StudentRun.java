package edu.kh.collection.pack1.run;

import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		StudentService service = new StudentService();

		// service.ex();

		service.displayMenu();
		
//		List<Integer> numberList = null; // 돌렸을때 나는 nullpointerException

//		List<Integer> numberList = new ArrayList<Integer>();
//		
//		numberList.add(5);
//		numberList.add(3);
//		numberList.add(1);
//		numberList.add(4);
//		numberList.add(2);
//		
//		// 숫자 리스트를 정렬 (Comparable이 이미 구현되어 있음)
//		Collections.sort(numberList);
//		
//		System.out.println(numberList); // [1,2,3,4,5]

		
		//service.comparatorTest();
		service.comparingTest();
		
		
	}

}
