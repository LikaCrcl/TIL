package koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koreait.dao.MemberDao;
import koreait.vo.Member;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");  //요청을 전달할 view페이지를 설정한다.
		rd.forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
	
			String email = request.getParameter("userid");
			String password = request.getParameter("pwd").trim();
			
			//패스워드. memberDao의 login() 메소드 실행하여 리턴값 저장한다.
			ServletContext sc = request.getServletContext();    //JSP의 application 객체 생성
			MemberDao memberDao = (MemberDao)sc.getAttribute("memberDao"); 
			
			Member member = memberDao.login(email, password);    //로그인 쿼리 메소드 실행
			
			//그 리턴값이 null이 아니면 로그인 성공이다.
			if(member != null) {  
				session.setAttribute("member",member);   //리턴받은 Member객체를 애트리뷰트에 저장한다.
				//로그인 완료 -> 페이지 home.jsp로 이동
				response.sendRedirect("home");
			}else {   //패스워드 불일치
				
				out.print("<script>");
				out.print("alert('로그인 정보가 불확실 합니다.');");
				out.print("history.back();"); //뒤로 가기
				out.print("</script>");
				
			}
	
	}

}
