package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.board.BoardVO;
import com.yedam.app.comments.CommentDAO;
import com.yedam.app.comments.CommentDAOImpl;
import com.yedam.app.comments.CommentVO;
import com.yedam.app.common.Frame;
import com.yedam.app.user.UserVO;

public class CommentFrame implements Frame {
	Scanner sc = new Scanner(System.in);
	CommentDAO dao = CommentDAOImpl.getInstance();
	BoardVO param = new BoardVO(4, 1);// 게시글 4번 // 유저 1번
	UserVO user = new UserVO(1);	// 유저 1번
	CommentVO com = new CommentVO(3, 4, 1); // 댓글번호 3번

	@Override
	public void run() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 댓글 등록
				insertComment();
			} else if (menuNo == 2) { // 댓글 수정
				modifyComment();
			} else if (menuNo == 3) { // 댓글 삭제
				deleteComment();
			} else if (menuNo == 4) { // 댓글 전체 확인
				commentsList();
			} else if (menuNo == 9) { // 종료
				end();
				break;
			}
		}
	}

	void menuPrint() {
		System.out.println("");
		System.out.println("=============================");
		System.out.println("==1.댓글등록 2.댓글수정 3.댓글삭제 4.댓글출력 9.종료==");
		System.out.println("=============================");
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

	// 종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	// 댓글 등록
	void insertComment() {
		dao.insertComment(param, user);
	}

	// 댓글 수정
	void modifyComment() {
		dao.modifyComment(com, user);

	}

	// 댓글 삭제
	void deleteComment() {
		dao.deleteComment(com, user);

	}

	// 댓글 전체확인
	void commentsList() {
		List<CommentVO> list = dao.commentsList(com);
		for (CommentVO vo : list) {
			System.out.println(vo);
		}
	}
}
