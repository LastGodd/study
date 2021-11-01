package com.yedam.java.test1;

public class ColorPoint extends Point {
	// 필드
	private String color;
	
	// 생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	// 메소드
	void setPoint(int x, int y) {
		this.move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void show() {
		System.out.printf("%s색으로 (%d,%d)", this.color, this.getX(), this.getY());
	}

}
