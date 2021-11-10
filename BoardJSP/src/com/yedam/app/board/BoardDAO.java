package com.yedam.app.board;

import java.util.List;

import com.yedam.app.user.UserVO;

public interface BoardDAO {
	// 게시글 작성
	public int boardInsert(BoardVO param, UserVO user);

	// 게시글 수정
	public int boardUpdate(BoardVO param, UserVO user);

	// 게시글 삭제
	public int boardDelete(BoardVO param, UserVO user);

	// 게시글 전체조회
	List<BoardVO> boardListAll();

	// 게시글 조회
	BoardVO boardList(int bno);
}
