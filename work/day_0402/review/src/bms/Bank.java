package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int balance;
	
	public Bank() {}
	
	public Bank(String account, String pw, String name) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = 0;
	}
	void deposit(int money) {
		balance+=money;
	}
	void withdraw(int money) {
		if(balance>=money) {
			balance-=money;
		}
	}
	void show() {
		System.out.println(name+"ดิ("+account+")\nภÜพื : "+balance+"ฟ๘");
	}
}









