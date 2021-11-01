package com.yedam.java.test1;

public class Circle implements Shape {
	// 필드
	private double radius;
	private double area;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	// 메소드
	@Override
	public void draw() {
		this.area = (radius * radius) * PI;
	}

	@Override
	public double getArea() {
		return area;
	}
}
