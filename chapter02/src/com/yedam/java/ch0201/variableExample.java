package com.yedam.java.ch0201;

public class variableExample {
	private int num = 10;

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");

		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");

		int x, y, z;

		x = 1;
		y = 2;
		z = x + y;

		System.out.println(x + "+" + y + "=" + z);

		int a, b, result;

		a = 54;
		b = 36;

		result = a + b;
		System.out.println(a + "+" + b + "=" + result);

		result = a - b;
		System.out.println(a + "*" + b + "=" + result);

		result = a * b;
		System.out.println(a + "-" + b + "=" + result);

		result = a / b;
		System.out.println(a + "/" + b + "=" + result);

		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("a: " + a + ", b:" + b);

		/*
		 * int v1 = 0; if(v1 >= 0) { v1 = 1; int v2 = 0; if(v2 == 0) { v2 = 2; int v3 =
		 * v1 + v2; System.out.println("v1: " + v1 + ", v2:" + v2 + ", v3" + v3); }
		 * System.out.println("v1: " + v1 + ", v2:" + v2 + ", v3" + v3);
		 * 
		 * }
		 * 
		 * System.out.println("v1: " + v1 + ", v2:" + v2 + ", v3" + v3); }
		 * 
		 * for(int i = 0; i< 10; i++) { int sum = 0; sum = sum + 1; }
		 */

		int m = 10;

		if (m >= 10) {

		}
		int n = 21;
		int sum = m + n;
		System.out.println("sum :" + sum);

	}
}
