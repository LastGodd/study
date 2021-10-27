package com.yedam.java.ch02_02;

public class Tire {
	// 필드
	// 최대 회전수(타이어 수명)
	int maxRotation;
	// 누적 회전수
	int accumlatedRotaion;
	// 타이어의 위치
	String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	// 메소드
	public boolean roll() {
		accumlatedRotaion++;
		if(accumlatedRotaion < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumlatedRotaion) + "회" );
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
	
	
}
