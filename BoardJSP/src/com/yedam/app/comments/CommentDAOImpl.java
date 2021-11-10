package com.yedam.app.comments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.app.board.BoardVO;
import com.yedam.app.common.DAO;
import com.yedam.app.user.UserVO;

public class CommentDAOImpl extends DAO implements CommentDAO {
	// 싱글톤
	private static CommentDAO instance = new CommentDAOImpl();

	public static CommentDAO getInstance() {
		return instance;
	}

	// 유저정보
	UserVO user;
	BoardVO param;
	Scanner sc = new Scanner(System.in);

	// 댓글 입력
	@Override
	public int insertComment(BoardVO param, UserVO user) {
		int result = 0;
		try {
			connect();
			String sql = "INSERT INTO comments( cno, content, bno, uno) VALUES(CNO_SEQ.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			System.out.print("댓글입력>>");
			pstmt.setString(1, sc.next());
			pstmt.setInt(2, param.getBno());
			pstmt.setInt(3, user.getUno());
			result = pstmt.executeUpdate();
			System.out.println("댓글 " + result + "건이 등록되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 댓글 수정
	@Override
	public int modifyComment(CommentVO param, UserVO user) {
		int result = 0;
		try {
			connect();
			String sql = "UPDATE comments SET content = ? WHERE cno = ? AND uno = ?";
			if(param.getUno() == user.getUno()) {
				
				pstmt = conn.prepareStatement(sql);
				System.out.print("수정할 댓글 번호>>");
				pstmt.setInt(2, sc.nextInt());
				System.out.print("수정할 댓글>>");
				pstmt.setString(1, sc.next());
				pstmt.setInt(3, param.getUno());
				
				result = pstmt.executeUpdate();
				System.out.println(result + "건이 수정되었습니다.");
			} else {
				System.out.println("댓글 수정 권한이 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 댓글 삭제
	@Override
	public int deleteComment(CommentVO param, UserVO user) {
		int result = 0;
		try {
			connect();
			String sql = "DELETE FROM comments WHERE cno = ? AND uno = ?";
			if(param.getUno() == user.getUno()) {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, param.getCno());
				pstmt.setInt(2, param.getUno());
				
				result = pstmt.executeUpdate();
				System.out.println(result + "건이 삭제되었습니다.");
			} else {
				System.out.println("댓글 삭제 권한이 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 게시글 댓글 출력
	@Override
	public List<CommentVO> commentsList(CommentVO param) {
		List<CommentVO> list = new ArrayList<>();

		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM comments WHERE bno=" + param.getBno();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				CommentVO cvo = new CommentVO();
				cvo.setCno(rs.getInt("cno"));
				cvo.setContent(rs.getString("content"));
				cvo.setBno(rs.getInt("bno"));
				cvo.setUno(rs.getInt("uno"));
				
				list.add(cvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}
