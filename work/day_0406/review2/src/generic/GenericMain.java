package generic;

public class GenericMain {
	public static void main(String[] args) {
//		GClassTest<String> obj1 = new GClassTest<>();
//		obj1.data="Hello";
//		GClassTest<Integer> obj2 = new GClassTest<>();
//		obj2.data = 20;
		
//		GMethodTest obj = new GMethodTest();
//		obj.<String>f("Hello");
//		obj.f(50);
//		obj.f('C');
		
		GInterTest<Integer, Double> obj = new GInterTest<Integer, Double>() {
			
			@Override
			public Double sub(Double num1, Double num2) {
				return num1-num2;
			}
			
			@Override
			public Double div(Integer num1, Double num2) {
				return num1/num2;
			}
			
			@Override
			public Integer add(Integer num1, Integer num2) {
				return num1+num2;
			}
		};
		
	}
}
