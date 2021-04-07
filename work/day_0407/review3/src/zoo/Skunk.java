package zoo;

public class Skunk extends Animal implements Runnable{

	public Skunk(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void makeSomeNoise() {
		for (int i = 0; i < 10; i++) {
			System.out.println("»Ñ¿ì¿ì¿ì¿õ~");
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
