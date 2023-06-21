package com.yeji.board.model.dao;

import java.util.List;

import com.yeji.board.model.dto.User;

public interface UserDao {

	// admin전용 유저리스트
	public List<User> selectAll();

	// 로그인 할 때 해당 유저 찾기
	public User selectOne(String id);

	// 회원가입
	public void insertUser(User user);
}
