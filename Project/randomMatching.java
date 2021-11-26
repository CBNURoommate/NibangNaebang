package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

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
		
		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(0, 96, 1600, 1);
		contentPane.add(line1);
		
		panel0.setLayout(null);
		panel0.setBounds(145, 290, 1343, 530);
		contentPane.add(panel0);
		
		JButton btn0_1 = new JButton("\uC124\uC815\uC2DC\uC791");
		btn0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel0.setVisible(false); 
				panel1.setVisible(true); 
			}
		});
		btn0_1.setBounds(600, 450, 97, 23);
		panel0.add(btn0_1);
		
		JLabel lblNewLabel = new JLabel("매칭 전, 매칭에 필요한 니방의 조건을 필수적으로 설정해야해요.");
		lblNewLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		lblNewLabel.setBounds(10, 10, 1150, 60);
		panel0.add(lblNewLabel);
		
		panel1.setLayout(null);
		panel1.setBounds(145, 290, 915, 530);
		contentPane.add(panel1);
		
		JButton btn1_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false); 
				panel2.setVisible(true); 
			}
		});
		btn1_1.setBounds(600, 450, 97, 23);
		panel1.add(btn1_1);
		
		JLabel Label2_1_1 = new JLabel("□ 범위를 선택하세요.");
		Label2_1_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		Label2_1_1.setBounds(170, 360, 400, 40);
		panel1.add(Label2_1_1);
		
		JLabel Label1_2 = new JLabel("Q1. 생년");
		Label1_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label1_2.setBounds(10, 10, 195, 60);
		panel1.add(Label1_2);
		
		JList list1_1 = new JList();
		list1_1.setBounds(249, 125, 87, 148);
		panel1.add(list1_1);
		list1_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JList list1_2 = new JList();
		list1_2.setBounds(483, 125, 87, 148);
		panel1.add(list1_2);
		list1_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		panel2.setLayout(null);
		panel2.setBounds(145, 290, 915, 530);
		contentPane.add(panel2);
		
		JButton btn2_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false); 
				panel3.setVisible(true); 
			}
		});
		btn2_1.setBounds(600, 450, 97, 23);
		panel2.add(btn2_1);
		
		JLabel Label2_1 = new JLabel("□ 범위를 선택하세요.");
		Label2_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		Label2_1.setBounds(170, 360, 400, 40);
		panel2.add(Label2_1);
		
		JLabel Label2_2 = new JLabel("Q2. 학번");
		Label2_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label2_2.setBounds(10, 10, 195, 60);
		panel2.add(Label2_2);
		
		JList list2_1 = new JList();
		list2_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"14", "15", "16", "17", "18", "19", "20", "21"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list2_1.setBounds(198, 124, 181, 191);
		panel2.add(list2_1);
		
		JList list2_2 = new JList();
		list2_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"14", "15", "16", "17", "18", "19", "20", "21"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list2_2.setBounds(439, 124, 195, 197);
		panel2.add(list2_2);
		
		panel3.setLayout(null);
		panel3.setBounds(145, 290, 915, 530);
		contentPane.add(panel3);
		
		JButton btn3_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3.setVisible(false); 
				panel4.setVisible(true); 
			}
		});
		btn3_1.setBounds(600, 450, 97, 23);
		panel3.add(btn3_1);
		
		JLabel Label3_2 = new JLabel("Q3. 흡연여부");
		Label3_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label3_2.setBounds(10, 10, 260, 60);
		panel3.add(Label3_2);
		
		JRadioButton rdbtn3_1 = new JRadioButton(" 흡연자");
		rdbtn3_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn3_1.setBackground(Color.WHITE);
		buttonGroup.add(rdbtn3_1);
		rdbtn3_1.setBounds(170, 120, 160, 60);
		panel3.add(rdbtn3_1);
		
		JRadioButton rdbtn3_2 = new JRadioButton(" 비흡연자");
		rdbtn3_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn3_2.setBackground(Color.WHITE);
		buttonGroup.add(rdbtn3_2);
		rdbtn3_2.setBounds(370, 120, 200, 60);
		panel3.add(rdbtn3_2);
		
		JRadioButton rdbtn3_3 = new JRadioButton(" 상관없음");
		rdbtn3_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		rdbtn3_3.setBackground(Color.WHITE);
		buttonGroup.add(rdbtn3_3);
		rdbtn3_3.setBounds(570, 120, 210, 60);
		panel3.add(rdbtn3_3);
		
		panel4.setLayout(null);
		panel4.setBounds(145, 290, 915, 530);
		contentPane.add(panel4);
		
		JButton btn4_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(false); 
				panel5.setVisible(true); 
			}
		});
		btn4_1.setBounds(600, 450, 97, 23);
		panel4.add(btn4_1);
		
		JLabel Label4_2 = new JLabel("Q4. 단과");
		Label4_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label4_2.setBounds(10, 10, 195, 60);
		panel4.add(Label4_2);
		
		JRadioButton rdbtn4_1 = new JRadioButton(" 같은 과");
		rdbtn4_1.setBackground(Color.WHITE);
		rdbtn4_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup2.add(rdbtn4_1);
		rdbtn4_1.setBounds(170, 120, 180, 60);
		panel4.add(rdbtn4_1);
		
		JRadioButton rdbtn4_2 = new JRadioButton(" 타과");
		rdbtn4_2.setBackground(Color.WHITE);
		rdbtn4_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup2.add(rdbtn4_2);
		rdbtn4_2.setBounds(370, 120, 160, 60);
		panel4.add(rdbtn4_2);
		
		JRadioButton rdbtn4_3 = new JRadioButton(" 상관없음");
		rdbtn4_3.setBackground(Color.WHITE);
		rdbtn4_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup2.add(rdbtn4_3);
		rdbtn4_3.setBounds(570, 120, 200, 60);
		panel4.add(rdbtn4_3);
		
		panel5.setLayout(null);
		panel5.setBounds(145, 290, 915, 530);
		contentPane.add(panel5);
		
		JButton btn5_1 = new JButton("\uB2E4\uC74C\uC9C8\uBB38");
		btn5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel5.setVisible(false); 
				panel6.setVisible(true); 
			}
		});
		btn5_1.setBounds(600, 450, 97, 23);
		panel5.add(btn5_1);
		
		JLabel Label5_2 = new JLabel("Q5. 소리");
		Label5_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label5_2.setBounds(10, 10, 195, 60);
		panel5.add(Label5_2);
		
		JRadioButton rdbtn5_1 = new JRadioButton(" 이어폰");
		rdbtn5_1.setBackground(Color.WHITE);
		rdbtn5_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup3.add(rdbtn5_1);
		rdbtn5_1.setBounds(170, 120, 160, 60);
		panel5.add(rdbtn5_1);
		
		JRadioButton rdbtn5_2 = new JRadioButton(" 스피커");
		rdbtn5_2.setBackground(Color.WHITE);
		rdbtn5_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup3.add(rdbtn5_2);
		rdbtn5_2.setBounds(370, 120, 160, 60);
		panel5.add(rdbtn5_2);
		
		JRadioButton rdbtn5_3 = new JRadioButton(" 상관없음");
		rdbtn5_3.setBackground(Color.WHITE);
		rdbtn5_3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup3.add(rdbtn5_3);
		rdbtn5_3.setBounds(570, 120, 200, 60);
		panel5.add(rdbtn5_3);
		
		panel6.setLayout(null);
		panel6.setBounds(145, 290, 915, 530);
		contentPane.add(panel6);
		
		JButton btn6_1 = new JButton("\uC124\uBB38\uC644\uB8CC");
		btn6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false); 
			}
		});
		btn6_1.setBounds(600, 450, 97, 23);
		panel6.add(btn6_1);
		
		JLabel Label6_2 = new JLabel("Q6. 향수");
		Label6_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		Label6_2.setBounds(10, 10, 195, 60);
		panel6.add(Label6_2);
		
		JRadioButton rdbtn6_1 = new JRadioButton(" 사용");
		rdbtn6_1.setBackground(Color.WHITE);
		rdbtn6_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup4.add(rdbtn6_1);
		rdbtn6_1.setBounds(170, 120, 130, 60);
		panel6.add(rdbtn6_1);
		
		JRadioButton rdbtn6_2 = new JRadioButton(" 미사용");
		rdbtn6_2.setBackground(Color.WHITE);
		rdbtn6_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		buttonGroup4.add(rdbtn6_2);
		rdbtn6_2.setBounds(370, 120, 160, 60);
		panel6.add(rdbtn6_2);
		
		JLabel infoLabel_1 = new JLabel("니방 랜덤매칭 - 필수 조건 설정");
		infoLabel_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel_1.setBounds(80, 150, 530, 80);
		contentPane.add(infoLabel_1);
		
		JLabel infoLabel_2 = new JLabel("조건 설정이 완료되었어요.");
		infoLabel_2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 70));
		infoLabel_2.setBounds(510, 400, 550, 70);
		contentPane.add(infoLabel_2);
		
		JPanel line2 = new JPanel();
		line2.setBackground(Color.LIGHT_GRAY);
		line2.setBounds(80, 230, 1400, 1);
		contentPane.add(line2);
		
		
		
		JButton btnNewButton = new JButton("랜덤매칭");
		btnNewButton.setBounds(745, 740, 97, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				MustSatisfy ms=new MustSatisfy();
				int f3;
				int f4;
				int f5;
				int f6;
				if(rdbtn3_1.isSelected())
					f3=1;
				else if(rdbtn3_2.isSelected())
					f3=2;
				else if(rdbtn3_3.isSelected())
					f3=3;
				else
					f3=-1;
				
				if(rdbtn4_1.isSelected())
					f4=1;
				else if(rdbtn4_2.isSelected())
					f4=2;
				else if(rdbtn4_3.isSelected())
					f4=3;
				else
					f4=-1;
				
				if(rdbtn5_1.isSelected())
					f5=1;
				else if(rdbtn5_2.isSelected())
					f5=2;
				else if(rdbtn5_3.isSelected())
					f5=3;
				else
					f5=-1;
				
				if(rdbtn6_1.isSelected())
					f6=2;
				else if(rdbtn6_2.isSelected())
					f6=1;
				else
					f6=-1;
				
				ResultSet rs;
				try {
					rs = ms.Satisfy(Integer.parseInt((list1_2.getSelectedValue().toString())), Integer.parseInt((list1_1.getSelectedValue().toString())),Integer.parseInt(list2_2.getSelectedValue().toString()), Integer.parseInt(list2_1.getSelectedValue().toString()), f3, f4, f5, f6);
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
	}
}