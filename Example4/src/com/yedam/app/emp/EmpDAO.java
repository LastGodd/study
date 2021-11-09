package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
	// 급여정보가 5000에서 10000사이 사원의 리스트 출력
	List<Emp> selectBetween();
	// 사원 직책이 ST_CLERK 인 사람들 중 급여가 가장높은 사원의 급여
	Emp jobIdSalary(String jobId);
	// 입사일이 5월달인 사람들의 평균급여를 출력 해당경우가 없을 경우
	// 에러없이 출력될 수 있도록 구현
	Emp avgSalary(int mm);
	
	// 직책이 SA_REP인 사원 중 급여가 10000이상인 사람들의
	// 사원번호 이름, 이메일, 급여정보를 출력
	List<Emp> selectSalary();
	
}
