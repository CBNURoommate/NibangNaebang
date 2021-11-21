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
	private int sensitive;
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
	
	ModFunctions m=new ModFunctions();
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
		setTitle("\uB2C8\uBC29\uB0B4\uBC29 - \uB0B4\uBC29 \uC810\uAC80\uD558\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();
		JPanel panel16 = new JPanel();
		JPanel panel17 = new JPanel();
		JPanel panel18 = new JPanel();
		JPanel panel19 = new JPanel();
		JPanel panel20 = new JPanel();
		JPanel panel21 = new JPanel();
		JPanel panel22 = new JPanel();
		JPanel panel23 = new JPanel();
		JPanel panel24 = new JPanel();
		JPanel panel25 = new JPanel();
		JPanel panel26 = new JPanel();
		JPanel panel27 = new JPanel();
		JPanel panel28 = new JPanel();

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
		
		JPanel line1 = new JPanel();
		line1.setBounds(230, 50, 1, 20);
		line1.setLayout(null);
		line1.setBackground(Color.BLACK);
		contentPane.add(line1);
		
		JPanel line2 = new JPanel();
		line2.setBounds(21, 96, 652, 1);
		contentPane.add(line2);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29");
		titleLabel.setBounds(47, 0, 167, 92);
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		contentPane.add(titleLabel);
		
		JButton movePage1 = new JButton("\uB0B4\uBC29 \uC810\uAC80\uD558\uAE30");
		movePage1.setBounds(234, 20, 195, 72);
		movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage1.setFocusPainted(false);
		movePage1.setContentAreaFilled(false);
		movePage1.setBorderPainted(false);
		movePage1.setBackground(Color.BLUE);
		contentPane.add(movePage1);
		
		JButton movePage2 = new JButton("\uB2C8\uBC29 \uB79C\uB364\uB9E4\uCE6D");
		movePage2.setBounds(621, 13, 195, 72);
		movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage2.setFocusPainted(false);
		movePage2.setContentAreaFilled(false);
		movePage2.setBorderPainted(false);
		movePage2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage2);
		
		JButton movePage3 = new JButton("\uB2C8\uBC29 \uCC3E\uC544\uBCF4\uAE30");
		movePage3.setBounds(815, 20, 195, 72);
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setFocusPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setBorderPainted(false);
		movePage3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage3);
		
		JButton movePage4 = new JButton("\uB0B4\uBC29 \uC18C\uAC1C\uD558\uAE30");
		movePage4.setBounds(430, 13, 195, 72);
		movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage4.setFocusPainted(false);
		movePage4.setContentAreaFilled(false);
		movePage4.setBorderPainted(false);
		movePage4.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage4);
		
		panel.setBounds(572, 104, 1000, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		
		btn1_1.setBounds(386, 221, 97, 23);
		panel.add(btn1_1);
		
		JLabel Label1_1 = new JLabel("\uC131\uBCC4");
		Label1_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label1_1.setBounds(38, 28, 115, 49);
		panel.add(Label1_1);
		
		JLabel Label1_2 = new JLabel("1 / ?");
		Label1_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label1_2.setBounds(163, 202, 115, 49);
		panel.add(Label1_2);
		
		JRadioButton rdbtn1_1 = new JRadioButton("\uB0A8\uC790");
		buttonGroup1.add(rdbtn1_1);
		rdbtn1_1.setBounds(87, 125, 121, 23);
		panel.add(rdbtn1_1);
		
		JRadioButton rdbtn1_2 = new JRadioButton("\uC5EC\uC790");
		buttonGroup1.add(rdbtn1_2);
		rdbtn1_2.setBounds(245, 125, 121, 23);
		panel.add(rdbtn1_2);
		
		panel2.setLayout(null);
		panel2.setBounds(555, 107, 1000, 600);
		contentPane.add(panel2);
		
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtn1_1.isSelected())
				{
					gender=1;
				}
				else if(rdbtn1_2.isSelected())
				{
					gender=2;
				}
				panel.setVisible(false); 
				panel2.setVisible(true); 
			}
		});
		JButton btn2_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		
		btn2_1.setBounds(386, 221, 97, 23);
		panel2.add(btn2_1);
		
		JLabel Label2_1 = new JLabel("\uAE30\uC219\uC0AC");
		Label2_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label2_1.setBounds(38, 28, 115, 49);
		panel2.add(Label2_1);
		
		JLabel Label2_2 = new JLabel("2 / ?");
		Label2_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label2_2.setBounds(242, 125, 115, 49);
		panel2.add(Label2_2);
		
		JRadioButton rdbtn2_1 = new JRadioButton("개성재");
		buttonGroup2.add(rdbtn2_1);
		rdbtn2_1.setBounds(38, 99, 121, 23);
		panel2.add(rdbtn2_1);
		
		JRadioButton rdbtn2_2 = new JRadioButton("계영원");
		buttonGroup2.add(rdbtn2_2);
		rdbtn2_2.setBounds(48, 124, 121, 23);
		panel2.add(rdbtn2_2);
		
		JRadioButton rdbtn2_3 = new JRadioButton("양성재");
		buttonGroup2.add(rdbtn2_3);
		rdbtn2_3.setBounds(58, 149, 121, 23);
		panel2.add(rdbtn2_3);
		
		JRadioButton rdbtn2_4 = new JRadioButton("양진재");
		buttonGroup2.add(rdbtn2_4);
		rdbtn2_4.setBounds(68, 174, 121, 23);
		panel2.add(rdbtn2_4);
		
		JRadioButton rdbtn2_5 = new JRadioButton("양현재");
		buttonGroup2.add(rdbtn2_5);
		rdbtn2_5.setBounds(78, 199, 121, 23);
		panel2.add(rdbtn2_5);
	
		panel3.setLayout(null);
		panel3.setBounds(540, 117, 1000, 600);
		contentPane.add(panel3);
		
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn2_1.isSelected())
				{
					dom=1;
				}
				else if(rdbtn2_2.isSelected())
				{
					dom=2;
				}
				else if(rdbtn2_3.isSelected())
				{
					dom=3;
				}
				else if(rdbtn2_4.isSelected())
				{
					dom=4;
				}
				else if(rdbtn2_5.isSelected())
				{
					dom=5;
				}
				else
				{
					
				}
				panel2.setVisible(false); 
				panel3.setVisible(true); 
			}
		});
		JButton btn3_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		
		btn3_1.setBounds(386, 221, 97, 23);
		panel3.add(btn3_1);
		
		JLabel Label3_1 = new JLabel("\uC0DD\uB144 & \uD559\uBC88");
		Label3_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label3_1.setBounds(38, 28, 200, 49);
		panel3.add(Label3_1);
		
		JLabel Label3_2 = new JLabel("3 / ?");
		Label3_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label3_2.setBounds(163, 202, 115, 49);
		panel3.add(Label3_2);
		
		JLabel Label3_3 = new JLabel("\uC0DD\uB144");
		Label3_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		Label3_3.setBounds(163, 131, 51, 49);
		panel3.add(Label3_3);
		
		JLabel Label3_4 = new JLabel("\uD559\uBC88");
		Label3_4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		Label3_4.setBounds(163, 88, 51, 49);
		panel3.add(Label3_4);
		
		textField3_1 = new JTextField();
		textField3_1.setBounds(240, 107, 116, 21);
		panel3.add(textField3_1);
		textField3_1.setColumns(10);
		
		textField3_2 = new JTextField();
		textField3_2.setBounds(240, 150, 116, 21);
		panel3.add(textField3_2);
		textField3_2.setColumns(10);
		
		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hakbun=Integer.parseInt(textField3_1.getText());
				age=Integer.parseInt(textField3_2.getText());
				
				panel3.setVisible(false); 
				panel4.setVisible(true); 
			}
		});
		panel4.setLayout(null);
		panel4.setBounds(526, 127, 1000, 600);
		contentPane.add(panel4);
		
		JButton btn4_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		
		btn4_1.setBounds(381, 243, 97, 23);
		panel4.add(btn4_1);
		
		JLabel Label4_1 = new JLabel("\uC131\uBCC4");
		Label4_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label4_1.setBounds(38, 28, 115, 49);
		panel4.add(Label4_1);
		
		JLabel Label4_2 = new JLabel("4 / ?");
		Label4_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label4_2.setBounds(140, 239, 115, 49);
		panel4.add(Label4_2);
		
		JRadioButton rdbtn4_1 = new JRadioButton("\uC778\uBB38");
		buttonGroup3.add(rdbtn4_1);
		rdbtn4_1.setBounds(48, 83, 121, 23);
		panel4.add(rdbtn4_1);
		
		JRadioButton rdbtn4_2 = new JRadioButton("\uC0AC\uACFC");
		buttonGroup3.add(rdbtn4_2);
		rdbtn4_2.setBounds(183, 83, 121, 23);
		panel4.add(rdbtn4_2);
		
		JRadioButton rdbtn4_3 = new JRadioButton("\uC790\uACFC");
		buttonGroup3.add(rdbtn4_3);
		rdbtn4_3.setBounds(58, 108, 121, 23);
		panel4.add(rdbtn4_3);
		
		JRadioButton rdbtn4_4 = new JRadioButton("\uACBD\uC601");
		buttonGroup3.add(rdbtn4_4);
		rdbtn4_4.setBounds(193, 108, 121, 23);
		panel4.add(rdbtn4_4);
		
		JRadioButton rdbtn4_5 = new JRadioButton("\uACF5\uACFC");
		buttonGroup3.add(rdbtn4_5);
		rdbtn4_5.setBounds(68, 133, 121, 23);
		panel4.add(rdbtn4_5);
		
		JRadioButton rdbtn4_6 = new JRadioButton("\uC804\uC815");
		buttonGroup3.add(rdbtn4_6);
		rdbtn4_6.setBounds(203, 133, 121, 23);
		panel4.add(rdbtn4_6);
		
		JRadioButton rdbtn4_7 = new JRadioButton("\uB18D\uC0DD");
		buttonGroup3.add(rdbtn4_7);
		rdbtn4_7.setBounds(78, 158, 121, 23);
		panel4.add(rdbtn4_7);
		
		JRadioButton rdbtn4_8 = new JRadioButton("\uC0AC\uBC94");
		buttonGroup3.add(rdbtn4_8);
		rdbtn4_8.setBounds(213, 158, 121, 23);
		panel4.add(rdbtn4_8);
		
		JRadioButton rdbtn4_9 = new JRadioButton("\uC0DD\uACFC");
		buttonGroup3.add(rdbtn4_9);
		rdbtn4_9.setBounds(88, 183, 121, 23);
		panel4.add(rdbtn4_9);
		
		JRadioButton rdbtn4_10 = new JRadioButton("\uC218\uC758\uB300");
		buttonGroup3.add(rdbtn4_10);
		rdbtn4_10.setBounds(223, 183, 121, 23);
		panel4.add(rdbtn4_10);
		
		JRadioButton rdbtn4_11 = new JRadioButton("\uC758\uACFC");
		buttonGroup3.add(rdbtn4_11);
		rdbtn4_11.setBounds(98, 208, 121, 23);
		panel4.add(rdbtn4_11);
		
		JRadioButton rdbtn4_12 = new JRadioButton("\uC790\uC728");
		buttonGroup3.add(rdbtn4_12);
		rdbtn4_12.setBounds(233, 208, 121, 23);
		panel4.add(rdbtn4_12);
		
		btn4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn4_1.isSelected())
				{
					department=1;
				}
				else if(rdbtn4_2.isSelected())
				{
					department=2;
				}
				else if(rdbtn4_3.isSelected())
				{
					department=3;
				}
				else if(rdbtn4_4.isSelected())
				{
					department=4;
				}
				else if(rdbtn4_5.isSelected())
				{
					department=5;
				}
				else if(rdbtn4_6.isSelected())
				{
					department=6;
				}
				else if(rdbtn4_7.isSelected())
				{
					department=7;
				}
				else if(rdbtn4_8.isSelected())
				{
					department=8;
				}
				else if(rdbtn4_9.isSelected())
				{
					department=9;
				}
				else if(rdbtn4_10.isSelected())
				{
					department=10;
				}
				else if(rdbtn4_11.isSelected())
				{
					department=11;
				}
				else if(rdbtn4_12.isSelected())
				{
					department=12;
				}
				else
				{
					
				}
				panel4.setVisible(false); 
				panel5.setVisible(true); 
			}
		});
		panel5.setLayout(null);
		panel5.setBounds(515, 137, 1000, 600);
		contentPane.add(panel5);
		
		JButton btn5_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		
		btn5_1.setBounds(386, 221, 97, 23);
		panel5.add(btn5_1);
		
		JLabel Label5_1 = new JLabel("\uCDE8\uCE68\uC2DC\uAC04");
		Label5_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label5_1.setBounds(38, 28, 137, 49);
		panel5.add(Label5_1);
		
		JLabel Label5_2 = new JLabel("5 / ?");
		Label5_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label5_2.setBounds(246, 108, 115, 49);
		panel5.add(Label5_2);
		
		JRadioButton rdbtn5_1 = new JRadioButton("10\uC2DC");
		buttonGroup4.add(rdbtn5_1);
		rdbtn5_1.setBounds(26, 83, 121, 23);
		panel5.add(rdbtn5_1);
		
		JRadioButton rdbtn5_2 = new JRadioButton("11\uC2DC");
		buttonGroup4.add(rdbtn5_2);
		rdbtn5_2.setBounds(38, 108, 121, 23);
		panel5.add(rdbtn5_2);
		
		JRadioButton rdbtn5_3 = new JRadioButton("12\uC2DC");
		buttonGroup4.add(rdbtn5_3);
		rdbtn5_3.setBounds(54, 133, 121, 23);
		panel5.add(rdbtn5_3);
		
		JRadioButton rdbtn5_4 = new JRadioButton("1\uC2DC");
		buttonGroup4.add(rdbtn5_4);
		rdbtn5_4.setBounds(64, 158, 121, 23);
		panel5.add(rdbtn5_4);
		
		JRadioButton rdbtn5_5 = new JRadioButton("2\uC2DC");
		buttonGroup4.add(rdbtn5_5);
		rdbtn5_5.setBounds(74, 183, 121, 23);
		panel5.add(rdbtn5_5);
		
		JRadioButton rdbtn5_6 = new JRadioButton("3\uC2DC \uC774\uD6C4");
		buttonGroup4.add(rdbtn5_6);
		rdbtn5_6.setBounds(94, 208, 121, 23);
		panel5.add(rdbtn5_6);
		
		btn5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				panel5.setVisible(false); 
				panel6.setVisible(true); 
			}
		});
		panel6.setLayout(null);
		panel6.setBounds(501, 147, 1000, 600);
		contentPane.add(panel6);
		
		JButton btn6_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false); 
				panel7.setVisible(true); 
			}
		});
		btn6_1.setBounds(386, 221, 97, 23);
		panel6.add(btn6_1);
		
		JLabel Label6_1 = new JLabel("\uAE30\uC0C1\uC2DC\uAC04");
		Label6_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label6_1.setBounds(38, 28, 137, 49);
		panel6.add(Label6_1);
		
		JLabel Label6_2 = new JLabel("6 / ?");
		Label6_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label6_2.setBounds(313, 147, 115, 49);
		panel6.add(Label6_2);
		
		JRadioButton rdbtn6_1 = new JRadioButton("7\uC2DC");
		buttonGroup5.add(rdbtn6_1);
		rdbtn6_1.setBounds(42, 96, 121, 23);
		panel6.add(rdbtn6_1);
		
		JRadioButton rdbtn6_2 = new JRadioButton("8\uC2DC");
		buttonGroup5.add(rdbtn6_2);
		rdbtn6_2.setBounds(54, 121, 121, 23);
		panel6.add(rdbtn6_2);
		
		JRadioButton rdbtn6_3 = new JRadioButton("9\uC2DC");
		buttonGroup5.add(rdbtn6_3);
		rdbtn6_3.setBounds(64, 146, 121, 23);
		panel6.add(rdbtn6_3);
		
		JRadioButton rdbtn6_4 = new JRadioButton("10\uC2DC");
		buttonGroup5.add(rdbtn6_4);
		rdbtn6_4.setBounds(74, 171, 121, 23);
		panel6.add(rdbtn6_4);
		
		JRadioButton rdbtn6_5 = new JRadioButton("11\uC2DC");
		buttonGroup5.add(rdbtn6_5);
		rdbtn6_5.setBounds(84, 196, 121, 23);
		panel6.add(rdbtn6_5);
		
		JRadioButton rdbtn6_6 = new JRadioButton("\uC624\uD6C4");
		buttonGroup5.add(rdbtn6_6);
		rdbtn6_6.setBounds(94, 221, 121, 23);
		panel6.add(rdbtn6_6);
		
		panel7.setLayout(null);
		panel7.setBounds(486, 158, 1000, 600);
		contentPane.add(panel7);
		
		JButton btn7_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel7.setVisible(false); 
				panel8.setVisible(true); 
			}
		});
		btn7_1.setBounds(386, 221, 97, 23);
		panel7.add(btn7_1);
		
		JLabel Label7_1 = new JLabel("\uC0E4\uC6CC\uC18C\uC694\uC2DC\uAC04");
		Label7_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label7_1.setBounds(38, 28, 196, 49);
		panel7.add(Label7_1);
		
		JLabel Label7_2 = new JLabel("7 / ?");
		Label7_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label7_2.setBounds(312, 162, 115, 49);
		panel7.add(Label7_2);
		
		JRadioButton rdbtn7_1 = new JRadioButton("5\uBD84");
		buttonGroup6.add(rdbtn7_1);
		rdbtn7_1.setBounds(62, 95, 121, 23);
		panel7.add(rdbtn7_1);
		
		JRadioButton rdbtn7_2 = new JRadioButton("10\uBD84");
		buttonGroup6.add(rdbtn7_2);
		rdbtn7_2.setBounds(74, 120, 121, 23);
		panel7.add(rdbtn7_2);
		
		JRadioButton rdbtn7_3 = new JRadioButton("15\uBD84");
		buttonGroup6.add(rdbtn7_3);
		rdbtn7_3.setBounds(84, 145, 121, 23);
		panel7.add(rdbtn7_3);
		
		JRadioButton rdbtn7_4 = new JRadioButton("20\uBD84");
		buttonGroup6.add(rdbtn7_4);
		rdbtn7_4.setBounds(94, 170, 121, 23);
		panel7.add(rdbtn7_4);
		
		JRadioButton rdbtn7_5 = new JRadioButton("25\uBD84");
		buttonGroup6.add(rdbtn7_5);
		rdbtn7_5.setBounds(104, 195, 121, 23);
		panel7.add(rdbtn7_5);
		
		JRadioButton rdbtn7_6 = new JRadioButton("30\uBD84 \uC774\uC0C1");
		buttonGroup6.add(rdbtn7_6);
		rdbtn7_6.setBounds(114, 221, 121, 23);
		panel7.add(rdbtn7_6);
		
		panel8.setLayout(null);
		panel8.setBounds(469, 168, 1000, 600);
		contentPane.add(panel8);
		
		JButton btn8_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel8.setVisible(false); 
				panel9.setVisible(true); 
			}
		});
		btn8_1.setBounds(386, 221, 97, 23);
		panel8.add(btn8_1);
		
		JLabel Label8_1 = new JLabel("\uC0E4\uC6CC\uC2DC\uAC04");
		Label8_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label8_1.setBounds(38, 28, 136, 49);
		panel8.add(Label8_1);
		
		JLabel Label8_2 = new JLabel("8 / ?");
		Label8_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label8_2.setBounds(178, 195, 115, 49);
		panel8.add(Label8_2);
		
		JRadioButton rdbtn8_1 = new JRadioButton("\uC544\uCE68");
		buttonGroup7.add(rdbtn8_1);
		rdbtn8_1.setBounds(62, 95, 121, 23);
		panel8.add(rdbtn8_1);
		
		JRadioButton rdbtn8_2 = new JRadioButton("\uC800\uB141");
		buttonGroup7.add(rdbtn8_2);
		rdbtn8_2.setBounds(74, 120, 121, 23);
		panel8.add(rdbtn8_2);
		
		JRadioButton rdbtn8_3 = new JRadioButton("\uC720\uB3D9\uC801");
		buttonGroup7.add(rdbtn8_3);
		rdbtn8_3.setBounds(84, 145, 121, 23);
		panel8.add(rdbtn8_3);
		
		panel9.setLayout(null);
		panel9.setBounds(451, 179, 1000, 600);
		contentPane.add(panel9);
		
		JButton btn9_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel9.setVisible(false); 
				panel10.setVisible(true); 
			}
		});
		btn9_1.setBounds(386, 221, 97, 23);
		panel9.add(btn9_1);
		
		JLabel Label9_1 = new JLabel("\uC7A0\uADC0");
		Label9_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label9_1.setBounds(38, 28, 136, 49);
		panel9.add(Label9_1);
		
		JLabel Label9_2 = new JLabel("9 / ?");
		Label9_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label9_2.setBounds(178, 195, 115, 49);
		panel9.add(Label9_2);
		
		JRadioButton rdbtn9_1 = new JRadioButton("\uC5B4\uB450\uC6C0");
		buttonGroup8.add(rdbtn9_1);
		rdbtn9_1.setBounds(62, 95, 121, 23);
		panel9.add(rdbtn9_1);
		
		JRadioButton rdbtn9_2 = new JRadioButton("\uBCF4\uD1B5");
		buttonGroup8.add(rdbtn9_2);
		rdbtn9_2.setBounds(74, 120, 121, 23);
		panel9.add(rdbtn9_2);
		
		JRadioButton rdbtn9_3 = new JRadioButton("\uBC1D\uC74C");
		buttonGroup8.add(rdbtn9_3);
		rdbtn9_3.setBounds(84, 145, 121, 23);
		panel9.add(rdbtn9_3);
		
		panel10.setLayout(null);
		panel10.setBounds(438, 190, 1000, 600);
		contentPane.add(panel10);
		
		JButton btn10_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel10.setVisible(false); 
				panel11.setVisible(true); 
			}
		});
		btn10_1.setBounds(386, 221, 97, 23);
		panel10.add(btn10_1);
		
		JLabel Label10_1 = new JLabel("\uC7A0\uBC84\uB987");
		Label10_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label10_1.setBounds(38, 28, 136, 49);
		panel10.add(Label10_1);
		
		JLabel Label10_2 = new JLabel("10 / ?");
		Label10_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label10_2.setBounds(178, 195, 115, 49);
		panel10.add(Label10_2);
		
		JCheckBox checkbtn10_1 = new JCheckBox("\uC5C6\uC74C");
		checkbtn10_1.setBounds(59, 94, 115, 23);
		panel10.add(checkbtn10_1);
		
		JCheckBox checkbtn10_2 = new JCheckBox("\uC774\uAC08\uC774");
		checkbtn10_2.setBounds(190, 94, 115, 23);
		panel10.add(checkbtn10_2);
		
		JCheckBox checkbtn10_3 = new JCheckBox("\uC7A0\uAF2C\uB300");
		checkbtn10_3.setBounds(200, 119, 115, 23);
		panel10.add(checkbtn10_3);
		
		JCheckBox checkbtn10_4 = new JCheckBox("\uCF54\uACE8\uC774");
		checkbtn10_4.setBounds(210, 144, 115, 23);
		panel10.add(checkbtn10_4);
		
		panel11.setLayout(null);
		panel11.setBounds(430, 200, 1000, 600);
		contentPane.add(panel11);
		
		JButton btn11_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel11.setVisible(false); 
				panel12.setVisible(true); 
			}
		});
		btn11_1.setBounds(386, 221, 97, 23);
		panel11.add(btn11_1);
		
		JLabel Label11_1 = new JLabel("\uC218\uBA74\uB4F1");
		Label11_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label11_1.setBounds(38, 28, 136, 49);
		panel11.add(Label11_1);
		
		JLabel Label11_2 = new JLabel("11 / ?");
		Label11_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label11_2.setBounds(178, 195, 115, 49);
		panel11.add(Label11_2);
		
		JRadioButton rdbtn11_1 = new JRadioButton("\uC548\uC500");
		buttonGroup9.add(rdbtn11_1);
		rdbtn11_1.setBounds(62, 95, 121, 23);
		panel11.add(rdbtn11_1);
		
		JRadioButton rdbtn11_2 = new JRadioButton("\uD615\uAD11\uB4F1");
		buttonGroup9.add(rdbtn11_2);
		rdbtn11_2.setBounds(74, 120, 121, 23);
		panel11.add(rdbtn11_2);
		
		JRadioButton rdbtn11_3 = new JRadioButton("\uC2A4\uD0E0\uB4DC");
		buttonGroup9.add(rdbtn11_3);
		rdbtn11_3.setBounds(84, 145, 121, 23);
		panel11.add(rdbtn11_3);
		
		JRadioButton rdbtn11_4 = new JRadioButton("\uBB34\uB4DC\uB4F1");
		buttonGroup9.add(rdbtn11_4);
		rdbtn11_4.setBounds(94, 170, 121, 23);
		panel11.add(rdbtn11_4);
		
		panel12.setLayout(null);
		panel12.setBounds(409, 212, 1000, 600);
		contentPane.add(panel12);
		
		JButton btn12_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel12.setVisible(false); 
				panel13.setVisible(true); 
			}
		});
		btn12_1.setBounds(386, 221, 97, 23);
		panel12.add(btn12_1);
		
		JLabel Label12_1 = new JLabel("\uC54C\uB78C");
		Label12_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label12_1.setBounds(38, 28, 136, 49);
		panel12.add(Label12_1);
		
		JLabel Label12_2 = new JLabel("12 / ?");
		Label12_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label12_2.setBounds(178, 195, 115, 49);
		panel12.add(Label12_2);
		
		JRadioButton rdbtn12_1 = new JRadioButton("\uBABB\uB4E4\uC5B4\uC694");
		buttonGroup10.add(rdbtn12_1);
		rdbtn12_1.setBounds(62, 95, 121, 23);
		panel12.add(rdbtn12_1);
		
		JRadioButton rdbtn12_2 = new JRadioButton("\uC911\uAC04");
		buttonGroup10.add(rdbtn12_2);
		rdbtn12_2.setBounds(74, 120, 121, 23);
		panel12.add(rdbtn12_2);
		
		JRadioButton rdbtn12_3 = new JRadioButton("\uC798\uB4E4\uC5B4\uC694");
		buttonGroup10.add(rdbtn12_3);
		rdbtn12_3.setBounds(84, 145, 121, 23);
		panel12.add(rdbtn12_3);
		
		panel13.setLayout(null);
		panel13.setBounds(393, 216, 1000, 600);
		contentPane.add(panel13);
		
		JButton btn13_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel13.setVisible(false); 
				panel14.setVisible(true); 
			}
		});
		btn13_1.setBounds(386, 221, 97, 23);
		panel13.add(btn13_1);
		
		JLabel Label13_1 = new JLabel("\uCCAD\uC18C");
		Label13_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label13_1.setBounds(38, 28, 136, 49);
		panel13.add(Label13_1);
		
		JLabel Label13_2 = new JLabel("13 / ?");
		Label13_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label13_2.setBounds(178, 195, 115, 49);
		panel13.add(Label13_2);
		
		JRadioButton rdbtn13_1 = new JRadioButton("\uC790\uC8FC");
		buttonGroup11.add(rdbtn13_1);
		rdbtn13_1.setBounds(62, 95, 121, 23);
		panel13.add(rdbtn13_1);
		
		JRadioButton rdbtn13_2 = new JRadioButton("\uBCF4\uD1B5");
		buttonGroup11.add(rdbtn13_2);
		rdbtn13_2.setBounds(74, 120, 121, 23);
		panel13.add(rdbtn13_2);
		
		JRadioButton rdbtn13_3 = new JRadioButton("\uD55C\uBC88\uC5D0");
		buttonGroup11.add(rdbtn13_3);
		rdbtn13_3.setBounds(84, 145, 121, 23);
		panel13.add(rdbtn13_3);
		
		panel14.setLayout(null);
		panel14.setBounds(378, 221, 1000, 600);
		contentPane.add(panel14);
		
		JButton btn14_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel14.setVisible(false); 
				panel15.setVisible(true); 
			}
		});
		btn14_1.setBounds(386, 221, 97, 23);
		panel14.add(btn14_1);
		
		JLabel Label14_1 = new JLabel("\uB354\uC704");
		Label14_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label14_1.setBounds(38, 28, 136, 49);
		panel14.add(Label14_1);
		
		JLabel Label14_2 = new JLabel("14 / ?");
		Label14_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label14_2.setBounds(178, 195, 115, 49);
		panel14.add(Label14_2);
		
		JRadioButton rdbtn14_1 = new JRadioButton("\uC801\uAC8C\uD0D0");
		buttonGroup12.add(rdbtn14_1);
		rdbtn14_1.setBounds(62, 95, 121, 23);
		panel14.add(rdbtn14_1);
		
		JRadioButton rdbtn14_2 = new JRadioButton("\uBCF4\uD1B5");
		buttonGroup12.add(rdbtn14_2);
		rdbtn14_2.setBounds(74, 120, 121, 23);
		panel14.add(rdbtn14_2);
		
		JRadioButton rdbtn14_3 = new JRadioButton("\uB9CE\uC774\uD0D0");
		buttonGroup12.add(rdbtn14_3);
		rdbtn14_3.setBounds(84, 145, 121, 23);
		panel14.add(rdbtn14_3);
		
		panel15.setLayout(null);
		panel15.setBounds(362, 225, 1000, 600);
		contentPane.add(panel15);
		
		JButton btn15_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel15.setVisible(false); 
				panel16.setVisible(true); 
			}
		});
		btn15_1.setBounds(386, 221, 97, 23);
		panel15.add(btn15_1);
		
		JLabel Label15_1 = new JLabel("\uCD94\uC704");
		Label15_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label15_1.setBounds(38, 28, 136, 49);
		panel15.add(Label15_1);
		
		JLabel Label15_2 = new JLabel("15 / ?");
		Label15_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label15_2.setBounds(178, 195, 115, 49);
		panel15.add(Label15_2);
		
		JRadioButton rdbtn15_1 = new JRadioButton("\uC801\uAC8C\uD0D0");
		buttonGroup13.add(rdbtn15_1);
		rdbtn15_1.setBounds(62, 95, 121, 23);
		panel15.add(rdbtn15_1);
		
		JRadioButton rdbtn15_2 = new JRadioButton("\uBCF4\uD1B5");
		buttonGroup13.add(rdbtn15_2);
		rdbtn15_2.setBounds(74, 120, 121, 23);
		panel15.add(rdbtn15_2);
		
		JRadioButton rdbtn15_3 = new JRadioButton("\uB9CE\uC774\uD0D0");
		buttonGroup13.add(rdbtn15_3);
		rdbtn15_3.setBounds(84, 145, 121, 23);
		panel15.add(rdbtn15_3);
		
		panel16.setLayout(null);
		panel16.setBounds(350, 230, 1000, 600);
		contentPane.add(panel16);
		
		JButton btn16_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn16_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel16.setVisible(false); 
				panel17.setVisible(true); 
			}
		});
		btn16_1.setBounds(386, 221, 97, 23);
		panel16.add(btn16_1);
		
		JLabel Label16_1 = new JLabel("\uC18C\uB9AC");
		Label16_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label16_1.setBounds(38, 28, 136, 49);
		panel16.add(Label16_1);
		
		JLabel Label16_2 = new JLabel("16 / ?");
		Label16_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label16_2.setBounds(178, 195, 115, 49);
		panel16.add(Label16_2);
		
		JRadioButton rdbtn16_1 = new JRadioButton("\uC774\uC5B4\uD3F0");
		buttonGroup14.add(rdbtn16_1);
		rdbtn16_1.setBounds(62, 95, 121, 23);
		panel16.add(rdbtn16_1);
		
		JRadioButton rdbtn16_2 = new JRadioButton("\uC2A4\uD53C\uCEE4");
		buttonGroup14.add(rdbtn16_2);
		rdbtn16_2.setBounds(74, 120, 121, 23);
		panel16.add(rdbtn16_2);
		
		JRadioButton rdbtn16_3 = new JRadioButton("\uC720\uB3D9\uC801");
		buttonGroup14.add(rdbtn16_3);
		rdbtn16_3.setBounds(84, 145, 121, 23);
		panel16.add(rdbtn16_3);
		
		panel17.setLayout(null);
		panel17.setBounds(330, 238, 1000, 600);
		contentPane.add(panel17);
		
		JButton btn17_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn17_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel17.setVisible(false); 
				panel18.setVisible(true); 
			}
		});
		btn17_1.setBounds(386, 221, 97, 23);
		panel17.add(btn17_1);
		
		JLabel Label17_1 = new JLabel("\uD761\uC5F0\uC5EC\uBD80");
		Label17_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label17_1.setBounds(38, 28, 136, 49);
		panel17.add(Label17_1);
		
		JLabel Label17_2 = new JLabel("17 / ?");
		Label17_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label17_2.setBounds(178, 195, 115, 49);
		panel17.add(Label17_2);
		
		JRadioButton rdbtn17_1 = new JRadioButton("\uD761\uC5F0");
		buttonGroup15.add(rdbtn17_1);
		rdbtn17_1.setBounds(62, 95, 121, 23);
		panel17.add(rdbtn17_1);
		
		JRadioButton rdbtn17_2 = new JRadioButton("\uBE44\uD761\uC5F0");
		buttonGroup15.add(rdbtn17_2);
		rdbtn17_2.setBounds(74, 120, 121, 23);
		panel17.add(rdbtn17_2);
		
		panel18.setLayout(null);
		panel18.setBounds(311, 240, 1000, 600);
		contentPane.add(panel18);
		
		JButton btn18_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn18_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel18.setVisible(false); 
				panel19.setVisible(true); 
			}
		});
		btn18_1.setBounds(386, 221, 97, 23);
		panel18.add(btn18_1);
		
		JLabel Label18_1 = new JLabel("\uD761\uC5F0\uC5EC\uBD80");
		Label18_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label18_1.setBounds(38, 28, 136, 49);
		panel18.add(Label18_1);
		
		JLabel Label18_2 = new JLabel("18 / ?");
		Label18_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label18_2.setBounds(178, 195, 115, 49);
		panel18.add(Label18_2);
		
		JRadioButton rdbtn18_1 = new JRadioButton("\uBC18\uB300");
		buttonGroup16.add(rdbtn18_1);
		rdbtn18_1.setBounds(62, 95, 121, 23);
		panel18.add(rdbtn18_1);
		
		JRadioButton rdbtn18_2 = new JRadioButton("\uC0C1\uAD00\uC5C6\uC74C");
		buttonGroup16.add(rdbtn18_2);
		rdbtn18_2.setBounds(74, 120, 121, 23);
		panel18.add(rdbtn18_2);
		
		JRadioButton rdbtn18_3 = new JRadioButton("\uCC2C\uC131");
		buttonGroup16.add(rdbtn18_3);
		rdbtn18_3.setBounds(84, 145, 121, 23);
		panel18.add(rdbtn18_3);
		
		JRadioButton rdbtn18_4 = new JRadioButton("\uAC04\uB2E8\uD55C \uC6A9\uBB34\uB9CC");
		buttonGroup16.add(rdbtn18_4);
		rdbtn18_4.setBounds(94, 170, 121, 23);
		panel18.add(rdbtn18_4);
		
		panel19.setLayout(null);
		panel19.setBounds(301, 251, 1000, 600);
		contentPane.add(panel19);
		
		JButton btn19_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn19_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel19.setVisible(false); 
				panel20.setVisible(true); 
			}
		});
		btn19_1.setBounds(386, 221, 97, 23);
		panel19.add(btn19_1);
		
		JLabel Label19_1 = new JLabel("\uCE5C\uAD6C\uCD08\uB300");
		Label19_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label19_1.setBounds(38, 28, 136, 49);
		panel19.add(Label19_1);
		
		JLabel Label19_2 = new JLabel("19 / ?");
		Label19_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label19_2.setBounds(178, 195, 115, 49);
		panel19.add(Label19_2);
		
		JRadioButton rdbtn19_1 = new JRadioButton("\uAC00\uB2A5");
		buttonGroup17.add(rdbtn19_1);
		rdbtn19_1.setBounds(62, 95, 121, 23);
		panel19.add(rdbtn19_1);
		
		JRadioButton rdbtn19_2 = new JRadioButton("\uBD88\uAC00");
		buttonGroup17.add(rdbtn19_2);
		rdbtn19_2.setBounds(74, 120, 121, 23);
		panel19.add(rdbtn19_2);
		
		panel20.setLayout(null);
		panel20.setBounds(288, 261, 1000, 600);
		contentPane.add(panel20);
		
		JButton btn20_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn20_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel20.setVisible(false); 
				panel21.setVisible(true); 
			}
		});
		btn20_1.setBounds(386, 221, 97, 23);
		panel20.add(btn20_1);
		
		JLabel Label20_1 = new JLabel("\uAE30\uC219\uC0AC\uC2DD");
		Label20_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label20_1.setBounds(38, 28, 136, 49);
		panel20.add(Label20_1);
		
		JLabel Label20_2 = new JLabel("20 / ?");
		Label20_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label20_2.setBounds(178, 195, 115, 49);
		panel20.add(Label20_2);
		
		JRadioButton rdbtn20_1 = new JRadioButton("\uAC19\uC774");
		buttonGroup18.add(rdbtn20_1);
		rdbtn20_1.setBounds(62, 95, 121, 23);
		panel20.add(rdbtn20_1);
		
		JRadioButton rdbtn20_2 = new JRadioButton("\uB530\uB85C");
		buttonGroup18.add(rdbtn20_2);
		rdbtn20_2.setBounds(74, 120, 121, 23);
		panel20.add(rdbtn20_2);
		
		panel21.setLayout(null);
		panel21.setBounds(270, 272, 1000, 600);
		contentPane.add(panel21);
		
		JButton btn21_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn21_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel21.setVisible(false); 
				panel22.setVisible(true); 
			}
		});
		btn21_1.setBounds(386, 221, 97, 23);
		panel21.add(btn21_1);
		
		JLabel Label21_1 = new JLabel("\uACF5\uBD80");
		Label21_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label21_1.setBounds(38, 28, 136, 49);
		panel21.add(Label21_1);
		
		JLabel Label21_2 = new JLabel("21 / ?");
		Label21_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label21_2.setBounds(178, 195, 115, 49);
		panel21.add(Label21_2);
		
		JRadioButton rdbtn21_1 = new JRadioButton("\uAE30\uC219\uC0AC");
		buttonGroup19.add(rdbtn21_1);
		rdbtn21_1.setBounds(62, 95, 121, 23);
		panel21.add(rdbtn21_1);
		
		JRadioButton rdbtn21_2 = new JRadioButton("\uB3C4\uC11C\uAD00");
		buttonGroup19.add(rdbtn21_2);
		rdbtn21_2.setBounds(74, 120, 121, 23);
		panel21.add(rdbtn21_2);
		
		JRadioButton rdbtn21_3 = new JRadioButton("\uC720\uB3D9\uC801");
		buttonGroup19.add(rdbtn21_3);
		rdbtn21_3.setBounds(84, 145, 121, 23);
		panel21.add(rdbtn21_3);
		
		panel22.setLayout(null);
		panel22.setBounds(249, 283, 1000, 600);
		contentPane.add(panel22);
		
		JButton btn22_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn22_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel22.setVisible(false); 
				panel23.setVisible(true); 
			}
		});
		btn22_1.setBounds(386, 221, 97, 23);
		panel22.add(btn22_1);
		
		JLabel Label22_1 = new JLabel("\uD5A5\uC218");
		Label22_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label22_1.setBounds(38, 28, 136, 49);
		panel22.add(Label22_1);
		
		JLabel Label22_2 = new JLabel("22 / ?");
		Label22_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label22_2.setBounds(178, 195, 115, 49);
		panel22.add(Label22_2);
		
		JRadioButton rdbtn22_1 = new JRadioButton("\uBBF8\uC0AC\uC6A9");
		buttonGroup20.add(rdbtn22_1);
		rdbtn22_1.setBounds(62, 95, 121, 23);
		panel22.add(rdbtn22_1);
		
		JRadioButton rdbtn22_2 = new JRadioButton("\uC0AC\uC6A9");
		buttonGroup20.add(rdbtn22_2);
		rdbtn22_2.setBounds(74, 120, 121, 23);
		panel22.add(rdbtn22_2);
		
		panel23.setLayout(null);
		panel23.setBounds(234, 291, 1000, 600);
		contentPane.add(panel23);
		
		JButton btn23_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn23_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel23.setVisible(false); 
				panel24.setVisible(true); 
			}
		});
		btn23_1.setBounds(386, 221, 97, 23);
		panel23.add(btn23_1);
		
		JLabel Label23_1 = new JLabel("\uD5A5 \uBBFC\uAC10\uB3C4");
		Label23_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label23_1.setBounds(38, 28, 174, 49);
		panel23.add(Label23_1);
		
		JLabel Label23_2 = new JLabel("23 / ?");
		Label23_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label23_2.setBounds(178, 195, 115, 49);
		panel23.add(Label23_2);
		
		JRadioButton rdbtn23_1 = new JRadioButton("\uBBFC\uAC10");
		buttonGroup21.add(rdbtn23_1);
		rdbtn23_1.setBounds(62, 95, 121, 23);
		panel23.add(rdbtn23_1);
		
		JRadioButton rdbtn23_2 = new JRadioButton("\uC0C1\uAD00\uC5C6\uC74C");
		buttonGroup21.add(rdbtn23_2);
		rdbtn23_2.setBounds(74, 120, 121, 23);
		panel23.add(rdbtn23_2);
		
		panel24.setLayout(null);
		panel24.setBounds(223, 295, 1000, 600);
		contentPane.add(panel24);
		
		JButton btn24_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn24_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel24.setVisible(false); 
				panel25.setVisible(true); 
			}
		});
		btn24_1.setBounds(386, 221, 97, 23);
		panel24.add(btn24_1);
		
		JLabel Label24_1 = new JLabel("\uCEF4\uD4E8\uD130 \uAC8C\uC784");
		Label24_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label24_1.setBounds(38, 28, 188, 49);
		panel24.add(Label24_1);
		
		JLabel Label24_2 = new JLabel("24 / ?");
		Label24_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label24_2.setBounds(178, 195, 115, 49);
		panel24.add(Label24_2);
		
		JRadioButton rdbtn24_1 = new JRadioButton("\uC548\uD568");
		buttonGroup22.add(rdbtn24_1);
		rdbtn24_1.setBounds(62, 95, 121, 23);
		panel24.add(rdbtn24_1);
		
		JRadioButton rdbtn24_2 = new JRadioButton("\uAC00\uB054");
		buttonGroup22.add(rdbtn24_2);
		rdbtn24_2.setBounds(74, 120, 121, 23);
		panel24.add(rdbtn24_2);
		
		JRadioButton rdbtn24_3 = new JRadioButton("\uC790\uC8FC");
		buttonGroup22.add(rdbtn24_3);
		rdbtn24_3.setBounds(84, 145, 121, 23);
		panel24.add(rdbtn24_3);
		
		panel25.setLayout(null);
		panel25.setBounds(206, 298, 1000, 600);
		contentPane.add(panel25);
		
		JButton btn25_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn25_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel25.setVisible(false); 
				panel26.setVisible(true); 
			}
		});
		btn25_1.setBounds(386, 221, 97, 23);
		panel25.add(btn25_1);
		
		JLabel Label25_1 = new JLabel("\uC57C\uC2DD");
		Label25_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label25_1.setBounds(38, 28, 86, 49);
		panel25.add(Label25_1);
		
		JLabel Label25_2 = new JLabel("25 / ?");
		Label25_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label25_2.setBounds(178, 195, 115, 49);
		panel25.add(Label25_2);
		
		JRadioButton rdbtn25_1 = new JRadioButton("\uC548\uBA39\uC74C");
		buttonGroup23.add(rdbtn25_1);
		rdbtn25_1.setBounds(62, 95, 121, 23);
		panel25.add(rdbtn25_1);
		
		JRadioButton rdbtn25_2 = new JRadioButton("\uAC00\uB054");
		buttonGroup23.add(rdbtn25_2);
		rdbtn25_2.setBounds(74, 120, 121, 23);
		panel25.add(rdbtn25_2);
		
		JRadioButton rdbtn25_3 = new JRadioButton("\uC790\uC8FC");
		buttonGroup23.add(rdbtn25_3);
		rdbtn25_3.setBounds(84, 145, 121, 23);
		panel25.add(rdbtn25_3);
		
		panel26.setLayout(null);
		panel26.setBounds(187, 302, 1000, 600);
		contentPane.add(panel26);
		
		JButton btn26_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn26_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel26.setVisible(false); 
				panel27.setVisible(true); 
			}
		});
		btn26_1.setBounds(386, 221, 97, 23);
		panel26.add(btn26_1);
		
		JLabel Label26_1 = new JLabel("\uC220");
		Label26_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label26_1.setBounds(38, 28, 86, 49);
		panel26.add(Label26_1);
		
		JLabel Label26_2 = new JLabel("26 / ?");
		Label26_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label26_2.setBounds(178, 195, 115, 49);
		panel26.add(Label26_2);
		
		JRadioButton rdbtn26_1 = new JRadioButton("\uC548\uB9C8\uC2EC");
		buttonGroup24.add(rdbtn26_1);
		rdbtn26_1.setBounds(62, 95, 121, 23);
		panel26.add(rdbtn26_1);
		
		JRadioButton rdbtn26_2 = new JRadioButton("\uAC00\uB054");
		buttonGroup24.add(rdbtn26_2);
		rdbtn26_2.setBounds(74, 120, 121, 23);
		panel26.add(rdbtn26_2);
		
		JRadioButton rdbtn26_3 = new JRadioButton("\uC790\uC8FC");
		buttonGroup24.add(rdbtn26_3);
		rdbtn26_3.setBounds(84, 145, 121, 23);
		panel26.add(rdbtn26_3);
		
		panel27.setLayout(null);
		panel27.setBounds(174, 306, 1000, 600);
		contentPane.add(panel27);
		
		JButton btn27_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn27_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel27.setVisible(false); 
				panel28.setVisible(true); 
			}
		});
		btn27_1.setBounds(386, 221, 97, 23);
		panel27.add(btn27_1);
		
		JLabel Label27_1 = new JLabel("\uC2E4\uB0B4\uCDE8\uC2DD");
		Label27_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label27_1.setBounds(38, 28, 145, 49);
		panel27.add(Label27_1);
		
		JLabel Label27_2 = new JLabel("27 / ?");
		Label27_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label27_2.setBounds(178, 195, 115, 49);
		panel27.add(Label27_2);
		
		JRadioButton rdbtn27_1 = new JRadioButton("\uBD88\uAC00");
		buttonGroup25.add(rdbtn27_1);
		rdbtn27_1.setBounds(62, 95, 121, 23);
		panel27.add(rdbtn27_1);
		
		JRadioButton rdbtn27_2 = new JRadioButton("\uB0C4\uC0C8 \uC548\uB098\uB294 \uC74C\uC2DD\uB9CC");
		buttonGroup25.add(rdbtn27_2);
		rdbtn27_2.setBounds(74, 120, 167, 23);
		panel27.add(rdbtn27_2);
		
		JRadioButton rdbtn27_3 = new JRadioButton("\uAC00\uB2A5");
		buttonGroup25.add(rdbtn27_3);
		rdbtn27_3.setBounds(84, 145, 121, 23);
		panel27.add(rdbtn27_3);
		
		panel28.setLayout(null);
		panel28.setBounds(154, 317, 1000, 600);
		contentPane.add(panel28);
		
		JButton btn28_1 = new JButton("\uC124\uBB38\uC644\uB8CC");
		btn28_1.setBounds(386, 221, 97, 23);
		panel28.add(btn28_1);
		
		JLabel Label28_1 = new JLabel("\uBC8C\uB808");
		Label28_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label28_1.setBounds(38, 28, 136, 49);
		panel28.add(Label28_1);
		
		JLabel Label28_2 = new JLabel("28 / ?");
		Label28_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		Label28_2.setBounds(248, 145, 115, 49);
		panel28.add(Label28_2);
		
		JRadioButton rdbtn28_1 = new JRadioButton("\uD610\uC624");
		buttonGroup26.add(rdbtn28_1);
		rdbtn28_1.setBounds(62, 95, 121, 23);
		panel28.add(rdbtn28_1);
		
		JRadioButton rdbtn28_2 = new JRadioButton("\uBABB\uC7A1\uC74C");
		buttonGroup26.add(rdbtn28_2);
		rdbtn28_2.setBounds(74, 120, 121, 23);
		panel28.add(rdbtn28_2);
		
		JRadioButton rdbtn28_3 = new JRadioButton("\uC911\uAC04");
		buttonGroup26.add(rdbtn28_3);
		rdbtn28_3.setBounds(84, 145, 121, 23);
		panel28.add(rdbtn28_3);
		
		JRadioButton rdbtn28_4 = new JRadioButton("\uC7A1\uC74C");
		buttonGroup26.add(rdbtn28_4);
		rdbtn28_4.setBounds(94, 170, 121, 23);
		panel28.add(rdbtn28_4);
		
		JRadioButton rdbtn28_5 = new JRadioButton("\uADC0\uC5EC\uC6C0");
		buttonGroup26.add(rdbtn28_5);
		rdbtn28_5.setBounds(104, 195, 121, 23);
		panel28.add(rdbtn28_5);
	}
}
