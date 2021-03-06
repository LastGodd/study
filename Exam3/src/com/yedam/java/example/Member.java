package com.yedam.java.example;

public abstract class Member {
	int record; // 전월실적
	String grade; // 회원등급
	// 등급을 나누는 기준을 정적 상수 필드로 선언
	public static final int GRADE = 1000000;

	// 전월실적을 넘겨받아 초기화하는 생성자
	public Member(int record) {
		this.record = record;
	}

	// 현재 실적 및 회원등급을 출력하는 메소드 : 출력 예시) 현재 실적은 1100000이며, 회원등급은 GOLD입니다.
	public abstract void showMemberInfo();

	// 해당 추상클래스를 상속하는 실체클래스 두 개(Silver, Gold) 클래스를 선언하고
	Silver silver;
	Gold gold;
	// 전월 실적에 따라 해당하는 인스턴스를 반환하는 메소드
	public static Member getMemberShip(int record) {
		if (record >= GRADE) {
			return new Gold(record);
		} else if (record < GRADE) {
			return new Silver(record);
		} else {
			return null;
		}
	}
}
