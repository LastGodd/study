package com.yedam.java.ch01;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();

	// 생성자
	MyClass() {

	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolumn(5);
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolumn(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolumn(5);
	}
}
