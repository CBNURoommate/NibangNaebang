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
		setTitle("\uB2C8\uBC29\uB0B4\uBC29 - \uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29 \uD68C\uC6D0\uAC00\uC785");
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 100));
		titleLabel.setBounds(507, 45, 560, 138);
		contentPane.add(titleLabel);
		
		idField = new JTextField();
		idField.setBounds(622, 209, 300, 40);
		contentPane.add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(622, 316, 300, 40);
		contentPane.add(passwordField);
		
		password2Field = new JPasswordField();
		password2Field.setBounds(622, 396, 300, 40);
		contentPane.add(password2Field);
		
		nicknameField = new JTextField();
		nicknameField.setBounds(622, 481, 300, 40);
		contentPane.add(nicknameField);
		nicknameField.setColumns(10);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		idLabel.setBounds(455, 197, 97, 63);
		contentPane.add(idLabel);
		
		JLabel password2Label = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		password2Label.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		password2Label.setBounds(391, 374, 191, 63);
		contentPane.add(password2Label);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		passwordLabel.setBounds(441, 294, 127, 63);
		contentPane.add(passwordLabel);
		
		JLabel nicknameLabel = new JLabel("\uB2C9\uB124\uC784");
		nicknameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 45));
		nicknameLabel.setBounds(455, 471, 97, 63);
		contentPane.add(nicknameLabel);
		
		JLabel idErrorLabel = new JLabel("\uC874\uC7AC\uD558\uB294 \uC544\uC774\uB514\uC785\uB2C8\uB2E4.");
		idErrorLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		idErrorLabel.setBounds(944, 206, 230, 55);
		contentPane.add(idErrorLabel);
		idErrorLabel.setVisible(false);
		
		JLabel pwErrorLabel = new JLabel("\uBE44\uBC00\uBC88\uD638\uAC00 \uC77C\uCE58\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
		pwErrorLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		pwErrorLabel.setBounds(944, 396, 463, 63);
		contentPane.add(pwErrorLabel);
		pwErrorLabel.setVisible(false);
		
		loginUI l=new loginUI();
		
		JButton registerButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(passwordField.getText().equals(password2Field.getText())))
				{
					System.out.println("비밀번호 확인 틀림");
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
		registerButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 20));
		registerButton.setBackground(Color.WHITE);
		registerButton.setBounds(610, 551, 139, 33);
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
		cancelButton.setFont(new Font("야놀자 야체 B", Font.PLAIN, 20));
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setBounds(783, 551, 139, 33);
		cancelButton.setBorderPainted(false);
		cancelButton.setContentAreaFilled(false);
		cancelButton.setFocusPainted(false);
		contentPane.add(cancelButton);
	}
}
