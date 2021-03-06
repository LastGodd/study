package com.yedam.app.comments;

public class CommentVO {
	private int cno;
	private String content;
	private int bno;
	private int uno;

	public CommentVO() {

	}

	public CommentVO(int cno, int bno, int uno) {
		this.cno = cno;
		this.bno = bno;
		this.uno = uno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	@Override
	public String toString() {
		return content;
	}

}
