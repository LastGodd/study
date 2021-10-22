package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}

		String strN1 = args[0];
		String strN2 = args[1];

		int n1 = Integer.parseInt(strN1);
		int n2 = Integer.parseInt(strN2);

		int result = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result);
		System.out.println("==========Quiz==========");
		// 문제1 ) 책 200페이지 4번
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("max: " + max);

		// 문제2 ) 책 161페이지 3번
		// 주사위 2개의 합이 5이면 실행을 멈추고 아니면 계속 주사위 던짐
		int cnt = 0;
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			int sum = num1 + num2;
			cnt++;
			System.out.printf("=====%d번째======\n", cnt);
			System.out.println("num1: " + num1);
			System.out.println("num2: " + num2);
			System.out.println("sum: " + sum);
			if (sum == 5) {
				break;
			}
		}
		;

		int[][] scores = new int[2][3];

		int[] score1 = new int[3];
		int[] score2 = new int[3];
		// int[] -> 타입
		// int[][] scoreArray = new int[][2];
		// scoreArray[0] = score1;

		int[][] mathScores = new int[2][3];
		System.out.println(mathScores);

		for (int x = 0; x < mathScores.length; x++) {
			System.out.println(mathScores[x]);
			// int[] temp = mathScores[x];
			for (int y = 0; y < mathScores[x].length; y++) {
				System.out.println(mathScores[x]);
			}
		}
		System.out.println();

		int[][] engScores = new int[2][];
		engScores[0] = new int[5];
		engScores[1] = new int[3];

		System.out.println(engScores.length);
		for (int i = 0; i < engScores.length; i++) {
			System.out.println();
			System.out.println(engScores[i].length);
			for (int z = 0; z < engScores[i].length; z++) {
				System.out.println(engScores[i][z]);
			}
		}

		System.out.println("=============================");
		int[] temp = { 89, 90, 93 };
		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		// { 1차원 배열, 1차원 배열}
		// { {95, 80}, {92, 96, 80} }
		// {95, 80} / { 92, 96, 80}
		for (int x = 0; x < javaScores.length; x++) {
			int[] java = javaScores[x];
			for (int y = 0; y < java.length; y++) {
				int ja = java[y];
				System.out.println(ja);
			}
		}

		System.out.println("=============================");
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}

		// System.arraycopy();
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 복사할배열, 몇번부터, 복사한배열, 몇번부터, 몇번까지
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}

		System.out.println("=============================");
		int[] scoresList = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for (int score : scoresList) {
			sum += score;
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scoresList.length;
		System.out.println("평균 : " + avg);
		
	}
}
