package com.yedam.java.test1;

import java.util.Scanner;

public abstract class Calculator {
	// 필드
	protected int a, b;
	
	// 생성자

	// 메소드
	abstract protected int calc();

	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 >> ");
		a = sc.nextInt();
		b = sc.nextInt();
	}

	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
}
