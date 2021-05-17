package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {   //인터페이스 : 형식만 정의
	
	//구현해야할 메소드 정의(프로토타입 선언)
	public void execute(HttpServletRequest request,HttpServletResponse response);
	
	//--> void 대신에 isRedirect, url 리턴
}
