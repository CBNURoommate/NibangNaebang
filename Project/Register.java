package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Register{

	
	public void reg(String ID, String PASSWD,String NAME) throws SQLException {
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
			String sql="insert into Test.user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
		 
			pstmt.setString(1,id);
			pstmt.setString(2,passwd);
			pstmt.setString(3, NAME);
			pstmt.setInt(4, 0);
			pstmt.setInt(5, 0);
			pstmt.setInt(6, 0);	
			pstmt.setInt(7, 0);	
			pstmt.setInt(8, 0);	
			pstmt.setInt(9, 0);	
			pstmt.setInt(10, 0);	
			pstmt.setInt(11, 0);	
			pstmt.setInt(12, 0);	
			pstmt.setInt(13, 0);	
			pstmt.setInt(14, 0);	
			pstmt.setInt(15, 0);	
			pstmt.setInt(16, 0);	
			pstmt.setInt(17, 0);	
			pstmt.setInt(18, 0);	
			pstmt.setInt(19, 0);	
			pstmt.setInt(20, 0);	
			pstmt.setInt(21, 0);	
			pstmt.setInt(22, 0);	
			pstmt.setInt(23, 0);	
			pstmt.setInt(24, 0);	
			pstmt.setInt(25, 0);	
			pstmt.setInt(26, 0);	
			pstmt.setInt(27, 0);	
			pstmt.setInt(28, 0);	
			pstmt.setInt(29, 0);	
			pstmt.setInt(30, 0);	
			pstmt.setInt(31, 0);	
			pstmt.executeUpdate();
			System.out.println("가입성공");
		}
		catch(java.sql.SQLIntegrityConstraintViolationException d)
		{
			System.out.println("중복된 id가 있습니다");
		}
		 
	}
}
