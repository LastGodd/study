package com.yedam.java.test1;

public class Rectangle {
	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 메소드
	public double getArea() {
		return width * height;
	}

	public double getCircumference() {
		return (width + height) * 2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
