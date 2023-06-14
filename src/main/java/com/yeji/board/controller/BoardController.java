package com.yeji.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yeji.board.model.dto.Board;
import com.yeji.board.model.service.BoardService;

@Controller
public class BoardController {
	
	private  BoardService boardService;
	
	@Autowired
	public void setBoarService (BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "index";
	}
}
