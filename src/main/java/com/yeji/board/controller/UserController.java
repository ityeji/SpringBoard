package com.yeji.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yeji.board.model.dto.User;
import com.yeji.board.model.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// 로그인 페이지 이동
	@GetMapping("/login")
	public String loginForm() {
		return "/user/login";
	}

	// 로그인
	@PostMapping("/login")
	public String logIn(User user) {
		// 밑의 내용을 수행하려면?
		// 먼저, 로그인시 입력한 아이디와 비밀번호가 DB에 있는지를 확인해야함!
		// 없으면 null
		// 있으면 User
		User tmp = userService.logIn(user.getId(), user.getPassword());

		// 회원 정보가 DB에 없으면 로그인 화면으로 다시 돌아가기
		if (tmp == null) {
			return "redirect:login";
		} else {
			// 회원 정보가 DB에 있으면 로그인이 가능하므로
			// 바로 메인 페이지로 이동
			return "redirect:index";
		}
	}

	// 로그아웃
	@GetMapping("/logout")
	// 로그아웃한다는 것 -> session에 저장되어있는 user 정보를 session에서 지운다는 것
	// 그래서 파라미터로 session 받아줘야함
	public String logOut(HttpSession session) {
		session.removeAttribute("loginUser");
//		session.invalidate();
		return "redirect:index";
	}

	// 회원가입창으로 이동
	@GetMapping("/signup")
	public String signUp() {
		return "/user/signup";
	}

	// 회원가입
	@PostMapping("/signup")
	public String signUp(User user) {
		userService.signUp(user);

		// 회원가입 하는 순간 자동으로 로그인도 되게끔 짜보자!
		this.logIn(user);
		return "redirect:index";
	}

	// 관리자용 유저 리스트
	@GetMapping("/list")
	public String userList(Model model) {
		// jsp 화면에 뿌려주어야 하니까 Model 객체를 사용한다.
		model.addAttribute("userList", userService.getUserList());
		return "/user/list";
	}
}
