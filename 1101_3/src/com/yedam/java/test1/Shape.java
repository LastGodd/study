package com.yedam.java.test1;

public interface Shape {
	// 필드
	final double PI = 3.14;

	// 메소드
	void draw();

	double getArea();

	default public void redraw() {
		System.out.println("--- 다시 그립니다 ---");
		draw();
	}
}
