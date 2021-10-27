package com.yedam.java.ch01_01;

public class DmbPhone extends Phone {
	// 필드
	int channel;
	
	// 생성자
	public DmbPhone(String model, String color, int channel) {
		// super.model
		// 부모 클래스에 있는 model을 말함
		// this.model
		// 현재 클래스의 상속받은 model을 말함
		
		this.model = model;
		this.color = color;
		this.channel  = channel;
	}
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB방송수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송수신을 멈춥니다.");
	}
	
}
