package koreait.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koreait.dao.MemberDao;
import koreait.vo.Member;

@WebServlet("/member/join")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //MemberForm.jsp 입력화면 표시 : get 메소드 방식
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/member/MemberForm.jsp");
		rd.forward(request, response);
	
	}
	//MemberForm.jsp에서 사용자 입력 후 submit 할 때 실행된다. : post 메소드 방식
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//파라미터 7개 받아서 Member 객체에 저장한다.
		String name = request.getParameter("name");
		String password=request.getParameter("pwd");
		String email=request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Member member = new Member(0,name,password,email);
		
		member.setAddr(request.getParameter("addr"));
		member.setAge(age);
		member.setGender(request.getParameter("gender"));
		member.setHobby(Arrays.toString(request.getParameterValues("hobby")));
		
		//response.getWriter().append(member.toString());
		
		//insert 쿼리 실행한다.
		//웹애플리케이션 시작할때 생성시켜놓은 memberDao 애트리뷰트 가져오기
		ServletContext sc = request.getServletContext();
		MemberDao memberDao = (MemberDao)sc.getAttribute("memberDao");
		
		int n = memberDao.insert(member);
		if(n==1) {
			System.out.println("정상 insert 완료!!");
		}else System.out.println("insert 오류!");
		
		response.sendRedirect("./list");   //1) request로 전달할 애트리뷰트 없고 url을 바꾼다.
		
		// sendRedirect 에  /member/list 하면 컨텍스트패스를 /member 로 변경해서 요청합니다.
		//  ./ 현재위치를 기준으로  설정해준다. -->  ./list
	}

}












