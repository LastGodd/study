package com.yedam.java.feedback;

public class Product {
	// 필드
	private	String name;
	private int price;
	
	// 생성자
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// 메소드
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
