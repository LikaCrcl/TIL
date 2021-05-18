package com.korea.vo;

import java.util.Date;

//freeboard 테이블 컬럼과 매핍되는 프로퍼티 설정

public class Freeboard {
		private int idx;
		private String name;
		private String password;
		private String subject;
		private String content;
		private int readCount;  //조회수
		private Date wdate;
		private String ip;
		private int commentCount; //댓글수
		
		
		
		public int getIdx() {
			return idx;
		}
		public void setIdx(int idx) {
			this.idx = idx;
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
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public int getReadCount() {
			return readCount;
		}
		public void setReadCount(int readCount) {
			this.readCount = readCount;
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
		public int getCommentCount() {
			return commentCount;
		}
		public void setCommentCount(int commentCount) {
			this.commentCount = commentCount;
		}
		
		@Override
		public String toString() {
			return "Freeboard [idx=" + idx + ", name=" + name + ", subject=" + subject + ", readCount=" + readCount
					+ ", commentCount=" + commentCount + "]";
		}
		
		
		
}

