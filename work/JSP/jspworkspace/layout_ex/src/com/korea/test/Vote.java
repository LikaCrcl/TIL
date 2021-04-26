package com.korea.test;

public class Vote {
	private String content; 	// 설문 항목
	private int count; 			// 득표수
	
	public Vote(String content, int count) {
		super();
		this.content = content;
		this.count = count;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
