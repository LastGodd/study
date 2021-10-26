package com.yedam.java.ch0605;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student_lsh[] st = null;
		boolean run = true;
		int selectNum = 0;
		int studentNum = 0;

		while (run) {
			System.out.println("=== 1.학생수 입력 2.학생정보 등록 3.학생정보 전체조회 4.학생정보 분석 5.종료 ===");
			System.out.println("선택 >");
			selectNum = sc.nextInt();
			if (studentNum == 0 && selectNum != 1) {
				System.out.println("학생수가 없습니다.");
				System.out.println("학생수를 입력해주세요.");
				continue;
			}
			switch (selectNum) {
			case 1:
				System.out.println("학생 수>");
				studentNum = sc.nextInt();
				st = new Student_lsh[studentNum];
				break;
			case 2:
				int studentId = 0;
				String name = "";
				int point = 0;

				for (int i = 0; i < st.length; i++) {
					System.out.println("학번 >");
					studentId = sc.nextInt();
					System.out.println("이름 >");
					name = sc.next();
					System.out.println("점수 >");
					point = sc.nextInt();
					st[i] = new Student_lsh(studentId, name, point);
				}
				break;
			case 3:
				for (int i = 0; i < st.length; i++) {
					System.out.printf("%d 학번의 점수는 %d입니다.\n", st[i].getStudentId(), st[i].getPoint());
				}
				break;
			case 4:
				int max = 0;
				int min = st[0].point;
				int idxMax = 0;
				int idxMin = 0;
				int total = 0;

				for (int i = 0; i < st.length; i++) {
					if (st[i].point >= max) {
						max = st[i].point;
						idxMax = st[i].studentId;
					}
					if (st[i].point <= min) {
						min = st[i].point;
						idxMin = st[i].studentId;
					}
				}
				for (int i = 0; i < st.length; i++) {
					if (max == st[i].point) {
						continue;
					}
					if (min == st[i].point) {
						continue;
					}
					total += st[i].point;
				}

				System.out.printf("최고 점수 : %d점, 학번 : %d\n", max, idxMax);
				System.out.printf("최저 점수 : %d점, 학번 : %d\n", min, idxMin);
				System.out.printf("최고점, 최저점을 제외한 평균 점수는 %.2f점 입니다.\n", (double) total / (st.length - 2));
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
			}

		}
		sc.close();
	}

}
