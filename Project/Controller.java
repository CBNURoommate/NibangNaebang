package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Controller {
    Connection conn = null;
    ResultSet rs = null;
    Statement st = null;

    public Controller() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/", "admin",
                    "singapore");
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }


    // ȸ�� �߰�
    public void insertMember(Model model) {
        try {
        	
        	String sql="insert into Test.mainboard values(?,?,?,?)";
        	PreparedStatement pstmt=conn.prepareStatement(sql);
        	
            /*int stmt = st.executeUpdate(
                    "insert into member values ('" + model.name + "', '" + model.birth + "', '" + model.tel + "');");*/
        	
        	pstmt.setString(1,model.getName());
			pstmt.setString(2,model.getBirth());
			pstmt.setString(3,model.getTel());
			
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // ȸ�� ��� ���
    public ArrayList<Model> readMember() {
        ArrayList<Model> arr = new ArrayList<Model>();
        System.out.println(arr);
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from mainboard;");
            while (rs.next()) {
                arr.add(new Model(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arr;
    }

    // ȸ������
    public void updateMember(String name, String tel) {
        try {
            st = conn.createStatement();
            int stmt = st.executeUpdate("update mainboard set tel = '" + tel + "' where name = '" + name + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // ȸ������
    public void deleteMember(String name) {
        try {
            st = conn.createStatement();
            int stmt = st.executeUpdate("delete from mainboard where name = '" + name + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // ȸ�� �˻�
    public ArrayList<Model> searchMember(String content) {
        ArrayList<Model> arr = new ArrayList<Model>();
        System.out.println(arr);
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from mainboard where name like '%" + content + "%';");
            while (rs.next()) {
                arr.add(new Model(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arr;
    }
}