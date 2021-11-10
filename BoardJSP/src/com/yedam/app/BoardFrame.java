package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.board.BoardDAO;
import com.yedam.app.board.BoardDAOImpl;
import com.yedam.app.board.BoardVO;
import com.yedam.app.common.Frame;
import com.yedam.app.user.UserVO;

public class BoardFrame implements Frame {
	Scanner sc = new Scanner(System.in);
	BoardDAO dao = BoardDAOImpl.getInstance();
	BoardVO param = new BoardVO(4, 1);
	UserVO user = new UserVO(1);

	public void run() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 게시글 등록
				insertBoard();
			} else if (menuNo == 2) { // 게시글 수정
				modifyBoard();
			} else if (menuNo == 3) { // 게시글 삭제
				deleteBoard();
			} else if (menuNo == 4) { // 게시글 전체 제목
				selectAll();
			} else if (menuNo == 5) { // 게시글 내용
				selectOne();
			} else if (menuNo == 9) { // 종료
				end();
				break;
			}
		}
	}

	void menuPrint() {
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("==1.게시글 등록 2.게시글 수정 3.게시글 삭제 4.게시글 전체 목록 5.게시글 내용 9.종료==");
		System.out.println("===========================================");
		System.out.println("선택>>");
	}

	// 메뉴를 선택하는 메소드
	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	// 메소드
	// 종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	// 1. 게시글 등록
	void insertBoard() {
		dao.boardInsert(param, user);

	}

	// 2. 게시글 수정
	void modifyBoard() {
		dao.boardUpdate(param, user);
	}

	// 3. 게시글 삭제
	void deleteBoard() {
		dao.boardDelete(param, user);
	}

	// 4. 게시글 전체 제목
	void selectAll() {
		List<BoardVO> list = dao.boardListAll();
		for (BoardVO vo : list) {
			System.out.println(vo);
		}
	}

	// 5. 게시글 내용보기
	void selectOne() {
		System.out.print("조회할 게시글 번호입력>>");
		BoardVO board = dao.boardList(sc.nextInt());
		System.out.println(board.contentInfo());
	}
}
