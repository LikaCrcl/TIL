package hrd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrd.vo.Sale;

public class SaleDao {
	DataSource ds;
	
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	
	public List<Sale> getSales(){
		List<Sale> list = new ArrayList<Sale>();
		
		String sql ="SELECT cust.custno,custname," + 
				"DECODE(grade,'A','VIP','B','일반','C','직원') grade2,sale.total" + 
				" FROM MEMBER_TBL_02 cust," + 
				"(SELECT custno,sum(price) total" + 
				" FROM MONEY_TBL_02" + 
				" GROUP BY custno) sale" + 
				" WHERE cust.custno = sale.custno ORDER BY cust.custno";
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connection = ds.getConnection();
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Sale(rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getInt(4)));
			}
			
			
		}catch (SQLException e) {      //java.sql 패키지 클래스는 javaSE 에 포함.
			// 완성시키세요.
			System.out.println("getSales() Exception : " + e.getMessage());
		}finally {
			if(rs!=null) try {rs.close(); } catch(SQLException e){}
			if(pstmt!=null) try {pstmt.close(); } catch(SQLException e){}
			if(connection!=null) try {connection.close(); } catch(SQLException e){}
		}
		
		return list;
	}
}








