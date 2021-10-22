package com.yedam.java.ch0604;

public class Computer {
	// 필드

	// 생성자

	// 기본메소드
	// 배열 이용
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 도트연산자 이용
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
