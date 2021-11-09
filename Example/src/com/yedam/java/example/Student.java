package com.yedam.java.example;

public class Student {
	public int studentNum;

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (student.studentNum == studentNum) {
				return true;
			}
		}
		return false;
	}

}
