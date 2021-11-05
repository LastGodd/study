package com.yedam.java.ch06.Stringtoken;

public class Regex {
	// 정규표현식 : 문자 또는 숫자 기호와 반복 기호가 결합된 문자열
	/*
	 []  		한 개의 문자
  				1) [abc] -> a or b or c
	  	   		2) [^abc] -> a,b,c 이외의 하나의 문자
	  	 		3) [a-zA-Z] -> a~z, A~Z 중 하나의 문자
	\d			한 개의 숫자로 [0-9]와 동일
	\s			공백
	\w			한 개의 알파벳 또는 한 개의 숫자[a-zA-Z_0-9]와 동일
	?			없음 또는 한 개
	*			없음 또는 한 개 이상
	+			한 개 이상
	{n}		정확히 n개
	{n,} 		최소한 n개
	{n,m} 	n개에서 m개까지
	()			그룹핑
	
	(053|010)-\d{3,4}-\d{4}
	-> (053|010) : 053 or 010
	-> - : -
	-> \d{3,4} : 한 개의 숫자 -> 최소 3개에서 4개까지 => 숫자 3, 4개 까지
	-> - : -
	-> \d{4} : 한 개의 수자 -> 4개 => 숫자 4개
	
	\w+@\w+\.\w+(\.\w+)?
	-> \w+			: 한 개의 알파벳 또는 한 개의 숫자 -> 한 개 이상 => 한 개 이상의 알파벳 또는 숫자
	-> @				: @
	-> \w+			: 한 개의 알파벳 또는 한 개의 숫자 -> 한 개 이상 => 한 개 이상의 알파벳 또는 숫자
	-> \.				: .
	-> \w+			: 한 개의 알파벳 또는 한 개의 숫자 -> 한 개 이상 => 한 개 이상의 알파벳 또는 숫자
	-> (\.\w+)?	: (. + 한 개 이상의 알파벳 또는 숫자) 형태가 하나 더 올 수 있음을 뜻함.
	*/
	
	
}