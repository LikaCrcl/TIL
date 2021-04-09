package dao;

import java.util.HashSet;

import dto.UserDTO;

public class UserDAO {
	DBConnection conn;
	
	public UserDAO() {
		//UserDAO 클래스는 User에 관한 데이터만 관리하는 클래스이다.
		//따라서 접근해야 하는 파일은 "db/UserTable.txt" 이다.
		//때문에 UserDAO타입의 객체가 생성되는 생성자 내부에서
		//conn을 그 파일에 접근하도록 생성해준다.
		conn = new DBConnection("db/UserTable.txt");
	}
	
	public boolean join(UserDTO user) {
		return conn.insert(user.toString());
	}

	//							apple
	public boolean checkId(String userid) {
		HashSet<String> rs = conn.select(0, userid);
		return rs.size()==0;
	}

	public boolean login(String userid, String userpw) {
		HashSet<String> rs = conn.select(0, userid);
		for(String line : rs) {
			if(line.split("\t")[1].equals(userpw)) {
				Session.setData("login_id", userid);
				return true;
			}
		}
		return false;
	}

	public boolean updateUser(String userid, int col, String newData) {
		return conn.update(userid, col, newData);
	}

	public boolean leaveId() {
		return conn.delete(Session.getData("login_id"));
	}
	
}
















