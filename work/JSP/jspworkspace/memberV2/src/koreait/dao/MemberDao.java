package koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import koreait.vo.Member;

public class MemberDao {
	
			DataSource ds;
			
			public void setDataSource(DataSource ds) {
				this.ds = ds;
			}
			
			public List<Member> selectList(){  //select 쿼리 실행 리턴 타입이 List<Member>
				Connection connection = null;   
				List<Member> list=null;
				String sql ="select * from member";
				
				//select 쿼리 실행에 필요한 객체 준비
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				Member member;
				
				try {  //오류 수정 단축키 ctrl+ 1
					//select 쿼리 실행
					
					//DBCP 에서 connection 가져오기
					connection = ds.getConnection();
					
					pstmt = connection.prepareStatement(sql);   //preparedStatement(), executeQuery() 메소드는
					rs = pstmt.executeQuery();                  //SQLException 발생 가능성이 있는 메소드로 정의되었으므로
																//try~catch 처리 꼭 필요하다.
					//실행결과를 rs 참조해서 list로 저장한다.
					list = new ArrayList<>();
					
					while(rs.next()) {   //rs는 select 쿼리 결과 row(행)를 가리키는 포인터로 생각합시다.
						//지정된 row에서 컬럼단위로 값을 가져오기 -> member 객체에 저장한다.
						member = new Member(rs.getInt(1), 
								rs.getString(2), rs.getString(3), rs.getString(4));
						member.setGender(rs.getString(5));
						member.setHobby(rs.getString(6));
						member.setAddr(rs.getString(7));
						member.setAge(rs.getInt(8));
						list.add(member);
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("SelectList Exception : " + e.getMessage());
				} finally {
					//쿼리 실행 사용한 객체 종료(close)
					if(rs != null) 
						try {rs.close();	} catch (SQLException e) {	}
					if(pstmt != null)
						try {pstmt.close();	} catch (SQLException e) {	}
					if(connection !=null)     //DB풀에서 가져온 Connection 객체를 참조하던 포인터 close   :   [ 객체  ]   <-----  [포인터 객체가 객체 참조 주소값 등을 관리] 
						try {connection.close(); } catch (SQLException e) {}
					
				}
				
				
				return list;
			}
	
			//앞으로 추가할 메소드
			//select one : pk 검색 결과
			//insert
			public int insert(Member member) {
				Connection connection = null;
				int n=0;
				String sql="insert into member(mno,name,password,email,gender,hobby,addr,age) " + 
						"values (MEMBER_IDX_SEQ.NEXTVAL,?,?,?,?,?,?,?)";
				PreparedStatement pstmt = null;
				try {
					connection = ds.getConnection();
					
					pstmt=connection.prepareStatement(sql);
					
					pstmt.setString(1,member.getName());
					pstmt.setString(2, member.getPassword());
					pstmt.setString(3, member.getEmail());
					pstmt.setString(4, member.getGender());
					pstmt.setString(5, member.getHobby());
					pstmt.setString(6, member.getAddr());
					pstmt.setInt(7, member.getAge());
					n=pstmt.executeUpdate();    //insert 실행 하고 반영된 row(행) 개수를 리턴
					
				}catch (SQLException e) {
					System.out.println("Insert Exception : " + e.getMessage());
				
				}finally {
					if(pstmt !=null)
						try {
							pstmt.close();
						} catch (SQLException e) {	}
					if(connection !=null)     //DB풀에서 가져온 Connection 객체를 참조하던 포인터 close   :   [ 객체  ]   <-----  [포인터 객체가 객체 참조 주소값 등을 관리] 
						try {connection.close(); } catch (SQLException e) {}
				}
				return n;
				
			}
			
			//login select
			public Member login(String email,String password) {
				Connection connection = null;
				Member member = null;
				
				//email을 아이디로 사용한다.그러므로 중복값이 없어야한다.
				//String sql = "select mno,name,email,gender from member where email = ? and password=?";  //**
				String sql ="select * from member where email=? and password=?";
				
				PreparedStatement pstmt = null;
				ResultSet rs =null;
				
				try {
					connection = ds.getConnection();
					pstmt=connection.prepareStatement(sql);
					pstmt.setString(1, email);
					pstmt.setString(2, password);
					rs = pstmt.executeQuery();
					
					if(rs.next()) {   //select 조회결과 row(행)이 존재한다.--> 로그인 성공.객체 -> Member 타입 리턴
						// member=new Member(rs.getInt(1),rs.getString(2),"",rs.getString(3));   //**
						 member=new Member(rs.getInt(1),rs.getString(2),"",rs.getString(4));
						 
						 member.setGender(rs.getString(5));
						 member.setHobby(rs.getString(6));
						 member.setAddr(rs.getString(7));
						 member.setAge(rs.getInt(8));
					}
				}catch (SQLException e) {
					System.out.println("Login Exception : " + e.getMessage());
				}finally {
					//쿼리 실행 사용한 객체 종료(close)
					if(rs != null) 
						try {rs.close();	} catch (SQLException e) {	}
					if(pstmt != null)
						try {pstmt.close();	} catch (SQLException e) {	}
					if(connection !=null)     
						//DB풀에서 가져온 Connection 객체를 참조하던 포인터 close   : [DBCP Connection 객체  ]   <-----  [포인터 객체가 객체 참조 주소값 등을 관리] 
						try {connection.close(); } catch (SQLException e) {}
				}
				
				return member;    //로그인을 성공하지 못했다면 member는 무엇일까요?  답 : null
				
			}
			
			
			//update : 무엇을 수정할까요?  email,age,gender,addr,hobby 
			//sql : UPDATE MEMBER SET email='test@up.com',GENDER='female',addr='대전',hobby='[스키]',age=12 WHERE mno=1
//			public int update(Member member) {
//				
//				
//				
//			}
			
			
			//delete
			
}












