package com.yedam.java.test1;

public class Km2Mile extends Converter {
	// 필드

	// 생성자
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	// 메소드
	@Override
	protected double convert(double src) {
		return (double) src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

}
