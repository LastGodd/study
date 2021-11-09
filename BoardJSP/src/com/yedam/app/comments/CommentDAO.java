package com.yedam.app.comments;

import java.util.List;

public interface CommentDAO {
	// 댓글 작성
	public int insertComment();
	// 댓글 수정
	public int modifyComment(CommentVO param);
	// 댓글 삭제
	public int deleteComment(CommentVO param);
	// 댓글 보기
	public List<CommentVO> commentsList(CommentVO param);
}
