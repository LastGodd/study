package com.yedam.java.example1;

public class Gold extends Customer {
	//필드
	double saleRatio;
	
	//생성자
	public Gold(String customerName, int customerId) {
		super(customerName, customerId);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
		System.out.println("Gold(String, int) 생성자 호출");
	}
	//메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
