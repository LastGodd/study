package com.yedam.java.exam1;

public class Product {
	// 필드
	String product;
	int price;
	int count;

	// 생성자
	Product(String product, int price, int count) {
		this.product = product;
		this.price = price;
		this.count = count;
	}

	// 메소드
	int totalPrice(Product[] product) {
		int total = 0;
		for (int i = 0; i < product.length; i++) {
			total += product[i].price;
		}
		return total;
	}
	
}
