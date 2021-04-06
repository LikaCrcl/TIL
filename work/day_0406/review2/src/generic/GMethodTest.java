package generic;

public class GMethodTest {
	
	<T>T f(T data) {
		T result=data;
		
		if(data instanceof Integer) {
			System.out.println("정수형 데이터");
		}else if(data instanceof String) {
			System.out.println("문자열 데이터");
		}else if(data instanceof Double || data instanceof Float) {
			System.out.println("실수형 데이터");
		}else if(data instanceof Character) {
			System.out.println("문자형 데이터");
		}else if(data instanceof Boolean) {
			System.out.println("논리형 데이터");
		}
		
		return result;
	}
	
}
