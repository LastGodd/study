package com.yedam.java.ch06.arrays;

public class Member implements Comparable<Member> {
	// 필드
	String name;

	// 생성자
	Member(String name) {
		this.name = name;
	}

	// 메소드
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
