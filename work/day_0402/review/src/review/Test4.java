package review;

public class Test4 {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("Ferrari","Red",65000,"abcd1234");
		mycar.engineStart();
	}
}
class SuperCar extends Car{
	String pw;
	public SuperCar() {
		//CarŬ������ ������ ȣ��
		//super : �θ�Ŭ������ �̸�
		super();
	}
	
	//Alt + Shift + S > O : pw�� ������ �ʵ��̹Ƿ� using fields�� �̿��Ѵ�
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}

	//Alt + Shift + S > C : �θ� Ŭ������ ����Ǿ� �ִ� ������ �޾Ƽ� �����
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
	void engineStart() {
		System.out.println(brand + " �������� �õ� �ѱ�");
	}
	
	//������̼� 
	@Override
	void engineStop() {
		System.out.println(brand + " �������� �õ� ����");
	}
	

	void roofOpen() {
		System.out.println(brand+" �Ѳ�����");
	}
	void roofClose() {
		System.out.println(brand+" �Ѳ��ݱ�");
	}
	
	
	
	
}











