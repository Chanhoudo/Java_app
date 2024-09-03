package sec02.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO3 {
	
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO3() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
			System.out.println("1차검증 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delMember(String id) {
		try {
			con = dataFactory.getConnection();
			String query = "delete from t_member where id=?";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void addMember(MemberVO3 memberVO) {
		try {
			con = dataFactory.getConnection();
			System.out.println("2차검증 성공");
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			
			System.out.println("MemberVO3 확인 : " + id + ", "+ pwd + ", " + name + ", " + email);
			
			String query = "insert into t_member(id, pwd, name, email) values(?, ?, ?, ?)";
			System.out.println("preparedStatement : " + query);
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listMembers() {
		List list = new ArrayList();
		
		try {
			con = dataFactory.getConnection();
			System.out.println("Connection 객체 가져오기 성공");
			
			String query = "select * from t_member";
			System.out.println(query);
			// 연결과 함께 query문 컴파일
			pstmt = con.prepareStatement(query);
			System.out.println("Statement 생성 성공");
			// 컴파일된 동적질의를 DBMS에 요청 -> 결과는 ResultSet이 받는다.
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				// System.out.println("[확인]" + id + pwd + name + email + joinDate);
				
				MemberVO3 vo = new MemberVO3();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("실패~");
		}
		return list;
	}
}
