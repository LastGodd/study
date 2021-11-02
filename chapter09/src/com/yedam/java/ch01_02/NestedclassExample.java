package com.yedam.java.ch01_02;

public class NestedclassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 내부 인스턴스 클래스 선언방법
		Car.Tire tire = myCar.new Tire();
		
		// 내부 정적 클래스 선언방법
		Car.Engine engine = new Car.Engine();
		
		
	}
}
