package com.yedam.java.ch01_02;

public class Example {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new CallListner());
		btn.touch();
		
		btn.setOnClickListner(new MessageListner());
		btn.touch();
	}
}
