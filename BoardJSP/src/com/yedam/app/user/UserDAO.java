package com.yedam.app.user;

public interface UserDAO {
	// 회원가입
	public int sign();
	// 회원정보 수정
	public int modifyMember(UserVO param);
	// 회원 탈퇴
	public int deleteMember(UserVO param);
	// 로그인
	public UserVO login(UserVO param);
}
