package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i = 20;//����ڽ�
		int data = i;//�����ڽ�
		
		Test obj = new Test();
		
//		obj.f(10);
//		obj.f(10);
//		
//		obj.f(i);
		
		obj.f(10);
		//�ι�° f()�� ȣ���Ϸ��� ���� �ڽ��� �ؼ� �Ѱܾ� �Ѵ�.
		//����° f()�� �Ű������� Object Ÿ���� ����Ǿ� �ְ�
		//�Ű������� Object Ÿ���� ����Ǿ� �ִ� �͵��� ��ü�� �ѱ��� ���̴�.
		//���� ��ü�� ���� ���� �Ѱ��־�� ����° �ִ� f()�� ����� �� �ִ�.
		obj.f(new Integer(10));
		obj.f(i.intValue());
	}
}
class Test{
	void f(int data) {
		System.out.println("������ ������");
	}
//	void f(Integer data) {
//		System.out.println("Integer ��ü ������");
//	}
	void f(Object obj) {
		System.out.println("��ü ������");
	}
	
}
