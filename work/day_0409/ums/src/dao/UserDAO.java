package dao;

import java.util.HashSet;

import dto.UserDTO;

public class UserDAO {
	DBConnection conn;
	
	public UserDAO() {
		//UserDAO Ŭ������ User�� ���� �����͸� �����ϴ� Ŭ�����̴�.
		//���� �����ؾ� �ϴ� ������ "db/UserTable.txt" �̴�.
		//������ UserDAOŸ���� ��ü�� �����Ǵ� ������ ���ο���
		//conn�� �� ���Ͽ� �����ϵ��� �������ش�.
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
















