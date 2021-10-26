package com.yedam.java.ch0605;

public class Student_lsh {
	// 필드
	int studentId;
	String name;
	int point;

	// 생성자
	Student_lsh(int studenId, String name, int point) {
		this.studentId = studenId;
		this.name = name;
		this.point = point;
	}

	// 메소드
	public int getStudentId() {
		return this.studentId;
	}

	public String getName() {
		return this.name;
	}

	public int getPoint() {
		return this.point;
	}

}
