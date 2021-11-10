package com.yedam.app;

import java.util.Scanner;

import com.yedam.app.common.Frame;
import com.yedam.app.user.UserDAO;
import com.yedam.app.user.UserDAOImpl;
import com.yedam.app.user.UserVO;

public class UserFrame  implements Frame {
	Scanner sc = new Scanner(System.in);
	UserDAO dao = UserDAOImpl.getInstance();
	UserVO param = null;

	void menuPrint() {
		System.out.println("");
		System.out.println("===================================");
		System.out.println("==1.회원가입 2.회원정보수정 3.회원탈퇴 4.로그인 5.로그아웃 9.종료==");
		System.out.println("===================================");
		System.out.println("선택>>");
	}

	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	@Override
	public void run() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 회원가입
				signUser();
			} else if (menuNo == 2) { // 회원정보 수정
				modifyUser();
			} else if (menuNo == 3) { // 회원 탈퇴
				deleteUser();
			} else if (menuNo == 4) { // 로그인
				loginUser();
			} else if (menuNo == 5) { // 로그아웃
				logout();
			} else if (menuNo == 9) { // 종료
				end();
				break;
			}
		}
	}

	// 1.회원가입
	void signUser() {
		dao.sign();
	}

	// 2.회원정보 수정
	void modifyUser() {
		dao.modifyMember(param);

	}

	// 3.회원탈퇴
	void deleteUser() {
		dao.deleteMember(param);
	}

	// 4. 로그인
	void loginUser() {
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		param = dao.login(id, pw);
	}

	// 5. 로그아웃
	void logout() {
		if (param != null) {
			param = null;
		} else {
			System.out.println("로그인 정보가 없습니다.");
		}
	}

	// 종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}
}
