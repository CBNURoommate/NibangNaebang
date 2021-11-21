package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Matching {

	public void Match(String name, int gender, int dom, int hakbun, int age, int department, int sleep, int wake, int showertime, int whenshower, int sensitive, int jamb1, int jamb2, int jamb3, int sleeplight, int alarmhear, int clean, int heat, int cold, int soundgigi, int smoking, int silnaecall, int friendinvite, int eatbob, int studytype, int perfume, int smellwell, int game, int yasick, int sool, int silnaeeat, int insect) throws SQLException {
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		
		UserNeeds usersneeds = new UserNeeds();
		UserNeeds.setName(name);
		UserNeeds.setGender(gender);
		UserNeeds.setDom(dom);
		UserNeeds.setHakbun(hakbun);
		UserNeeds.setAge(age);
		UserNeeds.setDepartment(department);
		UserNeeds.setSleep(sleep);
		UserNeeds.setWake(wake);
		UserNeeds.setShowertime(showertime);
		UserNeeds.setWhenshower(whenshower);
		UserNeeds.setSensitive(sensitive);
		UserNeeds.setJamb1(jamb1);
		UserNeeds.setJamb2(jamb2);
		UserNeeds.setJamb3(jamb3);
		UserNeeds.setSleeplight(sleeplight);
		UserNeeds.setAlarmhear(alarmhear);
		UserNeeds.setClean(clean);
		UserNeeds.setHeat(heat);
		UserNeeds.setCold(cold);
		UserNeeds.setSoundgigi(soundgigi);
		UserNeeds.setSmoking(smoking);
		UserNeeds.setSilnaecall(silnaecall);
		UserNeeds.setFriendinvite(friendinvite);
		UserNeeds.setEatbob(eatbob);
		UserNeeds.setStudytype(studytype);
		UserNeeds.setPerfume(perfume);
		UserNeeds.setSmellwell(smellwell);
		UserNeeds.setGame(game);
		UserNeeds.setYasick(yasick);
		UserNeeds.setSool(sool);
		UserNeeds.setSilnaeeat(silnaeeat);
		UserNeeds.setInsect(insect);
		

		String Name = UserNeeds.getName();		
		int Gender = UserNeeds.getGender();
		int Dom = UserNeeds.getDom();
		int Hakbun = UserNeeds.getHakbun();
		int Age = UserNeeds.getAge();
		int Department = UserNeeds.getDepartment();
		int Sleep = UserNeeds.getSleep();
		int Wake = UserNeeds.getWake();
		int Showertime = UserNeeds.getShowertime();
		int Whenshower = UserNeeds.getWhenshower();
		int Sensitive = UserNeeds.getSensitive();
		int Jamb1 = UserNeeds.getJamb1();
		int Jamb2 = UserNeeds.getJamb2();
		int Jamb3 = UserNeeds.getJamb3();
		int Sleeplight = UserNeeds.getSleeplight();
		int Alarmhear = UserNeeds.getAlarmhear();
		int Clean = UserNeeds.getClean();
		int Heat = UserNeeds.getHeat();
		int Cold = UserNeeds.getCold();
		int Soundgigi = UserNeeds.getSoundgigi();
		int Smoking = UserNeeds.getSmoking();
		int Silnaecall = UserNeeds.getSilnaecall();
		int Friendinvite = UserNeeds.getFriendinvite();
		int Eatbob = UserNeeds.getEatbob();
		int Studytype = UserNeeds.getStudytype();
		int Perfume = UserNeeds.getPerfume();
		int Smellwell = UserNeeds.getSmellwell();
		int Game = UserNeeds.getGame();
		int Yasick = UserNeeds.getYasick();
		int Sool = UserNeeds.getSool();
		int Silnaeeat = UserNeeds.getSilnaeeat();
		int Insect = UserNeeds.getInsect();
		
		int acc = 0; // 정확도 측정용
		int acc_cnt = 1; // 정확도 측정용

		String sql="matching userneeds and sequential objuser info";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		
		while(acc_cnt > 0) // 적합도 높으면 해당 라인에서 탈출
		{
			{
				for(acc = 34; acc > 0; acc-- )
				{
					do {
						acc_cnt = acc;
						
						if((rs.getInt(gender) != Gender)||(rs.getInt(dom) != Dom)||(rs.getInt(hakbun) == Hakbun))
							break;
						
						if(rs.getInt(age) == Age)
							acc_cnt--;
						if(rs.getInt(department) == Department)
							acc_cnt--;
						if(rs.getInt(sleep) == Sleep)
							acc_cnt--;
						if(rs.getInt(wake) == Wake)
							acc_cnt--;
						if(rs.getInt(showertime) == Showertime)
							acc_cnt--;
						if(rs.getInt(whenshower) == Whenshower)
							acc_cnt--;
						if(rs.getInt(sensitive) == Sensitive)
							acc_cnt--;
						if(rs.getInt(jamb1) == Jamb1)
							acc_cnt--;
						if(rs.getInt(jamb2) == Jamb2)
							acc_cnt--;
						if(rs.getInt(jamb3) == Jamb3)
							acc_cnt--;
						if(rs.getInt(sleeplight) == Sleeplight)
							acc_cnt--;
						if(rs.getInt(alarmhear) == Alarmhear)
							acc_cnt--;
						if(rs.getInt(clean) == Clean)
							acc_cnt--;
						if(rs.getInt(heat) == Heat)
							acc_cnt--;
						if(rs.getInt(cold) == Cold)
							acc_cnt--;
						if(rs.getInt(soundgigi) == Soundgigi)
							acc_cnt--;
						if(rs.getInt(smoking) == Smoking)
							acc_cnt--;
						if(rs.getInt(silnaecall) == Silnaecall)
							acc_cnt--;
						if(rs.getInt(friendinvite) == Friendinvite)
							acc_cnt--;
						if(rs.getInt(eatbob) == Eatbob)
							acc_cnt--;
						if(rs.getInt(studytype) == Studytype)
							acc_cnt--;
						if(rs.getInt(perfume) == Perfume)
							acc_cnt--;
						if(rs.getInt(smellwell) == Smellwell)
							acc_cnt--;
						if(rs.getInt(game) == Game)
							acc_cnt--;
						if(rs.getInt(yasick) == Yasick)
							acc_cnt--;
						if(rs.getInt(sool) == Sool)
							acc_cnt--;
						if(rs.getInt(silnaeeat) == Silnaeeat)
							acc_cnt--;
						if(rs.getInt(insect) == Insect)
							acc_cnt--;
						 
						break;
						
					}while(true);
					rs.next();
				}
				
			}
		}
		
	}
}