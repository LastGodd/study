package com.yedam.app.main;

import java.util.List;

import com.yedam.app.emp.Emp;
import com.yedam.app.emp.EmpDAO;
import com.yedam.app.emp.EmpDAOImpl;
import com.yedam.common.Frame;

public class EmpFrame implements Frame {
	EmpDAO dao = EmpDAOImpl.getInstance();

	@Override
	public void run() {
		// 전체 출력
		while (true) {
			selectBetween();
			System.out.println();
			selectJobIdSalary();
			System.out.println();
			avgSalary();
			System.out.println();
			selectSalary();
			System.out.println();
			break;
		}
	}

	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	void selectBetween() {
		List<Emp> list = dao.selectBetween();
		System.out.println("== 급여가 5000에서 10000사이인 사원 목록 ==");
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}

	void selectJobIdSalary() {
		Emp emp = dao.jobIdSalary("ST_CLERK");
		if (emp == null) {
			System.out.println("직책이 ST_CLERK인 사원이 없습니다.");
		} else {
			System.out.println("== 직책이 \'ST_CLERK\'인 사원 중 최고 연봉 : " + emp.getSalary());
		}
	}

	void avgSalary() {
		Emp emp = dao.avgSalary(05);
		if (emp == null) {
			System.out.println("5월에 입사한 사원이 없습니다.");
		} else {
			System.out.println("== 5월에 입사한 사람들의 평균 연봉 : " + emp.getSalary());
		}
	}

	void selectSalary() {
		List<Emp> list = dao.selectSalary();
		System.out.println("== 직책이 \'SA_REP\'이며 급여가 10000이상인 사원 목록 ==");
		if (list == null) {
			System.out.println("직책이 \'SA_REP\'인 사원 중 급여가 10000이상인 사원이 없습니다.");
		} else {
			for (Emp emp : list) {
				System.out.println(emp);
			}
		}
	}

}
