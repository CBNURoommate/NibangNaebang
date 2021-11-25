package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class uploadMyroomUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uploadMyroomUI frame = new uploadMyroomUI();
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
	public uploadMyroomUI() {
		String temp = null;
		
		setTitle("니방내방 - 내방 소개하기");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29");
		titleLabel.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/logo_small.png")));
		titleLabel.setBounds(20, 15, 187, 67);
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		contentPane.add(titleLabel);
		
		JPanel line2 = new JPanel();
		line2.setBackground(Color.BLACK);
		line2.setBounds(0, 96, 1600, 1);
		contentPane.add(line2);
		
		JButton movePage1 = new JButton("\uB0B4\uBC29 \uC810\uAC80\uD558\uAE30");
		movePage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomCheck r = new roomCheck();
				r.setVisible(true);
				setVisible(false);
			}
		});
		
		JPanel line2_1 = new JPanel();
		line2_1.setBackground(Color.LIGHT_GRAY);
		line2_1.setBounds(82, 189, 652, 1);
		contentPane.add(line2_1);
		
		JPanel line2_2 = new JPanel();
		line2_2.setBackground(Color.LIGHT_GRAY);
		line2_2.setBounds(82, 494, 652, 1);
		contentPane.add(line2_2);
		movePage1.setBounds(300, 20, 200, 60);
		movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage1.setFocusPainted(false);
		movePage1.setContentAreaFilled(false);
		movePage1.setBorderPainted(false);
		movePage1.setBackground(Color.BLUE);
		contentPane.add(movePage1);
		
		JButton movePage2 = new JButton("\uB2C8\uBC29 \uB79C\uB364\uB9E4\uCE6D");
		movePage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomMatching r = new randomMatching();
				r.setVisible(true);
				setVisible(false);
			}
		});
		movePage2.setBounds(700, 20, 200, 60);
		movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage2.setFocusPainted(false);
		movePage2.setContentAreaFilled(false);
		movePage2.setBorderPainted(false);
		movePage2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage2);
		
		JButton movePage3 = new JButton("\uB2C8\uBC29 \uCC3E\uC544\uBCF4\uAE30");
		movePage3.setBounds(900, 20, 200, 60);
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setFocusPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setBorderPainted(false);
		movePage3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage3);
		
		JButton movePage4 = new JButton("\uB0B4\uBC29 \uC18C\uAC1C\uD558\uAE30");
		movePage4.setBounds(500, 20, 200, 60);
		movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage4.setFocusPainted(false);
		movePage4.setContentAreaFilled(false);
		movePage4.setBorderPainted(false);
		movePage4.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage4);
		
		JButton moveMail = new JButton();
		moveMail.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/mail.png")));
		moveMail.setBounds(1490, 20, 75, 60);
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		contentPane.add(moveMail);
		
		JButton btnNewButton = new JButton("수정하기");
		btnNewButton.setBounds(637, 505, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("업로드하기");
		btnNewButton2.setBounds(375, 596, 97, 23);
		contentPane.add(btnNewButton2);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/personn.png")));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);
		
		JLabel infoLabel1 = new JLabel("내방 현황");
		infoLabel1.setBounds(60, 136, 57, 15);
		contentPane.add(infoLabel1);
		
		JLabel myLable_1 = new JLabel();
		myLable_1.setBounds(154, 222, 57, 15);
		if(CurrentUser.getGender() == 1)
			 myLable_1.setText("남자");
		else if(CurrentUser.getGender() == 2)
			 myLable_1.setText("여자");
		else
			myLable_1.setText("정보 없음");
		contentPane.add(myLable_1);
		
		JLabel myLable_2 = new JLabel();
		myLable_2.setBounds(154, 247, 57, 15);
		if(CurrentUser.getDom() == 1)
			 myLable_2.setText("개성재");
		else if(CurrentUser.getDom() == 2)
			 myLable_2.setText("계영원");
		else if(CurrentUser.getDom() == 3)
			 myLable_2.setText("양성재");
		else if(CurrentUser.getDom() == 4)
			 myLable_2.setText("양진재");
		else if(CurrentUser.getDom() == 5)
			 myLable_2.setText("양현재");
		else
			myLable_2.setText("정보 없음");
		contentPane.add(myLable_2);
		
		JLabel myLable_3 = new JLabel();
		myLable_3.setBounds(154, 272, 57, 15);
		myLable_3.setText(String.valueOf(CurrentUser.getAge()));
		contentPane.add(myLable_3);
		
		JLabel myLable_4 = new JLabel();
		myLable_4.setBounds(154, 297, 57, 15);
		myLable_4.setText(String.valueOf(CurrentUser.getHakbun()));
		contentPane.add(myLable_4);
		
		JLabel myLable_5 = new JLabel();
		if(CurrentUser.getDepartment() == 1)
			 myLable_5.setText("인문");
		else if(CurrentUser.getDepartment() == 2)
			 myLable_5.setText("사과");
		else if(CurrentUser.getDepartment() == 3)
			 myLable_5.setText("자과");
		else if(CurrentUser.getDepartment() == 4)
			 myLable_5.setText("경영");
		else if(CurrentUser.getDepartment() == 5)
			 myLable_5.setText("공과");
		else if(CurrentUser.getDepartment() == 6)
			 myLable_5.setText("전정");
		else if(CurrentUser.getDepartment() == 7)
			 myLable_5.setText("농생");
		else if(CurrentUser.getDepartment() == 8)
			 myLable_5.setText("사범");
		else if(CurrentUser.getDepartment() == 9)
			 myLable_5.setText("생과");
		else if(CurrentUser.getDepartment() == 10)
			 myLable_5.setText("수의과");
		else if(CurrentUser.getDepartment() == 11)
			 myLable_5.setText("의과");
		else if(CurrentUser.getDepartment() == 12)
			 myLable_5.setText("자율");
		else
			myLable_5.setText("정보 없음");
		myLable_5.setBounds(154, 322, 57, 15);
		contentPane.add(myLable_5);
		
		JLabel myLable_6 = new JLabel();
		if(CurrentUser.getSleep() == 1)
			 myLable_6.setText("10시");
		else if(CurrentUser.getSleep() == 2)
			 myLable_6.setText("11시");
		else if(CurrentUser.getSleep() == 3)
			 myLable_6.setText("12시");
		else if(CurrentUser.getSleep() == 4)
			 myLable_6.setText("1시");
		else if(CurrentUser.getSleep() == 5)
			 myLable_6.setText("2시");
		else if(CurrentUser.getSleep() == 6)
			 myLable_6.setText("3시 이후");
		else
			myLable_6.setText("정보 없음");
		myLable_6.setBounds(154, 347, 57, 15);
		contentPane.add(myLable_6);
		
		JLabel myLable_7 = new JLabel();
		if(CurrentUser.getWake() == 1)
			 myLable_7.setText("7시");
		else if(CurrentUser.getWake() == 2)
			 myLable_7.setText("8시");
		else if(CurrentUser.getWake() == 3)
			 myLable_7.setText("9시");
		else if(CurrentUser.getWake() == 4)
			 myLable_7.setText("10시");
		else if(CurrentUser.getWake() == 5)
			 myLable_7.setText("11시");
		else if(CurrentUser.getWake() == 6)
			 myLable_7.setText("오후");
		else
			myLable_7.setText("정보 없음");
		myLable_7.setBounds(154, 376, 57, 15);
		contentPane.add(myLable_7);
		
		JLabel myLable_8 = new JLabel();
		if(CurrentUser.getShowertime() == 1)
			 myLable_8.setText("5분");
		else if(CurrentUser.getShowertime() == 2)
			 myLable_8.setText("10분");
		else if(CurrentUser.getShowertime() == 3)
			 myLable_8.setText("15분");
		else if(CurrentUser.getShowertime() == 4)
			 myLable_8.setText("20분");
		else if(CurrentUser.getShowertime() == 5)
			 myLable_8.setText("25분");
		else if(CurrentUser.getShowertime() == 6)
			 myLable_8.setText("30분");
		else
			myLable_8.setText("정보 없음");
		myLable_8.setBounds(154, 401, 57, 15);
		contentPane.add(myLable_8);
		
		JLabel myLable_9 = new JLabel();
		if(CurrentUser.getWhenshower() == 1)
			 myLable_9.setText("아침");
		else if(CurrentUser.getWhenshower() == 2)
			 myLable_9.setText("저녁");
		else if(CurrentUser.getWhenshower() == 3)
			 myLable_9.setText("유동적");
		else
			myLable_9.setText("정보 없음");
		myLable_9.setBounds(154, 426, 57, 15);
		contentPane.add(myLable_9);
		
		JLabel myLable_10 = new JLabel();
		if(CurrentUser.getSensitives() == 1)
			 myLable_10.setText("어두움");
		else if(CurrentUser.getSensitives() == 2)
			 myLable_10.setText("보통");
		else if(CurrentUser.getSensitives() == 3)
			 myLable_10.setText("밝음");
		else
			myLable_10.setText("정보 없음");
		myLable_10.setBounds(154, 451, 57, 15);
		contentPane.add(myLable_10);
		
		JLabel myLable_11 = new JLabel();
		if(CurrentUser.getJamb1() == 1)
			temp = "이갈이";
		if(CurrentUser.getJamb2() == 1) {
			if(temp != null)
				temp += ", ";
			temp += "잠꼬대";
		}
		if(CurrentUser.getJamb3() == 1) {
			if(temp != null)
				temp += ", ";
			temp += "코골이";
		}
		myLable_11.setText(temp);
		myLable_11.setBounds(331, 222, 57, 15);
		contentPane.add(myLable_11);
		
		JLabel myLable_12 = new JLabel();
		if(CurrentUser.getSleeplight() == 1)
			 myLable_12.setText("사용안함");
		else if(CurrentUser.getSleeplight() == 2)
			 myLable_12.setText("형광등");
		else if(CurrentUser.getSleeplight() == 3)
			 myLable_12.setText("스탠드");
		else if(CurrentUser.getSleeplight() == 4)
			 myLable_12.setText("무드등");
		else
			myLable_12.setText("정보 없음");
		myLable_12.setBounds(331, 247, 57, 15);
		contentPane.add(myLable_12);
		
		JLabel myLable_13 = new JLabel();
		if(CurrentUser.getAlarmhear() == 1)
			myLable_13.setText("못들어요");
		else if(CurrentUser.getAlarmhear() == 2)
			myLable_13.setText("중간");
		else if(CurrentUser.getAlarmhear() == 3)
			myLable_13.setText("잘들어요");
		else
			myLable_13.setText("정보 없음");
		myLable_13.setBounds(331, 272, 57, 15);
		contentPane.add(myLable_13);
		
		JLabel myLable_14 = new JLabel();
		if(CurrentUser.getClean() == 1)
			myLable_14.setText("자주");
		else if(CurrentUser.getClean() == 2)
			myLable_14.setText("보통");
		else if(CurrentUser.getClean() == 3)
			myLable_14.setText("한번에");
		else
			myLable_14.setText("정보 없음");
		myLable_14.setBounds(331, 297, 57, 15);
		contentPane.add(myLable_14);
		
		JLabel myLable_15 = new JLabel();
		if(CurrentUser.getClean() == 1)
			myLable_15.setText("자주");
		else if(CurrentUser.getClean() == 2)
			myLable_15.setText("보통");
		else if(CurrentUser.getClean() == 3)
			myLable_15.setText("한번에");
		else
			myLable_15.setText("정보 없음");
		myLable_15.setBounds(331, 322, 57, 15);
		contentPane.add(myLable_15);
		
		JLabel myLable_16 = new JLabel("New label");
		if(CurrentUser.getHeat() == 1)
			myLable_16.setText("적게탐");
		else if(CurrentUser.getHeat() == 2)
			myLable_16.setText("보통");
		else if(CurrentUser.getHeat() == 3)
			myLable_16.setText("많이탐");
		else
			myLable_16.setText("정보 없음");
		myLable_16.setBounds(331, 347, 57, 15);
		contentPane.add(myLable_16);
		
		JLabel myLable_17 = new JLabel("New label");
		if(CurrentUser.getCold() == 1)
			myLable_17.setText("적게탐");
		else if(CurrentUser.getCold() == 2)
			myLable_17.setText("보통");
		else if(CurrentUser.getCold() == 3)
			myLable_17.setText("많이탐");
		else
			myLable_17.setText("정보 없음");
		myLable_17.setBounds(331, 376, 57, 15);
		contentPane.add(myLable_17);
		
		JLabel myLable_18 = new JLabel("New label");
		if(CurrentUser.getCold() == 1)
			myLable_18.setText("이어폰");
		else if(CurrentUser.getCold() == 2)
			myLable_18.setText("스피커");
		else if(CurrentUser.getCold() == 3)
			myLable_18.setText("유동적");
		else
			myLable_18.setText("정보 없음");
		myLable_18.setBounds(331, 401, 57, 15);
		contentPane.add(myLable_18);
		
		JLabel myLable_19 = new JLabel("New label");
		if(CurrentUser.getSmoking() == 1)
			 myLable_19.setText("흡연");
		else if(CurrentUser.getSmoking() == 2)
			 myLable_19.setText("비흡연");
		else
			myLable_19.setText("정보 없음");
		myLable_19.setBounds(331, 426, 57, 15);
		contentPane.add(myLable_19);
		
		JLabel myLable_20 = new JLabel("New label");
		if(CurrentUser.getSilnaecall() == 1)
			myLable_20.setText("반대");
		else if(CurrentUser.getSilnaecall() == 2)
			myLable_20.setText("상관없음");
		else if(CurrentUser.getSilnaecall() == 3)
			myLable_20.setText("찬성");
		else if(CurrentUser.getSilnaecall() == 4)
			myLable_20.setText("간단한 용무만");
		else
			myLable_20.setText("정보 없음");
		myLable_20.setBounds(331, 451, 57, 15);
		contentPane.add(myLable_20);
		
		JLabel myLable_21 = new JLabel("New label");
		if(CurrentUser.getFriendinvite() == 1)
			 myLable_21.setText("찬성");
		else if(CurrentUser.getFriendinvite() == 2)
			 myLable_21.setText("반대");
		else
			myLable_21.setText("정보 없음");
		myLable_21.setBounds(430, 222, 57, 15);
		contentPane.add(myLable_21);
		
		JLabel myLable_22 = new JLabel("New label");
		if(CurrentUser.getEatbob() == 1)
			 myLable_22.setText("같이");
		else if(CurrentUser.getEatbob() == 2)
			 myLable_22.setText("따로");
		else
			myLable_22.setText("정보 없음");
		myLable_22.setBounds(430, 247, 57, 15);
		contentPane.add(myLable_22);
		
		JLabel myLable_23 = new JLabel("New label");
		if(CurrentUser.getStudytype() == 1)
			myLable_23.setText("기숙사");
		else if(CurrentUser.getStudytype() == 2)
			myLable_23.setText("도서관");
		else if(CurrentUser.getStudytype() == 3)
			myLable_23.setText("유동적");
		else
			myLable_23.setText("정보 없음");
		myLable_23.setBounds(430, 272, 57, 15);
		contentPane.add(myLable_23);
		
		JLabel myLable_24 = new JLabel("New label");
		myLable_24.setBounds(430, 297, 57, 15);
		contentPane.add(myLable_24);
		
		JLabel myLable_25 = new JLabel("New label");
		myLable_25.setBounds(430, 322, 57, 15);
		contentPane.add(myLable_25);
		
		JLabel myLable_26 = new JLabel("New label");
		myLable_26.setBounds(430, 347, 57, 15);
		contentPane.add(myLable_26);
		
		JLabel myLable_27 = new JLabel("New label");
		myLable_27.setBounds(554, 197, 57, 15);
		contentPane.add(myLable_27);
		
		JLabel myLable_28 = new JLabel("New label");
		myLable_28.setBounds(554, 222, 57, 15);
		contentPane.add(myLable_28);
		
		JLabel myLable_29 = new JLabel("New label");
		myLable_29.setBounds(554, 247, 57, 15);
		contentPane.add(myLable_29);
		
		JLabel myLable_30 = new JLabel("New label");
		myLable_30.setBounds(554, 272, 57, 15);
		contentPane.add(myLable_30);
		
		JLabel myLable_31 = new JLabel("New label");
		myLable_31.setBounds(554, 297, 57, 15);
		contentPane.add(myLable_31);
		
		JLabel myLable_32 = new JLabel("New label");
		myLable_32.setBounds(554, 322, 57, 15);
		contentPane.add(myLable_32);
		
		JLabel myLable_33 = new JLabel("New label");
		myLable_33.setBounds(554, 347, 57, 15);
		contentPane.add(myLable_33);
		
		JLabel myLable_34 = new JLabel("New label");
		myLable_34.setBounds(554, 376, 57, 15);
		contentPane.add(myLable_34);
	}
}