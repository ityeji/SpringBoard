package com.yeji.board.model.dao;

import java.util.List;

import com.yeji.board.model.dto.SubBoard;

public interface SubBoardDao {
	
	public List<SubBoard> selectAll(int boardSeq);

}
