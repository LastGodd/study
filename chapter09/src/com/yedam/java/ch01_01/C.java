package com.yedam.java.ch01_01;

public class C {
	// 멤버 클래스에서 사용 제한
	// 필드
	int field1;
	static int field2;
	// 생성자

	// 메소드
	void method1() {

	}

	static void method2() {

	}

	// 내부 인스턴스 클래스
	class X {
		// 내부 인스턴스 필드

		// 내부 인스턴스 메소드
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
	
	static class Y{
		void method() {
			//field1 = 10;
			//method1();
			C c = new C();
			c.field1 = 10;
			c.method1();
			
			field2 = 10;
			method2();
		}
	}
}
