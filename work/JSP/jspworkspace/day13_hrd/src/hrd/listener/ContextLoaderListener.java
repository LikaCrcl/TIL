package hrd.listener;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

import hrd.dao.MemberDao;
import hrd.dao.SaleDao;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {

		ServletContext sc = sce.getServletContext();
		InitialContext initialContext;
		try {
			initialContext = new InitialContext();
			DataSource ds = (DataSource) initialContext.lookup("java:comp/env/jdbc/gb2");
			System.out.println(ds);
			
			//Dao 객체생성 - sc 애트리뷰트에 저장.
			SaleDao saleDao = new SaleDao();
			saleDao.setDataSource(ds);
			sc.setAttribute("saleDao", saleDao);
			
			MemberDao memberDao = new MemberDao();
			memberDao.setDataSource(ds);
			sc.setAttribute("memberDao", memberDao);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
}






