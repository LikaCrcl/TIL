package bank;

public class Account implements Runnable{
	int balance;
	
	synchronized void withdraw(int money) {
		this.balance-=money;
		System.out.println("현재 잔액 : "+balance+"원");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
//			synchronized (this) {
//				withdraw(1000);
//			}
			withdraw(1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
