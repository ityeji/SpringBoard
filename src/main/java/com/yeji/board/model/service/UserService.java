package com.yeji.board.model.service;

import java.util.List;

import com.yeji.board.model.dto.User;

public interface UserService {

	public List<User> getUserList();

	public User logIn(String id, String password);

	public void signUp(User user);
}
