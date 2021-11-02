package com.yedam.java.ch01_02;

public class Button {
	// 필드
	onClickListner listner;
	
	// 생성자

	// 메소드
	void setOnClickListner(onClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
	
	// 내부 정적 인터페이스
	static interface onClickListner {
		void onClick();
	}
	
}
