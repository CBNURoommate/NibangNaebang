// sender id = cur user id
// receiver id = 
// typing or ranmatching result id

// scanf(constext)
// now time = sendtime;


package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class SendMessage {

	 
	public int send(String ReceiverID,String text) throws SQLException {
		Connection con = null;

		
		Date now = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yy.MM.dd HH:mm");
		
		String formatedNow = formatter.format(now);
		
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
			//return -1;
			return -1;
		}
		try {
			String sql = "insert into Test.msgtable values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, ReceiverID);
			pstmt.setString(2, CurrentUser.getId());
			pstmt.setString(3, formatedNow);
			pstmt.setString(4, text);
			pstmt.setInt(5, -1);
			pstmt.executeUpdate();
			System.out.println("쪽지 전송 완료");
			//return 0;
			return 0;
		} catch (java.sql.SQLIntegrityConstraintViolationException d) {
			System.out.println("실패");
			//return 1;
			return 1;
		}

	}
}
