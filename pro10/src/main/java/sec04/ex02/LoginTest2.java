package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginTest2
 */
@WebServlet("/login2")
public class LoginTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context = null;
	List user_list = new ArrayList();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    context = getServletContext();
	    PrintWriter out = response.getWriter();
	    ServletContext sc = getServletContext();
	    HttpSession session = request.getSession();
	    
	    String user_id = request.getParameter("user_id");
	    String user_pw = request.getParameter("user_pw");
	    
	    LoginImpl loginUser = new LoginImpl(user_id, user_pw);
	    
	    if(session.isNew()){
	        session.setAttribute("loginUser", loginUser);
	        context.setAttribute("user_list", user_list);
	        user_list.add(user_id);
	    }
	    List list = (ArrayList)context.getAttribute("user_list");
	    out.println("<html><body>");
	    boolean check = true;
	    for(int i = 0; i < list.size()-1; i++){
	    	System.out.println(list.get(i));
	    	System.out.println(user_id);
	    	if (user_id.equals(list.get(i)))
	    	{
	    		check = false;
		    	out.println("<a>중복된 아이디가 있습니다.</a><br>");
		    	out.println("<a href='login2.html'>다시 로그인</a>");
		    	out.println("</body></html>");
		    	user_list.remove(user_id);
				context.removeAttribute("user_list");
				context.setAttribute("user_list", user_list);
	    	}
	    		
	    }
	    if (check) {
	    	
		    out.println("사용자 아이디: " + loginUser.user_id + "<br>");
		    out.println("현재 접속자 수는 " + LoginImpl.total_user + "<br><br>");
		    out.println("접속 아이디: <br>");
	
		    for(int i = 0; i < list.size(); i++){
		        out.println(list.get(i) + "<br>");
		    }
	
		    out.println("<a href='logout?user_id=" + user_id + "'>로그아웃</a>");
		    out.println("</body></html>");
	    }
	}

}
