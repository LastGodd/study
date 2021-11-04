package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		// 람다식 : (매개변수, ...) -> {실행문}
		// @FunctionalInterface

		// 매개변수와 리턴타입이 없는 람다식
		MyFunctionalInterfaceA fa;

		fa = new MyFunctionalInterfaceA() {
			@Override
			public void method() {
				System.out.println("익명구현객체입니다.");
			}

		};
		fa.method();

		// 람다식을 이용하여 익명구현객체 만들기
		fa = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fa.method();

		// 더 간단한 람다식 표현 방법
		fa = () -> System.out.println("람다식 표현법");
		fa.method();

		// 매개변수가 있는 람다식
		MyFunctionalInterfaceB fb;
		fb = new MyFunctionalInterfaceB() {
			private int result = 1;

			@Override
			public void method(int x) {
				System.out.println(x + result);
			}
		};

		fb.method(2);

		fb = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};

		fb.method(10);

		// 위의 식을 더 간단하게 표현(매개변수가 하나일 경우 괄호없어도 됨)
		fb = x -> System.out.println(x * 5);
		fb.method(10);
		System.out.println();

		// 리턴값이 있는 람다식
		MyFunctionalInterfaceC fc;
		fc = new MyFunctionalInterfaceC() {

			@Override
			public int method(int x, int y) {
				return x + y;
			}
		};
		System.out.println(fc.method(1, 2));

		fc = (x, y) -> {
			return x + y;
		};
		System.out.println(fc.method(1, 3));

		// 너무 줄이는 것은 권장하지 않음
		fc = (x, y) -> x + y;
		System.out.println(fc.method(1, 4));

		fc = (x, y) -> {
			return x + y;
		};
		System.out.println(fc.method(1, 5));

		// fc = (x, y) -> { return sum(x, y); };
		fc = (x, y) -> sum(x, y);
		System.out.println(fc.method(1, 4));

		MyNumber max = (x, y) -> (x > y) ? x : y;
		System.out.println(max.getMax(10, 20));

	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
