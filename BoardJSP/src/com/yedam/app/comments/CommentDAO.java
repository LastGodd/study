package com.yedam.app.comments;

import java.util.List;

import com.yedam.app.board.BoardVO;
import com.yedam.app.user.UserVO;

public interface CommentDAO {
	// 댓글 작성
	public int insertComment(BoardVO param, UserVO user);
	// 댓글 수정
	public int modifyComment(CommentVO param, UserVO user);
	// 댓글 삭제
	public int deleteComment(CommentVO param, UserVO user);
	// 댓글 보기
	public List<CommentVO> commentsList(CommentVO param);
}
