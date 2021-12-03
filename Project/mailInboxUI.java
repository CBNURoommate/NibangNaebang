package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import java.sql.ResultSet;
import java.sql.SQLException;
public class mailInboxUI extends JFrame {

	private JPanel contentPane;
	private JTable messageTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mailInboxUI frame = new mailInboxUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public mailInboxUI() throws SQLException {
		setTitle("니방내방 - 메세지 박스");
		setIconImage(Toolkit.getDefaultToolkit().getImage(mailInboxUI.class.getResource("/Project/searchH.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(mailInboxUI.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setIcon(new ImageIcon(mailInboxUI.class.getResource("/Project/personn.png")));
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);
		
		JButton moveMail = new JButton();
		moveMail.setIcon(new ImageIcon(mailInboxUI.class.getResource("/Project/mail.png")));
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
		
		JButton resetButton = new JButton(" 새로고침");
		resetButton.setIcon(new ImageIcon(mailInboxUI.class.getResource("/Project/reset.png")));
		resetButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		resetButton.setFocusPainted(false);
		resetButton.setContentAreaFilled(false);
		resetButton.setBorderPainted(false);
		resetButton.setBounds(565, 750, 200, 60);
		contentPane.add(resetButton);
		
		JButton sendButton = new JButton(" 작성하기");
		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMessageUI s = new sendMessageUI();
				s.setVisible(true);
				setVisible(false);
			}
		});
		sendButton.setIcon(new ImageIcon(mailInboxUI.class.getResource("/Project/send.png")));
		sendButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		sendButton.setFocusPainted(false);
		sendButton.setContentAreaFilled(false);
		sendButton.setBorderPainted(false);
		sendButton.setBounds(820, 750, 200, 60);
		contentPane.add(sendButton);
		
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
		
		JPanel pointPanel = new JPanel();
		pointPanel.setForeground(new Color(0, 102, 102));
		pointPanel.setBackground(new Color(0, 102, 102));
		pointPanel.setBounds(1490, 87, 75, 10);
		contentPane.add(pointPanel);
		
		JPanel messagePanel = new JPanel();
		messagePanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		messagePanel.setBackground(Color.WHITE);
		messagePanel.setBounds(910, 255, 555, 420);
		contentPane.add(messagePanel);
		messagePanel.setLayout(null);
		
		JPanel outputPanel2 = new JPanel();
		outputPanel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		outputPanel2.setBackground(Color.WHITE);
		outputPanel2.setBounds(180, 15, 355, 40);
		messagePanel.add(outputPanel2);
		outputPanel2.setLayout(null);
		
		JLabel idLabel = new JLabel("");
		idLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		idLabel.setBounds(10, 0, 333, 40);
		outputPanel2.add(idLabel);
		
		JScrollPane outputPanel3 = new JScrollPane();
		outputPanel3.setBounds(20, 120, 515, 280);
		messagePanel.add(outputPanel3);
		
		JTextPane msgPanel = new JTextPane();
		outputPanel3.setViewportView(msgPanel);
		msgPanel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
		msgPanel.setEditable(false);
		
		JLabel infoLabel2 = new JLabel("수신/발신인");
		infoLabel2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		infoLabel2.setBounds(20, 15, 150, 40);
		messagePanel.add(infoLabel2);
		
		JLabel infoLabel3 = new JLabel("메세지 내용");
		infoLabel3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		infoLabel3.setBounds(20, 70, 150, 40);
		messagePanel.add(infoLabel3);
		
		JLabel timeLabel = new JLabel("메세지 전송 시간");
		timeLabel.setForeground(Color.GRAY);
		timeLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
		timeLabel.setBounds(305, 80, 230, 35);
		messagePanel.add(timeLabel);
		
		JScrollPane outputPanel1 = new JScrollPane();
		outputPanel1.setBounds(100, 255, 785, 420);
		contentPane.add(outputPanel1);
		
		messageTable = new JTable();
		outputPanel1.setViewportView(messageTable);
		messageTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		messageTable.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
		messageTable.setRowHeight(50);
		messageTable.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		DefaultTableModel m=new DefaultTableModel(
			new Object[][] {
				{null, null, "", null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uC218\uC2E0/\uBC1C\uC2E0", "\uC218\uC2E0/\uBC1C\uC2E0\uC778", "\uB0B4\uC6A9"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		messageTable.setModel(m);
		messageTable.getColumnModel().getColumn(0).setResizable(false);
		messageTable.getColumnModel().getColumn(0).setPreferredWidth(80);
		messageTable.getColumnModel().getColumn(0).setMinWidth(80);
		messageTable.getColumnModel().getColumn(0).setMaxWidth(80);
		messageTable.getColumnModel().getColumn(1).setResizable(false);
		messageTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		messageTable.getColumnModel().getColumn(1).setMinWidth(80);
		messageTable.getColumnModel().getColumn(1).setMaxWidth(80);
		messageTable.getColumnModel().getColumn(2).setResizable(false);
		messageTable.getColumnModel().getColumn(2).setPreferredWidth(250);
		messageTable.getColumnModel().getColumn(2).setMinWidth(250);
		messageTable.getColumnModel().getColumn(2).setMaxWidth(250);
		messageTable.getColumnModel().getColumn(3).setResizable(false);
		mailInbox mi=new mailInbox();
		ResultSet rs=mi.getbox();
		
		if(rs!=null)
		{
			int i=1;
			while(rs.next())
			{
				Object[] d=new Object[4];
				d[0]=i;
				if(CurrentUser.getId().equals(rs.getString("senderid")))
				{
					d[1]="발신";
					d[2]=rs.getString("receiverid");
				}
				else
				{
					d[1]="수신";
					d[2]=rs.getString("senderid");
				}
				d[3]=rs.getString("constext");
				m.insertRow(i-1, d);
				i++;
			}
		}
		
		messageTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowNum = messageTable.getSelectedRow();	// save selected row line number
				idLabel.setText((String) messageTable.getModel().getValueAt(rowNum, 2));
				msgPanel.setText((String) messageTable.getModel().getValueAt(rowNum, 3));
			}
		});
		
		JLabel infoLabel1 = new JLabel("메세지");
		infoLabel1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		infoLabel1.setBounds(80, 150, 220, 80);
		contentPane.add(infoLabel1);
	}
}
