package com.yeji.board.model.dto;

public class User {
	
	private int seq;
	private String id;
	private String password;
	private String email;
	private String nickname;
	
	public User() {
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "User [seq=" + seq + ", id=" + id + ", password=" + password + ", email=" + email + ", nickname="
				+ nickname + "]";
	}
	
}
