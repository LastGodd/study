package com.yedam.java.test1;

public class Account {
	// 필드
	private String owner;
	private long balance;

	// 생성자
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	// 메소드
	public long deposit(long amount) {
		this.balance += amount;
		return balance;
	}

	public long withdraw(long amount) {
		if (this.balance < amount) {
			System.out.println("금액이 부족합니다.");
			return balance;
		} else {
			this.balance -= amount;
			return balance;
		}
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
