package com.yedam.java.totalTest;

import java.util.Scanner;

public class TotalTest {
	public static void main(String[] args) {
		// 문제) 다음은 키보드로부터 학생 수 와 각 학생들의 점수를 입력 받아서
		// 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행결과를 보고 알맞게 작성해보세요.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int max = 0;
		double avg = 0;
		int selectNo = 0;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			selectNo = sc.nextInt();
			switch (selectNo) {
			case 1:
				System.out.print("학생수> ");
				scores = new int[studentNum = sc.nextInt()];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				int cnt = 0;
				for (int i : scores) {
					System.out.printf("scores[%d]: %d\n", cnt, i);
					cnt++;
				}
				break;
			case 4:
				for (int i : scores) {
					if (max < i) {
						max = i;
					}
					total += i;
				}
				avg = (double) total / scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.2f\n",avg);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = !run;
			}
		}

//		while (run) {
//			System.out.println("----------------------------------------------");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//			System.out.println("----------------------------------------------");
//			System.out.print("선택> ");
//			selectNo = sc.nextInt();
//			if (selectNo == 5) {
//				break;
//			} else if (selectNo == 1) {
//				System.out.print("학생수> ");
//				studentNum = sc.nextInt();
//				scores = new int[studentNum];
//				continue;
//			} else if (selectNo == 2) {
//				for (int i = 0; i < studentNum; i++) {
//					System.out.printf("scores[%d]>\n", i);
//					scores[i] = sc.nextInt();
//					continue;
//				}
//			} else if (selectNo == 3) {
//				for (int i = 0; i < scores.length; i++) {
//					System.out.printf("scores[%d]: %d\n", i, scores[i]);
//					continue;
//				}
//			} else if (selectNo == 4) {
//				for (int i = 0; i < scores.length; i++) {
//					if (max < scores[i]) {
//						max = scores[i];
//					}
//					total += scores[i];
//				}
//				avg = (double) total / scores.length;
//				System.out.printf("최고 점수 : %d\n", max);
//				System.out.printf("평균 점수 : %.2f\n", avg);
//			}
//		}
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
	}
}
