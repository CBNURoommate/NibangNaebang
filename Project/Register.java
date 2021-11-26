package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Register{

	
	public int reg(String ID, String PASSWD,String NAME) throws SQLException {
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
			return -1;
		}
		try
		{
			String sql="insert into Test.user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
		 
			pstmt.setString(1,id);
			pstmt.setString(2,passwd);
			pstmt.setString(3, NAME);
			pstmt.setInt(4, -1);
			pstmt.setInt(5, -1);
			pstmt.setInt(6, -1);	
			pstmt.setInt(7, -1);	
			pstmt.setInt(8, -1);	
			pstmt.setInt(9, -1);	
			pstmt.setInt(10, -1);	
			pstmt.setInt(11, -1);	
			pstmt.setInt(12, -1);	
			pstmt.setInt(13, -1);	
			pstmt.setInt(14, -1);	
			pstmt.setInt(15, -1);	
			pstmt.setInt(16, -1);	
			pstmt.setInt(17, -1);	
			pstmt.setInt(18, -1);	
			pstmt.setInt(19, -1);	
			pstmt.setInt(20, -1);	
			pstmt.setInt(21, -1);	
			pstmt.setInt(22, -1);	
			pstmt.setInt(23, -1);	
			pstmt.setInt(24, -1);	
			pstmt.setInt(25, -1);	
			pstmt.setInt(26, -1);	
			pstmt.setInt(27, -1);	
			pstmt.setInt(28, -1);	
			pstmt.setInt(29, -1);	
			pstmt.setInt(30, -1);	
			pstmt.setInt(31, -1);	
			pstmt.setInt(32, -1);	
			pstmt.setInt(33, -1);	
			pstmt.setInt(34, -1);	
		
			pstmt.executeUpdate();
			System.out.println("가입 성공");
			return 0;
		}
		catch(java.sql.SQLIntegrityConstraintViolationException d)
		{
			System.out.println("중복된 id 존재");
			return 1;
			
		}
		 
	}
}