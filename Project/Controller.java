package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Controller {
    Connection conn;
    ResultSet rs;
    Statement st;

    public Controller() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com", "admin",
                    "singapore");
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }


    /*// 회원 추가
    public void insertMember(Model model) {
        try {
        
        	st = conn.createStatement();
            rs = st.executeQuery("select * from Test.mainboard;");
        	
            int stmt = st.executeUpdate(
                "insert into member values ('" + model.name + "', '" + model.birth + "', '" + model.tel + "');");
        	
        	
			
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          /*  try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }  */

    // 회원 목록 출력
    public ArrayList<Model> readMember() {
        ArrayList<Model> arr = new ArrayList<Model>();
        System.out.println(arr);
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from Test.user;");
            while (rs.next()) {
                arr.add(new Model(rs.getString(1), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(23),rs.getInt(15),rs.getInt(8),rs.getInt(20),rs.getInt(21),rs.getInt(9),rs.getInt(10),rs.getInt(12),rs.getInt(24),rs.getInt(33),rs.getInt(32)));
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


    // 회원수정
    public void updateMember(String name, String tel) {
        try {
            st = conn.createStatement();
            int stmt = st.executeUpdate("update Test.user set tel = '" + tel + "' where name = '" + name + "';");
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

    // 회원삭제
    public void deleteMember(String name) {
        try {
            st = conn.createStatement();
            int stmt = st.executeUpdate("delete from Test.user where id = '" + name + "';");
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

    // 회원 검색
    public ArrayList<Model> searchMember(String content) {
        ArrayList<Model> arr = new ArrayList<Model>();
        System.out.println(arr);
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from Test.user where id like '%" + content + "%';");
            while (rs.next()) {
                arr.add(new Model(rs.getString(1), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(23),rs.getInt(15),rs.getInt(8),rs.getInt(20),rs.getInt(21),rs.getInt(9),rs.getInt(10),rs.getInt(12),rs.getInt(24),rs.getInt(33),rs.getInt(32)));
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
