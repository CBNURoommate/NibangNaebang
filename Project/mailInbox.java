package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class mailInbox {

	public ResultSet getbox() throws SQLException
	{
		 Connection con=null;
		
		 
		 final String URL="jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,"admin","singapore");
			
		} catch (ClassNotFoundException e) {
			System.out.println("fail");
			return null;
		}
		try
		{
			String sql="select * from Test.msgtable where receiverid=? or senderid=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, CurrentUser.getId());
			pstmt.setString(2, CurrentUser.getId());
			ResultSet rs=pstmt.executeQuery();
			
			return rs;
		}
		catch(java.sql.SQLIntegrityConstraintViolationException d)
		{
			return null;
			
		}
	}
}
