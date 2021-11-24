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
		
		JPanel line1 = new JPanel();
		line1.setBackground(Color.BLACK);
		line1.setBounds(248, 23, 1, 85);
		contentPane.add(line1);
		line1.setLayout(null);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29");
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		titleLabel.setBounds(69, 10, 167, 92);
		contentPane.add(titleLabel);
		
		JButton movePage1 = new JButton("\uB0B4\uBC29 \uC810\uAC80\uD558\uAE30");
		movePage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomCheck r = new roomCheck();
				r.setVisible(true);
				setVisible(false); 
			}
		});
		movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage1.setBackground(Color.BLUE);
		movePage1.setBounds(284, 23, 195, 72);
		movePage1.setBorderPainted(false);
		movePage1.setContentAreaFilled(false);
		movePage1.setFocusPainted(false);
		contentPane.add(movePage1);
		
		JButton movePage2 = new JButton("\uB2C8\uBC29 \uB79C\uB364\uB9E4\uCE6D");
		movePage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomMatching r = new randomMatching();
				r.setVisible(true);
				setVisible(false); 
			}
		});
		movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage2.setBackground(Color.LIGHT_GRAY);
		movePage2.setBounds(669, 23, 195, 72);
		movePage2.setBorderPainted(false);
		movePage2.setContentAreaFilled(false);
		movePage2.setFocusPainted(false);
		contentPane.add(movePage2);
		
		JButton movePage3 = new JButton("\uB2C8\uBC29 \uCC3E\uC544\uBCF4\uAE30");
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setBackground(Color.LIGHT_GRAY);
		movePage3.setBounds(864, 23, 195, 72);
		movePage3.setBorderPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setFocusPainted(false);
		contentPane.add(movePage3);
		
		JPanel line2 = new JPanel();
		line2.setBounds(43, 106, 652, 1);
		contentPane.add(line2);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		textPane.setText("\uB2C8\uBC29\uB0B4\uBC29\uC758 \uAE30\uBCF8\uC124\uBA85\r\n\r\n\uB0B4\uBC29 \uC810\uAC80\uD558\uAE30\uC5D0\uC120 \uC790\uC2E0\uC758 \uC815\uBCF4\uB97C \uC785\uB825\uD560 \uC218 \uC788\uC5B4\uC694.\r\n\uB0B4\uBC29 \uC18C\uAC1C\uD558\uAE30\uC5D0\uC120 \uC790\uC2E0\uC758 \uC815\uBCF4\uB97C \uD64D\uBCF4\uD560 \uC218 \uC788\uC5B4\uC694.\r\n\uB2C8\uBC29 \uB79C\uB364\uB9E4\uCE6D\uC5D0\uC120 \uC0C1\uB300\uC758 \uC815\uBCF4\uB97C \uAE30\uBC18\uC73C\uB85C \uB9E4\uCE6D\uC744 \uD560 \uC218 \uC788\uC5B4\uC694.\r\n\uB2C8\uBC29 \uCC3E\uC544\uBCF4\uAE30\uC5D0\uC120 \uB2E4\uB978 \uC0AC\uB78C\uB4E4\uC774 \uC62C\uB9B0 \uB0B4\uBC29\uC744 \uBCFC \uC218 \uC788\uC5B4\uC694.");
		textPane.setBounds(85, 155, 846, 393);
		contentPane.add(textPane);
		
		JButton movePage4 = new JButton("\uB0B4\uBC29 \uC18C\uAC1C\uD558\uAE30");
		movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage4.setFocusPainted(false);
		movePage4.setContentAreaFilled(false);
		movePage4.setBorderPainted(false);
		movePage4.setBackground(Color.LIGHT_GRAY);
		movePage4.setBounds(471, 23, 203, 72);
		contentPane.add(movePage4);
	}
}
