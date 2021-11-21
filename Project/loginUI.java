package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class loginUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField idField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUI frame = new loginUI();
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
	public loginUI() {
		setTitle("\uB2C8\uBC29\uB0B4\uBC29 - \uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29");
		titleLabel.setFont(new Font("具愁磊 具眉 Bold", Font.BOLD, 100));
		titleLabel.setBounds(442, 121, 367, 138);
		contentPane.add(titleLabel);
		
		idField = new JTextField();
		idField.setBounds(467, 332, 300, 40);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setFont(new Font("具愁磊 具眉 Bold", Font.PLAIN, 45));
		idLabel.setBounds(274, 321, 97, 63);
		contentPane.add(idLabel);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setFont(new Font("具愁磊 具眉 Bold", Font.PLAIN, 45));
		passwordLabel.setBounds(284, 385, 186, 58);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(467, 405, 300, 40);
		contentPane.add(passwordField);
		
		JLabel iderrorLabel = new JLabel("\uC544\uC774\uB514\uAC00 \uC874\uC7AC\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
        iderrorLabel.setFont(new Font("具愁磊 具眉 B", Font.PLAIN, 30));
        iderrorLabel.setBounds(386, 530, 463, 63);
        contentPane.add(iderrorLabel);
        iderrorLabel.setVisible(false);

        JLabel pwerrorLabel = new JLabel("\uBE44\uBC00\uBC88\uD638\uAC00 \uD2C0\uB838\uC2B5\uB2C8\uB2E4.");
        pwerrorLabel.setFont(new Font("具愁磊 具眉 B", Font.PLAIN, 30));
        pwerrorLabel.setBounds(392, 528, 463, 63);
        contentPane.add(pwerrorLabel);
        pwerrorLabel.setVisible(false);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login l=new Login();
				try {
					int k=l.login(idField.getText(),passwordField.getText());
					if(k==0)
					{
						main m=new main();
						m.setVisible(true);
						setVisible(false);
					}
					else if(k==1)
					{
						iderrorLabel.setVisible(false);
						pwerrorLabel.setVisible(true);
					}
					else if(k==2)
					{
						pwerrorLabel.setVisible(false);
						iderrorLabel.setVisible(true);
					}
					else
					{
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		loginButton.setFont(new Font("具愁磊 具眉 Bold", Font.PLAIN, 20));
		loginButton.setBounds(465, 468, 139, 33);
		loginButton.setBorderPainted(false);
		loginButton.setContentAreaFilled(false);
		loginButton.setFocusPainted(false);
		contentPane.add(loginButton);
		
		JButton registerButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterUI r=new RegisterUI();
				r.setVisible(true);
				setVisible(false);
				
			}
		});
		registerButton.setFont(new Font("具愁磊 具眉 B", Font.PLAIN, 20));
		registerButton.setBounds(631, 468, 136, 33);
		registerButton.setBorderPainted(false);
		registerButton.setContentAreaFilled(false);
		registerButton.setFocusPainted(false);
		contentPane.add(registerButton);
		
		
		
		JPanel logoPanel = new JPanel();
		logoPanel.setBounds(192, 81, 216, 177);
		contentPane.add(logoPanel);
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300 \uB8F8\uBA54\uC774\uD2B8 \uAC80\uC0C9 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("具愁磊 具眉 Bold", Font.PLAIN, 35));
		lblNewLabel.setBounds(446, 96, 311, 33);
		contentPane.add(lblNewLabel);
		
		
		
	}
}