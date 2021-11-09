package com.yedam.java.example;

public class Silver extends Member {
	GreenCard greenCard = new GreenCard();
	public Silver(int record) {
		super(record);
	}

	@Override
	public void showMemberInfo() {
		System.out.printf("현재 실적은 %d이며, 회원등급은 %s입니다.\n", record, greenCard.getGrade() );
	}
	
}
