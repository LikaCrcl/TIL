package thread;

public class ThreadMain {
	public static void main(String[] args) {
//		MyThread t1 = new MyThread("!");
//		MyThread t2 = new MyThread("?");
//		
//		t1, t2�� �ִ� run()�� �����ٸ� �� ��Ƽ������� �����ض�!
//		t1.start();
//		t2.start();
		
		MyRunnable r1 = new MyRunnable("��");
		MyRunnable r2 = new MyRunnable("��");
		
		//			  ThreadŬ����	Runnable�������̽�
		//			  �� target : r1
		//t1.start() -> t1.run() -> r1.run()
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
