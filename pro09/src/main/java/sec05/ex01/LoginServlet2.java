package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login5")

public class LoginServlet2 extends HttpServlet {
   public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		MemberVO memberVo = new MemberVO();
		memberVo.setId(user_id);
		memberVo.setPwd(user_pw);
		
		MemberDAO dao = new MemberDAO();

		boolean result = dao.isExisted(memberVo);
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("isLogOn", true);
			session.setAttribute("login.id", user_id);
			session.setAttribute("login.pwd", user_pw);
			out.print("<html><body>");
			out.print("안녕하세요 " + user_id + "님!!!<br>");
			out.print("<a href='show'>회원정보 보기</a>");
			out.print("</body></html>");

		} else {
			out.print("<html><body><center>회원 아이디가 틀립니다.");
			out.print("<a href='login3.html'>다시 로그인하기</a>");
			out.print("</body></html>");
		}
	}
}