package com.yeji.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yeji.board.model.dto.Article;
import com.yeji.board.model.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@GetMapping("/list/{boardSeq}")
	public String showArticles(Model model, @PathVariable int boardSeq) {
		
		List<Article> articleList = articleService.getArticleList(boardSeq);
		model.addAttribute("articleList", articleList);
		model.addAttribute("boardSeq", boardSeq);
		return "article/list";
	}

	@GetMapping("/list/{boardSeq}/{subBoardSeq}")
	public String divideArticle(Model model, @PathVariable int boardSeq, @PathVariable int subBoardSeq) {
		List<Article> articleList = articleService.dividedArticleList(boardSeq, subBoardSeq);
		model.addAttribute("articleList", articleList);
		return "article/list";
	}

}
