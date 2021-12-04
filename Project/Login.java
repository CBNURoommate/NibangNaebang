package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

	public int login(String ID, String PASSWD) throws SQLException {
		Connection con = null;

		Member member = new Member();
		CurrentUser user = new CurrentUser();
		passwdSecurity pwSec = new passwdSecurity();
		
		member.setId(ID);
		member.setPasswd(PASSWD);
		String id = member.getId();
		String passwd = pwSec.passwdSecurity(member.getPasswd());
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");

		}
		try {
			String sql = "select * from Test.user where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				if (rs.getString("passwd").equals(passwd)) {
					System.out.println("");
					CurrentUser.setId(rs.getString("id"));
					CurrentUser.setPasswd(rs.getString("passwd"));
					CurrentUser.setName(rs.getString("name"));
					CurrentUser.setGender(rs.getInt("gender"));
					CurrentUser.setDom(rs.getInt("dom"));
					CurrentUser.setAge(rs.getInt("age"));
					CurrentUser.setHakbun(rs.getInt("hakbun"));
					CurrentUser.setDepartment(rs.getInt("department"));
					CurrentUser.setSleep(rs.getInt("sleep"));
					CurrentUser.setWake(rs.getInt("wake"));
					CurrentUser.setShowertime(rs.getInt("showertime"));
					CurrentUser.setWhenshower(rs.getInt("whenshower"));
					CurrentUser.setSensitives(rs.getInt("sensitives"));
					CurrentUser.setJamb1(rs.getInt("jamb1"));
					CurrentUser.setJamb2(rs.getInt("jamb2"));
					CurrentUser.setJamb3(rs.getInt("jamb3"));
					CurrentUser.setSleeplight(rs.getInt("sleeplight"));
					CurrentUser.setAlarmhear(rs.getInt("alramhear"));
					CurrentUser.setClean(rs.getInt("clean"));
					CurrentUser.setHeat(rs.getInt("heat"));
					CurrentUser.setCold(rs.getInt("cold"));
					CurrentUser.setSoundgigi(rs.getInt("soundgigi"));
					CurrentUser.setSmoking(rs.getInt("smoking"));
					CurrentUser.setSilnaecall(rs.getInt("silnaecall"));
					CurrentUser.setFriendinvite(rs.getInt("friendinvite"));
					CurrentUser.setEatbob(rs.getInt("eatbob"));
					CurrentUser.setStudytype(rs.getInt("studytype"));
					CurrentUser.setPerfume(rs.getInt("perfume"));
					CurrentUser.setSmellwell(rs.getInt("smellwell"));
					CurrentUser.setGame(rs.getInt("game"));
					CurrentUser.setYasick(rs.getInt("yasick"));
					CurrentUser.setSool(rs.getInt("sool"));
					CurrentUser.setSilnaeeat(rs.getInt("silnaeeat"));
					CurrentUser.setInsect(rs.getInt("insect"));
					return 0;

				} else {
					System.out.println("아이디는 맞는데 비밀번호 틀림.");
					return 1;
				}
			else {
				System.out.println("없는 아이디");
				return 2;
			}
		} catch (java.sql.SQLIntegrityConstraintViolationException d) {
			System.out.println("실패");
		}
		return -1;

	}
}
