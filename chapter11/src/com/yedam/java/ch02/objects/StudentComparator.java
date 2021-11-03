package com.yedam.java.ch02.objects;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		// 일반적으로 o1가 o2보다 작으면 음수리턴, 같으면 0, 크면 양수를 리턴하도록 클래스를 구현한다.
		/*
		 * if (a.sno < b.sno) { return -1; } else if (a.sno == b.sno) { return 0; } else
		 * { return 1; }
		 */

		return Integer.compare(a.sno, b.sno);
	}

}
