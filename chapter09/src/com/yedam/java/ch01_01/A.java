package com.yedam.java.ch01_01;

public class A {
	public A() {
		System.out.println("A 객체가 생성됨");
	}

	// 인스턴스 멤버 클래스
	public class B {
		// 필드
		int field1;
		// static int field2;

		// 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}

		// 메소드
		void method1() {
		}
		// static void method2() {}

	}

	// 정적 멤버 클래스
	static class C {
		// 필드
		int field1;
		static int field2;

		// 생성자
		C() {
			System.out.println("C 객체가 생성됨");
		}

		// 메소드
		void method1() {
		}

		static void method2() {
		}
	}

	// 로컬 클래스 (접근 제한자는 필요없음)
	void method() {
		class D {
			// 필드
			int field1;
			// static int field2;

			// 생성자
			D() {
				System.out.println("D 객체가 생성됨");
			}

			// 메소드
			void method1() {

			}

			// static void method2() {}
		}

		// 메소드 내에서만 사용이 가능하다
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
