package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;
	// 생성자

	// 메소드
	// setter
	void setGas(int gas) {
		if (gas >= 0) {
			this.gas = gas;
		} else {
			this.gas = 0;
		}
	}

	// getter
	int getGas() {
		return this.gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				// void이지만 메소드를 종료하기 위해서 return문을 넣는다.
				return;
			}
		}
	}
	
	
	
	
	
}
