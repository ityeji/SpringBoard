package com.yeji.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// RestController는 반환값을 jsp로 인식하지 않는다. 본문 그대로로 판단.
//import org.springframework.web.bind.annotation.RestController;

import com.yeji.board.model.dto.Board;
import com.yeji.board.model.service.BoardService;

@Controller
@RequestMapping("/")
public class BoardController {
	
	private BoardService boardService;
	
	@Autowired
	public void setBoarService (BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping()
	public String index(Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "index";
	}
}
