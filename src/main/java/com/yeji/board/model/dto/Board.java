package com.yeji.board.model.dto;

public class Board {
	
	private int seq;
	private String name;
	
	public Board() {
	}
	
	public Board(int seq, String name) {
		this.seq = seq;
		this.name = name;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", name=" + name + "]";
	}

}
