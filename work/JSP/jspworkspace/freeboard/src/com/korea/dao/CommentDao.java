package com.korea.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.korea.mybatis.SqlSessionUtil;
import com.korea.vo.Comment;

public class CommentDao {
	SqlSessionFactory sqlFactory = SqlSessionUtil.getSessionFactory();
	private static CommentDao cdao = new CommentDao();
	private CommentDao() {}
	public static CommentDao getInstance() {
		return cdao;
	}
	public void insert(Comment bean) {
		SqlSession mapper = sqlFactory.openSession();
		mapper.insert("comment.insert", bean);
		mapper.commit();
		mapper.close();
	}
	
	public List<Comment> getCmtList(int mref){
		SqlSession mapper = sqlFactory.openSession();
		List<Comment> list = mapper.selectList("getCmtList", mref);
		mapper.close();
		return list;		
	}
	
	public int getCmtCnt(int mref) {
		SqlSession mapper = sqlFactory.openSession();
		int n = mapper.selectOne("getCmtCnt", mref);
		mapper.close();
		return n;
	}
	//실행 확인 후 FreeboardDao 로 이동합니다.
	public void updateCmtCnt(int cmtcnt,int idx) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("cmtcnt",cmtcnt);
		map.put("idx",idx);
		SqlSession mapper = sqlFactory.openSession();
		mapper.update("comment.updateCmtCnt",map);
		mapper.commit();
		mapper.close();
	}
}









