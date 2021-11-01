package com.yedam.java.example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*
		 * 문제) 고객센터에 전화가 오면 일단 대기열에 저장됩니다. 
		 * 		각 전화를 상담원에 배분하는 방법이 총 3가지로 구현
		 * 		1) 순서대로 배분하기 : 모든 상담원이 동일한 상담건수를 처리하도록 
		 * 			들어오는 전화 순서대로 상담원에게 하나씩 배분합니다.
		 * 		2) 짧은 대기열 찾아 배분하기 : 고객 대기 시간을 줄이기 위해
		 * 			상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.
		 * 		3) 우선순위에 따라 배분하기 : 고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와서
		 * 			업무 능력이 좋은 상담원에게 우선 배분합니다.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		System.out.print("입력 >");
		String ch = sc.next();

		Scheduler scheduler = null;

		if ("R".equalsIgnoreCase(ch)) {
			scheduler = new RoundRobin();
		} else if ("L".equalsIgnoreCase(ch)) {
			scheduler = new LeastJob();
		} else if ("P".equalsIgnoreCase(ch)) {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
