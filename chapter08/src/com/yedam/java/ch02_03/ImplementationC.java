package com.yedam.java.ch02_03;

public class ImplementationC implements InterfaceC {
	
	@Override
	public void methodA() {
		System.out.println("ImplemtesC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemtesC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplemtesC-methodC() 실행");
	}

}
