package koreait.listener;

import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

import koreait.dao.MemberDao;

@WebListener
public class ContextLoaderListener implements ServletContextListener {  //인터페이스 구현 클래스
	
	/*
	 * 톰캣 서블릿은 리스너라는 객체를 사용할 수 있다.
	 * DAO 는 여러 서블릿(WebServlet)이 사용하는 객체이다. 따라서 서로 공유하여 메모리 관리와 실행속도를 향상시킨다. 
	 * 리스너 객체를 활용한다. : 웹애플리케이션의 상황을 모니터링하며 주요한 사건에 대해 알림을 받는다.
	 */
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {  //웹애플리케이션의 시작 이벤트를 처리한다.
		
		try {
			ServletContext sc = sce.getServletContext();   //jsp의 application 객체 생성
			
			//jdbc/gb2 리소스에 대한 dbcp 객체 생성하기
			InitialContext initialContext = new InitialContext();    //자바의 리소스 네이밍을 처리하는 객체
			//  jdbc/gb2 데이터베이스 자원을 가져오기 --> dbcp 객체 DataSource 생성
			DataSource ds = (DataSource) initialContext.lookup("java:comp/env/jdbc/gb2");		
			
			
			MemberDao memberDao = new MemberDao();    //여기서 처음에 딱 한번만 실행되고 객체가 1개만 존재한다.
			memberDao.setDataSource(ds);			  //memberDao 객체에 ds 를 주입한다.
			
			sc.setAttribute("memberDao", memberDao);     //application JSP 내장객체에 애트리뷰트 저장하는 것과 동일한 코드
			
		}catch (Exception e) {
			e.printStackTrace();
		}
//		ServletContextListener.super.contextInitialized(sce);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {   //웹애플리케이션이 끝날때 
			
	}

}
