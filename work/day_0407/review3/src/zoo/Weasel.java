package zoo;

public class Weasel extends Animal implements Runnable{

	public Weasel(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void makeSomeNoise() {
		for (int i = 0; i < 10; i++) {
			System.out.println("²Ï¾Ö¾×!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
	@Override
	public void run() {
		makeSomeNoise();
	}
}
