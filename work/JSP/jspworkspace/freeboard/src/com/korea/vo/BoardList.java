package com.korea.vo;

import java.util.List;

//페이징(1페이지에 보여줄 목록과 페이지 이동부분설정)
//에 필요한 변수들을 멤버로 함.
public class BoardList {
	private int currentPage;   //현재 페이지      예) 1, 14 , 29....
	private int totalCount;		//전체 글의 갯수     예) 136개 
	private int pageSize;	//1페이지 목록의 글 갯수     예) 10개
	
	private int totalPage;
	private int startNo;       //currentPage값으로 글목록의 시작번호 구합니다.
	private int endNo;   	   //currentPage값으로 글목록의 마직막번호 구합니다.	
	private int startPage;     //currentPage값으로 페이지목록의 시작번호 구합니다.
	private int endPage;        //currentPage값으로 페이지목록의 마지막번호 구합니다.
	
	private List<Freeboard> list;    //페이징으로 계산된 starNO~endNo 글 리스트를 참조
	
	public BoardList(int currentPage,int totalCount,int pageSize) {
		//프로퍼티 2개 값 초기화
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		
		//나머지 프로퍼티 계산하기 -> 초기화
		totalPage = (totalCount - 1) / pageSize + 1;    //  (136-1)/10 +1   => 14개
		this.currentPage 
			= currentPage > totalPage ? totalPage:currentPage;  //인자로 전달된 currentPage가 전체페이지 갯수보다 클때 필요
		this.currentPage 
			= currentPage < 1 ? 1:currentPage;   
			
		//글목록 범위 계산	
		startNo = (this.currentPage - 1) * pageSize +1 ;       //currentPage=4 ,pageSize=20 , startNo=61
		endNo = startNo + pageSize -1 ;  						//  						  endNo=80
		
		//페이지목록 범위 계산									//currentPage 20일때 , 11 
		startPage = (this.currentPage - 1) / 10 * 10 + 1;   //currentPage 14일때 , 11 
		endPage = startPage + 9;							//currentPage 14일때 , 20
		endPage = endPage > totalPage ? totalPage : endPage;   //마지막 페이지목록에서 필요함.
	}
	//list의 getter/setter
	public List<Freeboard> getList() {
		return list;
	}
	
	public void setList(List<Freeboard> list) {
		this.list = list;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	@Override
	public String toString() {
		return "BoardList [currentPage=" + currentPage + ", startNo=" + startNo + ", endNo=" + endNo + ", list=" + list
				+ "]";
	}
	
	
}
