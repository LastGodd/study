package com.yedam.java.test1;

public class Main {
	public static void main(String[] args) {
		System.out.println("*** 문제1 ***");
		DaoExample.dbWork(new OracleDao());
		DaoExample.dbWork(new MySqlDao());
		System.out.println();

		System.out.println("*** 문제2 ***");
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
		System.out.println();

		System.out.println("*** 문제3 ***");
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
		System.out.println();

	}
}
