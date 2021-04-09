package dao;

import java.util.HashSet;

import dto.ProductDTO;

public class ProductDAO {
	DBConnection conn;
	
	public ProductDAO() {
		conn = new DBConnection("db/ProductTable.txt");
	}
	
	public boolean addProduct(ProductDTO product) {
		return conn.insert(product.toString());
	}
	
	public int getNum() {
		String lastPk = conn.lastPK();
		if(lastPk == null) {
			return 1;
		}else {
			return Integer.parseInt(lastPk)+1;
		}
	}

	public String showList() {
		HashSet<String> rs = conn.select(6, Session.getData("login_id"));
		String resultMsg = "";
		for(String line : rs) {
			String[] datas = line.split("\t");
			//'상품번호'. '상품명' - '가격'('수량'개)
			resultMsg+=String.format("%s. %s - %s(%s개)\n",datas[0],datas[1],datas[2],datas[3]);
//			resultMsg+=datas[1]+" - "+datas[2]+"("+datas[3]+"개)\n";
		}
		return resultMsg;
	}

	public boolean updateProduct(String prodnum, int choice, String newData) {
		return conn.update(prodnum, choice+1, newData);
	}

	public boolean deleteProduct(int prodnum) {
		return conn.delete(prodnum+"");
	}

	public void deleteAll(String userid) {
		HashSet<String> rs = conn.select(6,userid);
		for(String line : rs) {
			deleteProduct(Integer.parseInt(line.split("\t")[0]));
		}
	}

	public String search(String keyword) {
		HashSet<String> allProducts = conn.select();
		HashSet<String> result = new HashSet<>();
		for(String line : allProducts) {
			String[] datas = line.split("\t");
			if(datas[1].contains(keyword)) {
				result.add(line);
			}
			if(datas[4].contains(keyword)) {
				result.add(line);
			}
			if(datas[6].equals(keyword)) {
				result.add(line);
			}
		}
		String resultMsg = "";
		for(String line : result) {
			String[] datas = line.split("\t");
			//'상품번호'. '상품명' - '가격'('수량'개)
			resultMsg+=String.format("%s. %s - %s(%s개)\n",datas[0],datas[1],datas[2],datas[3]);
		}
		return resultMsg;
		
	}
}






















