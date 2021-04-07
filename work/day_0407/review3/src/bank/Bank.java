package bank;

public class Bank {
	public static void main(String[] args) {
		Account account = new Account();
		account.balance=10000;
		
		Thread mom = new Thread(account);
		Thread son = new Thread(account);
		mom.start();
		son.start();
	}
}
