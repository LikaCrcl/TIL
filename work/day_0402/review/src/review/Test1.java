package review;

public class Test1 {
	//진입점 (프로그램의 시작)
	public static void main(String[] args) {
		Calc c = new Calc();
		c.add(10,20);
	}
	void doing() {
		System.out.println("와우");
	}
	
}



class Calc{
	int add(int num1,int num2) {
		return num1+num2;
	}
	
}







