package review;

public class Test5 {
	public static void main(String[] args) {
		Car noOptionFerrari = new SuperCar("Ferrari", "Red", 65000);
		noOptionFerrari.engineStart();
//		System.out.println((int)(10.0+2.0));
		
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		fullOptionFerrari.roofOpen();
		fullOptionFerrari.roofClose();
		
		
	}
}
