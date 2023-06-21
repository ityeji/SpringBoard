package com.yeji.board.model.service;

import java.util.List;

import com.yeji.board.model.dto.Article;

public interface ArticleService {
	
	public List<Article> getArticleList(int boardSeq);
	
	public List<Article> dividedArticleList(int boardSeq, int subBoardSeq);

}
