package com.yedam.java.ch02;

import com.yedam.java.ch01.Box;

public class UtilBox {
	// public static 리턴타입 메소드명(매개변수)
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
