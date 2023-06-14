package com.yeji.board.model.dao;

import java.util.List;

import com.yeji.board.model.dto.Board;

// DAO는 Annotation 안씀!
// root-context.xml에서 mybatis-spring:scan을 썼기 때문!
public interface BoardDao {
	
	// sql문과 비슷한 메소드명을 적기!
	public List<Board> selectAll();
}
