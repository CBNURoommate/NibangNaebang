package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MustSatisfy {
	public void Satisfy(String name, int roomagehigh, int roomagelow, int roomhakbunhigh, int roomhakbunlow, int roomsmoking, int roomdepartment, int roomsoundgigi, int roomperfume, int gender, int dom, int age, int hakbun, int smoking, int department, int soundgigi, int perfume) throws SQLException {
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException f) {
			System.out.println("fail");
		}
		


		CurrentUser currentuser = new CurrentUser();

		String Name = CurrentUser.getName();
		int Gender = CurrentUser.getGender();
		int Dom = CurrentUser.getDom();		
		
		int Age = CurrentUser.getAge();
		int Hakbun = CurrentUser.getHakbun();
		int Department = UserNeeds.getDepartment();
		int Soundgigi = UserNeeds.getSoundgigi();
		int Smoking = UserNeeds.getSmoking();
		int Perfume = UserNeeds.getPerfume();
		
		int Roomagehigh = CurrentUser.getRoomagehigh();
		int Roomagelow = CurrentUser.getRoomagelow();
		int Roomhakbunhigh = CurrentUser.getRoomhakbunhigh();
		int Roomhakbunlow = CurrentUser.getRoomhakbunlow();
		int Roomsmoking = CurrentUser.getRoomsmoking();
		int Roomdepartment = CurrentUser.getRoomdepartment();
		int Roomsoundgigi = CurrentUser.getRoomsoundgigi();
		int Roomperfume = CurrentUser.getRoomperfume();
		
		
		int acc = 0;
		int acc_cnt = 1;

		String sql = "matching matching roommate info and obj info";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while(true)
		{
			

					if ((rs.getInt(gender) != Gender) || (rs.getInt(dom) != Dom))
						break;
					// 성별이나 기숙사 안맞으면 나가리

					if ( !(rs.getInt(age) <= Roomagehigh) || !(rs.getInt(age) >= Roomagelow)  )
						break;				
					//obj의 나이가 user바운더리 밖이면 나가리

					if ( !(rs.getInt(roomagehigh) >= age) || !(rs.getInt(roomagelow) <= age)  )
						break;
					//user의 나이가 obj바운더리 밖이면 나가리
					
					if ( !(rs.getInt(hakbun) <= Roomhakbunhigh) || !(rs.getInt(hakbun) >= Roomhakbunlow)  )
						break;
					//obj의 학번이 user바운더리 밖이면 나가리
					
					if ( !(rs.getInt(roomhakbunhigh) >= hakbun) || !(rs.getInt(roomhakbunlow) <= hakbun)  )
						break;
					//user의 학번이 obj바운더리 밖이면 나가리
					
					if ( Roomsmoking != 3)
					{
						if(rs.getInt(smoking) != Roomsmoking)
							break;	
					}
					// user의 obj흡연 체크
					
					if( rs.getInt(roomsmoking) != 3)
					{
						if(rs.getInt(Roomsmoking) != smoking)
							break;
					}
					// obj의 user흡연 체크
					
					if ( Roomdepartment != 3)
					{
						// 같은과					
						if(Roomdepartment == 1)
						{	
							if(rs.getInt(department) != Department)
								break;	
						}
						// 다른과
						else if(Roomdepartment == 2)
						{
							if(rs.getInt(department) == Department)
								break;
						}
					}
					// user의 obj 학과 체크
					
					if ( rs.getInt(roomdepartment) != 3)
					{
						// 같은과					
						if(rs.getInt(roomdepartment) == 1)
						{	
							if(rs.getInt(department) != Department)
								break;	
						}
						// 다른과
						else if(rs.getInt(roomdepartment) == 2)
						{
							if(rs.getInt(department) == Department)
								break;
						}
					}
					// obj의 user 학과 체크
					
					if ( Roomsoundgigi != 3)
					{
						// 이어폰					
						if(Roomsoundgigi == 1)
						{	
							if(rs.getInt(soundgigi) != Soundgigi)
								break;	
						}
						// 스피커
						else if(Roomsoundgigi == 1)
						{
							if(rs.getInt(soundgigi) == Soundgigi)
								break;
						}
					}
					// user의 obj 오디오기기 체크
					
					if ( rs.getInt(roomsoundgigi) != 3)
					{
						// 이어폰				
						if(rs.getInt(roomsoundgigi) == 1)
						{	
							if(rs.getInt(soundgigi) != Soundgigi)
								break;	
						}
						// 스피커
						else if(rs.getInt(roomsoundgigi) == 2)
						{
							if(rs.getInt(soundgigi) == Soundgigi)
								break;
						}
					}
					// obj의 user 오디오기기 체크
					
					if ( Roomperfume != 3)
					{
						// 미사용				
						if(Roomperfume == 1)
						{	
							if(rs.getInt(perfume) != Perfume)
								break;	
						}
						// 사용
						else if(Roomperfume == 1)
						{
							if(rs.getInt(perfume) == Perfume)
								break;
						}
					}
					// user의 obj 향수 체크
					
					if ( rs.getInt(roomperfume) != 3)
					{
						// 미사용		
						if(rs.getInt(roomperfume) == 1)
						{	
							if(rs.getInt(perfume) != Perfume)
								break;	
						}
						// 사용
						else if(rs.getInt(roomperfume) == 2)
						{
							if(rs.getInt(perfume) == Perfume)
								break;
						}
					}
					// obj의 user 향수 체크
					if ( rs.getString(name) == Name)
						break;
					// 본인 제외?
					
				
					rs.next();
		}	

	}
}
