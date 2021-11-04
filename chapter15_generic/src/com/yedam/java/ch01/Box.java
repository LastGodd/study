package com.yedam.java.ch01;

public class Box<T> {
	// <T> <- 타입 파라미터
	// 자동으로 타입이 변환된다
	// 클래스 구분없이 필드를 가지고 싶을 때
	// 클래스와 인터페이스, 메소드를 정의할 때 타입을 파라미터로 사용할 수 있도록 한다
	private T object;

	public void set(T object) {
		this.object = object;
	}

	public T get() {
		return object;
	}
	// 타입을 T로 바꿈 -> 제네릭으로 선언한다라고 함
}
