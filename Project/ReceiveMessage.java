package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReceiveMessage {

	public static void main(String[] args) throws SQLException {
	}
//    CurrentUser user = new CurrentUser();
//    String receiverid = user.getId();
    String receiverid = "5678";

    Connection conn = null;
    ResultSet psrs;
    ResultSet strs;
    PreparedStatement psmt;
    Statement st;
    
    public ReceiveMessage() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com", "admin",
                    "singapore");
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }


    public ArrayList<MessageArray> readMessage() {
        ArrayList<MessageArray> arr = new ArrayList<MessageArray>();
        System.out.println(arr);
        try {
            //rs = st.executeQuery("select * from Test.msgtable where id = ?;");

            
//			String pssql = "select * from Test.user where id=?";
//			psmt = conn.prepareStatement(pssql);
//			psmt.setString(1, receiverid);
//			psrs = psmt.executeQuery();
			
			//String stsql = "select * from Test.user where receiverid="+receiverid;
			st = conn.createStatement();
			strs = st.executeQuery("select * from Test.msgtable where receiverid like '%" + receiverid + "%';");
			int cnt = 0;
            while (strs.next()) {
            	if(strs.getString(1) == receiverid)
            		arr.add(new MessageArray(strs.getString(1), strs.getString(2), strs.getString(3), strs.getString(4), strs.getInt(5)));
            	System.out.println(cnt + " \t ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
				st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        //return arr;
        System.out.println("ReceiverID \t SenderID \t Sendtime \t Constext \t Receiverchecked \n");
        System.out.println("------------------------------------------------------------------\n");
        
        for(int i = 0; i < arr.size(); i++)
        {
        	System.out.println(arr.get(i).getReceiverID() + " \t " + arr.get(i).getSenderID() + " \t " +arr.get(i).getSendtime() + " \t " +arr.get(i).getConstext() + " \t " +arr.get(i).getReceiverchecked() + " \n");
        }
		return arr;
    }
	 
}
