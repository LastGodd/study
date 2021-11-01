package com.yedam.java.test1;

public class SalaryMan {
	// 필드
	private int salary = 1000000;

	// 생성자
	SalaryMan() {

	}

	SalaryMan(int salary) {
		this.salary = salary;
	}
	
	// 메소드
	int getAnnualGross() {
		return (salary * 12) + (salary * 5);
	}

	
}
