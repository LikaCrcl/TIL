package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i = 20;//오토박싱
		int data = i;//오토언박싱
		
		Test obj = new Test();
		
//		obj.f(10);
//		obj.f(10);
//		
//		obj.f(i);
		
		obj.f(10);
		//두번째 f()를 호출하려면 직접 박싱을 해서 넘겨야 한다.
		//세번째 f()는 매개변수로 Object 타입이 선언되어 있고
		//매개변수로 Object 타입이 선언되어 있는 것들은 객체를 넘기라는 뜻이다.
		//따라서 객체로 직접 만들어서 넘겨주어야 세번째 있는 f()를 사용할 수 있다.
		obj.f(new Integer(10));
		obj.f(i.intValue());
	}
}
class Test{
	void f(int data) {
		System.out.println("정수형 데이터");
	}
//	void f(Integer data) {
//		System.out.println("Integer 객체 데이터");
//	}
	void f(Object obj) {
		System.out.println("객체 데이터");
	}
	
}
