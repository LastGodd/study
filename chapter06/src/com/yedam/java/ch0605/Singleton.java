package com.yedam.java.ch0605;

public class Singleton {
	// 필드
	private static Singleton singleton = new Singleton();
	// 생성자
	// 외부에서 접근할 수 없게 private로 생성자를 만든다.
	private Singleton() {
		
	}
	// 메소드
	// 외부에서 접근하기 위해서 static으로 만든다.
	static Singleton getInstance() {
		return singleton;
	}
	
	
	
}
