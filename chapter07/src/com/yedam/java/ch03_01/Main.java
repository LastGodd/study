package com.yedam.java.ch03_01;

public class Main {
	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동");
		// 추상클래스이기 때문에 인스턴스화 할 수 없다
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
		
	}
}
