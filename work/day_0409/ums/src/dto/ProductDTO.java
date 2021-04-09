package dto;

import dao.Session;

public class ProductDTO {
	int prodnum;
	String prodname;
	String prodprice;
	String prodamount;
	String prodinfo;
	int likecnt;
	String userid;
	
	public ProductDTO(int prodnum, String prodname, String prodprice, String prodamount, String prodinfo) {
		this.prodnum = prodnum;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodamount = prodamount;
		this.prodinfo = prodinfo;
		likecnt = 0;
		userid = Session.getData("login_id");
	}
	
	@Override
	public String toString() {
		return prodnum+"\t"+prodname+"\t"+prodprice+"\t"+prodamount
				+"\t"+prodinfo+"\t"+likecnt+"\t"+userid;
	}
	
	
}
