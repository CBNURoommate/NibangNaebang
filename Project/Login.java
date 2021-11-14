package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Login {

	public void login(String ID, String PASSWD) throws SQLException {
		 Connection con=null;
		
		 Member member =new Member();
		 CurrentUser user=new CurrentUser();
		 member.setId(ID);
		 member.setPasswd(PASSWD);
		 String id=member.getId();
		 String passwd=member.getPasswd();
		 final String URL="jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,"admin","singapore");
			
		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		try
		{
			String sql="select * from Test.user where id=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				if(rs.getString("passwd").equals(passwd))
				{
					System.out.println("성공");
					user.setId(rs.getString("id"));
					user.setPasswd(rs.getString("passwd"));
					user.setName(rs.getString("name"));
					user.setGender(rs.getString("gender"));
					
				}
				else
					System.out.println("아이디는 맞는데 비밀번호 틀림");
			else
				System.out.println("없는 아이디");
		}
		catch(java.sql.SQLIntegrityConstraintViolationException d)
		{
			System.out.println("실패");
		}
		
	}
	
	 

}
