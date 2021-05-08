package hrd.vo;

public class Sale {
	private int custno;
	private String custname;
	private String grade2;
	private int total;
	
	public Sale(int custno, String custname, String grade2, int total) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.grade2 = grade2;
		this.total = total;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getGrade2() {
		return grade2;
	}

	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Sale [custno=" + custno + ", custname=" + custname + ", grade2=" + grade2 + ", total=" + total + "]";
	}
	
	
	
	
}
