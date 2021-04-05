package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) throws IOException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();
			System.out.println("결과 : "+num1/num2);
		}catch(ArithmeticException ame) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException ime) {
			System.out.println("정수만 입력해 주세요.");
		}catch(Exception e) {
			System.out.println("알 수 없는 오류 발생 / 개발자에게 알려주세요");
			System.out.println(e);
		}
		//Alt + Shift + Z : try ~ catch 단축키
//		try {
//			new FileWriter("");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}








