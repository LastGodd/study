package com.yedam.java.ch01.object;

import java.util.Arrays;

public class Person implements Cloneable {
	// 필드
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	// 생성자
	public Person(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	// 메소드
	public Person getPserson() {
		Person cloned = null;
		try {
			cloned = (Person) clone();
		} catch (CloneNotSupportedException e) {

		}
		return cloned;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Person cloned = (Person) super.clone();
		// scores를 깊은 복제 한다.(배열 복사)
		// this.scoes = A객체
		// cloned.scores = A객체
		// this.scores -> cloned.scores : A객체 -> A객체
		// System.arraycopy(this.scores, 0, cloned.scores, 0, this.scores.length);
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제 한다
		cloned.car = new Car(this.car.model);

		return cloned;
	}

}
