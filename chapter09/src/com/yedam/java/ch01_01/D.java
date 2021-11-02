package com.yedam.java.ch01_01;

public class D {
	// 로컬 클래스에서 사용 제한
	// 필드
	// 생성자

	// 자바 7버전
	// 메소드
	public void method1(final int arg) {
		final int localVariable = 1;

		// 로컬 클래스
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;
		// localVariable = 100;

		// 로컬 클래스
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
