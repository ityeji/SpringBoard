package com.yeji.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeji.board.model.dao.UserDao;
import com.yeji.board.model.dto.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserList() {
		return userDao.selectAll();
	}

	@Override
	public User logIn(String id, String password) {
		User tmp = userDao.selectOne(id);

		// tmp가 null이 아니다! -> 유저 정보가 있다는 이야기!
		if (tmp != null && tmp.getPassword().equals(password)) {
			// tmp가 null이 아니고, 입력받은 password와 id로 찾은 user객체의 password가 같다!
			// 로그인 가능!
			return tmp;
		}

		// 로그인 불가한 상태
		return null;
	}

	@Override
	public void signUp(User user) {
		// 회원 가입
		userDao.insertUser(user);

	}

}
