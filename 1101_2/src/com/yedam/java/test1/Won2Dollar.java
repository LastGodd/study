package com.yedam.java.test1;

public class Won2Dollar extends Converter {
	// 필드

	// 생성자
	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}

	// 메소드
	@Override
	protected double convert(double src) {
		return (double) src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
