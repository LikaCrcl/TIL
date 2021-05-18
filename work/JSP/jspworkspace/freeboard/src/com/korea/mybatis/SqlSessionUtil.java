package com.korea.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	public static SqlSessionFactory sqlSessionFactory;
	
	static {  //static 변수와 메소드가 접근할 static 변수들의 초기화
	//마이바티스가 db연결에 필요한 정보를 저장하는 설정파일   it/mybatis/는 패키지이름.
	String resource = "com/korea/mybatis/mybatis-config.xml";
	InputStream inputStream=null;
	
	try {
	 //resource 변수에 지정된 파일을 읽어온다.	
	 inputStream = Resources.getResourceAsStream(resource);
	}catch (IOException e){
		
	}
	 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public static SqlSessionFactory getSessionFactory() {
		return sqlSessionFactory;
	}
	
	
	
//	https://downloads.mariadb.org/connector-java/2.4.4/
}


