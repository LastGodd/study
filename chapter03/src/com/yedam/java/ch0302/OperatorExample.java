package com.yedam.java.ch0302;

public class OperatorExample {
	public static void main(String[] args) {
		System.out.println("======== 부호연산 =========");
		// 부호연산
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("a: " + a);
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		// -값에 +를 한다고 하여도 값이 변하지는 않음
		// -값에 -를 하면 +가 된다

		byte b = 100;
		// 연산할 때 인트로 인식하기 때문에 부호연산을 해도 에러가 발생함
		// byte result3 = -b;
		int result3 = -b;
		System.out.println("result3= " + result3);

		System.out.println("======== 증감연산자 =========");
		// 증감연산자
		int x, y, z;
		x = y = 10;
		// y = 10 -> x = y -> x = 10;
		x++; // x = x + 1;
		++x; // x = x + 1;
		System.out.println("x= " + x);
		y--; // y = y + 1;
		--y; // y = y + 1;
		System.out.println("y= " + y);
		z = x++; // z = x -> x = x + 1
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("===================");
		z = ++x; // x = x + 1 -> z = x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);

		System.out.println("===================");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("===================");
		// x + 1 -> x = 15, y = 8
		// 15 + 8
		// y = y + 1
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("===================");

		x = y = 5;
		z = x++ + --y;
		// x++ : x = 5 -> x = x + 1;
		// --y : y = y -1 = 5 - 1 = 4;
		// z = 5 + 4 => 9;
		// x = x + 1 => 5 + 1 => 6;
		// y = 4;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);

		z = --x + y++;
		// --x : x = x -1 => 6 -1 = 5;
		// y++ : y = 4 => y + 1;
		// z = 5 + 4 => 9;
		// x = 5;
		// y = y + 1 => y = 5;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);

		System.out.println("======== 논리부정연산자 =========");
		// 논리부정연산자
		boolean play = true;
		System.out.println(play);

		play = !play;
		System.out.println(play);

		play = !play;
		System.out.println(play);

		System.out.println("======== 이항연산자 =========");
		// 산술연산자
		int v1 = 5;
		int v2 = 2;
		System.out.printf("v1: %d, v2: %d\n", v1, v2);
		int result;
		result = v1 + v2;
		System.out.println(result);

		result = v1 - v2;
		System.out.println(result);

		result = v1 * v2;
		System.out.println(result);

		result = v1 / v2;
		System.out.println(result);

		result = v1 % v2;
		System.out.println(result);

		double doubleResult = (double) v1 / v2;
		System.out.println(doubleResult);
		System.out.println("===========================");
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1;
		int c3 = c2 + 1;
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3의 유니코드값 : " + c3);
		System.out.println("c3의 출력문자 : " + (char) c3);

		System.out.println("===========================");
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("==== Quiz");
		int m, n, total;
		m = n = 10;

		// 1. 부호연산자를 이용하여 변수 m의 값을 음수로 출력하세요.
		// 단, 변수 m의 값은 변하지 않습니다.
		System.out.println("=====문제1=====");
		total = -m;
		System.out.println(total);

		// 2. 변수 m과 n의 값을 더한 후 n의 값을 증가시키는 연산식을 한 줄로 작성
		System.out.println("=====문제2======");
		total = m + n++;
		System.out.println(total);

		// 3. 변수 m과 n의 값을 더한 값이 20이 되도록 변수 m과 n 중 하나의
		// 변수에 증감연산자를 사용
		System.out.println("=====문제3=====");
		System.out.println("m: " + m);
		System.out.println("n: " + n);
		total = m + --n;
		System.out.println(total);

		// 4. 변수 m에서 변수 n을 나눈 후 몫과 나머지를 출력하세요.
		System.out.println("=====문제4======");
		total = m / n;
		System.out.println("몫: " + total);

		total = m % n;
		System.out.println("나머지: " + total);

		// 5. 356이 주어졌을 경우 산술연산자만 사용해서 300으로 변수 값을 변경해서 출력하세요
		System.out.println("======문제5======");
		int val = 356;

		total = (val / 100) * 100;
		System.out.println(total);

		System.out.println("======== 비교연산자 =========");
		// 비교연산자
		int n1 = 10;
		int n2 = 10;
		boolean bResult1, bResult2, bResult3;
		bResult1 = (n1 == n2);
		bResult2 = (n1 != n2);
		bResult3 = (n1 <= n2);
		System.out.println(bResult1);
		System.out.println(bResult2);
		System.out.println(bResult3);

		char char1 = 'A';
		char char2 = 'B';
		boolean bResult4 = (char1 < char2);
		System.out.println(bResult4);

		int v3 = 1;
		double v4 = 1.0;
		System.out.println(v3 == v4);

		double v5 = 0.1;
		float v6 = 0.1f;
		System.out.println(v5 == v6);
		System.out.println((float) v5 == v6);

		System.out.println("========================");
		int charCode = 'A';

		// 유니코드 중 65보다 크거나 같으며 90보다는 작거나 같아야 대문자
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자");
		}

		// 유니코드 중 97보다 크거나 같으며 122보다 작거나 같으면 소문자
		if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자");
		}

		// 유니코드 중 48보다 크고 57보다 작아야 숫자 0~9
		if ((charCode > 48) & (charCode < 57)) {
			System.out.println("숫자 0~9");
		}

		int nVal = 6;

		// 2의 배수 이거나 3의 배수가 맞는지
		if ((nVal % 2 == 0) & (nVal % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if ((nVal % 2 == 0) && (nVal % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		System.out.println("======== 대입연산자 =========");
		// 대입연산자 = + (사칙연산자, 논리연산자, 논리부정연산자)
		int intResult = 0;
		
		intResult += 10; // intResult + 10 = intResult
		System.out.println(intResult);
		
		intResult -= 5; // intResult - 5 = intResult
		System.out.println(intResult);
		
		intResult *= 3; // intResult * 3 = intResult
		System.out.println(intResult);
		
		intResult /= 5; // intResult / 5 = intResult
		System.out.println(intResult);
		
		intResult %= 3; // intResult % 3 = intResult
		System.out.println(intResult);
		
		System.out.println("======== 삼항연산자 =========");
		// 삼항연산자
		int score = 95;
		char grade = ' ';
		// 점수가 90점보다 크면 등급을 A라고 주고 90보다 작거나 같으면 등급 B
//		if(score>90) {
//			grade = 'A';
//		} else if(score <= 90) {
//			grade = 'B';
//		}
//		System.out.printf("등급은 %c입니다.\n", grade);
		// 삼항연산자 (조건이 참이면 ? 거짓이면 : )
		grade = (score > 90)? 'A' : 'B';
		System.out.printf("등급은 %c입니다.\n", grade);
		
		int age = 27;
		String str = (age>=20)? "성인" : "미성년";
		System.out.printf("나이는 %d이고 %s입니다.\n", age, str);
		
		int value = 35;
		int resultI = (value%3==0)? value%3 : value/3;
		System.out.println(resultI);
	}
}
