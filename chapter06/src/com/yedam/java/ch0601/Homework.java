package com.yedam.java.ch0601;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
		// 3) 각 가격에 해당하는 제품명은 인덱스+1로 합니다.
		// 예를 들어 배열[0] = 10000 이면 10,000원인 제품은 1번째 제품입니다.
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner sc = new Scanner(System.in);

		int[] products = null;
		int num = 0;
		int idx = 0;
		int maxPrice = 0;
		int totalPrice = 0;
		boolean run = true;

		while (run) {
			System.out.println("===============================================");
			System.out.println("1.상품수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("===============================================");
			System.out.print("선택> ");
			num = sc.nextInt();

			if (idx == 0 && num != 1) {
				System.out.println("제품 수가 없습니다.");
				System.out.println("제품 수를 먼저 입력하세요.");
				continue;
			}

			switch (num) {
			case 1:
				System.out.print("상품 수>");
				idx = sc.nextInt();
				products = new int[idx];
				break;
			case 2:
				for (int i = 0; i < products.length; i++) {
					System.out.printf("%d번째 제품>", (i + 1));
					products[i] = sc.nextInt();
				}
				break;
			case 3:
				System.out.println("제품별 가격");
				for (int i = 0; i < products.length; i++) {
					System.out.printf("%d번째 제품 : %d\n", (i + 1), products[i]);
				}
				break;
			case 4:
				for (int z : products) {
					if (maxPrice < z) {
						maxPrice = z;
						totalPrice += z;
					}
				}
				int index = 0;
				for (int i = 0; i < products.length; i++) {
					if (products[i] == maxPrice) {
						index = i + 1;
						continue;
					}
				}
				totalPrice -= maxPrice;

				System.out.printf("최고 가격을 가진 제품은 %d입니다.\n", index);
				System.out.printf("최고 가격을 제외한 제품들의 합은 %d입니다.\n", totalPrice);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}

		}
		sc.close();
	}
}