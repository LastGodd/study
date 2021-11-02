package com.yedam.java.ch01_01;

public class Outer {
	// 필드
	int outNum = 100;
	static int sNum = 200;

	// 생성자

	// 메소드
	Runnable getRunnable(int i) {
		int num = 100;
		
		// 로컬 클래스
		class MyRunnable implements Runnable {
			// 로컬 클래스 필드
			int localNum = 10;
			
			// 로컬 클래스 메소드
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}

		}
		
		return new MyRunnable();
	}
}
