package com.yeji.board.model.service;

import java.util.List;


import com.yeji.board.model.dto.SubBoard;

public interface SubBoardService {

	public List<SubBoard> getSubBoards(int boardSeq);
}
