package com.yedam.java.ch02_02;

public class Button {
	// 필드
	OnclickListener listener;
	// 생성자

	// 메소드
	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	// 내부 일반 클래스

	// 내부 정적 클래스

	// 중첩 인터페이스
	static interface OnclickListener {
		void onClick();
	}

	public void touch() {
		
	}
}
