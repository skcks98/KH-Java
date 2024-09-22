package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee();
		employees[1] = new Employee(1,"홍길동", null, null, 19,'M', 0, 0.0, "01022223333", "서울 잠실");
		employees[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 0, 0.0, "01011112222", "서울 마곡");
		
		
		for(int i=0; i<employees.length; i++) {
			System.out.println("emp[" + i + "] : " + employees[i].information()  );
		}
		
		
		employees[0].setEmpNo(0);
		employees[0].setEmpName("김말똥");
		employees[0].setDept("영업부");
		employees[0].setJob("팀장");
		employees[0].setAge(30);
		employees[0].setGender('M');
		employees[0].setSalary(3000000);
		employees[0].setBonusPoint(0.2);
		employees[0].setPhone("01055559999");
		employees[0].setAddress("전라도 광주");
		
		employees[1].setDept("기획부");
		employees[1].setJob("부장");
		employees[1].setSalary(4000000);
		employees[1].setBonusPoint(0.3);
		
		employees[2].setSalary(1000000);
		employees[2].setBonusPoint(0.01);
		
		System.out.println("=============================================================================");
		
		// 수정 후 출력
		for(int i=0; i<employees.length; i++) {
			System.out.println("emp[" + i + "] : " + employees[i].information()  );
		}
		
		
		System.out.println("=============================================================================");
		
		
		// 각 사원 연봉  (헷갈림)
		
		int totalSalary = 0;
		for (Employee emp : employees) {
			int salalyAnnual = (int)(emp.getSalary() * (1 + emp.getBonusPoint()) * 12);
			System.out.printf("%s의 연봉 : %d원\n", emp.getEmpName(), salalyAnnual);
			totalSalary += salalyAnnual;
		}
		
		
		
		System.out.println("=============================================================================");
		
		int salaryAvg = totalSalary / employees.length;
		
		System.out.printf("직원들의 연봉의 평균 : %d 원", salaryAvg);
	}

}
