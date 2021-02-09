package com;

public class Hello {

	public static void main(String[] args) {
		
		// �ּ� ó�� �� ���� �� �� �տ� //, ���� ���� /* ~ */, Ư�� ���� ���߼��� �� Ctrl + /
		// ���𰡸� ���� �� ���� ������ ���� �����ؼ� �ּ��� �� ������� ����.
		// ������ byte(1byte), short(2byte), int(4byte), long(8byte) - ���� �� �⺻���� int
		// �Ǽ��� float(4byte), double(8byte) - ���� �� �⺻���� double , float���� ���ڸ� ��Ÿ���� �� �Ҽ��� �Ʒ� 6��° �ڸ������� ��Ȯ��. 0.1415926535���� 2������ ��Ȯ. �̸� ���е� 7 �̶�� �Ѵٰ� ��.
		// �� float�� ���е� ������ �� �� 1.123456789f�� 0.123456789f�� ������� �ٸ�. �������� �𸣰���
		// ������ char(2byte) <- �����ϰԵǸ�(ex 'a'+'a') ASCII�ڵ�� �ٲ㼭 ������(int)���� ������ 
		// ���� boolean(1byte) ���� �⺻Ÿ��(Primitive Type) 8��.
		
		// ����Ÿ��(Reference Type) - �� 8���� ���� ������ ��� ����Ÿ�� ex) ���ڿ� String
		
		byte b;
		b = 127;
		
		System.out.println(b+1); // ����
		System.out.println("127"+1); // ���� (����x)
		
		byte c = 4;
		byte d = 4; // ���� ���̸� byte c,d; �̷������� �����ص� �������
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c/d);
		System.out.println(c*d);
		System.out.println("---------");
		System.out.println(4/2.0); // double������ ǥ�õ�
		
		char e = 'A';
		
		System.out.println(e-1); // ASCII code
		
		short f = 1;
		int g = 20000000; // �������� �⺻��
		long h = 20000000000L; // L�� ���̻�. long h=20000000000; �� Ʋ��
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		long i = g*1000;
		
		System.out.println(i); // long i = g*1000; ���� ������ long, ������ int(�������� ������ �⺻���� int)�̱� ������ ���ϴ� ���� �ȳ���. ������ long���� ����� ����ȯ ����� ��.
		
		long j = (long)g*1000;
		
		System.out.println(j);
		
		int k = 100;
		
		System.out.println("hello : "+k+k); // String + int = String �̶� 100100���� ����. hello : 200�� ��Ÿ���� ������ "hello : "+(k+k)
		
		char l = 'A';
		String m = "A"; // char l = ''; (X), String m = ""; (O)
		
		System.out.println(l+m); // char + String => String + String.
		
		char n = 'A'+'0';
		
		System.out.println(n);
		System.out.println('A'+'0');
		System.out.println((char)'A'+'0'); // 'A' �� char�� ��ȯ������ ���� '0' �� int�� int�� ��� �����
		System.out.println((char)('A'+'0'));
		
		String bin = Integer.toBinaryString(10);		
		String oct = Integer.toOctalString(10); // �� �� �ڵ�� ���� ������ ������ ���� String��
		String hex = Integer.toHexString(16);
		
		System.out.println(bin); // 2����
		System.out.println(oct); // 8����
		System.out.println(hex); // 16����
		
		int int_bin = 0b1010; // 0bOOOO 2���� ǥ��� ex) 0b1111
		int int_oct = 012; // 0OO 8���� ǥ��� ex) 011
		int int_hex = 0xa; // 0xO 16���� ǥ��� ex) 0xf
		
		System.out.println(int_bin);
		System.out.println(int_oct);
		System.out.println(int_hex);
		
		System.out.printf("%d\n%s\n%f", 100, "100", 3.14f); // \n : �ٹٲ�, �� ���� 100�� %d�� �ް� �� ���� "100"�� %s�� ����. �� �ڷε� ��� �������.
		// %d = decimal�̶� �׳� 100, %s = String �̶� "100", %f = float �̶� 3.14f.
		
		System.out.println();
		System.out.printf("[%-5d]\n", 100);
		System.out.printf("[%5d]\n", 100);
		
		float o = 3.141234567f;
		
		System.out.println(o);
		
		double p = 3.141234567;
		
		System.out.println(p);
		
		// �� ��ȯ
		
		byte q = 127;
		short r = q;
		int s = r;
		long t = s;
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		
		byte u;
		short v = 128;
		u = (byte)v;
		
		System.out.println(u); // overflow : max + 1 = min, min - 1 = max
		// ex) byte�� min : -128, max : 127. ���� 128�� byte max + 1. ���� �� print ����� -128
		
		float w = 3.94f;
		int x = (int)w;
		
		System.out.println(x); // float�� int�� �� ��ȯ �� �Ҽ��� �Ʒ� ���� ����
		
	}

}
