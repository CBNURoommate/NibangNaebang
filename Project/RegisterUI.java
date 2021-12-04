package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class RegisterUI extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JPasswordField passwordField;
	private JPasswordField password2Field;
	private JTextField nicknameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUI frame = new RegisterUI();
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
	public RegisterUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegisterUI.class.getResource("/Project/searchH.png")));
		setTitle("\uB2C8\uBC29\uB0B4\uBC29 - \uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1600, 900);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("니방내방");
		titleLabel.setIcon(new ImageIcon(RegisterUI.class.getResource("/Project/logo_small.png")));
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(20, 15, 187, 67);
		contentPane.add(titleLabel);
		
		JLabel idLabel_1 = new JLabel("회원가입");
		idLabel_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 60));
		idLabel_1.setBounds(718, 15, 170, 70);
		contentPane.add(idLabel_1);
		
		JPanel pointPanel = new JPanel();
		pointPanel.setForeground(new Color(0, 102, 102));
		pointPanel.setBackground(new Color(0, 102, 102));
		pointPanel.setBounds(707, 87, 175, 10);
		contentPane.add(pointPanel);
		
		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(0, 96, 1600, 1);
		contentPane.add(line1);
		
		idField = new JTextField();
		idField.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		idField.setBounds(751, 220, 300, 50);
		contentPane.add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		passwordField.setBounds(751, 320, 300, 50);
		contentPane.add(passwordField);
		
		password2Field = new JPasswordField();
		password2Field.setEchoChar('*');
		password2Field.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		password2Field.setBounds(751, 420, 300, 50);
		contentPane.add(password2Field);
		
		nicknameField = new JTextField();
		nicknameField.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		nicknameField.setBounds(751, 520, 300, 50);
		contentPane.add(nicknameField);
		nicknameField.setColumns(10);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		idLabel.setBounds(531, 210, 100, 65);
		contentPane.add(idLabel);
		
		JLabel password2Label = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		password2Label.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		password2Label.setBounds(531, 410, 190, 65);
		contentPane.add(password2Label);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		passwordLabel.setBounds(531, 310, 125, 65);
		contentPane.add(passwordLabel);
		
		JLabel nicknameLabel = new JLabel("이름");
		nicknameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		nicknameLabel.setBounds(531, 510, 100, 65);
		contentPane.add(nicknameLabel);
		
		JLabel idErrorLabel = new JLabel("\uC874\uC7AC\uD558\uB294 \uC544\uC774\uB514\uC785\uB2C8\uB2E4.");
		idErrorLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
		idErrorLabel.setBounds(751, 270, 300, 50);
		contentPane.add(idErrorLabel);
		idErrorLabel.setVisible(false);
		
		JLabel pwErrorLabel = new JLabel("\uBE44\uBC00\uBC88\uD638\uAC00 \uC77C\uCE58\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
		pwErrorLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
		pwErrorLabel.setBounds(751, 470, 340, 50);
		contentPane.add(pwErrorLabel);
		pwErrorLabel.setVisible(false);
		
		loginUI l=new loginUI();
		
		JButton registerButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(passwordField.getText().equals(password2Field.getText())))
				{
					System.out.println("비밀번호가 일치하지 않습니다");
					pwErrorLabel.setVisible(true);
					return;
				
				}
				Register r=new Register();
				try {
					idErrorLabel.setVisible(false);
					pwErrorLabel.setVisible(false);
					int k=r.reg(idField.getText(), passwordField.getText(),nicknameField.getText());
					if(k==1)
					{
						idErrorLabel.setVisible(true);
					}
					else
					{
						l.setVisible(true);
						setVisible(false);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		registerButton.setForeground(Color.BLACK);
		registerButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		registerButton.setBackground(Color.WHITE);
		registerButton.setBounds(599, 640, 140, 60);
		registerButton.setBorderPainted(false);
		registerButton.setContentAreaFilled(false);
		registerButton.setFocusPainted(false);
		contentPane.add(registerButton);
		
		JButton cancelButton = new JButton("\uAC00\uC785\uCDE8\uC18C");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				l.setVisible(true);
				setVisible(false);
			}
		});
		cancelButton.setForeground(Color.BLACK);
		cancelButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setBounds(844, 640, 140, 60);
		cancelButton.setBorderPainted(false);
		cancelButton.setContentAreaFilled(false);
		cancelButton.setFocusPainted(false);
		contentPane.add(cancelButton);
	}
}