package com.yedam.java.ch01_02;

public class CallListner implements Button.onClickListner {
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
