package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.Login;

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
		
		JLabel imageLabel = new JLabel(new ImageIcon(loginUI.class.getResource("/Project/logo.png")));
		imageLabel.setSize(250, 250);
		imageLabel.setLocation(130, 300);
		contentPane.add(imageLabel);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29");
		titleLabel.setFont(new Font("야놀자 야체 Bold", Font.BOLD, 120));
		titleLabel.setBounds(465, 383, 320, 135);
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300 \uB8F8\uBA54\uC774\uD2B8 \uAC80\uC0C9 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 50));
		lblNewLabel.setBounds(400, 334, 460, 70);
		contentPane.add(lblNewLabel);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 60));
		idLabel.setBounds(920, 300, 160, 70);
		contentPane.add(idLabel);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 60));
		passwordLabel.setBounds(920, 390, 160, 70);
		contentPane.add(passwordLabel);
		
		JLabel iderrorLabel = new JLabel("\uC544\uC774\uB514\uAC00 \uC874\uC7AC\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
		iderrorLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
		iderrorLabel.setBounds(600, 600, 430, 60);
		contentPane.add(iderrorLabel);
        iderrorLabel.setVisible(false);

        JLabel pwerrorLabel = new JLabel("\uBE44\uBC00\uBC88\uD638\uAC00 \uD2C0\uB838\uC2B5\uB2C8\uB2E4.");
		pwerrorLabel.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 50));
		pwerrorLabel.setBounds(630, 600, 340, 60);
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
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 40));
		passwordField.setBounds(1090, 400, 300, 50);
		contentPane.add(passwordField);
		
		idField = new JTextField();
		idField.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 40));
		idField.setBounds(1090, 310, 300, 50);
		contentPane.add(idField);
		idField.setColumns(10);

		loginButton.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 50));
		loginButton.setBounds(960, 490, 160, 50);
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
		registerButton.setFont(new Font("야놀자 야체 Bold", Font.PLAIN, 50));
		registerButton.setBounds(1170, 490, 160, 50);
		registerButton.setBorderPainted(false);
		registerButton.setContentAreaFilled(false);
		registerButton.setFocusPainted(false);
		contentPane.add(registerButton);
	}
}