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

	 public static void main(String[] args) throws SQLException {
	//public int send(String ReceiverID) throws SQLException {
		Connection con = null;

		//CurrentUser user = new CurrentUser();
		//String sendId = user.getId();
		//String receiveId = ReceiverID;
		
		String sendId = "1234";
		String receiveId = "5678";
		
	
		Scanner sc = new Scanner(System.in);

		System.out.println("한 줄 최대 500자 인풋(엔터시 넘어감)");
		String text = sc.nextLine();
		System.out.println("");
		
		Date now = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String formatedNow = formatter.format(now);
		
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
			//return -1;
			return;
		}
		try {
			String sql = "insert into Test.msgtable values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, receiveId);
			pstmt.setString(2, sendId);
			pstmt.setString(3, formatedNow);
			pstmt.setString(4, text);
			pstmt.setInt(5, -1);

			pstmt.executeUpdate();
			System.out.println("쪽지 전송 완료");
			//return 0;
			return;
		} catch (java.sql.SQLIntegrityConstraintViolationException d) {
			System.out.println("중복된 id 존재");
			//return 1;
			return;
		}

	}
}