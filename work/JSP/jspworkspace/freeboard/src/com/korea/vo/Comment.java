package com.korea.vo;

import java.util.Date;

public class Comment {
	private int idx;
	private int mref;
	private String name;
	private String password;
	private String content;
	private Date wdate;
	private String ip;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public int getMref() {
		return mref;
	}
	
	public void setMref(int mref) {
		this.mref = mref;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getWdate() {
		return wdate;
	}
	
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "Comment [idx=" + idx + ", "
	+ "mref=" + mref + ", name=" + name + ", content=" + content + "]";
	}
	
	
	
	
}
