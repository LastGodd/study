package com.yedam.java.example;

public class GreenCard implements Payment {
	private final String name = "GreenCard"; // 카드명
	private String grade; // 적립 등급
	private int point; // 적립 포인트
	private double pointRatio; // 포인트 적립율

	public GreenCard() {
		this.grade = "SILVER";
		this.point = 0;
		this.pointRatio = 0.05;
	}

	@Override
	public int offline(int price) {
		point += price * pointRatio;
		return price - (int) (price * offPrice);
	}

	@Override
	public int online(int price) {
		point += price * pointRatio;
		return price - (int) (price * onPrice);
	}

	@Override
	public int simple(int price) {
		point += price * pointRatio;
		return price - (int) (price * ganPrice);
	}

	@Override
	public void showCardInfo() {
		System.out.println("===== 카드 정보 =====");
		System.out.println("카드명 : " + name);
		System.out.println("적용 등급 : " + grade);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("포인트 : " + point);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getPointRatio() {
		return pointRatio;
	}

	public void setPointRatio(double pointRatio) {
		this.pointRatio = pointRatio;
	}

	public String getName() {
		return name;
	}

}
