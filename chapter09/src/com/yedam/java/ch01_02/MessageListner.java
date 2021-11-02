package com.yedam.java.ch01_02;

public class MessageListner implements Button.onClickListner {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}

}
