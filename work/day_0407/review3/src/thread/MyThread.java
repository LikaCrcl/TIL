package thread;

public class MyThread extends Thread{
	String data;

	//Alt + Shift + S > O : 필드를 이용해서 생성자 만들기
	public MyThread(String data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
//			Thread.sleep(1000);	 : 1초 잠시 쉬기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
	
}
