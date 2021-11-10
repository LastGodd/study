package com.yedam.app.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.app.common.DAO;
import com.yedam.app.user.UserVO;

public class BoardDAOImpl extends DAO implements BoardDAO {
	// 싱글톤
	private static BoardDAO instance = new BoardDAOImpl();

	public static BoardDAO getInstance() {
		return instance;
	}

	Scanner sc = new Scanner(System.in);

	
	// 게시글 등록
	@Override
	public int boardInsert(BoardVO param, UserVO user) {
		int result = 0;
		try {
			connect();
			String sql = "INSERT INTO board (bno, title, content, uno) VALUES(BNO_SEQ.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			System.out.print("제목 입력 >>");
			pstmt.setString(1, sc.next());
			System.out.print("내용 입력>>");
			pstmt.setString(2, sc.next());
			pstmt.setInt(3, user.getUno());

			result = pstmt.executeUpdate();
			System.out.println(result + "건이 등록되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 게시글 수정
	@Override
	public int boardUpdate(BoardVO param, UserVO user) {
		int result = 0;
		try {
			connect();
			String sql = "UPDATE board SET title = ?, content = ? WHERE bno = ? AND uno = ?";
			if(param.getUno() == user.getUno()) {
				pstmt = conn.prepareStatement(sql);
				System.out.print("수정할 글 제목 >>");
				pstmt.setString(1, sc.next());
				System.out.print("수정할 내용>>");
				pstmt.setString(2, sc.next());
				pstmt.setInt(3, param.getBno());
				pstmt.setInt(4, param.getUno());
				
				result = pstmt.executeUpdate();
				System.out.println(result + "건이 수정되었습니다.");
			} else {
				System.out.println("수정 권한이 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 게시글 삭제
	@Override
	public int boardDelete(BoardVO param, UserVO user) {
		int result = 0;
		try {
			connect();
			String sql = "DELETE FROM board WHERE bno = ? AND uno = ?";
			if(param.getUno() == user.getUno()) {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, param.getBno());
				pstmt.setInt(2, param.getUno());
				
				result = pstmt.executeUpdate();
				System.out.println(result + "건 삭제되었습니다.");
			} else {
				System.out.println("삭제 권한이 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 게시글 전체 리스트
	@Override
	public List<BoardVO> boardListAll() {
		List<BoardVO> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM board";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BoardVO param = new BoardVO();
				param.setBno(rs.getInt("bno"));
				param.setTitle(rs.getString("title"));
				param.setContent(rs.getString("content"));
				param.setUno(rs.getInt("uno"));

				list.add(param);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 게시글 내용
	@Override
	public BoardVO boardList(int bno) {
		BoardVO param = null;
		try {
			connect();
			String sql = "SELECT * FROM board WHERE bno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				param = new BoardVO();
				param.setBno(rs.getInt("bno"));
				param.setTitle(rs.getString("title"));
				param.setContent(rs.getString("content"));
				param.setUno(rs.getInt("uno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return param;
	}

}
