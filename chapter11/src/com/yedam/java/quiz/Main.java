package com.yedam.java.quiz;

public class Main {

	public static void main(String[] args) {
		// 교재보고 문제 풀기

		Member member = new Member("blue", "이파란");
		System.out.println(member);
		String val1 = "a234";
		String val2 = "1234";
		System.out.println(solution(val1));
		System.out.println(solution(val2));
	}

	
	
	public static boolean solution(String s) {
		boolean result = true;
		// 문자열 s의 길이가 4혹은 6
		if (s.length() == 4 || s.length() == 6) {
			// 숫자로만 구성
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch < 48 || ch > 58) {
					// 숫자 0~9 무조건 아니다.
					result = false;
				}
			}
		}
		return result;
	}

}
