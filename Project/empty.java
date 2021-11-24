package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//dsdaasd
public class empty{
	
	
	Connection con=null;
	
	int count=0;
	
	final String URL="jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(URL,"admin","singapore");
		
	} catch (ClassNotFoundException e) {
		System.out.println("fail");
	}
	
	 String sql="select * from Test.user where jam2=1";
	 
	 PreparedStatement pstmt=con.prepareStatement(sql);
	 
	 ResultSet rs=pstmt.executeQuery();
	 
	 if(rs.next()) {
		 count++;
	 }
	 
	 System.out.println(+count);
	 
	 
	 // 제갈도현 뽕뽕 
}
