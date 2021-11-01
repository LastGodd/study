package com.yedam.java.test1;

public class Main {
	public static void main(String[] args) {
		System.out.println("*** 문제1 ***");
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
		System.out.println();
		
		System.out.println("*** 문제2 ***");
		Calculator calc1 = new Adder();
		calc1.run();
		Calculator clac2 = new Subtracter();
		clac2.run();
		System.out.println();
		
		System.out.println("*** 문제3 ***");
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
		System.out.println();
		
		System.out.println("*** 문제4 ***");
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();

		System.out.println("*** 문제5 ***");
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
		System.out.println();
	}
}
