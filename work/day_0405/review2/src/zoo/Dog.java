package zoo;

//ÇÊ¼öÀûÀ¸·Î sleep(), makeSomeNoise() ÀçÁ¤ÀÇ ÇØ¾ßÇÔ
public class Dog extends Animal{

	@Override
	void sleep() {
		System.out.println("ÄğÄğ");
	}

	@Override
	void makeSomeNoise() {
		System.out.println("¸Û¸Û");
	}
	
}
