package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) throws IOException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���� : ");
			int num2 = sc.nextInt();
			System.out.println("��� : "+num1/num2);
		}catch(ArithmeticException ame) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(InputMismatchException ime) {
			System.out.println("������ �Է��� �ּ���.");
		}catch(Exception e) {
			System.out.println("�� �� ���� ���� �߻� / �����ڿ��� �˷��ּ���");
			System.out.println(e);
		}
		//Alt + Shift + Z : try ~ catch ����Ű
//		try {
//			new FileWriter("");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}








