package zoo;

public class Ground {
	public static void main(String[] args) {
		Lutra l = new Lutra("���뺸��", "����", 36);
		Skunk s = new Skunk("�׻���", "����", 22);
		Weasel w = new Weasel("����", "����", 27);
		
		Thread t1 = new Thread(l);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(w);
		System.out.println("=======������ ��� ����!=======");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
		}
		System.out.println("==========================");
	}
}
