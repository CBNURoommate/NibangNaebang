package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class MainBoardUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBoardUI frame = new MainBoardUI();
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
	public MainBoardUI() {
		setTitle("MainBoard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel mainLabel = new JLabel("\uD604\uC7AC \uC0AC\uC6A9\uC790 \uBAA9\uB85D");
		mainLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		mainLabel.setBounds(707, 178, 460, 70);
		
		JTextPane textPane = new JTextPane();
		
		JList UserList = new JList();
		
		JRadioButton SmokeFilterButton = new JRadioButton("\uD761\uC5F0\uC790 \uAC70\uB974\uAE30");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(mainLabel, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
						.addComponent(SmokeFilterButton)
						.addComponent(UserList, GroupLayout.PREFERRED_SIZE, 1128, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(393, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 793, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(mainLabel)
					.addGap(18)
					.addComponent(SmokeFilterButton)
					.addGap(19)
					.addComponent(UserList, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
