package thread;

public class MyThread extends Thread{
	String data;

	//Alt + Shift + S > O : �ʵ带 �̿��ؼ� ������ �����
	public MyThread(String data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
//			Thread.sleep(1000);	 : 1�� ��� ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
	
}
