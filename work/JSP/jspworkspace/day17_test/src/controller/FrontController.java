package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.MemberInsertAction;
import action.MemberListAction;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//마지막에 요청을 처리하는 방식 결정하는 값.
		boolean isRedirect=false;
		String url ="home.jsp";   //기본값
		
		
		String spath = request.getServletPath();
		
		if(spath.equals("/member/list.do")) {
			
			Action action = new MemberListAction();
			action.execute(request, response);    //실행내용 테스트로 파라미터 name 받아서 출력
			
			
		}else if(spath.equals("/member/add.do")) {
			Action action = new MemberInsertAction();
			action.execute(request, response);  //실행내용 테스트로 파라미터 age 받아서 출력
			
		}
		
		//pageContext.forward 또는 response.sendRedirect 중에 선택.
		if(isRedirect ) {
			response.sendRedirect(url);  	//url(요청)을 바꾸기 .변수명 url은 xxx.do
		}else {	
		  RequestDispatcher rd = request.getRequestDispatcher(url);   //변수명 url은 xxx.jsp
		  rd.forward(request,response);     //url(요청)변경없이 request 유지(전달)하고 view만 변경한다. 
		}
	}

}
