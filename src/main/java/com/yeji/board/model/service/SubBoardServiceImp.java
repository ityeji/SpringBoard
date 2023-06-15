package com.yeji.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeji.board.model.dao.SubBoardDao;
import com.yeji.board.model.dto.SubBoard;

@Service
public class SubBoardServiceImp implements SubBoardService {

	
	private SubBoardDao subBoardDao;
	
	@Autowired
	public void getSubBoardDao(SubBoardDao subBoardDao) {
		this.subBoardDao = subBoardDao;
	}
	
	@Override
	public List<SubBoard> getSubBoards(int boardSeq) {
		return subBoardDao.selectAll(boardSeq);
	}

}
