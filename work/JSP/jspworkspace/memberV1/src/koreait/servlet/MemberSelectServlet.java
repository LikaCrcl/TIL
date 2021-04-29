package koreait.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koreait.dao.MemberDao;


@WebServlet("/member/list")
public class MemberSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//context-path : 프로젝트 이름(애플리케이션 이름). url 에서는 localhost:8083 뒤에나오는 경로명
		
		response.setCharacterEncoding("UTF-8");
		//memberDao 객체 애트리뷰트에서 가져오기
		ServletContext sc =  request.getServletContext();
		MemberDao memberDao = (MemberDao) sc.getAttribute("memberDao");
		
		//	memberDao.selectList(); 메소드 실행결과를 request 객체 애트리뷰트에 저장하기
		request.setAttribute("list", memberDao.selectList());    //View 로 애트리뷰트로 전달.
		//response.getWriter().append(memberDao.selectList().toString());
		
		 //2)request로 전달할 애트리뷰트 있고 url을 변경이 없다.
		RequestDispatcher rd = request.getRequestDispatcher("/member/MemberList.jsp");   //View
		rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
