package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import java.awt.Toolkit;

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
		String temp = "없음";
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(uploadMyroomUI.class.getResource("/Project/searchH.png")));
		setTitle("니방내방 - 내방 소개하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1600, 900);
		setResizable(false);
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
		
		JPanel pointPanel = new JPanel();
		pointPanel.setBackground(new Color(0, 102, 102));
		pointPanel.setForeground(new Color(0, 102, 102));
		pointPanel.setBounds(512, 87, 175, 10);
		contentPane.add(pointPanel);

		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(0, 96, 1600, 1);
		contentPane.add(line1);

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
		line2_1.setBounds(80, 230, 1400, 1);
		contentPane.add(line2_1);

		JPanel line2_2 = new JPanel();
		line2_2.setBackground(Color.LIGHT_GRAY);
		line2_2.setBounds(80, 700, 1400, 1);
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
		movePage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainBoardUI gui = new MainBoardUI();
				setVisible(false);
			}
		});
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
		moveMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mailInboxUI m;
				try {
					m = new mailInboxUI();
					m.setVisible(true);
					setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		moveMail.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/mail.png")));
		moveMail.setBounds(1490, 20, 75, 60);
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		contentPane.add(moveMail);

		JButton checkButton = new JButton(" 수정하기");
		checkButton.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/pencil.png")));
		checkButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomCheck r = new roomCheck();
				r.setVisible(true);
				setVisible(false);
			}
		});
		checkButton.setBounds(585, 750, 178, 60);
		checkButton.setFocusPainted(false);
		checkButton.setContentAreaFilled(false);
		checkButton.setBorderPainted(false);
		contentPane.add(checkButton);

		JButton uploadButton = new JButton(" 업로드하기");
		uploadButton.setEnabled(false);
		uploadButton.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/upload.png")));
		uploadButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		uploadButton.setBounds(810, 750, 210, 60);
		uploadButton.setFocusPainted(false);
		uploadButton.setContentAreaFilled(false);
		uploadButton.setBorderPainted(false);
		contentPane.add(uploadButton);

		JLabel nameLabel = new JLabel();
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/personn.png")));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);

		JLabel infoLabel1 = new JLabel("내방 현황");
		infoLabel1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel1.setBounds(80, 150, 160, 80);
		contentPane.add(infoLabel1);

		JLabel myLable_1 = new JLabel();
		myLable_1.setForeground(new Color(0, 102, 102));
		myLable_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_1.setBounds(270, 270, 160, 40);
		if (CurrentUser.getGender() == 1)
			myLable_1.setText("남자");
		else if (CurrentUser.getGender() == 2)
			myLable_1.setText("여자");
		else
			myLable_1.setText("정보 없음");
		contentPane.add(myLable_1);

		JLabel myLable_2 = new JLabel();
		myLable_2.setForeground(new Color(0, 102, 102));
		myLable_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_2.setBounds(270, 320, 160, 40);
		if (CurrentUser.getDom() == 1)
			myLable_2.setText("개성재");
		else if (CurrentUser.getDom() == 2)
			myLable_2.setText("계영원");
		else if (CurrentUser.getDom() == 3)
			myLable_2.setText("양성재");
		else if (CurrentUser.getDom() == 4)
			myLable_2.setText("양진재");
		else if (CurrentUser.getDom() == 5)
			myLable_2.setText("양현재");
		else
			myLable_2.setText("정보 없음");
		contentPane.add(myLable_2);

		JLabel myLable_3 = new JLabel();
		myLable_3.setForeground(new Color(0, 102, 102));
		myLable_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_3.setBounds(270, 370, 160, 40);
		myLable_3.setText(String.valueOf(CurrentUser.getAge()));
		contentPane.add(myLable_3);

		JLabel myLable_4 = new JLabel();
		myLable_4.setForeground(new Color(0, 102, 102));
		myLable_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_4.setBounds(270, 420, 160, 40);
		myLable_4.setText(String.valueOf(CurrentUser.getHakbun()));
		contentPane.add(myLable_4);

		JLabel myLable_5 = new JLabel();
		myLable_5.setForeground(new Color(0, 102, 102));
		myLable_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getDepartment() == 1)
			myLable_5.setText("인문");
		else if (CurrentUser.getDepartment() == 2)
			myLable_5.setText("사과");
		else if (CurrentUser.getDepartment() == 3)
			myLable_5.setText("자과");
		else if (CurrentUser.getDepartment() == 4)
			myLable_5.setText("경영");
		else if (CurrentUser.getDepartment() == 5)
			myLable_5.setText("공과");
		else if (CurrentUser.getDepartment() == 6)
			myLable_5.setText("전정");
		else if (CurrentUser.getDepartment() == 7)
			myLable_5.setText("농생");
		else if (CurrentUser.getDepartment() == 8)
			myLable_5.setText("사범");
		else if (CurrentUser.getDepartment() == 9)
			myLable_5.setText("생과");
		else if (CurrentUser.getDepartment() == 10)
			myLable_5.setText("수의과");
		else if (CurrentUser.getDepartment() == 11)
			myLable_5.setText("의과");
		else if (CurrentUser.getDepartment() == 12)
			myLable_5.setText("자율");
		else
			myLable_5.setText("정보 없음");
		myLable_5.setBounds(270, 470, 160, 40);
		contentPane.add(myLable_5);

		JLabel myLable_6 = new JLabel();
		myLable_6.setForeground(new Color(0, 102, 102));
		myLable_6.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSleep() == 1)
			myLable_6.setText("10시");
		else if (CurrentUser.getSleep() == 2)
			myLable_6.setText("11시");
		else if (CurrentUser.getSleep() == 3)
			myLable_6.setText("12시");
		else if (CurrentUser.getSleep() == 4)
			myLable_6.setText("1시");
		else if (CurrentUser.getSleep() == 5)
			myLable_6.setText("2시");
		else if (CurrentUser.getSleep() == 6)
			myLable_6.setText("3시 이후");
		else
			myLable_6.setText("정보 없음");
		myLable_6.setBounds(270, 520, 160, 40);
		contentPane.add(myLable_6);

		JLabel myLable_7 = new JLabel();
		myLable_7.setForeground(new Color(0, 102, 102));
		myLable_7.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getWake() == 1)
			myLable_7.setText("7시");
		else if (CurrentUser.getWake() == 2)
			myLable_7.setText("8시");
		else if (CurrentUser.getWake() == 3)
			myLable_7.setText("9시");
		else if (CurrentUser.getWake() == 4)
			myLable_7.setText("10시");
		else if (CurrentUser.getWake() == 5)
			myLable_7.setText("11시");
		else if (CurrentUser.getWake() == 6)
			myLable_7.setText("오후");
		else
			myLable_7.setText("정보 없음");
		myLable_7.setBounds(270, 570, 160, 40);
		contentPane.add(myLable_7);

		JLabel myLable_8 = new JLabel();
		myLable_8.setForeground(new Color(0, 102, 102));
		myLable_8.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getShowertime() == 1)
			myLable_8.setText("5분");
		else if (CurrentUser.getShowertime() == 2)
			myLable_8.setText("10분");
		else if (CurrentUser.getShowertime() == 3)
			myLable_8.setText("15분");
		else if (CurrentUser.getShowertime() == 4)
			myLable_8.setText("20분");
		else if (CurrentUser.getShowertime() == 5)
			myLable_8.setText("25분");
		else if (CurrentUser.getShowertime() == 6)
			myLable_8.setText("30분 이상");
		else
			myLable_8.setText("정보 없음");
		myLable_8.setBounds(270, 620, 160, 40);
		contentPane.add(myLable_8);

		JLabel myLable_9 = new JLabel();
		myLable_9.setForeground(new Color(0, 102, 102));
		myLable_9.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getWhenshower() == 1)
			myLable_9.setText("아침");
		else if (CurrentUser.getWhenshower() == 2)
			myLable_9.setText("저녁");
		else if (CurrentUser.getWhenshower() == 3)
			myLable_9.setText("유동적");
		else
			myLable_9.setText("정보 없음");
		myLable_9.setBounds(610, 270, 160, 40);
		contentPane.add(myLable_9);

		JLabel myLable_10 = new JLabel();
		myLable_10.setForeground(new Color(0, 102, 102));
		myLable_10.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSensitives() == 1)
			myLable_10.setText("어두움");
		else if (CurrentUser.getSensitives() == 2)
			myLable_10.setText("보통");
		else if (CurrentUser.getSensitives() == 3)
			myLable_10.setText("밝음");
		else
			myLable_10.setText("정보 없음");
		myLable_10.setBounds(610, 320, 160, 40);
		contentPane.add(myLable_10);

		JLabel myLable_11 = new JLabel();
		myLable_11.setForeground(new Color(0, 102, 102));
		myLable_11.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getJamb1() != 0 || CurrentUser.getJamb2() != 0 || CurrentUser.getJamb3() != 0) {
			temp = "";

			if (CurrentUser.getJamb1() == 1)
				temp += "이갈이";
			if (CurrentUser.getJamb2() == 1) {
				if (temp != "")
					temp += ", ";
				temp += "잠꼬대";
			}
			if (CurrentUser.getJamb3() == 1) {
				if (temp != "")
					temp += ", ";
				temp += "코골이";
			}
		}
		myLable_11.setText(temp);
		myLable_11.setBounds(950, 520, 300, 40);
		contentPane.add(myLable_11);

		JLabel myLable_12 = new JLabel();
		myLable_12.setForeground(new Color(0, 102, 102));
		myLable_12.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSleeplight() == 1)
			myLable_12.setText("사용안함");
		else if (CurrentUser.getSleeplight() == 2)
			myLable_12.setText("형광등");
		else if (CurrentUser.getSleeplight() == 3)
			myLable_12.setText("스탠드");
		else if (CurrentUser.getSleeplight() == 4)
			myLable_12.setText("무드등");
		else
			myLable_12.setText("정보 없음");
		myLable_12.setBounds(610, 370, 160, 40);
		contentPane.add(myLable_12);

		JLabel myLable_13 = new JLabel();
		myLable_13.setForeground(new Color(0, 102, 102));
		myLable_13.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getAlarmhear() == 1)
			myLable_13.setText("못들어요");
		else if (CurrentUser.getAlarmhear() == 2)
			myLable_13.setText("중간");
		else if (CurrentUser.getAlarmhear() == 3)
			myLable_13.setText("잘들어요");
		else
			myLable_13.setText("정보 없음");
		myLable_13.setBounds(610, 420, 160, 40);
		contentPane.add(myLable_13);

		JLabel myLable_14 = new JLabel();
		myLable_14.setForeground(new Color(0, 102, 102));
		myLable_14.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getClean() == 1)
			myLable_14.setText("자주");
		else if (CurrentUser.getClean() == 2)
			myLable_14.setText("보통");
		else if (CurrentUser.getClean() == 3)
			myLable_14.setText("한번에");
		else
			myLable_14.setText("정보 없음");
		myLable_14.setBounds(610, 470, 160, 40);
		contentPane.add(myLable_14);

		JLabel myLable_16 = new JLabel();
		myLable_16.setForeground(new Color(0, 102, 102));
		myLable_16.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getHeat() == 1)
			myLable_16.setText("적게탐");
		else if (CurrentUser.getHeat() == 2)
			myLable_16.setText("보통");
		else if (CurrentUser.getHeat() == 3)
			myLable_16.setText("많이탐");
		else
			myLable_16.setText("정보 없음");
		myLable_16.setBounds(610, 520, 160, 40);
		contentPane.add(myLable_16);

		JLabel myLable_17 = new JLabel();
		myLable_17.setForeground(new Color(0, 102, 102));
		myLable_17.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getCold() == 1)
			myLable_17.setText("적게탐");
		else if (CurrentUser.getCold() == 2)
			myLable_17.setText("보통");
		else if (CurrentUser.getCold() == 3)
			myLable_17.setText("많이탐");
		else
			myLable_17.setText("정보 없음");
		myLable_17.setBounds(610, 570, 160, 40);
		contentPane.add(myLable_17);

		JLabel myLable_18 = new JLabel();
		myLable_18.setForeground(new Color(0, 102, 102));
		myLable_18.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSoundgigi() == 1)
			myLable_18.setText("이어폰");
		else if (CurrentUser.getSoundgigi() == 2)
			myLable_18.setText("스피커");
		else if (CurrentUser.getSoundgigi() == 3)
			myLable_18.setText("유동적");
		else
			myLable_18.setText("정보 없음");
		myLable_18.setBounds(610, 620, 160, 40);
		contentPane.add(myLable_18);

		JLabel myLable_19 = new JLabel();
		myLable_19.setForeground(new Color(0, 102, 102));
		myLable_19.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSmoking() == 1)
			myLable_19.setText("흡연");
		else if (CurrentUser.getSmoking() == 2)
			myLable_19.setText("비흡연");
		else
			myLable_19.setText("정보 없음");
		myLable_19.setBounds(950, 270, 160, 40);
		contentPane.add(myLable_19);

		JLabel myLable_20 = new JLabel();
		myLable_20.setForeground(new Color(0, 102, 102));
		myLable_20.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSilnaecall() == 1)
			myLable_20.setText("반대");
		else if (CurrentUser.getSilnaecall() == 2)
			myLable_20.setText("상관없음");
		else if (CurrentUser.getSilnaecall() == 3)
			myLable_20.setText("찬성");
		else if (CurrentUser.getSilnaecall() == 4)
			myLable_20.setText("간단한 용무만");
		else
			myLable_20.setText("정보 없음");
		myLable_20.setBounds(950, 570, 260, 40);
		contentPane.add(myLable_20);

		JLabel myLable_21 = new JLabel();
		myLable_21.setForeground(new Color(0, 102, 102));
		myLable_21.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getFriendinvite() == 1)
			myLable_21.setText("찬성");
		else if (CurrentUser.getFriendinvite() == 2)
			myLable_21.setText("반대");
		else
			myLable_21.setText("정보 없음");
		myLable_21.setBounds(950, 320, 160, 40);
		contentPane.add(myLable_21);

		JLabel myLable_22 = new JLabel();
		myLable_22.setForeground(new Color(0, 102, 102));
		myLable_22.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getEatbob() == 1)
			myLable_22.setText("같이");
		else if (CurrentUser.getEatbob() == 2)
			myLable_22.setText("따로");
		else
			myLable_22.setText("정보 없음");
		myLable_22.setBounds(950, 370, 160, 40);
		contentPane.add(myLable_22);

		JLabel myLable_23 = new JLabel();
		myLable_23.setForeground(new Color(0, 102, 102));
		myLable_23.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getStudytype() == 1)
			myLable_23.setText("기숙사");
		else if (CurrentUser.getStudytype() == 2)
			myLable_23.setText("도서관");
		else if (CurrentUser.getStudytype() == 3)
			myLable_23.setText("유동적");
		else
			myLable_23.setText("정보 없음");
		myLable_23.setBounds(950, 420, 160, 40);
		contentPane.add(myLable_23);

		JLabel myLable_24 = new JLabel();
		myLable_24.setForeground(new Color(0, 102, 102));
		myLable_24.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getPerfume() == 1)
			myLable_24.setText("미사용");
		else if (CurrentUser.getPerfume() == 2)
			myLable_24.setText("사용");
		else
			myLable_24.setText("정보 없음");
		myLable_24.setBounds(950, 470, 160, 40);
		contentPane.add(myLable_24);

		JLabel myLable_25 = new JLabel();
		myLable_25.setForeground(new Color(0, 102, 102));
		myLable_25.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSmellwell() == 1)
			myLable_25.setText("민감");
		else if (CurrentUser.getSmellwell() == 2)
			myLable_25.setText("상관없음");
		else
			myLable_25.setText("정보 없음");
		myLable_25.setBounds(1290, 420, 160, 40);
		contentPane.add(myLable_25);

		JLabel myLable_26 = new JLabel();
		myLable_26.setForeground(new Color(0, 102, 102));
		myLable_26.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getGame() == 1)
			myLable_26.setText("안함");
		else if (CurrentUser.getGame() == 2)
			myLable_26.setText("가끔");
		else if (CurrentUser.getGame() == 3)
			myLable_26.setText("자주");
		else
			myLable_26.setText("정보 없음");
		myLable_26.setBounds(1290, 270, 160, 40);
		contentPane.add(myLable_26);

		JLabel myLable_27 = new JLabel();
		myLable_27.setForeground(new Color(0, 102, 102));
		myLable_27.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getYasick() == 1)
			myLable_27.setText("안먹음");
		else if (CurrentUser.getYasick() == 2)
			myLable_27.setText("가끔먹음");
		else if (CurrentUser.getYasick() == 3)
			myLable_27.setText("자주먹음");
		else
			myLable_27.setText("정보 없음");
		myLable_27.setBounds(1290, 320, 160, 40);
		contentPane.add(myLable_27);

		JLabel myLable_28 = new JLabel();
		myLable_28.setForeground(new Color(0, 102, 102));
		myLable_28.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSool() == 1)
			myLable_28.setText("안마심");
		else if (CurrentUser.getSool() == 2)
			myLable_28.setText("가끔마심");
		else if (CurrentUser.getSool() == 3)
			myLable_28.setText("자주마심");
		else
			myLable_28.setText("정보 없음");
		myLable_28.setBounds(1290, 370, 160, 40);
		contentPane.add(myLable_28);

		JLabel myLable_29 = new JLabel();
		myLable_29.setForeground(new Color(0, 102, 102));
		myLable_29.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getSilnaeeat() == 1)
			myLable_29.setText("불가");
		else if (CurrentUser.getSilnaeeat() == 2)
			myLable_29.setText("냄새 안나는 음식만");
		else if (CurrentUser.getSilnaeeat() == 3)
			myLable_29.setText("가능");
		else
			myLable_29.setText("정보 없음");
		myLable_29.setBounds(950, 620, 260, 40);
		contentPane.add(myLable_29);

		JLabel myLable_30 = new JLabel();
		myLable_30.setForeground(new Color(0, 102, 102));
		myLable_30.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		if (CurrentUser.getInsect() == 1)
			myLable_30.setText("혐오");
		else if (CurrentUser.getInsect() == 2)
			myLable_30.setText("못잡음");
		else if (CurrentUser.getInsect() == 3)
			myLable_30.setText("중간");
		else if (CurrentUser.getInsect() == 4)
			myLable_30.setText("잡음");
		else if (CurrentUser.getInsect() == 5)
			myLable_30.setText("파브르");
		else
			myLable_30.setText("정보 없음");
		myLable_30.setBounds(1290, 470, 160, 40);
		contentPane.add(myLable_30);

		JLabel myLable_info_1 = new JLabel();
		myLable_info_1.setForeground(Color.BLACK);
		myLable_info_1.setText("성별");
		myLable_info_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_1.setBounds(100, 270, 120, 40);
		contentPane.add(myLable_info_1);

		JLabel myLable_info_2 = new JLabel();
		myLable_info_2.setForeground(Color.BLACK);
		myLable_info_2.setText("기숙사");
		myLable_info_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_2.setBounds(100, 320, 120, 40);
		contentPane.add(myLable_info_2);

		JLabel myLable_info_3 = new JLabel();
		myLable_info_3.setForeground(Color.BLACK);
		myLable_info_3.setText("학번");
		myLable_info_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_3.setBounds(100, 370, 120, 40);
		contentPane.add(myLable_info_3);

		JLabel myLable_info_4 = new JLabel();
		myLable_info_4.setForeground(Color.BLACK);
		myLable_info_4.setText("생년");
		myLable_info_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_4.setBounds(100, 420, 120, 40);
		contentPane.add(myLable_info_4);

		JLabel myLable_info_5 = new JLabel();
		myLable_info_5.setForeground(Color.BLACK);
		myLable_info_5.setText("단과");
		myLable_info_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_5.setBounds(100, 470, 120, 40);
		contentPane.add(myLable_info_5);

		JLabel myLable_info_6 = new JLabel();
		myLable_info_6.setForeground(Color.BLACK);
		myLable_info_6.setText("취침시간");
		myLable_info_6.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_6.setBounds(100, 520, 120, 40);
		contentPane.add(myLable_info_6);

		JLabel myLable_info_7 = new JLabel();
		myLable_info_7.setForeground(Color.BLACK);
		myLable_info_7.setText("기상시간");
		myLable_info_7.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_7.setBounds(100, 570, 120, 40);
		contentPane.add(myLable_info_7);

		JLabel myLable_info_8 = new JLabel();
		myLable_info_8.setForeground(Color.BLACK);
		myLable_info_8.setText("샤워소요시간");
		myLable_info_8.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_8.setBounds(100, 620, 160, 40);
		contentPane.add(myLable_info_8);

		JLabel myLable_info_9 = new JLabel();
		myLable_info_9.setForeground(Color.BLACK);
		myLable_info_9.setText("샤워시간");
		myLable_info_9.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_9.setBounds(440, 270, 160, 40);
		contentPane.add(myLable_info_9);

		JLabel myLable_info_10 = new JLabel();
		myLable_info_10.setForeground(Color.BLACK);
		myLable_info_10.setText("잠귀");
		myLable_info_10.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_10.setBounds(440, 320, 160, 40);
		contentPane.add(myLable_info_10);

		JLabel myLable_info_11 = new JLabel();
		myLable_info_11.setForeground(Color.BLACK);
		myLable_info_11.setText("잠버릇");
		myLable_info_11.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_11.setBounds(780, 520, 160, 40);
		contentPane.add(myLable_info_11);

		JLabel myLable_info_12 = new JLabel();
		myLable_info_12.setForeground(Color.BLACK);
		myLable_info_12.setText("수면등");
		myLable_info_12.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_12.setBounds(440, 370, 160, 40);
		contentPane.add(myLable_info_12);

		JLabel myLable_info_13 = new JLabel();
		myLable_info_13.setForeground(Color.BLACK);
		myLable_info_13.setText("알람");
		myLable_info_13.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_13.setBounds(440, 420, 160, 40);
		contentPane.add(myLable_info_13);

		JLabel myLable_info_14 = new JLabel();
		myLable_info_14.setForeground(Color.BLACK);
		myLable_info_14.setText("청소");
		myLable_info_14.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_14.setBounds(440, 470, 160, 40);
		contentPane.add(myLable_info_14);

		JLabel myLable_info_15 = new JLabel();
		myLable_info_15.setForeground(Color.BLACK);
		myLable_info_15.setText("더위");
		myLable_info_15.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_15.setBounds(440, 520, 160, 40);
		contentPane.add(myLable_info_15);

		JLabel myLable_info_16 = new JLabel();
		myLable_info_16.setForeground(Color.BLACK);
		myLable_info_16.setText("추위");
		myLable_info_16.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_16.setBounds(440, 570, 160, 40);
		contentPane.add(myLable_info_16);

		JLabel myLable_info_17 = new JLabel();
		myLable_info_17.setForeground(Color.BLACK);
		myLable_info_17.setText("소리");
		myLable_info_17.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_17.setBounds(440, 620, 160, 40);
		contentPane.add(myLable_info_17);

		JLabel myLable_info_18 = new JLabel();
		myLable_info_18.setForeground(Color.BLACK);
		myLable_info_18.setText("흡연여부");
		myLable_info_18.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_18.setBounds(780, 270, 160, 40);
		contentPane.add(myLable_info_18);

		JLabel myLable_info_19 = new JLabel();
		myLable_info_19.setForeground(Color.BLACK);
		myLable_info_19.setText("실내통화");
		myLable_info_19.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_19.setBounds(780, 570, 160, 40);
		contentPane.add(myLable_info_19);

		JLabel myLable_info_20 = new JLabel();
		myLable_info_20.setForeground(Color.BLACK);
		myLable_info_20.setText("친구초대");
		myLable_info_20.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_20.setBounds(780, 320, 160, 40);
		contentPane.add(myLable_info_20);

		JLabel myLable_info_21 = new JLabel();
		myLable_info_21.setForeground(Color.BLACK);
		myLable_info_21.setText("기숙사식");
		myLable_info_21.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_21.setBounds(780, 370, 160, 40);
		contentPane.add(myLable_info_21);

		JLabel myLable_info_22 = new JLabel();
		myLable_info_22.setForeground(Color.BLACK);
		myLable_info_22.setText("공부");
		myLable_info_22.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_22.setBounds(780, 420, 160, 40);
		contentPane.add(myLable_info_22);

		JLabel myLable_info_23 = new JLabel();
		myLable_info_23.setForeground(Color.BLACK);
		myLable_info_23.setText("향수");
		myLable_info_23.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_23.setBounds(780, 470, 160, 40);
		contentPane.add(myLable_info_23);

		JLabel myLable_info_24 = new JLabel();
		myLable_info_24.setForeground(Color.BLACK);
		myLable_info_24.setText("향 민감도");
		myLable_info_24.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_24.setBounds(1120, 420, 160, 40);
		contentPane.add(myLable_info_24);

		JLabel myLable_info_25 = new JLabel();
		myLable_info_25.setForeground(Color.BLACK);
		myLable_info_25.setText("컴퓨터 게임");
		myLable_info_25.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_25.setBounds(1120, 270, 160, 40);
		contentPane.add(myLable_info_25);

		JLabel myLable_info_26 = new JLabel();
		myLable_info_26.setForeground(Color.BLACK);
		myLable_info_26.setText("야식");
		myLable_info_26.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_26.setBounds(1120, 320, 160, 40);
		contentPane.add(myLable_info_26);

		JLabel myLable_info_27 = new JLabel();
		myLable_info_27.setForeground(Color.BLACK);
		myLable_info_27.setText("술");
		myLable_info_27.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_27.setBounds(1120, 370, 160, 40);
		contentPane.add(myLable_info_27);

		JLabel myLable_info_28 = new JLabel();
		myLable_info_28.setForeground(Color.BLACK);
		myLable_info_28.setText("실내취식");
		myLable_info_28.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_28.setBounds(780, 620, 160, 40);
		contentPane.add(myLable_info_28);

		JLabel myLable_info_29 = new JLabel();
		myLable_info_29.setForeground(Color.BLACK);
		myLable_info_29.setText("벌레");
		myLable_info_29.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		myLable_info_29.setBounds(1120, 470, 160, 40);
		contentPane.add(myLable_info_29);
	}
}