package review;

import java.util.Scanner;

public class Test2 {
	static int data3;
	int data2;	
	Scanner sc;
	public static void main(String[] args) {
		int data;
		for (int i = 0; i < args.length; i++) {
			
		}
//		System.out.println(data3);
//		System.out.println(data2);
//		sc.next();
//		System.out.println(i);
//		Scanner sc;
//		sc.next();
		Car mycar = new Car("Ferrari","Red",65000);
		Car momcar = new Car("K7", "White", 7000);
//		System.out.println
		Car dadcar = new Car(30000);
		//�� �� �õ��ѱ�
		mycar.engineStart();//Ferrari �õ� �ѱ�
		mycar.engineStart();//�̹� �õ��� �����ֽ��ϴ�.
		mycar.engineStart();//�̹� �õ��� �����ֽ��ϴ�.
		mycar.engineStart();//�̹� �õ��� �����ֽ��ϴ�.
		mycar.engineStart();//�̹� �õ��� �����ֽ��ϴ�.
		momcar.engineStart();//K7 �õ� �ѱ�
		data = 10;
		System.out.println(data+5);
		
		
		
	}
	void f() {
		System.out.println(data2);
		sc.next();
	}
}
class Car{
	String brand;
	String color;
	int price;
	boolean engine;
	
	//Alt+Shift+S > O : �ʵ� ������ �̿��ؼ� ������ �����
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = false;
	}
	
	public Car(int price) {
		this.price=price;
	}
	
	
	void engineStart() {
		if(!engine) {
			//~~ �� �� / ������ �������� ��(if)
			System.out.println(brand + " ����� �õ� �ѱ�");
			engine=true;
		}else {
			//�� ��
			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
		}
	}
	
	void engineStop() {
		if(engine) {
			System.out.println(brand + " ����� �õ� ����");
			engine=false;
		}else {
			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
		}
	}
	
	
}





