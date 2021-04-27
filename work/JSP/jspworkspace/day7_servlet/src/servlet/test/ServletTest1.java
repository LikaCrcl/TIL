package servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. 서블릿은 http 서비스를 처리하는 자바 클래스 이다. ->  HttpServlet 클래스 상속받는다.
 * 2. url 매핑한다. ->  @WebServlet("/ServletTest1")  @는 어노테이션이며 실행관련된 지시이다./ServletTest1 는 매핑될 url 이다.
 * 3. 요청 method 2가지 방식 -> get 또는 post 의 실행 내용을 메소드 오버라이딩으로 작성한다.
 *                      -> doGet() , doPost() 메소드
 * 4. doGet(), doPost() 메소드의 args : request, response 객체          
 * 			-> request, response 외에  out,session,application 등 jsp 내장객체는 직접 선언하여 사용한다.
 * 5. 서블릿 실행 주의 사항 : 서블릿 소스에 오류가 있으면(예를 들면, 동일한 url이 여러개 있을떄...)  톰캣 오류가 발생한다.
 * 6. M(model) V(View) C(Controller) 패턴에서 Controller 역할이다.  
 *             
 */
@WebServlet("/test1")
public class ServletTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest1() {   //생성자
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 메소드 오버라이딩.  get 요청 방식을 처리한다. --> 화면 처리 view 를 보여주는 jsp페이지로 이동한다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//html 형식을 적용하기 위한 추가 코딩 : out 객체를 생성하기 전에 설정한다.꼭!!!
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");   
		//out 객체 : response.getWriter();
		PrintWriter out = response.getWriter();   //jsp out 객체는 직접 선언해서 사용한다.

		response.getWriter().append("Served at: ")
		.append(request.getContextPath()).append("<br>");
		
		out.print("<h3>테스트중......</h3>");
		out.print("<br><br>");
		out.print("<script>");
		out.print("alert('테스트 중....');");
		out.print("</script>");
		
//정식으로 하면 아래와 같은 html 형식을 따라 print 한다. 그러나 생략도 가능한다. 단,response객체로 인코딩과 contentType 설정한다.		
//		out.print("<html>");
//		out.print("<head>");
//		out.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
//		out.print("</head>");
//		out.print("<body>");
//		out.print("</body>");
//		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 메소드 오버라이딩. post 요청 방식을 처리한다.  --> 비지니스 로직, db 저장 등을 처리한다.form태그 method="post" 했을 때,
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
