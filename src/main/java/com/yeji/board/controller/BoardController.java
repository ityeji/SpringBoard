package com.yeji.board.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeji.board.model.dto.Board;
import com.yeji.board.model.dto.SubBoard;
import com.yeji.board.model.service.BoardService;
import com.yeji.board.model.service.SubBoardService;

@RestController
@RequestMapping("/")
public class BoardController {
	
	private BoardService boardService;
	private SubBoardService subBoardService;
	
	@Autowired
	public void setBoarService (BoardService boardService) {
		this.boardService = boardService;
	}
	
	@Autowired
	public void setSubBoardService (SubBoardService subBoardService) {
		this.subBoardService = subBoardService;
	}

	@GetMapping()
	public String index(Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "index";
	}
}
