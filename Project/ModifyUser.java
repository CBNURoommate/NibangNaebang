package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
class ModifyUser {

	public void Modify() throws SQLException 
	{
		Connection con=null;
		 final String URL="jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,"admin","singapore");
			
		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		try
		{

			String sql="update Test.user set name=?, gender=?, hakbun=?, age=?, dom=?, department=?, showertime=?, sensitives=?, jamb1=?, jamb2=?, jamb3=?, sleeplight=?, alramhear=?, clean=?, heat=?, cold=?, soundgigi=?, smoking=?, silnaecall=?, friendinvite=?, eatbob=?, studytype=?, perfume=?, smellwell=?, game=?, yasick=?,sool=?,silnaeeat=?,insect=?, whenshower=?,sleep=?,wake=? where id=?";


			PreparedStatement pstmt=con.prepareStatement(sql);
		 
			pstmt.setString(1,CurrentUser.getName());
			pstmt.setInt(2,CurrentUser.getGender());
			pstmt.setInt(3, CurrentUser.getDom());
			pstmt.setInt(4,CurrentUser.getHakbun() );
			pstmt.setInt(5, CurrentUser.getAge());
			pstmt.setInt(6, CurrentUser.getDepartment());	
			pstmt.setInt(7, CurrentUser.getSleep());
			pstmt.setInt(8, CurrentUser.getWake());
			pstmt.setInt(9, CurrentUser.getShowertime());	
			pstmt.setInt(10, CurrentUser.getWhenshower());
			pstmt.setInt(11, CurrentUser.getSensitive());	
			pstmt.setInt(12, CurrentUser.getJamb1());
			pstmt.setInt(13, CurrentUser.getJamb2());	
			pstmt.setInt(14, CurrentUser.getJamb3());	
			pstmt.setInt(15, CurrentUser.getSleeplight());	
			pstmt.setInt(16, CurrentUser.getAlarmhear());
			pstmt.setInt(17, CurrentUser.getClean());	
			pstmt.setInt(18, CurrentUser.getHeat());	
			pstmt.setInt(19, CurrentUser.getCold());	
			pstmt.setInt(20, CurrentUser.getSoundgigi());	
			pstmt.setInt(21, CurrentUser.getSmoking());	
			pstmt.setInt(22, CurrentUser.getSilnaecall());	
			pstmt.setInt(23, CurrentUser.getFriendinvite());	
			pstmt.setInt(24, CurrentUser.getEatbob());	
			pstmt.setInt(25, CurrentUser.getStudytype());	
			pstmt.setInt(26, CurrentUser.getPerfume());	
			pstmt.setInt(27, CurrentUser.getSmellwell());	
			pstmt.setInt(28, CurrentUser.getGame());
			

			pstmt.setInt(26, CurrentUser.getYasick());	
			pstmt.setInt(27, CurrentUser.getSool());	
			pstmt.setInt(28, CurrentUser.getSilnaeeat());	
			pstmt.setInt(29, CurrentUser.getInsect());	
			pstmt.setInt(30, CurrentUser.getWhenshower());
			pstmt.setInt(31, CurrentUser.getSleep());
			pstmt.setInt(32, CurrentUser.getWake());
			pstmt.setString(33, CurrentUser.getId());	

			pstmt.setInt(29, CurrentUser.getYasick());	
			pstmt.setInt(30, CurrentUser.getSool());	
			pstmt.setInt(31, CurrentUser.getSilnaeeat());	
			pstmt.setInt(32, CurrentUser.getInsect());	
				

			pstmt.executeUpdate();
			System.out.println("성공");
		}
		catch(java.sql.SQLIntegrityConstraintViolationException d)
		{
			System.out.println("실패");
		}
		 
	}
	
}
