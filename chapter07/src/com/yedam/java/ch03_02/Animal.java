package com.yedam.java.ch03_02;

public abstract class Animal {
	// 필드
	public String kind;
	
	// 생성자
	
	
	// 메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	// 추상메소드는 {} 부분을 없애고 리턴 타입앞에 abstract를 추가한다.
}
