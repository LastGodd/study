package com.yedam.java.test1;

public class NamedCircle extends Circle {
	// 필드
	String name;

	// 생성자
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}

	// 메소드
	public void show() {
		System.out.printf("%s, 반지름 = %d\n", this.name, this.getRadius());
	}
}
