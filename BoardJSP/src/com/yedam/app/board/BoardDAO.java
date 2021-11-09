package com.yedam.app.board;

import java.util.List;

public interface BoardDAO {
	// 게시글 작성
	public int boardInsert(BoardVO param);

	// 게시글 수정
	public int boardUpdate(BoardVO param);

	// 게시글 삭제
	public int boardDelete(BoardVO param);

	// 게시글 전체조회
	List<BoardVO> boardListAll();

	// 게시글 조회
	BoardVO boardList(int bno);
}
