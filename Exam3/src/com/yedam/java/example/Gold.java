package com.yedam.java.example;
// Member 클래스 상속
public class Gold extends Member {
	VIPCard vipCard = new VIPCard();
	public Gold(int record) {
		super(record);
	}

	@Override
	public void showMemberInfo() {
		System.out.printf("현재 실적은 %d이며, 회원등급은 %s입니다.\n", record, vipCard.getGrade() );
	}
	
}
