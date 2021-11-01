package com.yedam.java.example;

public class RoundRobin implements Scheduler {
	// 상담원 한 명씩 동일하게 상담업무 배분
	@Override
	public void getNextCall() {
		System.out.println("RoundRobin : 상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("RoundRobin : 다음 순서 상담원에게 배분합니다.");
	}

}
