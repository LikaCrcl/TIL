package koreait.vo;

public class Member {
	
		private int mno;
		private String name;
		private String password;
		private String email;      //위에 4개는 not null
		private String gender;
		private String hobby;
		private String addr;
		private int age;
		
		//not null 컬럼 생성자로 초기화
		public Member(int mno, String name, String password, String email) {
			super();
			this.mno = mno;
			this.name = name;
			this.password = password;
			this.email = email;
		}

		public int getMno() {
			return mno;
		}

		public void setMno(int mno) {
			this.mno = mno;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Member [mno=" + mno + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
					+ gender + ", hobby=" + hobby + ", addr=" + addr + ", age=" + age + "]";
		}
		
		
		
}
