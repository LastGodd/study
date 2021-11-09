package com.yedam.java.example;

public class VIPCard implements Payment {
	private final String name = "VIPCard"; // 카드명
	private String grade; // 적용 등급
	private double saleRatio; // 할인율
	private int point; // 적립 포인트
	private double pointRatio; // 포인트 적립율

	public VIPCard() {
		this.grade = "GOLD";
		this.saleRatio = 0.1;
		this.point = 0;
		this.pointRatio = 0.03;
	}

	@Override
	public int offline(int price) {
		point += price * pointRatio;
		return price - (int) (price * offPrice) - (int) (price * saleRatio);
	}

	@Override
	public int online(int price) {
		point += price * pointRatio;
		return price - (int) (price * onPrice) - (int) (price * saleRatio);
	}

	@Override
	public int simple(int price) {
		point += price * pointRatio;
		return price - (int) (price * ganPrice) - (int) (price * saleRatio);
	}

	@Override
	public void showCardInfo() {
		System.out.println("===== 카드 정보 =====");
		System.out.println("카드명 : " + name);
		System.out.println("적용 등급 : " + grade);
		System.out.println("할인율 : " + saleRatio);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("포인트 : " + point);

	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
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
