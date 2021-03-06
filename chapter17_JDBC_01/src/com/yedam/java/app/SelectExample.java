package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver 로딩하기.
		// 클래스 이름을 입력하면 객체를 반환 함
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "hr";
		
		Connection conn = DriverManager.getConnection(url, id, password);

		// 3. Statement or PreparedStatement 객체 생성하기 (운반 역할)
		Statement stmt = conn.createStatement();

		// 4. SQL 실행
		// executeUpdate 는 인설트한 갯수 반환
		ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
	
		// 5. 결과값 받아서 출력하기
		while (rs.next()) {
			String name = "이름 : " + rs.getString("first_name");
			System.out.println(name);
			
		}

		// 6. 자원을 해제 하기 (실행의 역순으로 해제하기)
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}

	}

}
