package com.yedam.java.example1;

public class VIP extends Customer {
	// 필드
	private int agentId;
	private double saleRatio;

	// 생성자
	public VIP() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		
		System.out.println("VIP() 생성자 호출");
	}
	
	public VIP(String customerName, int customerId, int agentId) {
		// super 부모인스턴스 호출
		super(customerName, customerId);
		
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentId = agentId;
		
		System.out.println("VIP(String, int) 생성자 호출");
	}
	
	public int getAgentId() {
		return agentId;
	}

	// 메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentId + "입니다.";
	}
}
