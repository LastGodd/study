package com.yedam.java.ch01_01;

public class Student extends People{
	int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		// 기본생성자를 못쓰니 부모클래스의 생성자를 호출하라는 의미
		super(name, ssn);
		this.studentNo = studentNo;
		
		
	}
}
