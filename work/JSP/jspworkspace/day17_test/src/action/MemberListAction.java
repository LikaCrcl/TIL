package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberListAction implements Action {   //Action 인터페이스의 구현체 클래스

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
		  System.out.println("파라미터 확인 : " + request.getParameter("name"));

	}

}
