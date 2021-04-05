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

		// ���� ��ü
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
		return "������ �ִ� ������ : " + data;
	}

	//1. Ÿ�Ժ�
	//2. �ٿ�ĳ����
	//3. ���Ǻ�
	@Override
	public boolean equals(Object obj) {
		//��ü instanceof Ŭ������ : ��ü�� �ڿ����� Ŭ���� Ÿ���̸� true �ƴϸ� false
		//upcasting �� ��ü�� �ش��ϴ� �ڽ�Ŭ������ ���ص� true�� ���´�.
		if (obj instanceof Test) {
			Test target = (Test) obj;
			if (this.data.equals(target.data)) {
				return true;
			}
		}
		return false;
	}

}










