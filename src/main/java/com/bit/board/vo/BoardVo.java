package com.bit.board.vo;

public class BoardVo {
	private int board_seq;
	private String id;
	private String title;
	private String content;
	private String modi_date;
	private String board_name;
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public int getBoard_seq() {
		return board_seq;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getModi_date() {
		return modi_date;
	}
	public void setModi_date(String modi_date) {
		this.modi_date = modi_date;
	}
	
	@Override
	public String toString() {
		return "BoardVo [board_seq=" + board_seq + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", modi_date=" + modi_date + ", board_name=" + board_name + "]";
	}
	
	
}
