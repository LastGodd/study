package com.yedam.app.user;

import oracle.sql.DATE;

public class UserVO {
	private int uno;
	private String uid;
	private String upw;
	private String unm;
	private DATE hiredate;

	public UserVO() {

	}

	public UserVO(int uno) {
		this.uno = uno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public DATE getHiredate() {
		return hiredate;
	}

	public void setHiredate(DATE hiredate) {
		this.hiredate = hiredate;
	}

}
