package com.yedam.app.user;

import java.util.Scanner;

import com.yedam.app.common.DAO;

public class UserDAOImpl extends DAO implements UserDAO {
	// 싱글톤
	private static UserDAO instance = new UserDAOImpl();

	public static UserDAO getInstance() {
		return instance;
	}

	// 유저정보
	UserVO user = null;

	Scanner sc = new Scanner(System.in);

	// 회원가입
	@Override
	public int sign() {
		int result = 0;
		try {
			connect();
			String sql = "INSERT INTO boarduser (uno, u_id, u_pw, u_nm) VALUES (NO_SEQ.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			System.out.print("아이디입력>>");
			pstmt.setString(1, sc.next());
			System.out.print("비밀번호 입력>>");
			pstmt.setString(2, sc.next());
			System.out.print("이름입력>>");
			pstmt.setString(3, sc.next());

			result = pstmt.executeUpdate();
			System.out.println("회원 " + result + "건이 등록되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	// 회원정보 수정
	@Override
	public int modifyMember(UserVO param) {
		int result = 0;
		try {
			connect();
			String sql = "UPDATE boarduser SET u_nm = ? WHERE uno = ?";
			pstmt = conn.prepareStatement(sql);
			System.out.print("수정할 이름>>");
			pstmt.setString(1, sc.next());
			pstmt.setInt(2, param.getUno());

			result = pstmt.executeUpdate();
			System.out.println(result + "건이 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 회원 탈퇴
	@Override
	public int deleteMember(UserVO param) {
		int result = 0;
		try {
			connect();
			String sql = "DELETE FROM boarduser WHERE uno = ? AND ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, param.getUno());

			result = pstmt.executeUpdate();
			System.out.println(result + "건 탈퇴되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 로그인
	@Override
	public UserVO login(String id, String pw) {
		UserVO user = null;
		try {
			connect();
			String sql = "SELECT * FROM boarduser WHERE u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new UserVO();
				user.setUno(rs.getInt("uno"));
				user.setUid(rs.getString("u_id"));
				user.setUpw(rs.getString("u_pw"));
				user.setUnm(rs.getString("u_nm"));
				if (user.getUid().equals(id)) {
					if (user.getUpw().equals(pw)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("아이디 또는 비밀번호가 틀립니다.");
					}
				} else {
					System.out.println("아이디 또는 비밀번호가 틀립니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return user;
	}
}
