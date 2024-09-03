package sec01.ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO2 {
	private Connection con;
	// Statement -> preparedStatement로 변경
	private PreparedStatement pstmt;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String pwd = "tiger";
	
	
	public List listMembers() {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try
		{
			connDB();
			String query = "select * from t_member ";
			System.out.println(query);
			//연결과 함께 query문 컴파일
			pstmt = con.prepareStatement(query);
			System.out.println("statment 생성 성공");
			//컴파일된 동적질의를 DBMS에 요청 -> 결과는 ResultSet이 받는다.
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				
				
				MemberVO vo = new MemberVO();
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	private void connDB()
	{
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
