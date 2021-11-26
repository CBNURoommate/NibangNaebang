package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ranmatch {

	public Member match(ResultSet rs)
	{
		ArrayList<Member> arr=new ArrayList<Member>();
		try {
			while(rs.next())
			{
				Member m=new Member();
				m.setId(rs.getString("id"));
				m.setPasswd(rs.getString("passwd"));
				m.setName(rs.getString("name"));
				m.setGender(rs.getInt("gender"));
				m.setDom(rs.getInt("dom"));
				m.setAge(rs.getInt("age"));
				m.setHakbun(rs.getInt("hakbun"));
				m.setDepartment(rs.getInt("department"));
				m.setSleep(rs.getInt("sleep"));
				m.setWake(rs.getInt("wake"));
				m.setShowertime(rs.getInt("showertime"));
				m.setWhenshower(rs.getInt("whenshower"));
				m.setSensitives(rs.getInt("sensitives"));
				m.setJamb1(rs.getInt("jamb1"));
				m.setJamb2(rs.getInt("jamb2"));
				m.setJamb3(rs.getInt("jamb3"));
				m.setSleeplight(rs.getInt("sleeplight"));
				m.setAlarmhear(rs.getInt("alramhear"));
				m.setClean(rs.getInt("clean"));
				m.setHeat(rs.getInt("heat"));
				m.setCold(rs.getInt("cold"));
				m.setSoundgigi(rs.getInt("soundgigi"));
				m.setSmoking(rs.getInt("smoking"));
				m.setSilnaecall(rs.getInt("silnaecall"));
				m.setFriendinvite(rs.getInt("friendinvite"));
				m.setEatbob(rs.getInt("eatbob"));
				m.setStudytype(rs.getInt("studytype"));
				m.setPerfume(rs.getInt("perfume"));
				m.setSmellwell(rs.getInt("smellwell"));
				m.setGame(rs.getInt("game"));
				m.setYasick(rs.getInt("yasick"));
				m.setSool(rs.getInt("sool"));
				m.setSilnaeeat(rs.getInt("silnaeeat"));
				m.setInsect(rs.getInt("insect"));
				arr.add(m);
			}
			if(arr.size()==0)
			{
				System.out.println("데이터 0개");
				return null;
			}
			Member rmem=arr.get((int)(Math.random()*arr.size()));
			return rmem;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
