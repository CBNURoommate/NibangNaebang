package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Register{

	
	public void reg(String ID, String PASSWD) throws SQLException {
		 Connection con=null;
		 Member member =new Member();
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
			String sql="insert into Test.user values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
		 
			pstmt.setString(1,id);
			pstmt.setString(2,passwd);
			pstmt.setString(3, null);
			pstmt.setString(4, null);
			
			pstmt.executeUpdate();
			
		}
		catch(java.sql.SQLIntegrityConstraintViolationException d)
		{
			System.out.println("중복된 id가 있습니다");
		}
		 
	}
}
