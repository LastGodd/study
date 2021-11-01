package com.yedam.java.example;

public interface Scheduler {
	// 상담원에게 전화를 배분하는 방법
	
	// 상담전화를 가져오는 메소드
	public void getNextCall();
	// 상담원에게 전화를 배분하는 메소드
	public void sendCallToAgent();
	
}
