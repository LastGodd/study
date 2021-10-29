package com.yedam.java.example2;

public abstract class PlayerLevel {
	//run
	public abstract void run();
	//jump
	public abstract void jump();
	//turn
	public abstract void turn();
	//레벨 메세지
	public abstract void showLevelMessage();
	
	//필살기
	final public void go(int count) {
		run();
		for(int i=0; i <count; i++) {
			jump();
		}
		turn();
	}	
}
