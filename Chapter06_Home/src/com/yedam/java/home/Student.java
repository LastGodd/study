package com.yedam.java.home;

public class Student {
	// 필드
	int studentID; // 학번
	String studentName; // 이름
	Subject[] subjectList;// 수강과목 목록
	int subjectIndex = 0; // 수강과목 목록에 저장된 수강과목 수

	// 생성자
	public Student(int studentId, String studentName) {
		// 매개변수를 통해 학번 초기화
		this.studentID = studentId;
		// 매개변수를 통해 이름 초기화
		this.studentName = studentName;
		// 수강가능한 과목 수는 3개
		subjectList = new Subject[3];

	}

	public void addSubject(String name, int scorePoint) {
		// 수강과목 정보를 담을 인스턴스 생성하기
		Subject subject = new Subject();
		// 매개변수를 통해 과목이름 추가하기
		subject.setName(name);
		// 매개변수를 통해 점수 추가하기
		subject.setScorePoint(scorePoint);
		// 배열에 저장하기
		subjectList[subjectIndex++] = subject;
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		// for문을 통해 학생의 수강과목과 과목의 점수를 모두 출력하세요.
		// 출력형태 : 학생 홍길동의 수학 과목은 80점입니다.
		for (int i = 0; i < subjectIndex; i++) {
			System.out.printf("학생 %s의 %s과목은 %d점입니다.\n", studentName, 
					subjectList[i].getName(),subjectList[i].getScorePoint());
		}
		
		// 학생의 총점을 계산해서 출력하세요.
		// 출력형태 : 학생 홍길동의 총점은 300점입니다.
		for (int i = 0; i < subjectIndex; i++) {
			total += subjectList[i].getScorePoint();
		}
		System.out.printf("학생 %s의 총점은 %d점입니다.\n", studentName, total);
		
	}

}
