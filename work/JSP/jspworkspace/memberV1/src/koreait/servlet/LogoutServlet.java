package koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		//logout.jsp

		//현재 session 무효화 - 세션 정보 삭제
		session.invalidate();
		
		//로그아웃 구현하는 다른 방법  : uid 애트리뷰트만 삭제한다.invalidate()와의 차이점은? 개발자도구에서 확인.
		//session.removeAttribute("uid");  

		out.print("<script>");
		out.print("alert('로그아웃 되었습니다.');");
		out.print("location.href='home';"); //home.jsp로 url 이동
		out.print("</script>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
