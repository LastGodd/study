package com.yedam.java.ch01.object;

public class Key {
	// 필드
	public int number;

	// 생성자
	public Key(int number) {
		this.number = number;
	}

	// 메소드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (compareKey.number == this.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
