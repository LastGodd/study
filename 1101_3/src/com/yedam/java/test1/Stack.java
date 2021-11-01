package com.yedam.java.test1;

public interface Stack {
	// 필드
	
	// 메소드
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	boolean push(); // 넣는거

	String pop(); // 꺼내오기
	
}
