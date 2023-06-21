package com.yeji.board.model.dto;

public class Article {
	
	private int seq;
	private String title;
	private String writer;
	private String content;
	private int boardSeq;
	private int subBoardSeq;
	private int viewCnt;
	
	public Article() {
	}

	public Article(int seq, String title, String writer, String content, int boardSeq, int subBoardSeq, int viewCnt) {
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.boardSeq = boardSeq;
		this.subBoardSeq = subBoardSeq;
		this.viewCnt = viewCnt;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}

	public int getSubBoardSeq() {
		return subBoardSeq;
	}

	public void setSubBoardSeq(int subBoardSeq) {
		this.subBoardSeq = subBoardSeq;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "Article [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", boardSeq=" + boardSeq + ", subBoardSeq=" + subBoardSeq + ", viewCnt=" + viewCnt + "]";
	}

	
}
