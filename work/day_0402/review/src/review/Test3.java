package review;

public class Test3 {
	public static void main(String[] args) {
		Car mycar = new Car("Ferrari", "Red", 65000);
		Car momcar = new Car("K7", "White", 7000);
		Car dadcar = new Car("BMW","Blue",35000);
		
//		mycar.engineStart();
//		momcar.engineStart();
//		dadcar.engineStart();
		
		int data1 = 10;
		int data2 = 20;
		int data3 = 30;
		
		int[] arData = {10,20,30};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arData[i]);
		}
		Car[] arCar = {
			new Car("Ferrari", "Red", 65000),
			new Car("K7", "White", 7000),
			new Car("BMW","Blue",35000)
		};
		
		for (int i = 0; i < 3; i++) {
			arCar[i].engineStart();
		}
	}
}














