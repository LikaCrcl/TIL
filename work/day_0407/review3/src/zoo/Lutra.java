package zoo;

//¼ö´Þ
public class Lutra extends Animal implements Runnable{

	public Lutra(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void makeSomeNoise() {
		for (int i = 0; i < 10; i++) {
			System.out.println("—s—s—t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	@Override
	public void run() {
		makeSomeNoise();
	}
}
