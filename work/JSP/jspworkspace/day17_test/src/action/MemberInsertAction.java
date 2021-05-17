package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)  {
		System.out.println("파라미터 확인 : " + request.getParameter("age"));

	}

}
