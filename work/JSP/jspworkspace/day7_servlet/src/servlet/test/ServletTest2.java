package servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class ServletTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletTest2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get 요청의 파라미터 name, age 값 가져와서 출력하기.
		//form 태그 없이 파라미터 주는 방법 : 1)url 주소창에 직접 입력하기   -->  ?name=홍길동&age=23 입력
		//		2) a태그 링크에 설정하기   <a href="test2?name=박보영&age=34">test2로 가기</a>
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("이름 : " + name);
		out.print("<br>");
		out.print("나이 : " + age);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
