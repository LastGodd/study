package com.yedam.java.test1;

public class StackApp {

	public static void main(String[] args) {
		StringStack ss = new StringStack();
		ss.push();
		ss.push();
		System.out.println("스택에 저장된 개수 : " + ss.length());
		System.out.println("스택에 저장할 수 있는 개수 : " + ss.capacity());
		ss.push();
		ss.push();
		
		System.out.println("스택에 저장된 모든 문자열 : " + ss.pop());
	}

}
