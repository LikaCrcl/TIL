package thread;

public class MyRunnable implements Runnable{
	String data;
	
	public MyRunnable(String data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}
}
