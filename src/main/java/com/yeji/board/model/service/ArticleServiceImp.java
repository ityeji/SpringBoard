package com.yeji.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeji.board.model.dao.ArticleDao;
import com.yeji.board.model.dto.Article;

@Service
public class ArticleServiceImp implements ArticleService {
	
	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> getArticleList(int boardSeq) {
		return articleDao.selectAll(boardSeq);
	}

	@Override
	public List<Article> dividedArticleList(int boardSeq, int subBoardSeq) {
		return articleDao.divideAll(boardSeq, subBoardSeq);
	}
	
	

}
