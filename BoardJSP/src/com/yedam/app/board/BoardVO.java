package com.yedam.app.board;

import com.yedam.app.user.UserVO;

public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private int uno;
	UserVO user;

	public BoardVO() {

	}

	public BoardVO(int bno, int uno) {
		this.bno = bno;
		this.uno = uno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return "글번호 : " + bno + " 글제목 : " + title;
	}
	
	public String contentInfo() {
		return "글내용 : " + content;
	}
}
