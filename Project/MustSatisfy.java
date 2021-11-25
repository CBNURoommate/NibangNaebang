package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MustSatisfy {
	public void Satisfy(int roomagehigh, int roomagelow, int roomhakbunhigh, int roomhakbunlow, int roomsmoking, int roomdepartment, int roomsoundgigi, int roomperfume, int gender, int dom, int age, int hakbun, int smoking, int department, int soundgigi, int perfume) throws SQLException {
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		
		RoommateInfo roommateinfo = new RoommateInfo();
		
		RoommateInfo.setRoomagehigh(roomagehigh);
		RoommateInfo.setRoomagelow(roomagelow);
		RoommateInfo.setRoomhakbunhigh(roomhakbunhigh);
		RoommateInfo.setRoomhakbunlow(roomhakbunlow);
		RoommateInfo.setRoomsmoking(roomsmoking);
		RoommateInfo.setRoomdepartment(roomdepartment);
		RoommateInfo.setRoomsoundgigi(roomsoundgigi);
		RoommateInfo.setRoomperfume(roomperfume);


		int Roomagehigh = RoommateInfo.getRoomagehigh();
		int Roomagelow = RoommateInfo.getRoomagelow();
		int Roomhakbunhigh = RoommateInfo.getRoomhakbunhigh();
		int Roomhakbunlow = RoommateInfo.getRoomhakbunlow();
		int Roomsmoking = RoommateInfo.getRoomsmoking();
		int Roomdepartment = RoommateInfo.getRoomdepartment();
		int Roomsoundgigi = RoommateInfo.getRoomsoundgigi();
		int Roomperfume = RoommateInfo.getRoomperfume();

		CurrentUser currentuser = new CurrentUser();
		
		int Curgender = CurrentUser.getGender();
		int Curdom = CurrentUser.getDom();
		
		Member member = new Member();
		
		int Memage = member.getAge();
		int Memhakbun = member.getHakbun();
		int Memsmoking = member.getDepartment();
		int Memdepartment = member.getDepartment();
		int Memsoundgigi = member.getSoundgigi();
		int Memperfume = member.getPerfume();
		int Memgender = member.getGender();
		int Memdom = member.getDom();
		int Memroomagehigh = member.getRoomagehigh();
		int Memroomagelow = member.getRoomagelow();
		int Memroomhakbunhigh = member.getRoomhakbunhigh();
		int Memroomhakbunlow = member.getRoomhakbunlow();
		int Memroomsmoking = member.getSmoking();
		int Memroomdepartment = member.getDepartment();
		int Memroomsoundgigi = member.getSoundgigi();
		int Memroomperfume = member.getRoomperfume();
		
		
		int acc = 0;
		int acc_cnt = 1;

		String sql = "matching matching roommate info and obj info";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while (acc_cnt > 0) {
			for (acc = 34; acc > 0; acc--) {
				do {
					acc_cnt = acc;

					if ((rs.getInt(gender) != Gender) || (rs.getInt(dom) != Dom) || (rs.getInt(hakbun) == Hakbun))
						break;

					if (rs.getInt(age) == Age)
						acc_cnt--;
					if (rs.getInt(department) == Department)
						acc_cnt--;
					if (rs.getInt(sleep) == Sleep)
						acc_cnt--;
					if (rs.getInt(wake) == Wake)
						acc_cnt--;
					if (rs.getInt(showertime) == Showertime)
						acc_cnt--;
					if (rs.getInt(whenshower) == Whenshower)
						acc_cnt--;
					if (rs.getInt(sensitive) == Sensitive)
						acc_cnt--;
					if (rs.getInt(jamb1) == Jamb1)
						acc_cnt--;
					if (rs.getInt(jamb2) == Jamb2)
						acc_cnt--;
					if (rs.getInt(jamb3) == Jamb3)
						acc_cnt--;
					if (rs.getInt(sleeplight) == Sleeplight)
						acc_cnt--;
					if (rs.getInt(alarmhear) == Alarmhear)
						acc_cnt--;
					if (rs.getInt(clean) == Clean)
						acc_cnt--;
					if (rs.getInt(heat) == Heat)
						acc_cnt--;
					if (rs.getInt(cold) == Cold)
						acc_cnt--;
					if (rs.getInt(soundgigi) == Soundgigi)
						acc_cnt--;
					if (rs.getInt(smoking) == Smoking)
						acc_cnt--;
					if (rs.getInt(silnaecall) == Silnaecall)
						acc_cnt--;
					if (rs.getInt(friendinvite) == Friendinvite)
						acc_cnt--;
					if (rs.getInt(eatbob) == Eatbob)
						acc_cnt--;
					if (rs.getInt(studytype) == Studytype)
						acc_cnt--;
					if (rs.getInt(perfume) == Perfume)
						acc_cnt--;
					if (rs.getInt(smellwell) == Smellwell)
						acc_cnt--;
					if (rs.getInt(game) == Game)
						acc_cnt--;
					if (rs.getInt(yasick) == Yasick)
						acc_cnt--;
					if (rs.getInt(sool) == Sool)
						acc_cnt--;
					if (rs.getInt(silnaeeat) == Silnaeeat)
						acc_cnt--;
					if (rs.getInt(insect) == Insect)
						acc_cnt--;

					break;

				} while (true);
				rs.next();
			}
		}

	}
}
