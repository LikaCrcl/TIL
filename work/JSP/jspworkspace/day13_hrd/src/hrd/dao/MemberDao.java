package hrd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrd.vo.Member;

public class MemberDao {
		DataSource ds;
		
		public void setDataSource(DataSource ds) {
			this.ds = ds;
		}
		
		public Member selectOne(int custno) {
			Member member=null;
			String sql="select * from MEMBER_TBL_02 where custno =?";
			
			Connection connection=null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				
				connection = ds.getConnection();
				pstmt = connection.prepareStatement(sql);
				pstmt.setInt(1, custno);
				
				rs = pstmt.executeQuery();
				if(rs.next()) {
					member = new Member(rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getString(4), 
							rs.getDate(5), 
							rs.getString(6), 
							rs.getString(7));
				}
			}catch (SQLException e) {
				System.out.println("Member selectOne() Exception : " + e.getMessage());
			}finally {
				if(rs!=null) try {rs.close();}catch(SQLException e) {}
				if(pstmt!=null) try {pstmt.close();}catch(SQLException e) {}
				if(connection!=null) try {connection.close();}catch(SQLException e) {}
			}
			return member;
		}
		
		public List<Member> getMembers(){
			List<Member> list = new ArrayList<Member>();
			
			Connection connection=null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql="select * from MEMBER_TBL_02";
			try {
				connection = ds.getConnection();
				pstmt = connection.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					list.add(new Member(rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getString(4), 
							rs.getDate(5), 
							rs.getString(6), 
							rs.getString(7)));
				}
			}catch (SQLException e) {
				System.out.println("getMembers() Exception : " + e.getMessage());
			}finally {
				if(rs!=null) try {rs.close();}catch(SQLException e) {}
				if(pstmt!=null) try {pstmt.close();}catch(SQLException e) {}
				if(connection!=null) try {connection.close();}catch(SQLException e) {}
			}
			return list;
		}
}
