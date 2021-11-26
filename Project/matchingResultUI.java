package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class matchingResultUI extends JFrame {

	private JPanel contentPane;
	public static Member ranMem;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					matchingResultUI frame = new matchingResultUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public matchingResultUI() {
		String temp = "";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(matchingResultUI.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);

		JLabel nameLabel = new JLabel();
		nameLabel.setIcon(new ImageIcon(matchingResultUI.class.getResource("/Project/personn.png")));
		nameLabel.setText((String) null);
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);

		JButton moveMail = new JButton();
		moveMail.setIcon(new ImageIcon(matchingResultUI.class.getResource("/Project/mail.png")));
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		moveMail.setBounds(1490, 20, 75, 60);
		contentPane.add(moveMail);

		JButton movePage2 = new JButton("니방 랜덤매칭");
		movePage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage2.setFocusPainted(false);
		movePage2.setContentAreaFilled(false);
		movePage2.setBorderPainted(false);
		movePage2.setBackground(Color.LIGHT_GRAY);
		movePage2.setBounds(700, 20, 200, 60);
		contentPane.add(movePage2);

		JButton movePage3 = new JButton("니방 찾아보기");
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setFocusPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setBorderPainted(false);
		movePage3.setBackground(Color.LIGHT_GRAY);
		movePage3.setBounds(900, 20, 200, 60);
		contentPane.add(movePage3);

		JButton movePage1 = new JButton("내방 점검하기");
		movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage1.setFocusPainted(false);
		movePage1.setContentAreaFilled(false);
		movePage1.setBorderPainted(false);
		movePage1.setBackground(Color.BLUE);
		movePage1.setBounds(300, 20, 200, 60);
		contentPane.add(movePage1);

		JButton movePage4 = new JButton("내방 소개하기");
		movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage4.setFocusPainted(false);
		movePage4.setContentAreaFilled(false);
		movePage4.setBorderPainted(false);
		movePage4.setBackground(Color.LIGHT_GRAY);
		movePage4.setBounds(500, 20, 200, 60);
		contentPane.add(movePage4);

		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(0, 96, 1600, 1);
		contentPane.add(line1);

		JPanel line2_1 = new JPanel();
		line2_1.setBackground(Color.LIGHT_GRAY);
		line2_1.setBounds(248, 227, 652, 1);
		contentPane.add(line2_1);

		JPanel line2_2 = new JPanel();
		line2_2.setBackground(Color.LIGHT_GRAY);
		line2_2.setBounds(248, 532, 652, 1);
		contentPane.add(line2_2);

		JLabel infoLabel1 = new JLabel("니방 값");
		infoLabel1.setBounds(226, 174, 57, 15);
		contentPane.add(infoLabel1);

		JLabel myLable_1 = new JLabel();
		if (ranMem.getGender() == 1)
			myLable_1.setText("남자");
		else if (ranMem.getGender() == 2)
			myLable_1.setText("여자");
		else
			myLable_1.setText("정보 없음");
		myLable_1.setBounds(320, 260, 57, 15);
		contentPane.add(myLable_1);

		JLabel myLable_2 = new JLabel();
		if (ranMem.getDom() == 1)
			myLable_2.setText("개성재");
		else if (ranMem.getDom() == 2)
			myLable_2.setText("계영원");
		else if (ranMem.getDom() == 3)
			myLable_2.setText("양성재");
		else if (ranMem.getDom() == 4)
			myLable_2.setText("양진재");
		else if (ranMem.getDom() == 5)
			myLable_2.setText("양현재");
		else
			myLable_2.setText("정보 없음");
		myLable_2.setBounds(320, 285, 57, 15);
		contentPane.add(myLable_2);

		JLabel myLable_3 = new JLabel();
		myLable_3.setText(String.valueOf(ranMem.getAge()));
		myLable_3.setBounds(320, 310, 57, 15);
		contentPane.add(myLable_3);

		JLabel myLable_4 = new JLabel();
		myLable_4.setText(String.valueOf(ranMem.getHakbun()));
		myLable_4.setBounds(320, 335, 57, 15);
		contentPane.add(myLable_4);

		JLabel myLable_5 = new JLabel();
		if (ranMem.getDepartment() == 1)
			myLable_5.setText("인문");
		else if (ranMem.getDepartment() == 2)
			myLable_5.setText("사과");
		else if (ranMem.getDepartment() == 3)
			myLable_5.setText("자과");
		else if (ranMem.getDepartment() == 4)
			myLable_5.setText("경영");
		else if (ranMem.getDepartment() == 5)
			myLable_5.setText("공과");
		else if (ranMem.getDepartment() == 6)
			myLable_5.setText("전정");
		else if (ranMem.getDepartment() == 7)
			myLable_5.setText("농생");
		else if (ranMem.getDepartment() == 8)
			myLable_5.setText("사범");
		else if (ranMem.getDepartment() == 9)
			myLable_5.setText("생과");
		else if (ranMem.getDepartment() == 10)
			myLable_5.setText("수의과");
		else if (ranMem.getDepartment() == 11)
			myLable_5.setText("의과");
		else if (ranMem.getDepartment() == 12)
			myLable_5.setText("자율");
		else
			myLable_5.setText("정보 없음");
		myLable_5.setBounds(320, 360, 57, 15);
		contentPane.add(myLable_5);

		JLabel myLable_6 = new JLabel();
		if (ranMem.getSleep() == 1)
			myLable_6.setText("10시");
		else if (ranMem.getSleep() == 2)
			myLable_6.setText("11시");
		else if (ranMem.getSleep() == 3)
			myLable_6.setText("12시");
		else if (ranMem.getSleep() == 4)
			myLable_6.setText("1시");
		else if (ranMem.getSleep() == 5)
			myLable_6.setText("2시");
		else if (ranMem.getSleep() == 6)
			myLable_6.setText("3시 이후");
		else
			myLable_6.setText("정보 없음");
		myLable_6.setBounds(320, 385, 57, 15);
		contentPane.add(myLable_6);

		JLabel myLable_7 = new JLabel();
		if (ranMem.getWake() == 1)
			myLable_7.setText("7시");
		else if (ranMem.getWake() == 2)
			myLable_7.setText("8시");
		else if (ranMem.getWake() == 3)
			myLable_7.setText("9시");
		else if (ranMem.getWake() == 4)
			myLable_7.setText("10시");
		else if (ranMem.getWake() == 5)
			myLable_7.setText("11시");
		else if (ranMem.getWake() == 6)
			myLable_7.setText("오후");
		else
			myLable_7.setText("정보 없음");
		myLable_7.setBounds(320, 414, 57, 15);
		contentPane.add(myLable_7);

		JLabel myLable_8 = new JLabel();
		if (ranMem.getShowertime() == 1)
			myLable_8.setText("5분");
		else if (ranMem.getShowertime() == 2)
			myLable_8.setText("10분");
		else if (ranMem.getShowertime() == 3)
			myLable_8.setText("15분");
		else if (ranMem.getShowertime() == 4)
			myLable_8.setText("20분");
		else if (ranMem.getShowertime() == 5)
			myLable_8.setText("25분");
		else if (ranMem.getShowertime() == 6)
			myLable_8.setText("30분");
		else
			myLable_8.setText("정보 없음");
		myLable_8.setBounds(320, 439, 57, 15);
		contentPane.add(myLable_8);

		JLabel myLable_9 = new JLabel();
		if (ranMem.getWhenshower() == 1)
			myLable_9.setText("아침");
		else if (ranMem.getWhenshower() == 2)
			myLable_9.setText("저녁");
		else if (ranMem.getWhenshower() == 3)
			myLable_9.setText("유동적");
		else
			myLable_9.setText("정보 없음");
		myLable_9.setBounds(320, 464, 57, 15);
		contentPane.add(myLable_9);

		JLabel myLable_10 = new JLabel();
		if (ranMem.getSensitives() == 1)
			myLable_10.setText("어두움");
		else if (ranMem.getSensitives() == 2)
			myLable_10.setText("보통");
		else if (ranMem.getSensitives() == 3)
			myLable_10.setText("밝음");
		else
			myLable_10.setText("정보 없음");
		myLable_10.setBounds(320, 489, 57, 15);
		contentPane.add(myLable_10);

		JLabel myLable_11 = new JLabel();
		if (ranMem.getJamb1() == 1)
			temp = "이갈이";
		if (ranMem.getJamb2() == 1) {
			if (temp != "")
				temp += ", ";
			temp += "잠꼬대";
		}
		if (ranMem.getJamb3() == 1) {
			if (temp != "")
				temp += ", ";
			temp += "코골이";
		}
		myLable_11.setText(temp);
		myLable_11.setBounds(497, 260, 57, 15);
		contentPane.add(myLable_11);

		JLabel myLable_12 = new JLabel();
		if (ranMem.getSleeplight() == 1)
			myLable_12.setText("사용안함");
		else if (ranMem.getSleeplight() == 2)
			myLable_12.setText("형광등");
		else if (ranMem.getSleeplight() == 3)
			myLable_12.setText("스탠드");
		else if (ranMem.getSleeplight() == 4)
			myLable_12.setText("무드등");
		else
			myLable_12.setText("정보 없음");
		myLable_12.setBounds(497, 285, 57, 15);
		contentPane.add(myLable_12);

		JLabel myLable_13 = new JLabel();
		if (ranMem.getAlarmhear() == 1)
			myLable_13.setText("못들어요");
		else if (ranMem.getAlarmhear() == 2)
			myLable_13.setText("중간");
		else if (ranMem.getAlarmhear() == 3)
			myLable_13.setText("잘들어요");
		else
			myLable_13.setText("정보 없음");
		myLable_13.setBounds(497, 310, 57, 15);
		contentPane.add(myLable_13);

		JLabel myLable_14 = new JLabel();
		if (ranMem.getClean() == 1)
			myLable_14.setText("자주");
		else if (ranMem.getClean() == 2)
			myLable_14.setText("보통");
		else if (ranMem.getClean() == 3)
			myLable_14.setText("한번에");
		else
			myLable_14.setText("정보 없음");
		myLable_14.setBounds(497, 335, 57, 15);
		contentPane.add(myLable_14);

		JLabel myLable_15 = new JLabel();
		if (ranMem.getClean() == 1)
			myLable_15.setText("자주");
		else if (ranMem.getClean() == 2)
			myLable_15.setText("보통");
		else if (ranMem.getClean() == 3)
			myLable_15.setText("한번에");
		else
			myLable_15.setText("정보 없음");
		myLable_15.setBounds(497, 360, 57, 15);
		contentPane.add(myLable_15);

		JLabel myLable_16 = new JLabel();
		if (ranMem.getHeat() == 1)
			myLable_16.setText("적게탐");
		else if (ranMem.getHeat() == 2)
			myLable_16.setText("보통");
		else if (ranMem.getHeat() == 3)
			myLable_16.setText("많이탐");
		else
			myLable_16.setText("정보 없음");
		myLable_16.setBounds(497, 385, 57, 15);
		contentPane.add(myLable_16);

		JLabel myLable_17 = new JLabel();
		if (ranMem.getCold() == 1)
			myLable_17.setText("적게탐");
		else if (ranMem.getCold() == 2)
			myLable_17.setText("보통");
		else if (ranMem.getCold() == 3)
			myLable_17.setText("많이탐");
		else
			myLable_17.setText("정보 없음");
		myLable_17.setBounds(497, 414, 57, 15);
		contentPane.add(myLable_17);

		JLabel myLable_18 = new JLabel();
		if (ranMem.getCold() == 1)
			myLable_18.setText("이어폰");
		else if (ranMem.getCold() == 2)
			myLable_18.setText("스피커");
		else if (ranMem.getCold() == 3)
			myLable_18.setText("유동적");
		else
			myLable_18.setText("정보 없음");
		myLable_18.setBounds(497, 439, 57, 15);
		contentPane.add(myLable_18);

		JLabel myLable_19 = new JLabel();
		if (ranMem.getSmoking() == 1)
			myLable_19.setText("흡연");
		else if (ranMem.getSmoking() == 2)
			myLable_19.setText("비흡연");
		else
			myLable_19.setText("정보 없음");
		myLable_19.setBounds(497, 464, 57, 15);
		contentPane.add(myLable_19);

		JLabel myLable_20 = new JLabel();
		if (ranMem.getSilnaecall() == 1)
			myLable_20.setText("반대");
		else if (ranMem.getSilnaecall() == 2)
			myLable_20.setText("상관없음");
		else if (ranMem.getSilnaecall() == 3)
			myLable_20.setText("찬성");
		else if (ranMem.getSilnaecall() == 4)
			myLable_20.setText("간단한 용무만");
		else
			myLable_20.setText("정보 없음");
		myLable_20.setBounds(497, 489, 57, 15);
		contentPane.add(myLable_20);

		JLabel myLable_21 = new JLabel();
		if (ranMem.getFriendinvite() == 1)
			myLable_21.setText("찬성");
		else if (ranMem.getFriendinvite() == 2)
			myLable_21.setText("반대");
		else
			myLable_21.setText("정보 없음");
		myLable_21.setBounds(596, 260, 57, 15);
		contentPane.add(myLable_21);

		JLabel myLable_22 = new JLabel();
		if (ranMem.getEatbob() == 1)
			myLable_22.setText("같이");
		else if (ranMem.getEatbob() == 2)
			myLable_22.setText("따로");
		else
			myLable_22.setText("정보 없음");
		myLable_22.setBounds(596, 285, 57, 15);
		contentPane.add(myLable_22);

		JLabel myLable_23 = new JLabel();
		if (ranMem.getStudytype() == 1)
			myLable_23.setText("기숙사");
		else if (ranMem.getStudytype() == 2)
			myLable_23.setText("도서관");
		else if (ranMem.getStudytype() == 3)
			myLable_23.setText("유동적");
		else
			myLable_23.setText("정보 없음");
		myLable_23.setBounds(596, 310, 57, 15);
		contentPane.add(myLable_23);

		JLabel myLable_24 = new JLabel();
		if (ranMem.getPerfume() == 1)
			myLable_24.setText("미사용");
		else if (ranMem.getPerfume() == 2)
			myLable_24.setText("사용");
		else
			myLable_24.setText("정보 없음");
		myLable_24.setBounds(596, 335, 57, 15);
		contentPane.add(myLable_24);

		JLabel myLable_25 = new JLabel();
		if (ranMem.getSmellwell() == 1)
			myLable_25.setText("민감");
		else if (ranMem.getSmellwell() == 2)
			myLable_25.setText("상관없음");
		else
			myLable_25.setText("정보 없음");
		myLable_25.setBounds(596, 360, 57, 15);
		contentPane.add(myLable_25);

		JLabel myLable_26 = new JLabel();
		if (ranMem.getGame() == 1)
			myLable_26.setText("안함");
		else if (ranMem.getGame() == 2)
			myLable_26.setText("가끔");
		else if (ranMem.getGame() == 3)
			myLable_26.setText("자주");
		else
			myLable_26.setText("정보 없음");
		myLable_26.setBounds(596, 385, 57, 15);
		contentPane.add(myLable_26);

		JLabel myLable_27 = new JLabel();
		if (ranMem.getYasick() == 1)
			myLable_27.setText("안먹음");
		else if (ranMem.getYasick() == 2)
			myLable_27.setText("가끔먹음");
		else if (ranMem.getYasick() == 3)
			myLable_27.setText("자주먹음");
		else
			myLable_27.setText("정보 없음");
		myLable_27.setBounds(720, 235, 57, 15);
		contentPane.add(myLable_27);

		JLabel myLable_28 = new JLabel();
		if (ranMem.getSool() == 1)
			myLable_28.setText("안마심");
		else if (ranMem.getSool() == 2)
			myLable_28.setText("가끔마심");
		else if (ranMem.getSool() == 3)
			myLable_28.setText("자주마심");
		else
			myLable_28.setText("정보 없음");
		myLable_28.setBounds(720, 260, 57, 15);
		contentPane.add(myLable_28);

		JLabel myLable_29 = new JLabel();
		if (ranMem.getSilnaeeat() == 1)
			myLable_29.setText("불가");
		else if (ranMem.getSilnaeeat() == 2)
			myLable_29.setText("냄새 안나는 음식만");
		else if (ranMem.getSilnaeeat() == 3)
			myLable_29.setText("가능");
		else
			myLable_29.setText("정보 없음");
		myLable_29.setBounds(720, 285, 57, 15);
		contentPane.add(myLable_29);

		JLabel myLable_30 = new JLabel();
		if (ranMem.getInsect() == 1)
			myLable_30.setText("혐오");
		else if (ranMem.getInsect() == 2)
			myLable_30.setText("못잡음");
		else if (ranMem.getInsect() == 3)
			myLable_30.setText("중간");
		else if (ranMem.getInsect() == 4)
			myLable_30.setText("잡음");
		else if (ranMem.getInsect() == 5)
			myLable_30.setText("귀여움");
		else
			myLable_30.setText("정보 없음");
		myLable_30.setBounds(720, 310, 57, 15);
		contentPane.add(myLable_30);
		
		JButton btnNewButton = new JButton("다시매칭");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs;
				try {
					MustSatisfy ms=new MustSatisfy();
					rs = ms.Satisfy(ranMem.getAge(), ranMem.getAge(),ranMem.getHakbun(), ranMem.getHakbun(), ranMem.getSmoking(), ranMem.getDepartment(), ranMem.getSoundgigi(), ranMem.getPerfume());
					rs.next();
					ranmatch rm=new ranmatch();
					Member fm=rm.match(rs);
					matchingResultUI.ranMem=fm;
					matchingResultUI mui=new matchingResultUI();
					mui.setVisible(true);
					setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(803, 574, 97, 23);
		contentPane.add(btnNewButton);
	}
}