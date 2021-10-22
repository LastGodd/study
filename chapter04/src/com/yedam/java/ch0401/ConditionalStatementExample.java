package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// 기본 if문
//		int score = 90;
//
//		if (score >= 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
//
//		if (score <= 90)
//			System.out.println("점수가 90보다 작습니다.");
//		System.out.println("등급은 B입니다.");
//		System.out.println("===============================");
//		// if~else구문
//		if (score >= 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		} else {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}
//
//		System.out.println("===============================");
//		// if~else if ~ else 구문
//		score = 75;
//
//		if (score >= 90) {
//			System.out.println("점수가 100~90입니다.");
//			System.out.println("등급은 A입니다");
//		} else if (score >= 80) {
//			System.out.println("점수가 80~89입니다.");
//			System.out.println("등급은 B입니다.");
//		} else if (score >= 70) {
//			System.out.println("점수가 70~79입니다.");
//			System.out.println("등급은 C입니다.");
//		} else {
//			System.out.println("점수가 70미만입니다.");
//			System.out.println("등급은 D입니다.");
//		}
//
//		System.out.println("===============================");
//		int n = (int) (Math.random() * 6) + 1;
//		// 0.0 <= Math.random() < 1.0
//		// 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//		// (int) 0 <= (int)Math.random() * 6 < (int) 6
//		// (int) 0+1 <= (int)Math.rand() * 20 + 1 < (int) 20+1
//		// (int)Math.random() * 갯수 + 시작숫자
//		
//		if (n == 1) {
//			System.out.println("1번이 나왔습니다.");
//		} else if (n == 2) {
//			System.out.println("2번이 나왔습니다.");
//		} else if (n == 3) {
//			System.out.println("3번이 나왔습니다.");
//		} else if (n == 4) {
//			System.out.println("4번이 나왔습니다.");
//		} else if (n == 5) {
//			System.out.println("5번이 나왔습니다.");
//		} else if (n == 6) {
//			System.out.println("6번이 나왔습니다.");
//		}
//
//		System.out.println("===Quiz");
//		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면
//		// 'Natural Number'를 출력하도록 구현하세요
		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수 a입력> ");
//		int a = sc.nextInt();
//		System.out.print("정수 b입력> ");
//		int b = sc.nextInt();
//
//		if ((a + b) > 0) {
//			System.out.println("Natural Number");
//		}
//
//		// 문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라
//		// 부동호(>, =, <)를 출력하도록 구현하세요
//		System.out.print("정수 x입력> ");
//		int x = sc.nextInt();
//		System.out.print("정수 y입력> ");
//		int y = sc.nextInt();
//		if (x > y) {
//			System.out.printf("%d > %d\n", x, y);
//		} else if (x == y) {
//			System.out.printf("%d = %d\n", x, y);
//		} else if (x < y) {
//			System.out.printf("%d < %d\n", x, y);
//		}
//
//		// 문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로
//		// 구분하여 결과값을 출력하도록 구현하세요.
//		// BMI = 체중 / (키 * 키)
//		// 저체중(18.5미만), 정상(18.5 이상 25 미만), 과체중(25이상 30미만), 비만(30이상)
//		System.out.print("키 입력> ");
//		double hg = sc.nextDouble();
//		System.out.print("몸무게 입력> ");
//		double wg = sc.nextDouble();
//
//		double bmi = wg / (hg * hg);
//
//		if (bmi >= 30) {
//			System.out.println("비만입니다.");
//		} else if (bmi >= 25) {
//			System.out.println("과체중입니다.");
//		} else if (bmi >= 18.5) {
//			System.out.println("정상입니다.");
//		} else {
//			System.out.println("저체중입니다.");
//		}

//		System.out.println("====================");
//		int random = (int) (Math.random() * 6) + 1;
//
//		switch (random) {
//		case 1:
//			System.out.println("1번이 나왔습니다.");
//			break;
//		case 2:
//			System.out.println("2번이 나왔습니다.");
//			break;
//		case 3:
//			System.out.println("3번이 나왔습니다.");
//			break;
//		case 4:
//			System.out.println("4번이 나왔습니다.");
//			break;
//		case 5:
//			System.out.println("5번이 나왔습니다.");
//			break;
//		case 6:
//			System.out.println("6번이 나왔습니다.");
//			break;
//		}
//
//		int time = (int) (Math.random() * 4) + 8;
//		System.out.println("현재시각 : " + time + "시");
//
//		switch (time) {
//		case 8:
//			System.out.println("출근합니다.");
//		case 9:
//			System.out.println("회의를 합니다.");
//		case 10:
//			System.err.println("업무를 봅니다.");
//		default:
//			System.out.println("외근을 나갑니다.");
//		}
//
//		char grade = 'B';
//		
//		switch(grade) {
//		case 'A':
//		case 'a':
//			System.out.println("우수 회원입니다.");
//			break;
//		case 'B':
//		case 'b':
//			System.out.println("일반 회원입니다.");
//			break;
//		default :
//			System.out.println("손님입니다.");
//		}
//
//		String position = "과장";
//		
//		switch(position) {
//		case "부장":
//			System.out.println("700만원");
//			break;
//		case "과장":
//			System.out.println("500만원");
//			break;
//		default :
//			System.out.println("300만원");
//		}
		System.out.println("===Quiz");
		// 문제4) 구구단을 출력하되 입력받은 단의 6번째 값을 출력하도록 구현
		// 예를 들어, 2단 일 경우엔 2 X 6 = 12
		// 출력문에는 변수를 사용하지 않습니다.
		System.out.print("구구단 입력>");
		int dan = sc.nextInt();
		switch(dan) {
		case 2:
			System.out.println("2 X 6 = 12");
			break;
		case 3:
			System.out.println("3 X 6 = 18");
			break;
		case 4:
			System.out.println("4 X 6 = 24");
			break;
		case 5:
			System.out.println("5 X 6 = 30");
			break;
		case 6:
			System.out.println("6 X 6 = 36");
			break;
		case 7:
			System.out.println("7 X 6 = 42");
			break;
		case 8:
			System.out.println("8 X 6 = 48");
			break;
		case 9:
			System.out.println("9 X 6 = 54");
			break;
		}

		// 문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 입력받은 점수에
		// 대한 등급을 출력 단, 점수 범위는 0~100점
		// 90점 이상 100점 이하 : A등급,
		// 80점 이상 90점 미만 : B등급,
		// 70점 이상 80점 미만 : C등급,
		// 60점 이상 70점 미만 : D등급,
		// 60점 미만 : E등급
		System.out.print("점수 입력>");
		int score = sc.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("E등급");
		}

		sc.close();
	}
}
