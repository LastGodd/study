package com.yedam.java.ch01_01;

public class Outter {
	// 필드
	String field = "Outter-field";
	// 생성자

	// 메소드
	void method() {
		System.out.println("Outter-method");
	}

	// 내부 클래스
	class Nested {
		// 내부 클래스 필드
		String field = "Nested-field";
		
		// 내부 클래스 생성자
		
		// 내부 클래스 메소드
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			// 내부 클래스 호출
			System.out.println(this.field);
			this.method();
			// 외부 클래스 호출 방법
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
