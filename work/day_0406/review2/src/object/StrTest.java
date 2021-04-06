package object;

public class StrTest {
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "Hello";
		System.out.println(msg1 == msg2);
		
		String msg3 = new String("Hello");
		String msg4 = new String("Hello");
		System.out.println(msg3 == msg4);
		System.out.println(msg3.equals(msg4));
	}
}
