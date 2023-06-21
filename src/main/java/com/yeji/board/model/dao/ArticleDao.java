package com.yeji.board.model.dao;

import java.util.List;

import com.yeji.board.model.dto.Article;

public interface ArticleDao {
	
	public List<Article> selectAll(int boardSeq);
	
	public List<Article> divideAll(int boardSeq, int subBoardSeq);

}
