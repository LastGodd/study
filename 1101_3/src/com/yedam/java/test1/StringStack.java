package com.yedam.java.test1;

import java.util.Scanner;

public class StringStack implements Stack {
	// 필드
	Scanner sc = new Scanner(System.in);
	String[] pop = null;
	int idx;
	int count;

	// 생성자
	public StringStack() {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		idx = sc.nextInt();
		pop = new String[idx];

	}

	// 메소드
	// 현재 스택에 저장된 개수 리턴
	@Override
	public int length() {
		return count;
	}

	// 현재 스택에 저장 가능한 개수 리턴
	@Override
	public int capacity() {
		return idx - count;
	}

	@Override
	public boolean push() {
		System.out.print("문자열 입력> ");
		String val = sc.next();
		if (count == idx) {
			System.out.println("스택이 꽉 차서 푸시 불가");
			return false;
		} else {
			pop[count++] = val;
			return true;
		}
	}

	// 스택의 톱(top)에 실수 저장
	@Override
	public String pop() {
		String totalStr = "";
		for (int i = pop.length - 1; i >= 0; i--) {
			totalStr += pop[i] + " ";
		}
		return totalStr;
	}

}
