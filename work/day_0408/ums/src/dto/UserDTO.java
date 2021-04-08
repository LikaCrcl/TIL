package dto;

//접근제어자
//(default)	: 다른 패키지에서 접근 불가
//public	: 모든 곳에서 접근 가능
//private	: 자신을 제외한 곳에서 접근 불가
//protected	: 다른 패키지에서 접근 불가, 상속받은 클래스는 가능
public class UserDTO {
	//Alt + Shift + A : 여러줄 동시에 수정
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
	//Alt + Shift + S > R : getter,setter 생성하기
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





