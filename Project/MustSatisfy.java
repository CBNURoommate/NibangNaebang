package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MustSatisfy {
	public ResultSet Satisfy(int roomagehigh, int roomagelow, int roomhakbunhigh, int roomhakbunlow, int roomsmoking, int roomdepartment, int roomsoundgigi, int roomperfume) throws SQLException {
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		
		matchingResultUI.roomagehigh=roomagehigh;
		matchingResultUI.roomagelow=roomagelow;
		matchingResultUI.roomhakbunhigh=roomhakbunhigh;
		matchingResultUI.roomhakbunlow=roomhakbunlow;
		
		String sql = "select * from Test.user where gender=? and dom=? and age between ? and ? and hakbun between ? and ? and ";
		if(roomsmoking==3)
		{
			String tmp="smoking<=? and ";
			sql=sql+tmp;
		}
		else
		{
			String tmp="smoking=? and ";
			sql=sql+tmp;
		}
		
		int wantdep=-1;
		if(roomdepartment==3)
		{
			String tmp="department<=? and ";
			sql+=tmp;
			wantdep=99;
		}
		else if(roomdepartment==1)
		{
			String tmp="department=? and ";
			sql+=tmp;
			wantdep=CurrentUser.getDepartment();
		}
		else
		{
			String tmp="department!=? and ";
			sql+=tmp;
			wantdep=CurrentUser.getDepartment();
		}
		
		if(roomsoundgigi==3)
		{
			String tmp="soundgigi<=? and ";
			sql+=tmp;
		}
		else
		{
			String tmp="soundgigi=? and ";
			sql+=tmp;
		}
		
		
		String tmp="perfume=?";
		sql+=tmp;
		
	
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, CurrentUser.getGender());
		pstmt.setInt(2, CurrentUser.getDom());
		pstmt.setInt(3, roomagelow);
		pstmt.setInt(4, roomagehigh);
		pstmt.setInt(5, roomhakbunlow);
		pstmt.setInt(6, roomhakbunhigh);
		pstmt.setInt(7, roomsmoking);
		pstmt.setInt(8, wantdep);
		pstmt.setInt(9, roomsoundgigi);
		pstmt.setInt(10, roomperfume);
		
		ResultSet rs = pstmt.executeQuery();
		
		return rs;
		

	}
}
