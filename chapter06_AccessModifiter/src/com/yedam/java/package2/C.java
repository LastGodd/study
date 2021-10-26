package com.yedam.java.package2;

import com.yedam.java.package1.A;

public class C {
	// A a;
	// B b;
	
	// 다른 패키지라서 public만 사용가능
	A a1 = new A(true);
	// A a2 = new A(1);
	// A a3 = new A("문자열");
	
	public C() {
		A a = new A();
		a.field1 = 5;
		//a.field2 = 5;
		//a.field3 = 5;
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
