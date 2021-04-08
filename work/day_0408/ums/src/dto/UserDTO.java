package dto;

//����������
//(default)	: �ٸ� ��Ű������ ���� �Ұ�
//public	: ��� ������ ���� ����
//private	: �ڽ��� ������ ������ ���� �Ұ�
//protected	: �ٸ� ��Ű������ ���� �Ұ�, ��ӹ��� Ŭ������ ����
public class UserDTO {
	//Alt + Shift + A : ������ ���ÿ� ����
	public String userid;
	public String userpw;
	public String username;
	public int userage;
	public String userphone;
	public String useraddr;
	
	public UserDTO(String userid, String userpw, String username, int userage, String userphone, String useraddr) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userage = userage;
		this.userphone = userphone;
		this.useraddr = useraddr;
	}
	//Alt + Shift + S > R : getter,setter �����ϱ�
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseraddr() {
		return useraddr;
	}
	public void setUseraddr(String useraddr) {
		this.useraddr = useraddr;
	}
	
	@Override
	public String toString() {
		return userid+"\t"+userpw+"\t"+username+"\t"+userage+
				"\t"+userphone+"\t"+useraddr;
	}
	
}





