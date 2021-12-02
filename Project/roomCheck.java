package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.ScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class roomCheck extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private JTextField textField3_1;
	private JTextField textField3_2;
	private final ButtonGroup buttonGroup3 = new ButtonGroup();
	private final ButtonGroup buttonGroup4 = new ButtonGroup();
	private final ButtonGroup buttonGroup5 = new ButtonGroup();
	private final ButtonGroup buttonGroup6 = new ButtonGroup();
	private final ButtonGroup buttonGroup7 = new ButtonGroup();
	private final ButtonGroup buttonGroup8 = new ButtonGroup();
	private final ButtonGroup buttonGroup9 = new ButtonGroup();
	private final ButtonGroup buttonGroup10 = new ButtonGroup();
	private final ButtonGroup buttonGroup11 = new ButtonGroup();
	private final ButtonGroup buttonGroup12 = new ButtonGroup();
	private final ButtonGroup buttonGroup13 = new ButtonGroup();
	private final ButtonGroup buttonGroup14 = new ButtonGroup();
	private final ButtonGroup buttonGroup15 = new ButtonGroup();
	private final ButtonGroup buttonGroup16 = new ButtonGroup();
	private final ButtonGroup buttonGroup17 = new ButtonGroup();
	private final ButtonGroup buttonGroup18 = new ButtonGroup();
	private final ButtonGroup buttonGroup19 = new ButtonGroup();
	private final ButtonGroup buttonGroup20 = new ButtonGroup();
	private final ButtonGroup buttonGroup21 = new ButtonGroup();
	private final ButtonGroup buttonGroup22 = new ButtonGroup();
	private final ButtonGroup buttonGroup23 = new ButtonGroup();
	private final ButtonGroup buttonGroup24 = new ButtonGroup();
	private final ButtonGroup buttonGroup25 = new ButtonGroup();
	private final ButtonGroup buttonGroup26 = new ButtonGroup();

	private int gender;
	private int dom;
	private int hakbun;
	private int age;
	private int department;
	private int sleep;
	private int wake;

	private int showertime;
	private int whenshower;
	private int sensitives;
	private int jamb1;
	private int jamb2;
	private int jamb3;
	private int sleeplight;
	private int alarmhear;
	private int clean;
	private int heat;
	private int cold;
	private int soundgigi;
	private int smoking;
	private int silnaecall;
	private int friendinvite;
	private int eatbob;
	private int studytype;
	private int perfume;
	private int smellwell;
	private int game;
	private int yasick;
	private int sool;
	private int silnaeeat;
	private int insect;

	ModFunctions m = new ModFunctions();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roomCheck frame = new roomCheck();
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
	public roomCheck() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(roomCheck.class.getResource("/Project/searchH.png")));
		setTitle("\uB2C8\uBC29\uB0B4\uBC29 - \uB0B4\uBC29 \uC810\uAC80\uD558\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel0 = new JPanel();
		panel0.setBackground(Color.WHITE);
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.WHITE);
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.WHITE);
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.WHITE);
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.WHITE);
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.WHITE);
		JPanel panel10 = new JPanel();
		panel10.setBackground(Color.WHITE);
		JPanel panel11 = new JPanel();
		panel11.setBackground(Color.WHITE);
		JPanel panel12 = new JPanel();
		panel12.setBackground(Color.WHITE);
		JPanel panel13 = new JPanel();
		panel13.setBackground(Color.WHITE);
		JPanel panel14 = new JPanel();
		panel14.setBackground(Color.WHITE);
		JPanel panel15 = new JPanel();
		panel15.setBackground(Color.WHITE);
		JPanel panel16 = new JPanel();
		panel16.setBackground(Color.WHITE);
		JPanel panel17 = new JPanel();
		panel17.setBackground(Color.WHITE);
		JPanel panel18 = new JPanel();
		panel18.setBackground(Color.WHITE);
		JPanel panel19 = new JPanel();
		panel19.setBackground(Color.WHITE);
		JPanel panel20 = new JPanel();
		panel20.setBackground(Color.WHITE);
		JPanel panel21 = new JPanel();
		panel21.setBackground(Color.WHITE);
		JPanel panel22 = new JPanel();
		panel22.setBackground(Color.WHITE);
		JPanel panel23 = new JPanel();
		panel23.setBackground(Color.WHITE);
		JPanel panel24 = new JPanel();
		panel24.setBackground(Color.WHITE);
		JPanel panel25 = new JPanel();
		panel25.setBackground(Color.WHITE);
		JPanel panel26 = new JPanel();
		panel26.setBackground(Color.WHITE);
		JPanel panel27 = new JPanel();
		panel27.setBackground(Color.WHITE);
		JPanel panel28 = new JPanel();
		panel28.setBackground(Color.WHITE);

		panel1.setVisible(false);
		panel2.setVisible(false);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel5.setVisible(false);
		panel6.setVisible(false);
		panel7.setVisible(false);
		panel8.setVisible(false);
		panel9.setVisible(false);
		panel10.setVisible(false);
		panel11.setVisible(false);
		panel12.setVisible(false);
		panel13.setVisible(false);
		panel14.setVisible(false);
		panel15.setVisible(false);
		panel16.setVisible(false);
		panel17.setVisible(false);
		panel18.setVisible(false);
		panel19.setVisible(false);
		panel20.setVisible(false);
		panel21.setVisible(false);
		panel22.setVisible(false);
		panel23.setVisible(false);
		panel24.setVisible(false);
		panel25.setVisible(false);
		panel26.setVisible(false);
		panel27.setVisible(false);
		panel28.setVisible(false);

		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);

		JLabel nameLabel = new JLabel();
		nameLabel.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/personn.png")));
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);

		JButton movePage1 = new JButton("내방 점검하기");
		movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage1.setFocusPainted(false);
		movePage1.setContentAreaFilled(false);
		movePage1.setBorderPainted(false);
		movePage1.setBackground(Color.BLUE);
		movePage1.setBounds(300, 20, 200, 60);
		contentPane.add(movePage1);

		JButton movePage4 = new JButton("내방 소개하기");
		movePage4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uploadMyroomUI u = new uploadMyroomUI();
				u.setVisible(true);
				setVisible(false);
			}
		});
		movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage4.setFocusPainted(false);
		movePage4.setContentAreaFilled(false);
		movePage4.setBorderPainted(false);
		movePage4.setBackground(Color.LIGHT_GRAY);
		movePage4.setBounds(500, 20, 200, 60);
		contentPane.add(movePage4);

		JButton movePage3 = new JButton("니방 찾아보기");
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setFocusPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setBorderPainted(false);
		movePage3.setBackground(Color.LIGHT_GRAY);
		movePage3.setBounds(900, 20, 200, 60);
		contentPane.add(movePage3);

		JButton movePage2 = new JButton("니방 랜덤매칭");
		movePage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomMatching r = new randomMatching();
				r.setVisible(true);
				setVisible(false);
			}
		});
		movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage2.setFocusPainted(false);
		movePage2.setContentAreaFilled(false);
		movePage2.setBorderPainted(false);
		movePage2.setBackground(Color.LIGHT_GRAY);
		movePage2.setBounds(700, 20, 200, 60);
		contentPane.add(movePage2);

		JButton moveMail = new JButton();
		moveMail.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/mail.png")));
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		moveMail.setBounds(1490, 20, 75, 60);
		contentPane.add(moveMail);

		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(0, 96, 1600, 1);
		contentPane.add(line1);

		panel0.setLayout(null);
		panel0.setBackground(Color.WHITE);
		panel0.setBounds(145, 290, 1000, 500);
		contentPane.add(panel0);

		JButton btn0_1 = new JButton(" 점검시작");
		btn0_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn0_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel0.setVisible(false);
				panel1.setVisible(true);
			}
		});
		btn0_1.setBounds(547, 450, 200, 60);
		btn0_1.setFocusPainted(false);
		btn0_1.setContentAreaFilled(false);
		btn0_1.setBorderPainted(false);
		panel0.add(btn0_1);

		JLabel Label0_1 = new JLabel("룸메이트들에게 소개할 내방 상태를 점검해볼까요?");
		Label0_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label0_1.setBounds(10, 10, 900, 60);
		panel0.add(Label0_1);

		panel1.setBounds(145, 290, 1000, 500);
		contentPane.add(panel1);
		panel1.setLayout(null);

		JButton btn1_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn1_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn1_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn1_1.setFocusPainted(false);
		btn1_1.setContentAreaFilled(false);
		btn1_1.setBorderPainted(false);
		btn1_1.setBounds(547, 450, 200, 60);
		panel1.add(btn1_1);

		JLabel Label1_1 = new JLabel("Q1. 성별");
		Label1_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label1_1.setBounds(10, 10, 195, 60);
		panel1.add(Label1_1);

		JRadioButton rdbtn1_1 = new JRadioButton(" 남자");
		rdbtn1_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn1_1.setBackground(Color.WHITE);
		buttonGroup1.add(rdbtn1_1);
		rdbtn1_1.setBounds(170, 120, 160, 60);
		panel1.add(rdbtn1_1);

		JRadioButton rdbtn1_2 = new JRadioButton(" 여자");
		rdbtn1_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn1_2.setBackground(Color.WHITE);
		buttonGroup1.add(rdbtn1_2);
		rdbtn1_2.setBounds(370, 120, 160, 60);
		panel1.add(rdbtn1_2);

		panel2.setLayout(null);
		panel2.setBounds(145, 290, 1000, 500);
		contentPane.add(panel2);

		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn1_1.isSelected()) {
					gender = 1;
				} else if (rdbtn1_2.isSelected()) {
					gender = 2;
				} else {
					gender = -1;
				}
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
		});
		JButton btn2_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn2_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn2_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn2_1.setFocusPainted(false);
		btn2_1.setContentAreaFilled(false);
		btn2_1.setBorderPainted(false);
		btn2_1.setBounds(547, 450, 200, 60);
		panel2.add(btn2_1);

		JLabel Label2_1 = new JLabel("Q2. 기숙사");
		Label2_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label2_1.setBounds(10, 10, 210, 60);
		panel2.add(Label2_1);

		JRadioButton rdbtn2_1 = new JRadioButton(" 개성재");
		rdbtn2_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn2_1.setBackground(Color.WHITE);
		buttonGroup2.add(rdbtn2_1);
		rdbtn2_1.setBounds(170, 120, 160, 60);
		panel2.add(rdbtn2_1);

		JRadioButton rdbtn2_2 = new JRadioButton(" 계영원");
		rdbtn2_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn2_2.setBackground(Color.WHITE);
		buttonGroup2.add(rdbtn2_2);
		rdbtn2_2.setBounds(370, 120, 160, 60);
		panel2.add(rdbtn2_2);

		JRadioButton rdbtn2_3 = new JRadioButton(" 양성재");
		rdbtn2_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn2_3.setBackground(Color.WHITE);
		buttonGroup2.add(rdbtn2_3);
		rdbtn2_3.setBounds(570, 120, 160, 60);
		panel2.add(rdbtn2_3);

		JRadioButton rdbtn2_4 = new JRadioButton(" 양진재");
		rdbtn2_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn2_4.setBackground(Color.WHITE);
		buttonGroup2.add(rdbtn2_4);
		rdbtn2_4.setBounds(170, 240, 160, 60);
		panel2.add(rdbtn2_4);

		JRadioButton rdbtn2_5 = new JRadioButton(" 양현재");
		rdbtn2_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn2_5.setBackground(Color.WHITE);
		buttonGroup2.add(rdbtn2_5);
		rdbtn2_5.setBounds(370, 240, 160, 60);
		panel2.add(rdbtn2_5);

		panel3.setLayout(null);
		panel3.setBounds(145, 290, 1100, 500);
		contentPane.add(panel3);

		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn2_1.isSelected()) {
					dom = 1;
				} else if (rdbtn2_2.isSelected()) {
					dom = 2;
				} else if (rdbtn2_3.isSelected()) {
					dom = 3;
				} else if (rdbtn2_4.isSelected()) {
					dom = 4;
				} else if (rdbtn2_5.isSelected()) {
					dom = 5;
				} else {
					dom = -1;
				}
				panel2.setVisible(false);
				panel3.setVisible(true);
			}
		});
		JButton btn3_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn3_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn3_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn3_1.setFocusPainted(false);
		btn3_1.setContentAreaFilled(false);
		btn3_1.setBorderPainted(false);
		btn3_1.setBounds(547, 450, 200, 60);
		panel3.add(btn3_1);

		JLabel Label3_1 = new JLabel("Q3. 생년 & 학번");
		Label3_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label3_1.setBounds(10, 10, 340, 60);
		panel3.add(Label3_1);

		JLabel Label3_2 = new JLabel("생년은 4자리, 학번은 2자리로 입력해주세요.  ex) 1999, 18");
		Label3_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label3_2.setBounds(170, 360, 1000, 60);
		panel3.add(Label3_2);

		JLabel Label3_3 = new JLabel("생년");
		Label3_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label3_3.setBounds(170, 120, 160, 60);
		panel3.add(Label3_3);

		JLabel Label3_4 = new JLabel("\uD559\uBC88");
		Label3_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label3_4.setBounds(170, 240, 160, 60);
		panel3.add(Label3_4);

		textField3_1 = new JTextField();
		textField3_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		textField3_1.setBounds(370, 120, 160, 60);
		panel3.add(textField3_1);
		textField3_1.setColumns(4);

		textField3_2 = new JTextField();
		textField3_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		textField3_2.setBounds(370, 240, 160, 60);
		panel3.add(textField3_2);
		textField3_2.setColumns(2);

		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hakbun = Integer.parseInt(textField3_1.getText());
				age = Integer.parseInt(textField3_2.getText());

				panel3.setVisible(false);
				panel4.setVisible(true);
			}
		});
		panel4.setLayout(null);
		panel4.setBounds(145, 290, 1400, 500);
		contentPane.add(panel4);

		JButton btn4_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn4_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn4_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn4_1.setFocusPainted(false);
		btn4_1.setContentAreaFilled(false);
		btn4_1.setBorderPainted(false);
		btn4_1.setBounds(547, 450, 200, 60);
		panel4.add(btn4_1);

		JLabel Label4_1 = new JLabel("Q4. 단과");
		Label4_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label4_1.setBounds(10, 10, 195, 60);
		panel4.add(Label4_1);

		JRadioButton rdbtn4_1 = new JRadioButton(" 인문");
		rdbtn4_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_1.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_1);
		rdbtn4_1.setBounds(170, 120, 160, 60);
		panel4.add(rdbtn4_1);

		JRadioButton rdbtn4_2 = new JRadioButton(" 사과");
		rdbtn4_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_2.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_2);
		rdbtn4_2.setBounds(370, 120, 160, 60);
		panel4.add(rdbtn4_2);

		JRadioButton rdbtn4_3 = new JRadioButton(" 자과");
		rdbtn4_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_3.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_3);
		rdbtn4_3.setBounds(570, 120, 160, 60);
		panel4.add(rdbtn4_3);

		JRadioButton rdbtn4_4 = new JRadioButton(" 경영");
		rdbtn4_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_4.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_4);
		rdbtn4_4.setBounds(770, 120, 160, 60);
		panel4.add(rdbtn4_4);

		JRadioButton rdbtn4_5 = new JRadioButton(" 공과");
		rdbtn4_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_5.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_5);
		rdbtn4_5.setBounds(970, 120, 160, 60);
		panel4.add(rdbtn4_5);

		JRadioButton rdbtn4_6 = new JRadioButton(" 전정");
		rdbtn4_6.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_6.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_6);
		rdbtn4_6.setBounds(1170, 120, 160, 60);
		panel4.add(rdbtn4_6);

		JRadioButton rdbtn4_7 = new JRadioButton(" 농생");
		rdbtn4_7.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_7.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_7);
		rdbtn4_7.setBounds(170, 240, 160, 60);
		panel4.add(rdbtn4_7);

		JRadioButton rdbtn4_8 = new JRadioButton(" 사범");
		rdbtn4_8.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_8.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_8);
		rdbtn4_8.setBounds(370, 240, 160, 60);
		panel4.add(rdbtn4_8);

		JRadioButton rdbtn4_9 = new JRadioButton(" 생과");
		rdbtn4_9.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_9.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_9);
		rdbtn4_9.setBounds(570, 240, 160, 60);
		panel4.add(rdbtn4_9);

		JRadioButton rdbtn4_10 = new JRadioButton(" 수의대");
		rdbtn4_10.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_10.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_10);
		rdbtn4_10.setBounds(770, 240, 160, 60);
		panel4.add(rdbtn4_10);

		JRadioButton rdbtn4_11 = new JRadioButton(" 의과");
		rdbtn4_11.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_11.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_11);
		rdbtn4_11.setBounds(970, 240, 160, 60);
		panel4.add(rdbtn4_11);

		JRadioButton rdbtn4_12 = new JRadioButton(" 자율");
		rdbtn4_12.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn4_12.setBackground(Color.WHITE);
		buttonGroup3.add(rdbtn4_12);
		rdbtn4_12.setBounds(1170, 240, 160, 60);
		panel4.add(rdbtn4_12);

		btn4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn4_1.isSelected()) {
					department = 1;
				} else if (rdbtn4_2.isSelected()) {
					department = 2;
				} else if (rdbtn4_3.isSelected()) {
					department = 3;
				} else if (rdbtn4_4.isSelected()) {
					department = 4;
				} else if (rdbtn4_5.isSelected()) {
					department = 5;
				} else if (rdbtn4_6.isSelected()) {
					department = 6;
				} else if (rdbtn4_7.isSelected()) {
					department = 7;
				} else if (rdbtn4_8.isSelected()) {
					department = 8;
				} else if (rdbtn4_9.isSelected()) {
					department = 9;
				} else if (rdbtn4_10.isSelected()) {
					department = 10;
				} else if (rdbtn4_11.isSelected()) {
					department = 11;
				} else if (rdbtn4_12.isSelected()) {
					department = 12;
				} else {
					department = -1;
				}
				panel4.setVisible(false);
				panel5.setVisible(true);
			}
		});
		panel5.setLayout(null);
		panel5.setBounds(145, 290, 1000, 500);
		contentPane.add(panel5);

		JButton btn5_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn5_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn5_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn5_1.setFocusPainted(false);
		btn5_1.setContentAreaFilled(false);
		btn5_1.setBorderPainted(false);
		btn5_1.setBounds(547, 450, 200, 60);
		panel5.add(btn5_1);

		JLabel Label5_1 = new JLabel("Q5. 취침시간");
		Label5_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label5_1.setBounds(10, 10, 250, 60);
		panel5.add(Label5_1);

		JRadioButton rdbtn5_1 = new JRadioButton(" 10시");
		rdbtn5_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn5_1.setBackground(Color.WHITE);
		buttonGroup4.add(rdbtn5_1);
		rdbtn5_1.setBounds(170, 120, 160, 60);
		panel5.add(rdbtn5_1);

		JRadioButton rdbtn5_2 = new JRadioButton(" 11시");
		rdbtn5_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn5_2.setBackground(Color.WHITE);
		buttonGroup4.add(rdbtn5_2);
		rdbtn5_2.setBounds(370, 120, 160, 60);
		panel5.add(rdbtn5_2);

		JRadioButton rdbtn5_3 = new JRadioButton(" 12시");
		rdbtn5_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn5_3.setBackground(Color.WHITE);
		buttonGroup4.add(rdbtn5_3);
		rdbtn5_3.setBounds(570, 120, 160, 60);
		panel5.add(rdbtn5_3);

		JRadioButton rdbtn5_4 = new JRadioButton(" 1시");
		rdbtn5_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn5_4.setBackground(Color.WHITE);
		buttonGroup4.add(rdbtn5_4);
		rdbtn5_4.setBounds(170, 240, 160, 60);
		panel5.add(rdbtn5_4);

		JRadioButton rdbtn5_5 = new JRadioButton(" 2시");
		rdbtn5_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn5_5.setBackground(Color.WHITE);
		buttonGroup4.add(rdbtn5_5);
		rdbtn5_5.setBounds(370, 240, 160, 60);
		panel5.add(rdbtn5_5);

		JRadioButton rdbtn5_6 = new JRadioButton(" 3시 이후");
		rdbtn5_6.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn5_6.setBackground(Color.WHITE);
		buttonGroup4.add(rdbtn5_6);
		rdbtn5_6.setBounds(570, 240, 320, 60);
		panel5.add(rdbtn5_6);

		btn5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn5_1.isSelected()) {
					sleep = 1;
				} else if (rdbtn5_2.isSelected()) {
					sleep = 2;
				} else if (rdbtn5_3.isSelected()) {
					sleep = 3;
				} else if (rdbtn5_4.isSelected())
					sleep = 4;
				else if (rdbtn5_5.isSelected())
					sleep = 5;
				else if (rdbtn5_6.isSelected())
					sleep = 6;
				else {
					sleep = -1;
				}
				panel5.setVisible(false);
				panel6.setVisible(true);
			}
		});
		panel6.setLayout(null);
		panel6.setBounds(145, 290, 1000, 500);
		contentPane.add(panel6);

		JButton btn6_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn6_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn6_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn6_1.setFocusPainted(false);
		btn6_1.setContentAreaFilled(false);
		btn6_1.setBorderPainted(false);
		btn6_1.setBounds(547, 450, 200, 60);
		panel6.add(btn6_1);

		JLabel Label6_1 = new JLabel("Q6. 기상시간");
		Label6_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label6_1.setBounds(10, 10, 260, 60);
		panel6.add(Label6_1);

		JRadioButton rdbtn6_1 = new JRadioButton(" 7시");
		rdbtn6_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn6_1.setBackground(Color.WHITE);
		buttonGroup5.add(rdbtn6_1);
		rdbtn6_1.setBounds(170, 120, 160, 60);
		panel6.add(rdbtn6_1);

		JRadioButton rdbtn6_2 = new JRadioButton(" 8시");
		rdbtn6_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn6_2.setBackground(Color.WHITE);
		buttonGroup5.add(rdbtn6_2);
		rdbtn6_2.setBounds(370, 120, 160, 60);
		panel6.add(rdbtn6_2);

		JRadioButton rdbtn6_3 = new JRadioButton(" 9시");
		rdbtn6_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn6_3.setBackground(Color.WHITE);
		buttonGroup5.add(rdbtn6_3);
		rdbtn6_3.setBounds(570, 120, 160, 60);
		panel6.add(rdbtn6_3);

		JRadioButton rdbtn6_4 = new JRadioButton(" 10시");
		rdbtn6_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn6_4.setBackground(Color.WHITE);
		buttonGroup5.add(rdbtn6_4);
		rdbtn6_4.setBounds(170, 240, 160, 60);
		panel6.add(rdbtn6_4);

		JRadioButton rdbtn6_5 = new JRadioButton(" 11시");
		rdbtn6_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn6_5.setBackground(Color.WHITE);
		buttonGroup5.add(rdbtn6_5);
		rdbtn6_5.setBounds(370, 240, 160, 60);
		panel6.add(rdbtn6_5);

		JRadioButton rdbtn6_6 = new JRadioButton(" 오후");
		rdbtn6_6.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn6_6.setBackground(Color.WHITE);
		buttonGroup5.add(rdbtn6_6);
		rdbtn6_6.setBounds(570, 240, 160, 60);
		panel6.add(rdbtn6_6);

		btn6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn6_1.isSelected())
					wake = 1;
				else if (rdbtn6_2.isSelected())
					wake = 2;
				else if (rdbtn6_3.isSelected())
					wake = 3;
				else if (rdbtn6_4.isSelected())
					wake = 4;
				else if (rdbtn6_5.isSelected())
					wake = 5;
				else if (rdbtn6_6.isSelected())
					wake = 6;
				else
					wake = -1;
				panel6.setVisible(false);
				panel7.setVisible(true);
			}
		});
		panel7.setLayout(null);
		panel7.setBounds(145, 290, 1000, 500);
		contentPane.add(panel7);

		JButton btn7_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn7_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn7_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn7_1.setFocusPainted(false);
		btn7_1.setContentAreaFilled(false);
		btn7_1.setBorderPainted(false);
		btn7_1.setBounds(547, 450, 200, 60);
		panel7.add(btn7_1);

		JLabel Label7_1 = new JLabel("Q7. 샤워소요시간");
		Label7_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label7_1.setBounds(10, 10, 320, 60);
		panel7.add(Label7_1);

		JRadioButton rdbtn7_1 = new JRadioButton(" 5분");
		rdbtn7_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn7_1.setBackground(Color.WHITE);
		buttonGroup6.add(rdbtn7_1);
		rdbtn7_1.setBounds(170, 120, 160, 60);
		panel7.add(rdbtn7_1);

		JRadioButton rdbtn7_2 = new JRadioButton(" 10분");
		rdbtn7_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn7_2.setBackground(Color.WHITE);
		buttonGroup6.add(rdbtn7_2);
		rdbtn7_2.setBounds(370, 120, 160, 60);
		panel7.add(rdbtn7_2);

		JRadioButton rdbtn7_3 = new JRadioButton(" 15분");
		rdbtn7_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn7_3.setBackground(Color.WHITE);
		buttonGroup6.add(rdbtn7_3);
		rdbtn7_3.setBounds(570, 120, 160, 60);
		panel7.add(rdbtn7_3);

		JRadioButton rdbtn7_4 = new JRadioButton(" 20분");
		rdbtn7_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn7_4.setBackground(Color.WHITE);
		buttonGroup6.add(rdbtn7_4);
		rdbtn7_4.setBounds(170, 240, 160, 60);
		panel7.add(rdbtn7_4);

		JRadioButton rdbtn7_5 = new JRadioButton(" 25분");
		rdbtn7_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn7_5.setBackground(Color.WHITE);
		buttonGroup6.add(rdbtn7_5);
		rdbtn7_5.setBounds(370, 240, 160, 60);
		panel7.add(rdbtn7_5);

		JRadioButton rdbtn7_6 = new JRadioButton(" 30분 이상");
		rdbtn7_6.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn7_6.setBackground(Color.WHITE);
		buttonGroup6.add(rdbtn7_6);
		rdbtn7_6.setBounds(570, 240, 240, 60);
		panel7.add(rdbtn7_6);

		btn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn7_1.isSelected())
					showertime = 1;
				else if (rdbtn7_2.isSelected())
					showertime = 2;
				else if (rdbtn7_3.isSelected())
					showertime = 3;
				else if (rdbtn7_4.isSelected())
					showertime = 4;
				else if (rdbtn7_5.isSelected())
					showertime = 5;
				else if (rdbtn7_6.isSelected())
					showertime = 6;
				else
					showertime = -1;
				panel7.setVisible(false);
				panel8.setVisible(true);
			}
		});
		panel8.setLayout(null);
		panel8.setBounds(145, 290, 1000, 500);
		contentPane.add(panel8);

		JButton btn8_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn8_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn8_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn8_1.setFocusPainted(false);
		btn8_1.setContentAreaFilled(false);
		btn8_1.setBorderPainted(false);
		btn8_1.setBounds(547, 450, 200, 60);
		panel8.add(btn8_1);

		JLabel Label8_1 = new JLabel("Q8. 샤워시간");
		Label8_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label8_1.setBounds(10, 10, 260, 60);
		panel8.add(Label8_1);

		JRadioButton rdbtn8_1 = new JRadioButton(" 아침");
		rdbtn8_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn8_1.setBackground(Color.WHITE);
		buttonGroup7.add(rdbtn8_1);
		rdbtn8_1.setBounds(170, 120, 160, 60);
		panel8.add(rdbtn8_1);

		JRadioButton rdbtn8_2 = new JRadioButton(" 저녁");
		rdbtn8_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn8_2.setBackground(Color.WHITE);
		buttonGroup7.add(rdbtn8_2);
		rdbtn8_2.setBounds(370, 120, 160, 60);
		panel8.add(rdbtn8_2);

		JRadioButton rdbtn8_3 = new JRadioButton(" 유동적");
		rdbtn8_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn8_3.setBackground(Color.WHITE);
		buttonGroup7.add(rdbtn8_3);
		rdbtn8_3.setBounds(570, 120, 160, 60);
		panel8.add(rdbtn8_3);
		btn8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn8_1.isSelected())
					whenshower = 1;
				else if (rdbtn8_2.isSelected())
					whenshower = 2;
				else if (rdbtn8_3.isSelected())
					whenshower = 3;
				else
					whenshower = -1;

				panel8.setVisible(false);
				panel9.setVisible(true);
			}
		});
		panel9.setLayout(null);
		panel9.setBounds(145, 290, 1000, 500);
		contentPane.add(panel9);

		JButton btn9_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn9_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn9_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn9_1.setFocusPainted(false);
		btn9_1.setContentAreaFilled(false);
		btn9_1.setBorderPainted(false);
		btn9_1.setBounds(547, 450, 200, 60);
		panel9.add(btn9_1);

		JLabel Label9_1 = new JLabel("Q9. 잠귀");
		Label9_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label9_1.setBounds(10, 10, 195, 60);
		panel9.add(Label9_1);

		JRadioButton rdbtn9_1 = new JRadioButton(" 어두움");
		rdbtn9_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn9_1.setBackground(Color.WHITE);
		buttonGroup8.add(rdbtn9_1);
		rdbtn9_1.setBounds(170, 120, 160, 60);
		panel9.add(rdbtn9_1);

		JRadioButton rdbtn9_2 = new JRadioButton(" 보통");
		rdbtn9_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn9_2.setBackground(Color.WHITE);
		buttonGroup8.add(rdbtn9_2);
		rdbtn9_2.setBounds(370, 120, 160, 60);
		panel9.add(rdbtn9_2);

		JRadioButton rdbtn9_3 = new JRadioButton(" 밝음");
		rdbtn9_3.setBackground(Color.WHITE);
		rdbtn9_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup8.add(rdbtn9_3);
		rdbtn9_3.setBounds(570, 120, 160, 60);
		panel9.add(rdbtn9_3);

		btn9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn9_1.isSelected())
					sensitives = 1;
				else if (rdbtn9_2.isSelected())
					sensitives = 2;
				else if (rdbtn9_3.isSelected())
					sensitives = 3;
				else
					sensitives = -1;

				panel9.setVisible(false);
				panel10.setVisible(true);
			}
		});
		panel10.setLayout(null);
		panel10.setBounds(145, 290, 1000, 500);
		contentPane.add(panel10);

		JButton btn10_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn10_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn10_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn10_1.setFocusPainted(false);
		btn10_1.setContentAreaFilled(false);
		btn10_1.setBorderPainted(false);
		btn10_1.setBounds(547, 450, 200, 60);
		panel10.add(btn10_1);

		JLabel Label10_1 = new JLabel("Q10. 잠버릇");
		Label10_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label10_1.setBounds(10, 10, 230, 60);
		panel10.add(Label10_1);

		JCheckBox checkbtn10_1 = new JCheckBox(" 없음");
		checkbtn10_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		checkbtn10_1.setBackground(Color.WHITE);
		checkbtn10_1.setBounds(170, 120, 160, 60);
		panel10.add(checkbtn10_1);

		JCheckBox checkbtn10_2 = new JCheckBox(" 이갈이");
		checkbtn10_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		checkbtn10_2.setBackground(Color.WHITE);
		checkbtn10_2.setBounds(170, 240, 160, 60);
		panel10.add(checkbtn10_2);

		JCheckBox checkbtn10_3 = new JCheckBox(" 잠꼬대");
		checkbtn10_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		checkbtn10_3.setBackground(Color.WHITE);
		checkbtn10_3.setBounds(370, 240, 160, 60);
		panel10.add(checkbtn10_3);

		JCheckBox checkbtn10_4 = new JCheckBox(" 코골이");
		checkbtn10_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		checkbtn10_4.setBackground(Color.WHITE);
		checkbtn10_4.setBounds(570, 240, 160, 60);
		panel10.add(checkbtn10_4);
		btn10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkbtn10_2.isSelected())
					jamb1 = 1;
				else
					jamb1 = 0;

				if (checkbtn10_3.isSelected())
					jamb2 = 1;
				else
					jamb2 = 0;

				if (checkbtn10_4.isSelected())
					jamb3 = 1;
				else
					jamb3 = 0;
				panel10.setVisible(false);
				panel11.setVisible(true);
			}
		});
		panel11.setLayout(null);
		panel11.setBounds(145, 290, 1000, 500);
		contentPane.add(panel11);

		JButton btn11_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn11_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn11_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn11_1.setFocusPainted(false);
		btn11_1.setContentAreaFilled(false);
		btn11_1.setBorderPainted(false);
		btn11_1.setBounds(547, 450, 200, 60);
		panel11.add(btn11_1);

		JLabel Label11_1 = new JLabel("Q11. 수면등");
		Label11_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label11_1.setBounds(10, 10, 230, 60);
		panel11.add(Label11_1);

		JRadioButton rdbtn11_1 = new JRadioButton(" 안씀");
		rdbtn11_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn11_1.setBackground(Color.WHITE);
		buttonGroup9.add(rdbtn11_1);
		rdbtn11_1.setBounds(170, 120, 160, 60);
		panel11.add(rdbtn11_1);

		JRadioButton rdbtn11_2 = new JRadioButton(" 형광등");
		rdbtn11_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn11_2.setBackground(Color.WHITE);
		buttonGroup9.add(rdbtn11_2);
		rdbtn11_2.setBounds(170, 240, 160, 60);
		panel11.add(rdbtn11_2);

		JRadioButton rdbtn11_3 = new JRadioButton(" 스탠드");
		rdbtn11_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn11_3.setBackground(Color.WHITE);
		buttonGroup9.add(rdbtn11_3);
		rdbtn11_3.setBounds(370, 240, 160, 60);
		panel11.add(rdbtn11_3);

		JRadioButton rdbtn11_4 = new JRadioButton(" 무드등");
		rdbtn11_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn11_4.setBackground(Color.WHITE);
		buttonGroup9.add(rdbtn11_4);
		rdbtn11_4.setBounds(570, 240, 160, 60);
		panel11.add(rdbtn11_4);
		btn11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn11_1.isSelected())
					sleeplight = 1;
				else if (rdbtn11_2.isSelected())
					sleeplight = 2;
				else if (rdbtn11_3.isSelected())
					sleeplight = 3;
				else if (rdbtn11_4.isSelected())
					sleeplight = 4;
				else
					sleeplight = -1;
				panel11.setVisible(false);
				panel12.setVisible(true);
			}
		});
		panel12.setLayout(null);
		panel12.setBounds(145, 290, 1000, 500);
		contentPane.add(panel12);

		JButton btn12_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn12_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn12_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn12_1.setFocusPainted(false);
		btn12_1.setContentAreaFilled(false);
		btn12_1.setBorderPainted(false);
		btn12_1.setBounds(547, 450, 200, 60);
		panel12.add(btn12_1);

		JLabel Label12_1 = new JLabel("Q12. 알람");
		Label12_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label12_1.setBounds(10, 10, 195, 60);
		panel12.add(Label12_1);

		JRadioButton rdbtn12_1 = new JRadioButton(" 못들어요");
		rdbtn12_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn12_1.setBackground(Color.WHITE);
		buttonGroup10.add(rdbtn12_1);
		rdbtn12_1.setBounds(170, 120, 200, 60);
		panel12.add(rdbtn12_1);

		JRadioButton rdbtn12_2 = new JRadioButton(" 중간");
		rdbtn12_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn12_2.setBackground(Color.WHITE);
		buttonGroup10.add(rdbtn12_2);
		rdbtn12_2.setBounds(370, 120, 160, 60);
		panel12.add(rdbtn12_2);

		JRadioButton rdbtn12_3 = new JRadioButton(" 잘들어요");
		rdbtn12_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn12_3.setBackground(Color.WHITE);
		buttonGroup10.add(rdbtn12_3);
		rdbtn12_3.setBounds(570, 120, 200, 60);
		panel12.add(rdbtn12_3);
		btn12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn12_1.isSelected())
					alarmhear = 1;
				else if (rdbtn12_2.isSelected())
					alarmhear = 2;
				else if (rdbtn12_3.isSelected())
					alarmhear = 3;
				else
					alarmhear = -1;
				panel12.setVisible(false);
				panel13.setVisible(true);
			}
		});
		panel13.setLayout(null);
		panel13.setBounds(145, 290, 1000, 500);
		contentPane.add(panel13);

		JButton btn13_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn13_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn13_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn13_1.setFocusPainted(false);
		btn13_1.setContentAreaFilled(false);
		btn13_1.setBorderPainted(false);
		btn13_1.setBounds(547, 450, 200, 60);
		panel13.add(btn13_1);

		JLabel Label13_1 = new JLabel("Q13. 청소");
		Label13_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label13_1.setBounds(10, 10, 195, 60);
		panel13.add(Label13_1);

		JRadioButton rdbtn13_1 = new JRadioButton(" 자주");
		rdbtn13_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn13_1.setBackground(Color.WHITE);
		buttonGroup11.add(rdbtn13_1);
		rdbtn13_1.setBounds(170, 120, 160, 60);
		panel13.add(rdbtn13_1);

		JRadioButton rdbtn13_2 = new JRadioButton(" 보통");
		rdbtn13_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn13_2.setBackground(Color.WHITE);
		buttonGroup11.add(rdbtn13_2);
		rdbtn13_2.setBounds(370, 120, 160, 60);
		panel13.add(rdbtn13_2);

		JRadioButton rdbtn13_3 = new JRadioButton(" 한번에");
		rdbtn13_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn13_3.setBackground(Color.WHITE);
		buttonGroup11.add(rdbtn13_3);
		rdbtn13_3.setBounds(570, 120, 160, 60);
		panel13.add(rdbtn13_3);
		btn13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn13_1.isSelected())
					clean = 1;
				else if (rdbtn13_2.isSelected())
					clean = 2;
				else if (rdbtn13_3.isSelected())
					clean = 3;
				else
					clean = -1;
				panel13.setVisible(false);
				panel14.setVisible(true);
			}
		});
		panel14.setLayout(null);
		panel14.setBounds(145, 290, 1000, 500);
		contentPane.add(panel14);

		JButton btn14_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn14_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn14_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn14_1.setFocusPainted(false);
		btn14_1.setContentAreaFilled(false);
		btn14_1.setBorderPainted(false);
		btn14_1.setBounds(547, 450, 200, 60);
		panel14.add(btn14_1);

		JLabel Label14_1 = new JLabel("Q14. 더위");
		Label14_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label14_1.setBounds(10, 10, 195, 60);
		panel14.add(Label14_1);

		JRadioButton rdbtn14_1 = new JRadioButton(" 적게탐");
		rdbtn14_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn14_1.setBackground(Color.WHITE);
		buttonGroup12.add(rdbtn14_1);
		rdbtn14_1.setBounds(170, 120, 160, 60);
		panel14.add(rdbtn14_1);

		JRadioButton rdbtn14_2 = new JRadioButton(" 보통");
		rdbtn14_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn14_2.setBackground(Color.WHITE);
		buttonGroup12.add(rdbtn14_2);
		rdbtn14_2.setBounds(370, 120, 160, 60);
		panel14.add(rdbtn14_2);

		JRadioButton rdbtn14_3 = new JRadioButton(" 많이탐");
		rdbtn14_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn14_3.setBackground(Color.WHITE);
		buttonGroup12.add(rdbtn14_3);
		rdbtn14_3.setBounds(570, 120, 160, 60);
		panel14.add(rdbtn14_3);
		btn14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn14_1.isSelected())
					heat = 1;
				else if (rdbtn14_2.isSelected())
					heat = 2;
				else if (rdbtn14_3.isSelected())
					heat = 3;
				else
					heat = -1;
				panel14.setVisible(false);
				panel15.setVisible(true);
			}
		});
		panel15.setLayout(null);
		panel15.setBounds(145, 290, 1000, 500);
		contentPane.add(panel15);

		JButton btn15_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn15_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn15_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn15_1.setFocusPainted(false);
		btn15_1.setContentAreaFilled(false);
		btn15_1.setBorderPainted(false);
		btn15_1.setBounds(547, 450, 200, 60);
		panel15.add(btn15_1);

		JLabel Label15_1 = new JLabel("Q15. 추위");
		Label15_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label15_1.setBounds(10, 10, 195, 60);
		panel15.add(Label15_1);

		JRadioButton rdbtn15_1 = new JRadioButton(" 적게탐");
		rdbtn15_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn15_1.setBackground(Color.WHITE);
		buttonGroup13.add(rdbtn15_1);
		rdbtn15_1.setBounds(170, 120, 160, 60);
		panel15.add(rdbtn15_1);

		JRadioButton rdbtn15_2 = new JRadioButton(" 보통");
		rdbtn15_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn15_2.setBackground(Color.WHITE);
		buttonGroup13.add(rdbtn15_2);
		rdbtn15_2.setBounds(370, 120, 160, 60);
		panel15.add(rdbtn15_2);

		JRadioButton rdbtn15_3 = new JRadioButton(" 많이탐");
		rdbtn15_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn15_3.setBackground(Color.WHITE);
		buttonGroup13.add(rdbtn15_3);
		rdbtn15_3.setBounds(570, 120, 160, 60);
		panel15.add(rdbtn15_3);
		btn15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn15_1.isSelected())
					cold = 1;
				else if (rdbtn15_2.isSelected())
					cold = 2;
				else if (rdbtn15_3.isSelected())
					cold = 3;
				else
					cold = -1;
				panel15.setVisible(false);
				panel16.setVisible(true);
			}
		});
		panel16.setLayout(null);
		panel16.setBounds(145, 290, 1000, 500);
		contentPane.add(panel16);

		JButton btn16_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn16_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn16_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn16_1.setFocusPainted(false);
		btn16_1.setContentAreaFilled(false);
		btn16_1.setBorderPainted(false);
		btn16_1.setBounds(547, 450, 200, 60);
		panel16.add(btn16_1);

		JLabel Label16_1 = new JLabel("Q16. 소리");
		Label16_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label16_1.setBounds(10, 10, 195, 60);
		panel16.add(Label16_1);

		JRadioButton rdbtn16_1 = new JRadioButton(" 이어폰");
		rdbtn16_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn16_1.setBackground(Color.WHITE);
		buttonGroup14.add(rdbtn16_1);
		rdbtn16_1.setBounds(170, 120, 160, 60);
		panel16.add(rdbtn16_1);

		JRadioButton rdbtn16_2 = new JRadioButton(" 스피커");
		rdbtn16_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn16_2.setBackground(Color.WHITE);
		buttonGroup14.add(rdbtn16_2);
		rdbtn16_2.setBounds(370, 120, 160, 60);
		panel16.add(rdbtn16_2);

		JRadioButton rdbtn16_3 = new JRadioButton(" 유동적");
		rdbtn16_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn16_3.setBackground(Color.WHITE);
		buttonGroup14.add(rdbtn16_3);
		rdbtn16_3.setBounds(570, 120, 160, 60);
		panel16.add(rdbtn16_3);
		btn16_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn16_1.isSelected())
					soundgigi = 1;
				else if (rdbtn16_2.isSelected())
					soundgigi = 2;
				else if (rdbtn16_3.isSelected())
					soundgigi = 3;
				else
					soundgigi = -1;
				panel16.setVisible(false);
				panel17.setVisible(true);
			}
		});
		panel17.setLayout(null);
		panel17.setBounds(145, 290, 1000, 500);
		contentPane.add(panel17);

		JButton btn17_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn17_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn17_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn17_1.setFocusPainted(false);
		btn17_1.setContentAreaFilled(false);
		btn17_1.setBorderPainted(false);
		btn17_1.setBounds(547, 450, 200, 60);
		panel17.add(btn17_1);

		JLabel Label17_1 = new JLabel("Q17. 흡연여부");
		Label17_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label17_1.setBounds(10, 10, 260, 60);
		panel17.add(Label17_1);

		JRadioButton rdbtn17_1 = new JRadioButton(" 흡연");
		rdbtn17_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn17_1.setBackground(Color.WHITE);
		buttonGroup15.add(rdbtn17_1);
		rdbtn17_1.setBounds(170, 120, 160, 60);
		panel17.add(rdbtn17_1);

		JRadioButton rdbtn17_2 = new JRadioButton(" 비흡연");
		rdbtn17_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn17_2.setBackground(Color.WHITE);
		buttonGroup15.add(rdbtn17_2);
		rdbtn17_2.setBounds(370, 120, 160, 60);
		panel17.add(rdbtn17_2);
		btn17_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn17_1.isSelected())
					smoking = 1;
				else if (rdbtn17_2.isSelected())
					smoking = 2;
				else
					smoking = -1;
				panel17.setVisible(false);
				panel18.setVisible(true);
			}
		});
		panel18.setLayout(null);
		panel18.setBounds(145, 290, 1000, 500);
		contentPane.add(panel18);

		JButton btn18_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn18_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn18_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn18_1.setFocusPainted(false);
		btn18_1.setContentAreaFilled(false);
		btn18_1.setBorderPainted(false);
		btn18_1.setBounds(547, 450, 200, 60);
		panel18.add(btn18_1);

		JLabel Label18_1 = new JLabel("Q18. 실내통화");
		Label18_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label18_1.setBounds(10, 10, 260, 60);
		panel18.add(Label18_1);

		JRadioButton rdbtn18_1 = new JRadioButton(" 반대");
		rdbtn18_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn18_1.setBackground(Color.WHITE);
		buttonGroup16.add(rdbtn18_1);
		rdbtn18_1.setBounds(170, 120, 160, 60);
		panel18.add(rdbtn18_1);

		JRadioButton rdbtn18_2 = new JRadioButton(" 상관없음");
		rdbtn18_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn18_2.setBackground(Color.WHITE);
		buttonGroup16.add(rdbtn18_2);
		rdbtn18_2.setBounds(370, 240, 280, 60);
		panel18.add(rdbtn18_2);

		JRadioButton rdbtn18_3 = new JRadioButton(" 찬성");
		rdbtn18_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn18_3.setBackground(Color.WHITE);
		buttonGroup16.add(rdbtn18_3);
		rdbtn18_3.setBounds(170, 240, 160, 60);
		panel18.add(rdbtn18_3);

		JRadioButton rdbtn18_4 = new JRadioButton(" 간단한 용무만");
		rdbtn18_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn18_4.setBackground(Color.WHITE);
		buttonGroup16.add(rdbtn18_4);
		rdbtn18_4.setBounds(370, 120, 300, 60);
		panel18.add(rdbtn18_4);
		btn18_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn18_1.isSelected())
					silnaecall = 1;
				else if (rdbtn18_2.isSelected())
					silnaecall = 2;
				else if (rdbtn18_3.isSelected())
					silnaecall = 3;
				else if (rdbtn18_4.isSelected())
					silnaecall = 4;
				else
					silnaecall = -1;
				panel18.setVisible(false);
				panel19.setVisible(true);
			}
		});
		panel19.setLayout(null);
		panel19.setBounds(145, 290, 1000, 500);
		contentPane.add(panel19);

		JButton btn19_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn19_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn19_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn19_1.setFocusPainted(false);
		btn19_1.setContentAreaFilled(false);
		btn19_1.setBorderPainted(false);
		btn19_1.setBounds(547, 450, 200, 60);
		panel19.add(btn19_1);

		JLabel Label19_1 = new JLabel("Q19. 친구초대");
		Label19_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label19_1.setBounds(10, 10, 280, 60);
		panel19.add(Label19_1);

		JRadioButton rdbtn19_1 = new JRadioButton(" 가능");
		rdbtn19_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn19_1.setBackground(Color.WHITE);
		buttonGroup17.add(rdbtn19_1);
		rdbtn19_1.setBounds(170, 120, 160, 60);
		panel19.add(rdbtn19_1);

		JRadioButton rdbtn19_2 = new JRadioButton(" 불가");
		rdbtn19_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn19_2.setBackground(Color.WHITE);
		buttonGroup17.add(rdbtn19_2);
		rdbtn19_2.setBounds(370, 120, 160, 60);
		panel19.add(rdbtn19_2);
		btn19_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn19_1.isSelected())
					friendinvite = 1;
				else if (rdbtn19_2.isSelected())
					friendinvite = 2;
				else
					friendinvite = -1;
				panel19.setVisible(false);
				panel20.setVisible(true);
			}
		});
		panel20.setLayout(null);
		panel20.setBounds(145, 290, 1000, 500);
		contentPane.add(panel20);

		JButton btn20_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn20_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn20_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn20_1.setFocusPainted(false);
		btn20_1.setContentAreaFilled(false);
		btn20_1.setBorderPainted(false);
		btn20_1.setBounds(547, 450, 200, 60);
		panel20.add(btn20_1);

		JLabel Label20_1 = new JLabel("Q20. 기숙사식");
		Label20_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label20_1.setBounds(10, 10, 280, 60);
		panel20.add(Label20_1);

		JRadioButton rdbtn20_1 = new JRadioButton(" 같이");
		rdbtn20_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn20_1.setBackground(Color.WHITE);
		buttonGroup18.add(rdbtn20_1);
		rdbtn20_1.setBounds(170, 120, 160, 60);
		panel20.add(rdbtn20_1);

		JRadioButton rdbtn20_2 = new JRadioButton(" 따로");
		rdbtn20_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn20_2.setBackground(Color.WHITE);
		buttonGroup18.add(rdbtn20_2);
		rdbtn20_2.setBounds(370, 120, 160, 60);
		panel20.add(rdbtn20_2);
		btn20_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn20_1.isSelected())
					eatbob = 1;
				else if (rdbtn20_2.isSelected())
					eatbob = 2;
				else
					eatbob = -1;
				panel20.setVisible(false);
				panel21.setVisible(true);
			}
		});
		panel21.setLayout(null);
		panel21.setBounds(145, 290, 1000, 500);
		contentPane.add(panel21);

		JButton btn21_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn21_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn21_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn21_1.setFocusPainted(false);
		btn21_1.setContentAreaFilled(false);
		btn21_1.setBorderPainted(false);
		btn21_1.setBounds(547, 450, 200, 60);
		panel21.add(btn21_1);

		JLabel Label21_1 = new JLabel("Q21. 공부");
		Label21_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label21_1.setBounds(10, 10, 195, 60);
		panel21.add(Label21_1);

		JRadioButton rdbtn21_1 = new JRadioButton(" 기숙사");
		rdbtn21_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn21_1.setBackground(Color.WHITE);
		buttonGroup19.add(rdbtn21_1);
		rdbtn21_1.setBounds(170, 120, 160, 60);
		panel21.add(rdbtn21_1);

		JRadioButton rdbtn21_2 = new JRadioButton(" 도서관");
		rdbtn21_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn21_2.setBackground(Color.WHITE);
		buttonGroup19.add(rdbtn21_2);
		rdbtn21_2.setBounds(370, 120, 160, 60);
		panel21.add(rdbtn21_2);

		JRadioButton rdbtn21_3 = new JRadioButton(" 유동적");
		rdbtn21_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn21_3.setBackground(Color.WHITE);
		buttonGroup19.add(rdbtn21_3);
		rdbtn21_3.setBounds(570, 120, 160, 60);
		panel21.add(rdbtn21_3);
		btn21_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn21_1.isSelected())
					studytype = 1;
				else if (rdbtn21_2.isSelected())
					studytype = 2;
				else if (rdbtn21_3.isSelected())
					studytype = 3;
				else
					studytype = -1;
				panel21.setVisible(false);
				panel22.setVisible(true);
			}
		});
		panel22.setLayout(null);
		panel22.setBounds(145, 290, 1000, 500);
		contentPane.add(panel22);

		JButton btn22_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn22_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn22_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn22_1.setFocusPainted(false);
		btn22_1.setContentAreaFilled(false);
		btn22_1.setBorderPainted(false);
		btn22_1.setBounds(547, 450, 200, 60);
		panel22.add(btn22_1);

		JLabel Label22_1 = new JLabel("Q22. 향수");
		Label22_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label22_1.setBounds(10, 10, 195, 60);
		panel22.add(Label22_1);

		JRadioButton rdbtn22_1 = new JRadioButton(" 미사용");
		rdbtn22_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn22_1.setBackground(Color.WHITE);
		buttonGroup20.add(rdbtn22_1);
		rdbtn22_1.setBounds(170, 120, 160, 60);
		panel22.add(rdbtn22_1);

		JRadioButton rdbtn22_2 = new JRadioButton(" 사용");
		rdbtn22_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn22_2.setBackground(Color.WHITE);
		buttonGroup20.add(rdbtn22_2);
		rdbtn22_2.setBounds(370, 120, 160, 60);
		panel22.add(rdbtn22_2);
		btn22_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn22_1.isSelected())
					perfume = 1;
				else if (rdbtn22_2.isSelected())
					perfume = 2;
				else
					perfume = -1;
				panel22.setVisible(false);
				panel23.setVisible(true);
			}
		});
		panel23.setLayout(null);
		panel23.setBounds(145, 290, 1000, 500);
		contentPane.add(panel23);

		JButton btn23_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn23_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn23_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn23_1.setFocusPainted(false);
		btn23_1.setContentAreaFilled(false);
		btn23_1.setBorderPainted(false);
		btn23_1.setBounds(547, 450, 200, 60);
		panel23.add(btn23_1);

		JLabel Label23_1 = new JLabel("Q23. 향 민감도");
		Label23_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label23_1.setBounds(10, 10, 300, 60);
		panel23.add(Label23_1);

		JRadioButton rdbtn23_1 = new JRadioButton(" 민감");
		rdbtn23_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn23_1.setBackground(Color.WHITE);
		buttonGroup21.add(rdbtn23_1);
		rdbtn23_1.setBounds(170, 120, 160, 60);
		panel23.add(rdbtn23_1);

		JRadioButton rdbtn23_2 = new JRadioButton(" 상관없음");
		rdbtn23_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn23_2.setBackground(Color.WHITE);
		buttonGroup21.add(rdbtn23_2);
		rdbtn23_2.setBounds(370, 120, 200, 60);
		panel23.add(rdbtn23_2);
		btn23_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn23_1.isSelected())
					smellwell = 1;
				else if (rdbtn23_2.isSelected())
					smellwell = 2;
				else
					smellwell = -1;
				panel23.setVisible(false);
				panel24.setVisible(true);
			}
		});
		panel24.setLayout(null);
		panel24.setBounds(145, 290, 1000, 500);
		contentPane.add(panel24);

		JButton btn24_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn24_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn24_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn24_1.setFocusPainted(false);
		btn24_1.setContentAreaFilled(false);
		btn24_1.setBorderPainted(false);
		btn24_1.setBounds(547, 450, 200, 60);
		panel24.add(btn24_1);

		JLabel Label24_1 = new JLabel("Q24. 컴퓨터 게임");
		Label24_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label24_1.setBounds(10, 10, 340, 60);
		panel24.add(Label24_1);

		JRadioButton rdbtn24_1 = new JRadioButton(" 안함");
		rdbtn24_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn24_1.setBackground(Color.WHITE);
		buttonGroup22.add(rdbtn24_1);
		rdbtn24_1.setBounds(170, 120, 160, 60);
		panel24.add(rdbtn24_1);

		JRadioButton rdbtn24_2 = new JRadioButton(" 가끔");
		rdbtn24_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn24_2.setBackground(Color.WHITE);
		buttonGroup22.add(rdbtn24_2);
		rdbtn24_2.setBounds(370, 120, 160, 60);
		panel24.add(rdbtn24_2);

		JRadioButton rdbtn24_3 = new JRadioButton(" 자주");
		rdbtn24_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn24_3.setBackground(Color.WHITE);
		buttonGroup22.add(rdbtn24_3);
		rdbtn24_3.setBounds(570, 120, 160, 60);
		panel24.add(rdbtn24_3);
		btn24_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn24_1.isSelected())
					game = 1;
				else if (rdbtn24_2.isSelected())
					game = 2;
				else if (rdbtn24_3.isSelected())
					game = 3;
				else
					game = -1;
				panel24.setVisible(false);
				panel25.setVisible(true);
			}
		});
		panel25.setLayout(null);
		panel25.setBounds(145, 290, 1000, 500);
		contentPane.add(panel25);

		JButton btn25_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn25_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn25_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn25_1.setFocusPainted(false);
		btn25_1.setContentAreaFilled(false);
		btn25_1.setBorderPainted(false);
		btn25_1.setBounds(547, 450, 200, 60);
		panel25.add(btn25_1);

		JLabel Label25_1 = new JLabel("Q25. 야식");
		Label25_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label25_1.setBounds(10, 10, 200, 60);
		panel25.add(Label25_1);

		JRadioButton rdbtn25_1 = new JRadioButton(" 안먹음");
		rdbtn25_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn25_1.setBackground(Color.WHITE);
		buttonGroup23.add(rdbtn25_1);
		rdbtn25_1.setBounds(170, 120, 160, 60);
		panel25.add(rdbtn25_1);

		JRadioButton rdbtn25_2 = new JRadioButton(" 가끔");
		rdbtn25_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn25_2.setBackground(Color.WHITE);
		buttonGroup23.add(rdbtn25_2);
		rdbtn25_2.setBounds(370, 120, 160, 60);
		panel25.add(rdbtn25_2);

		JRadioButton rdbtn25_3 = new JRadioButton(" 자주");
		rdbtn25_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn25_3.setBackground(Color.WHITE);
		buttonGroup23.add(rdbtn25_3);
		rdbtn25_3.setBounds(570, 120, 160, 60);
		panel25.add(rdbtn25_3);
		btn25_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn25_1.isSelected())
					yasick = 1;
				else if (rdbtn25_2.isSelected())
					yasick = 2;
				else if (rdbtn25_3.isSelected())
					yasick = 3;
				else
					yasick = -1;
				panel25.setVisible(false);
				panel26.setVisible(true);
			}
		});
		panel26.setLayout(null);
		panel26.setBounds(145, 290, 1000, 500);
		contentPane.add(panel26);

		JButton btn26_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn26_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn26_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn26_1.setFocusPainted(false);
		btn26_1.setContentAreaFilled(false);
		btn26_1.setBorderPainted(false);
		btn26_1.setBounds(547, 450, 200, 60);
		panel26.add(btn26_1);

		JLabel Label26_1 = new JLabel("Q26. 술");
		Label26_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label26_1.setBounds(10, 10, 200, 60);
		panel26.add(Label26_1);

		JRadioButton rdbtn26_1 = new JRadioButton(" 안마심");
		rdbtn26_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn26_1.setBackground(Color.WHITE);
		buttonGroup24.add(rdbtn26_1);
		rdbtn26_1.setBounds(170, 120, 160, 60);
		panel26.add(rdbtn26_1);

		JRadioButton rdbtn26_2 = new JRadioButton(" 가끔");
		rdbtn26_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn26_2.setBackground(Color.WHITE);
		buttonGroup24.add(rdbtn26_2);
		rdbtn26_2.setBounds(370, 120, 160, 60);
		panel26.add(rdbtn26_2);

		JRadioButton rdbtn26_3 = new JRadioButton(" 자주");
		rdbtn26_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn26_3.setBackground(Color.WHITE);
		buttonGroup24.add(rdbtn26_3);
		rdbtn26_3.setBounds(570, 120, 160, 60);
		panel26.add(rdbtn26_3);
		btn26_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn26_1.isSelected())
					sool = 1;
				else if (rdbtn26_2.isSelected())
					sool = 2;
				else if (rdbtn26_3.isSelected())
					sool = 3;
				else
					sool = -1;
				panel26.setVisible(false);
				panel27.setVisible(true);
			}
		});
		panel27.setLayout(null);
		panel27.setBounds(145, 290, 1000, 500);
		contentPane.add(panel27);

		JButton btn27_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn27_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn27_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn27_1.setFocusPainted(false);
		btn27_1.setContentAreaFilled(false);
		btn27_1.setBorderPainted(false);
		btn27_1.setBounds(547, 450, 200, 60);
		panel27.add(btn27_1);

		JLabel Label27_1 = new JLabel("Q27. 실내취식");
		Label27_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label27_1.setBounds(10, 10, 300, 60);
		panel27.add(Label27_1);

		JRadioButton rdbtn27_1 = new JRadioButton(" 불가");
		rdbtn27_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn27_1.setBackground(Color.WHITE);
		buttonGroup25.add(rdbtn27_1);
		rdbtn27_1.setBounds(170, 120, 160, 60);
		panel27.add(rdbtn27_1);

		JRadioButton rdbtn27_2 = new JRadioButton(" 냄새 안나는 음식만");
		rdbtn27_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn27_2.setBackground(Color.WHITE);
		buttonGroup25.add(rdbtn27_2);
		rdbtn27_2.setBounds(370, 240, 380, 60);
		panel27.add(rdbtn27_2);

		JRadioButton rdbtn27_3 = new JRadioButton(" 가능");
		rdbtn27_3.setBackground(Color.WHITE);
		rdbtn27_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup25.add(rdbtn27_3);
		rdbtn27_3.setBounds(170, 240, 160, 60);
		panel27.add(rdbtn27_3);
		btn27_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn27_1.isSelected())
					silnaeeat = 1;
				else if (rdbtn27_2.isSelected())
					silnaeeat = 2;
				else if (rdbtn27_3.isSelected())
					silnaeeat = 3;
				else
					silnaeeat = -1;
				panel27.setVisible(false);
				panel28.setVisible(true);
			}
		});
		panel28.setLayout(null);
		panel28.setBounds(145, 290, 1200, 500);
		contentPane.add(panel28);

		JButton btn28_1 = new JButton("\uC124\uBB38\uC644\uB8CC");
		btn28_1.setIcon(new ImageIcon(roomCheck.class.getResource("/Project/searchH.png")));
		btn28_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		btn28_1.setFocusPainted(false);
		btn28_1.setContentAreaFilled(false);
		btn28_1.setBorderPainted(false);
		btn28_1.setBounds(547, 450, 200, 60);
		panel28.add(btn28_1);

		JLabel Label28_1 = new JLabel("Q28. 벌레");
		Label28_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label28_1.setBounds(10, 10, 200, 60);
		panel28.add(Label28_1);

		JRadioButton rdbtn28_1 = new JRadioButton(" 혐오");
		rdbtn28_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn28_1.setBackground(Color.WHITE);
		buttonGroup26.add(rdbtn28_1);
		rdbtn28_1.setBounds(170, 120, 160, 60);
		panel28.add(rdbtn28_1);

		JRadioButton rdbtn28_2 = new JRadioButton(" 못잡음");
		rdbtn28_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn28_2.setBackground(Color.WHITE);
		buttonGroup26.add(rdbtn28_2);
		rdbtn28_2.setBounds(370, 120, 160, 60);
		panel28.add(rdbtn28_2);

		JRadioButton rdbtn28_3 = new JRadioButton(" 중간");
		rdbtn28_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn28_3.setBackground(Color.WHITE);
		buttonGroup26.add(rdbtn28_3);
		rdbtn28_3.setBounds(570, 120, 160, 60);
		panel28.add(rdbtn28_3);

		JRadioButton rdbtn28_4 = new JRadioButton(" 잡음");
		rdbtn28_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn28_4.setBackground(Color.WHITE);
		buttonGroup26.add(rdbtn28_4);
		rdbtn28_4.setBounds(770, 120, 160, 60);
		panel28.add(rdbtn28_4);

		JRadioButton rdbtn28_5 = new JRadioButton(" 파브르");
		rdbtn28_5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn28_5.setBackground(Color.WHITE);
		buttonGroup26.add(rdbtn28_5);
		rdbtn28_5.setBounds(970, 120, 160, 60);
		panel28.add(rdbtn28_5);

		JLabel infoLabel_1 = new JLabel("내방 점검하기");
		infoLabel_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel_1.setBounds(80, 150, 280, 80);
		contentPane.add(infoLabel_1);

		JPanel line2 = new JPanel();
		line2.setBackground(Color.LIGHT_GRAY);
		line2.setBounds(80, 230, 1400, 1);
		contentPane.add(line2);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 102, 102));
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(313, 87, 175, 10);
		contentPane.add(panel);

		btn28_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn28_1.isSelected())
					insect = 1;
				else if (rdbtn28_2.isSelected())
					insect = 2;
				else if (rdbtn28_3.isSelected())
					insect = 3;
				else if (rdbtn28_4.isSelected())
					insect = 4;
				else if (rdbtn28_5.isSelected())
					insect = 5;
				else
					insect = -1;

				main m = new main();
				ModFunctions mf = new ModFunctions();
				mf.ModGender(gender);
				mf.ModDom(dom);
				mf.ModHakbun(hakbun);
				mf.ModAge(age);
				mf.ModDepartment(department);
				mf.ModSleep(sleep);
				mf.ModWake(wake);
				mf.ModShowertime(showertime);
				mf.ModWhenshower(whenshower);
				mf.ModSensitives(sensitives);
				mf.ModJamb1(jamb1);
				mf.ModJamb2(jamb2);
				mf.ModJamb3(jamb3);
				mf.ModSleeplight(sleeplight);
				mf.ModAlarmhear(alarmhear);
				mf.ModClean(clean);
				mf.ModHeat(heat);
				mf.ModCold(cold);
				mf.ModSoundgigi(soundgigi);
				mf.ModSmoking(smoking);
				mf.ModSilnaecall(silnaecall);
				mf.ModFriendinvite(friendinvite);
				mf.ModEatbob(eatbob);
				mf.ModStudytype(studytype);
				mf.ModPerfume(perfume);
				mf.ModSmellwell(smellwell);
				mf.ModGame(game);
				mf.ModYasick(yasick);
				mf.ModSool(sool);
				mf.ModSilnaeeat(silnaeeat);
				mf.ModInsect(insect);

				ModifyUser mu = new ModifyUser();
				try {
					mu.Modify();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				m.setVisible(true);
				setVisible(false);
			}
		});
	}
}