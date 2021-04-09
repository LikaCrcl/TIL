package dao;

import java.util.HashMap;

public class Session {
	static HashMap<String, String> datas = new HashMap<>();
	
	public static void setData(String key,String value) {
		datas.put(key, value);
	}
	public static String getData(String key) {
		return datas.get(key);
	}
}
