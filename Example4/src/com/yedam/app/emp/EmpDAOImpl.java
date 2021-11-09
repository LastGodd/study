package com.yedam.app.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
	// 싱글톤
	private static EmpDAO instance = new EmpDAOImpl();

	public static EmpDAO getInstance() {
		return instance;
	}

	// 급여 5000-10000사이
	@Override
	public List<Emp> selectBetween() {
		List<Emp> list = new ArrayList<>();

		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees WHERE salary BETWEEN 5000 AND 10000";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// ST_CLERK 중 급여가 가장 높은 사원의 급여 출력
	@Override
	public Emp jobIdSalary(String jobId) {
		Emp emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT MAX(salary) AS maxSalary FROM employees WHERE job_id =\'" + jobId + "\'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				emp = new Emp();
				emp.setSalary(rs.getInt("maxSalary"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	// 입사일 5월의 평균 급여
	@Override
	public Emp avgSalary(int mm) {
		Emp emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT AVG(salary) AS maxSalary FROM employees WHERE TO_CHAR(hire_date, 'mm')=" + mm;
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				emp = new Emp();
				emp.setSalary(rs.getInt("maxSalary"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	// 직책이 SA_REP인 사원 중 급여가 10000이상인 사람들의
	// 사원번호 이름, 이메일, 급여정보를 출력
	@Override
	public List<Emp> selectSalary() {
		List<Emp> list = new ArrayList<>();
		Emp emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees WHERE job_id = 'SA_REP' AND salary >= 10000";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));

				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}
