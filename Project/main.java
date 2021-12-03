package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setTitle("\uB2C8\uBC29\uB0B4\uBC29 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setIcon(new ImageIcon(main.class.getResource("/Project/personn.png")));
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);
		
		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(main.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);
		
		JPanel line = new JPanel();
		line.setBackground(Color.BLACK);
		line.setBounds(0, 96, 1600, 1);
		contentPane.add(line);
		
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
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setFocusPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setBorderPainted(false);
		movePage3.setBackground(Color.LIGHT_GRAY);
		movePage3.setBounds(900, 20, 200, 60);
		contentPane.add(movePage3);
		
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
		
		JButton moveMail = new JButton();
		moveMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mailInboxUI m = new mailInboxUI();
				m.setVisible(true);
				setVisible(false);
			}
		});
		moveMail.setIcon(new ImageIcon(main.class.getResource("/Project/mail.png")));
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		moveMail.setBounds(1490, 20, 75, 60);
		contentPane.add(moveMail);
		
		JPanel pointPanel1 = new JPanel();
		pointPanel1.setForeground(new Color(0, 102, 102));
		pointPanel1.setBackground(new Color(0, 102, 102));
		pointPanel1.setBounds(220, 300, 250, 10);
		contentPane.add(pointPanel1);
		
		JPanel pointPanel2 = new JPanel();
		pointPanel2.setForeground(new Color(0, 102, 102));
		pointPanel2.setBackground(new Color(0, 102, 102));
		pointPanel2.setBounds(520, 300, 250, 10);
		contentPane.add(pointPanel2);
		
		JPanel pointPanel3 = new JPanel();
		pointPanel3.setForeground(new Color(0, 102, 102));
		pointPanel3.setBackground(new Color(0, 102, 102));
		pointPanel3.setBounds(820, 300, 250, 10);
		contentPane.add(pointPanel3);
		
		JPanel pointPanel4 = new JPanel();
		pointPanel4.setForeground(new Color(0, 102, 102));
		pointPanel4.setBackground(new Color(0, 102, 102));
		pointPanel4.setBounds(1120, 300, 250, 10);
		contentPane.add(pointPanel4);
		
		JLabel infoLabel1 = new JLabel("내방 점검하기");
		infoLabel1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		infoLabel1.setBounds(220, 320, 250, 50);
		contentPane.add(infoLabel1);
		
		JLabel infoLabel2 = new JLabel("내방 소개하기");
		infoLabel2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		infoLabel2.setBounds(520, 320, 250, 50);
		contentPane.add(infoLabel2);
		
		JLabel infoLabel3 = new JLabel("니방 랜덤매칭");
		infoLabel3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		infoLabel3.setBounds(820, 320, 250, 50);
		contentPane.add(infoLabel3);
		
		JLabel infoLabel4 = new JLabel("니방 찾아보기");
		infoLabel4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		infoLabel4.setBounds(1120, 320, 250, 50);
		contentPane.add(infoLabel4);
		
		JTextPane textPane1 = new JTextPane();
		textPane1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		textPane1.setText("룸메이트에게 소개할\r\n자신의 생활 정보를\r\n설정할 수 있어요.");
		textPane1.setBounds(220, 400, 250, 150);
		contentPane.add(textPane1);
		
		JTextPane textPane2 = new JTextPane();
		textPane2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		textPane2.setText("점검한 자신의 방을\r\n모든 룸메이트에게\r\n홍보할 수 있어요.");
		textPane2.setBounds(520, 400, 250, 150);
		contentPane.add(textPane2);
		
		JTextPane textPane3 = new JTextPane();
		textPane3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		textPane3.setText("원하는 룸메이트의 \r\n조건을 설정하여\r\n무작위로 매칭할 수 \r\n있어요.");
		textPane3.setBounds(820, 400, 250, 228);
		contentPane.add(textPane3);
		
		JTextPane textPane4 = new JTextPane();
		textPane4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		textPane4.setText("모든 룸메이트들이\r\n소개한 방의 조건을\r\n확인할 수 있어요.");
		textPane4.setBounds(1120, 400, 250, 150);
		contentPane.add(textPane4);
	}
}
