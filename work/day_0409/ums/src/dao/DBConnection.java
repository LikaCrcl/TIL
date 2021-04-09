package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class DBConnection {
	String file;

	public DBConnection(String file) {
		this.file = file;
	}
	
	boolean insert(String data) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(data+"\r\n");
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println("======오류 발생 : DB 연결 실패======");
			System.out.println(e);
			System.out.println("===============================");
		}
		return false;
	}
	boolean update(String key,int col,String newData) {
		String result = "";
		boolean check = false;
		try {
			BufferedReader br =  new BufferedReader(new FileReader(file));
			while(true) {
				String line = br.readLine();
				if(line ==null) {
					break;
				}
				String[] datas=line.split("\t");
				if(datas[0].equals(key)) {
					result+=datas[0];
					for (int i = 1; i < datas.length; i++) {
						if(i==col) {
							result+="\t"+newData;
							check = true;
						}else {
							result+="\t"+datas[i];
						}
					}
					result+="\r\n";
				}else {
					result+=line+"\r\n";
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("======오류 발생 : DB 파일 오류======");
			System.out.println(e);
			System.out.println("===============================");
		} catch (IOException e) {
			System.out.println("======오류 발생 : DB 연결 실패======");
			System.out.println(e);
			System.out.println("===============================");
		}	
		if(check) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(result);
				bw.close();
			} catch (IOException e) {
				System.out.println("======오류 발생 : DB 연결 실패======");
				System.out.println(e);
				System.out.println("===============================");
			}
		}
		return check;
	}
	boolean delete(String key) {
		String result = "";
		boolean check = false;
		try {
			BufferedReader br =  new BufferedReader(new FileReader(file));
			while(true) {
				String line = br.readLine();
				if(line ==null) {
					break;
				}
				String[] datas=line.split("\t");
				if(datas[0].equals(key)) {
					check = true;				
				}else {
					result+=line+"\r\n";
				}
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("======오류 발생 : DB 파일 오류======");
			System.out.println(e);
			System.out.println("===============================");
		} catch (IOException e) {
			System.out.println("======오류 발생 : DB 연결 실패======");
			System.out.println(e);
			System.out.println("===============================");
		}	
		if(check) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(result);
				bw.close();
			} catch (IOException e) {
				System.out.println("======오류 발생 : DB 연결 실패======");
				System.out.println(e);
				System.out.println("===============================");
			}
		}
		return check;
	}
	//"file" 안에 있는 모든 정보 검색
	HashSet<String> select() {
		HashSet<String> resultSet = new HashSet<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				resultSet.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("======오류 발생 : DB 파일 오류======");
			System.out.println(e);
			System.out.println("===============================");
		} catch (IOException e) {
			System.out.println("======오류 발생 : DB 연결 실패======");
			System.out.println(e);
			System.out.println("===============================");
		}	
		return resultSet;
	}
	HashSet<String> select(int col,String data) {
		HashSet<String> resultSet = new HashSet<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				String[] datas = line.split("\t");
				if(datas[col].equals(data)) {
					resultSet.add(line);//apple	abcd1234	김사과	10	01012341234	서울시 강남구 역삼동
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("======오류 발생 : DB 파일 오류======");
			System.out.println(e);
			System.out.println("===============================");
		} catch (IOException e) {
			System.out.println("======오류 발생 : DB 연결 실패======");
			System.out.println(e);
			System.out.println("===============================");
		}	
		return resultSet;
	}
	String lastPK() {
		String pk = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				pk=line.split("\t")[0];
			}
		} catch (FileNotFoundException e) {
			System.out.println("======오류 발생 : DB 파일 오류======");
			System.out.println(e);
			System.out.println("===============================");
		} catch (IOException e) {
			System.out.println("======오류 발생 : DB 연결 실패======");
			System.out.println(e);
			System.out.println("===============================");
		}
		return pk;
	}
	
}
