package com.yedam.java.ch06.Stringtoken;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// 010-123-1234 : -, 010 / 123 / 1234 => 문자열 3개로 분리

		// - String.split() : 정규표현식
		// - StringTokenizer : 문자

		String text1 = "홍길동&이수홍, 박연수, 김자바-최영호";
		String[] names = text1.split("&|, |-"); // -> & or , or - 도달할 때마다 하나의 String으로 잘라내라

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println();

		String text2 = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text2, "/");
		// st : 문자열을 담고 있는 스택
		// 홍길동
		// 이수홍
		// 박연수
		int countTokens = st.countTokens();
		System.out.println("현재 토큰 수 : " + countTokens);
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token + ", " + st.countTokens());
		}

		System.out.println();

		// 기본 골격
		st = new StringTokenizer(text2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		// StringBuilder : 새로운 문자열을 생성하지 않고 문자열을 변경하는 경우에 사용하며
		// 내부 버퍼를 별도로 가지고 그 안에 문자열을 저장해두고, 추가, 수정, 삭제 작업을 할 수 있음

		StringBuilder sb = new StringBuilder();

		// 문자열을 추가
		sb.append("Java ");
		sb.append("Program study");
		System.out.println(sb.toString());

		// 4번째 순서 뒤에 문자열 2를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());

		// 4번재 순서에 문자 6을 대체
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//	index6부터 index13 전까지를 "Book" 문자열로 대체 
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		// index4부터 index5 전까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수 : " + length);
		
		String result = sb.toString();
		System.out.println(result);
		System.out.println();
		
		//Pattern : 정규표현식으로 문자열을 검증
		
		String regExp = "(053|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		
		boolean resultData = Pattern.matches(regExp, data);
		if(resultData) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		resultData = Pattern.matches(regExp, data);
		if(resultData) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		
		
	}
}
