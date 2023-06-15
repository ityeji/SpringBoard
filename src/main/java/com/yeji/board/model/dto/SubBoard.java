package com.yeji.board.model.dto;

public class SubBoard {
	
	private String name;
	private int boardSeq;
	
	public SubBoard() {
	}

	public SubBoard(String name, int boardSeq) {
		this.name = name;
		this.boardSeq = boardSeq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}

	@Override
	public String toString() {
		return "SubBoard [name=" + name + ", boardSeq=" + boardSeq + "]";
	}
	
}
