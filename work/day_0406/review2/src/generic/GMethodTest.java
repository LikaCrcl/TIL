package generic;

public class GMethodTest {
	
	<T>T f(T data) {
		T result=data;
		
		if(data instanceof Integer) {
			System.out.println("������ ������");
		}else if(data instanceof String) {
			System.out.println("���ڿ� ������");
		}else if(data instanceof Double || data instanceof Float) {
			System.out.println("�Ǽ��� ������");
		}else if(data instanceof Character) {
			System.out.println("������ ������");
		}else if(data instanceof Boolean) {
			System.out.println("���� ������");
		}
		
		return result;
	}
	
}
