package com.yedam.java.example1;

public class Customer {
	// 필드
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;

	// 생성자
	// 일반 고객일 때 기본등급셋팅
	// 기본 등급일 경우 보너스 적립 비율 1%
	public Customer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(String customerName, int customerId) {
		// this();
		// 첫 줄에 호출해야 함
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer(String, int) 생성자 호출");
	}

	

	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerGrade() {
		return customerGrade;
	}



	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}



	public int getBonusPoint() {
		return bonusPoint;
	}



	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}



	public double getBonusRatio() {
		return bonusRatio;
	}



	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}



	// 메소드
	// calcPrice -> 물건을 구입했을 때 1) 보너스 포인트를 적립 2) 할인율을 적용한 가격을 반환
	// showCustomerInfo -> 고객이름과 등급, 보너스포인트를 출력하는 메소드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
