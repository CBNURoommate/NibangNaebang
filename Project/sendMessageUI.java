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
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class sendMessageUI extends JFrame {

	private JPanel contentPane;
	private JTextField idField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sendMessageUI frame = new sendMessageUI();
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
	public sendMessageUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(sendMessageUI.class.getResource("/Project/searchH.png")));
		setTitle("니방내방 - 메세지 전송");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(sendMessageUI.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setIcon(new ImageIcon(sendMessageUI.class.getResource("/Project/personn.png")));
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);
		
		JButton moveMail = new JButton();
		moveMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mailInboxUI m = new mailInboxUI();
				m.setVisible(true);
				setVisible(false);
			}
		});
		moveMail.setIcon(new ImageIcon(sendMessageUI.class.getResource("/Project/mail.png")));
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		moveMail.setBounds(1490, 20, 75, 60);
		contentPane.add(moveMail);
		
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
		
		JButton movePage3 = new JButton("니방 찾아보기");
		movePage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainBoardUI gui = new MainBoardUI();
				setVisible(false);
			}
		});
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
		
		JButton sendMessage = new JButton(" 전송하기");
		
		sendMessage.setIcon(new ImageIcon(sendMessageUI.class.getResource("/Project/send.png")));
		sendMessage.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		sendMessage.setFocusPainted(false);
		sendMessage.setContentAreaFilled(false);
		sendMessage.setBorderPainted(false);
		sendMessage.setBounds(691, 750, 200, 60);
		contentPane.add(sendMessage);
		
		
		JPanel pointPanel = new JPanel();
		pointPanel.setForeground(new Color(0, 102, 102));
		pointPanel.setBackground(new Color(0, 102, 102));
		pointPanel.setBounds(1490, 87, 75, 10);
		contentPane.add(pointPanel);
		
		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(0, 96, 1600, 1);
		contentPane.add(line1);
		
		JPanel line2_1 = new JPanel();
		line2_1.setBackground(Color.LIGHT_GRAY);
		line2_1.setBounds(80, 230, 1400, 1);
		contentPane.add(line2_1);
		
		JPanel line2_2 = new JPanel();
		line2_2.setBackground(Color.LIGHT_GRAY);
		line2_2.setBounds(80, 700, 1400, 1);
		contentPane.add(line2_2);
		
		JLabel infoLabel1 = new JLabel("메세지 보내기");
		infoLabel1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel1.setBounds(80, 150, 220, 80);
		contentPane.add(infoLabel1);
		
		JLabel infoLabel2 = new JLabel("ID");
		infoLabel2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel2.setBounds(160, 260, 100, 60);
		contentPane.add(infoLabel2);
		
		JLabel infoLabel3 = new JLabel("내용");
		infoLabel3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel3.setBounds(160, 340, 100, 60);
		contentPane.add(infoLabel3);
		
		JLabel infoLabel4 = new JLabel("메세지는 500자까지 입력이 가능해요.");
		infoLabel4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		infoLabel4.setBounds(270, 615, 460, 60);
		contentPane.add(infoLabel4);
		
		idField = new JTextField();
		idField.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		idField.setBounds(270, 260, 800, 60);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		inputPanel.setBackground(Color.WHITE);
		inputPanel.setBounds(270, 340, 800, 255);
		contentPane.add(inputPanel);
		inputPanel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		textPane.setBounds(12, 10, 776, 235);
		inputPanel.add(textPane);
		
		sendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SendMessage sm=new SendMessage();
				try {
					int s=sm.send(idField.getText(), textPane.getText());
					mailInboxUI mi=new mailInboxUI();
					mi.setVisible(true);
					setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
