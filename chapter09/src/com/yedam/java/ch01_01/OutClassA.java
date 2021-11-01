package com.yedam.java.ch01_01;

public class OutClassA {
	// 필드
	private int num = 10;
	private static int sNum = 20;
	
	// 내부 클래스를 선언 후 필드로 가진다
	private InClassA inClassA;

	// 생성자
	// 인스턴스화 만들 때 내부 클래스도 인스턴스화 시킨다
	public OutClassA() {
		inClassA = new InClassA();
	}

	// 메소드
	// 내부 클래스에 접근하여 메소드를 사용하는 메소드
	public void usingClass() {
		inClassA.inTest();
	}

	// 인스턴스 클래스
	class InClassA {
		// 필드
		int inNum = 100;
		
		// 생성자
		
		// 메소드
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
	}
}
