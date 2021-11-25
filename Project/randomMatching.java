package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.randomMatching;
import Project.roomCheck;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class randomMatching extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup3 = new ButtonGroup();
	private final ButtonGroup buttonGroup4 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					randomMatching frame = new randomMatching();
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
	public randomMatching() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel0 = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		
		panel1.setVisible(false); 
		panel2.setVisible(false); 
		panel3.setVisible(false); 
		panel4.setVisible(false); 
		panel5.setVisible(false); 
		panel6.setVisible(false);
		
		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(randomMatching.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setIcon(new ImageIcon(randomMatching.class.getResource("/Project/personn.png")));
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);
		
		JButton moveMail = new JButton();
		moveMail.setIcon(new ImageIcon(randomMatching.class.getResource("/Project/mail.png")));
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		moveMail.setBounds(1490, 20, 75, 60);
		contentPane.add(moveMail);
		
		JButton movePage2 = new JButton("니방 랜덤매칭");
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
		movePage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomCheck r = new roomCheck();
				r.setVisible(true);
				setVisible(false);
			}
		});
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
		
		JPanel line2 = new JPanel();
		line2.setBackground(Color.BLACK);
		line2.setBounds(0, 96, 1600, 1);
		contentPane.add(line2);
		
		panel0.setLayout(null);
		panel0.setBounds(138, 123, 1000, 600);
		contentPane.add(panel0);
		
		JButton btn0_1 = new JButton("\uC124\uC815\uC2DC\uC791");
		btn0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel0.setVisible(false); 
				panel1.setVisible(true); 
			}
		});
		btn0_1.setBounds(176, 140, 97, 23);
		panel0.add(btn0_1);
		
		JLabel Label0_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label0_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label0_1.setBounds(12, 18, 429, 49);
		panel0.add(Label0_1);
		
		panel1.setLayout(null);
		panel1.setBounds(118, 139, 1000, 600);
		contentPane.add(panel1);
		
		JButton btn1_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false); 
				panel2.setVisible(true); 
			}
		});
		btn1_1.setBounds(254, 182, 97, 23);
		panel1.add(btn1_1);
		
		JLabel Label1_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label1_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label1_1.setBounds(12, 18, 429, 49);
		panel1.add(Label1_1);
		
		JLabel Label1_2 = new JLabel("\uC0DD\uB144");
		Label1_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label1_2.setBounds(44, 77, 115, 49);
		panel1.add(Label1_2);
		
		JLabel Label1_3 = new JLabel("1 / ?");
		Label1_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label1_3.setBounds(228, 93, 115, 49);
		panel1.add(Label1_3);
		
		JCheckBox checkbtn1_1 = new JCheckBox("96");
		checkbtn1_1.setBounds(54, 132, 115, 23);
		panel1.add(checkbtn1_1);
		
		JCheckBox checkbtn1_2 = new JCheckBox("97");
		checkbtn1_2.setBounds(64, 157, 115, 23);
		panel1.add(checkbtn1_2);
		
		JCheckBox checkbtn1_3 = new JCheckBox("98");
		checkbtn1_3.setBounds(74, 182, 115, 23);
		panel1.add(checkbtn1_3);
		
		JCheckBox checkbtn1_4 = new JCheckBox("99");
		checkbtn1_4.setBounds(84, 207, 115, 23);
		panel1.add(checkbtn1_4);
		
		JCheckBox checkbtn1_5 = new JCheckBox("00");
		checkbtn1_5.setBounds(94, 232, 115, 23);
		panel1.add(checkbtn1_5);
		
		JCheckBox checkbtn1_6 = new JCheckBox("01");
		checkbtn1_6.setBounds(104, 257, 115, 23);
		panel1.add(checkbtn1_6);
		
		JCheckBox checkbtn1_7 = new JCheckBox("02");
		checkbtn1_7.setBounds(114, 282, 115, 23);
		panel1.add(checkbtn1_7);
		
		JCheckBox checkbtn1_8 = new JCheckBox("03");
		checkbtn1_8.setBounds(124, 307, 115, 23);
		panel1.add(checkbtn1_8);
		
		panel2.setLayout(null);
		panel2.setBounds(106, 149, 1000, 600);
		contentPane.add(panel2);
		
		JButton btn2_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false); 
				panel3.setVisible(true); 
			}
		});
		btn2_1.setBounds(254, 182, 97, 23);
		panel2.add(btn2_1);
		
		JLabel Label2_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label2_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label2_1.setBounds(12, 18, 429, 49);
		panel2.add(Label2_1);
		
		JLabel Label2_2 = new JLabel("\uD559\uBC88");
		Label2_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label2_2.setBounds(44, 77, 115, 49);
		panel2.add(Label2_2);
		
		JLabel Label2_3 = new JLabel("2 / ?");
		Label2_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label2_3.setBounds(228, 93, 115, 49);
		panel2.add(Label2_3);
		
		JCheckBox checkbtn2_1 = new JCheckBox("14");
		checkbtn2_1.setBounds(54, 132, 115, 23);
		panel2.add(checkbtn2_1);
		
		JCheckBox checkbtn2_2 = new JCheckBox("15");
		checkbtn2_2.setBounds(64, 157, 115, 23);
		panel2.add(checkbtn2_2);
		
		JCheckBox checkbtn2_3 = new JCheckBox("16");
		checkbtn2_3.setBounds(74, 182, 115, 23);
		panel2.add(checkbtn2_3);
		
		JCheckBox checkbtn2_4 = new JCheckBox("17");
		checkbtn2_4.setBounds(84, 207, 115, 23);
		panel2.add(checkbtn2_4);
		
		JCheckBox checkbtn2_5 = new JCheckBox("18");
		checkbtn2_5.setBounds(94, 232, 115, 23);
		panel2.add(checkbtn2_5);
		
		JCheckBox checkbtn2_6 = new JCheckBox("19");
		checkbtn2_6.setBounds(104, 257, 115, 23);
		panel2.add(checkbtn2_6);
		
		JCheckBox checkbtn2_7 = new JCheckBox("20");
		checkbtn2_7.setBounds(114, 282, 115, 23);
		panel2.add(checkbtn2_7);
		
		JCheckBox checkbtn2_8 = new JCheckBox("21");
		checkbtn2_8.setBounds(124, 307, 115, 23);
		panel2.add(checkbtn2_8);
		
		panel3.setLayout(null);
		panel3.setBounds(88, 156, 1000, 600);
		contentPane.add(panel3);
		
		JButton btn3_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3.setVisible(false); 
				panel4.setVisible(true); 
			}
		});
		btn3_1.setBounds(254, 182, 97, 23);
		panel3.add(btn3_1);
		
		JLabel Label3_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label3_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label3_1.setBounds(12, 18, 429, 49);
		panel3.add(Label3_1);
		
		JLabel Label3_2 = new JLabel("\uD761\uC5F0\uC5EC\uBD80");
		Label3_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label3_2.setBounds(44, 77, 157, 49);
		panel3.add(Label3_2);
		
		JLabel Label3_3 = new JLabel("3 / ?");
		Label3_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label3_3.setBounds(228, 93, 115, 49);
		panel3.add(Label3_3);
		
		JRadioButton rdbtn3_1 = new JRadioButton("\uD761\uC5F0\uC790");
		buttonGroup.add(rdbtn3_1);
		rdbtn3_1.setBounds(54, 132, 121, 23);
		panel3.add(rdbtn3_1);
		
		JRadioButton rdbtn3_2 = new JRadioButton("\uBE44\uD761\uC5F0\uC790");
		buttonGroup.add(rdbtn3_2);
		rdbtn3_2.setBounds(64, 157, 121, 23);
		panel3.add(rdbtn3_2);
		
		JRadioButton rdbtn3_3 = new JRadioButton("\uC0C1\uAD00\uC5C6\uC74C");
		buttonGroup.add(rdbtn3_3);
		rdbtn3_3.setBounds(74, 182, 121, 23);
		panel3.add(rdbtn3_3);
		
		panel4.setLayout(null);
		panel4.setBounds(71, 161, 1000, 600);
		contentPane.add(panel4);
		
		JButton btn4_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(false); 
				panel5.setVisible(true); 
			}
		});
		btn4_1.setBounds(254, 182, 97, 23);
		panel4.add(btn4_1);
		
		JLabel Label4_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label4_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label4_1.setBounds(12, 18, 429, 49);
		panel4.add(Label4_1);
		
		JLabel Label4_2 = new JLabel("\uB2E8\uACFC");
		Label4_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label4_2.setBounds(44, 77, 157, 49);
		panel4.add(Label4_2);
		
		JLabel Label4_3 = new JLabel("4 / ?");
		Label4_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label4_3.setBounds(228, 93, 115, 49);
		panel4.add(Label4_3);
		
		JRadioButton rdbtn4_1 = new JRadioButton("\uAC19\uC740 \uACFC");
		buttonGroup2.add(rdbtn4_1);
		rdbtn4_1.setBounds(54, 132, 121, 23);
		panel4.add(rdbtn4_1);
		
		JRadioButton rdbtn4_2 = new JRadioButton("\uD0C0\uACFC");
		buttonGroup2.add(rdbtn4_2);
		rdbtn4_2.setBounds(64, 157, 121, 23);
		panel4.add(rdbtn4_2);
		
		JRadioButton rdbtn4_3 = new JRadioButton("\uC0C1\uAD00\uC5C6\uC74C");
		buttonGroup2.add(rdbtn4_3);
		rdbtn4_3.setBounds(74, 182, 121, 23);
		panel4.add(rdbtn4_3);
		
		panel5.setLayout(null);
		panel5.setBounds(52, 167, 1000, 600);
		contentPane.add(panel5);
		
		JButton btn5_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel5.setVisible(false); 
				panel6.setVisible(true); 
			}
		});
		btn5_1.setBounds(254, 182, 97, 23);
		panel5.add(btn5_1);
		
		JLabel Label5_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label5_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label5_1.setBounds(12, 18, 429, 49);
		panel5.add(Label5_1);
		
		JLabel Label5_2 = new JLabel("\uC18C\uB9AC");
		Label5_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label5_2.setBounds(44, 77, 157, 49);
		panel5.add(Label5_2);
		
		JLabel Label5_3 = new JLabel("5 / ?");
		Label5_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label5_3.setBounds(228, 93, 115, 49);
		panel5.add(Label5_3);
		
		JRadioButton rdbtn5_1 = new JRadioButton("\uC774\uC5B4\uD3F0");
		buttonGroup3.add(rdbtn5_1);
		rdbtn5_1.setBounds(54, 132, 121, 23);
		panel5.add(rdbtn5_1);
		
		JRadioButton rdbtn5_2 = new JRadioButton("\uC2A4\uD53C\uCEE4");
		buttonGroup3.add(rdbtn5_2);
		rdbtn5_2.setBounds(64, 157, 121, 23);
		panel5.add(rdbtn5_2);
		
		JRadioButton rdbtn5_3 = new JRadioButton("\uC0C1\uAD00\uC5C6\uC74C");
		buttonGroup3.add(rdbtn5_3);
		rdbtn5_3.setBounds(74, 182, 121, 23);
		panel5.add(rdbtn5_3);
		
		panel6.setLayout(null);
		panel6.setBounds(26, 178, 1000, 600);
		contentPane.add(panel6);
		
		JButton btn6_1 = new JButton("\uC124\uBB38\uC644\uB8CC");
		btn6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false); 
			}
		});
		btn6_1.setBounds(254, 182, 97, 23);
		panel6.add(btn6_1);
		
		JLabel Label6_1 = new JLabel("\uB2C8\uBC29 \uC870\uAC74\uC744 \uC124\uC815\uD574 \uBCFC\uAE4C\uC694?");
		Label6_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label6_1.setBounds(12, 18, 429, 49);
		panel6.add(Label6_1);
		
		JLabel Label6_2 = new JLabel("\uD5A5\uC218");
		Label6_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label6_2.setBounds(44, 77, 157, 49);
		panel6.add(Label6_2);
		
		JLabel Label6_3 = new JLabel("6 / ?");
		Label6_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label6_3.setBounds(228, 93, 115, 49);
		panel6.add(Label6_3);
		
		JRadioButton rdbtn6_1 = new JRadioButton("\uC0AC\uC6A9");
		buttonGroup4.add(rdbtn6_1);
		rdbtn6_1.setBounds(54, 132, 121, 23);
		panel6.add(rdbtn6_1);
		
		JRadioButton rdbtn6_2 = new JRadioButton("\uBBF8\uC0AC\uC6A9");
		buttonGroup4.add(rdbtn6_2);
		rdbtn6_2.setBounds(64, 157, 121, 23);
		panel6.add(rdbtn6_2);
		
		JLabel Label = new JLabel("\uC870\uAC74\uC5D0 \uB9DE\uB294 \uB2C8\uBC29 \uB9E4\uCE6D\uC911...");
		Label.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		Label.setBounds(412, 378, 441, 63);
		contentPane.add(Label);
	}
}