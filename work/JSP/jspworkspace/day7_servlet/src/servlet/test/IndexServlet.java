package servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")    //컨텍스트 path로 요청
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//서블릿에서 지정한 url과 view 페이지(.jsp) 매핑하기: pageContext.forward("index.jsp") 와 같은 기능의 코드
		
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");  //요청을 전달할 view페이지를 설정한다.
		rd.forward(request, response);			  //view 페이지 보여주기. request와 response 를 index.jsp로 전달한다.
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
