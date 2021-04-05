package object;

public class ObjTest {
	public static void main(String[] args) {
//		Object[] arData = {10,10.24,"Java",'C'};
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		Test obj = new Test("Java");
		System.out.println(obj);
		System.out.println(obj.toString());

		// 동위 객체
		Test obj1 = new Test("Hello");
		Test obj2 = new Test("Hello");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(161));
		System.out.println(new Integer(10).intValue());
	}
}

class Test {
	String data;

	public Test(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "가지고 있는 데이터 : " + data;
	}

	//1. 타입비교
	//2. 다운캐스팅
	//3. 조건비교
	@Override
	public boolean equals(Object obj) {
		//객체 instanceof 클래스명 : 객체가 뒤에오는 클래스 타입이면 true 아니면 false
		//upcasting 된 객체는 해당하는 자식클래스로 비교해도 true가 나온다.
		if (obj instanceof Test) {
			Test target = (Test) obj;
			if (this.data.equals(target.data)) {
				return true;
			}
		}
		return false;
	}

}










