package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class MainBoardUI {
    private static final String String = null;
	JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();
    JTextField t4 = new JTextField();
    JTextArea ta = new JTextArea();
    int smokecheck = 0;

    JButton  btn2, btn5;
    JLabel ㅣ4 = new JLabel("ID \uAC80\uC0C9");
    public JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private final JRadioButton jamcheckbox = new JRadioButton(" 코골이 X");
    private final JComboBox dptbox = new JComboBox();
    private final JComboBox hakbunBox = new JComboBox();
    private final JComboBox ageBox = new JComboBox();
    private final JLabel ㅣ4_3_1 = new JLabel("\uCDE8\uCE68\uC2DC\uAC04");
    private final JLabel ㅣ4_3_2 = new JLabel("\uAE30\uC0C1\uC2DC\uAC04");
    private final JLabel ㅣ4_3_3 = new JLabel("\uC220");
    private final JLabel ㅣ4_3_4 = new JLabel("\uC0E4\uC6CC\uC2DC\uAC04");
    private final JLabel ㅣ4_3_5 = new JLabel("\uB354\uC704");
    private final JLabel ㅣ4_3_6 = new JLabel("\uCD94\uC704");
    private final JLabel ㅣ4_3_4_1 = new JLabel("\uC2E4\uB0B4\uD1B5\uD654");
    private final JLabel ㅣ4_3_4_2 = new JLabel("\uC2E4\uB0B4\uCDE8\uC2DD");
    private final JComboBox heatBox = new JComboBox();
    private final JComboBox coldBox = new JComboBox();
    private final JComboBox sleepBox = new JComboBox();
    private final JComboBox wakeBox = new JComboBox();
    private final JComboBox showerBox = new JComboBox();
    private final JComboBox callBox = new JComboBox();
    private final JComboBox eatBox = new JComboBox();
    private final JComboBox soolBox = new JComboBox();
    private final JPanel line2_1 = new JPanel();
    private final JLabel infoLabel_1 = new JLabel("니방 찾아보기");
    private final JPanel line2_2 = new JPanel();
    private final JPanel line2_2_1 = new JPanel();

    MainBoardUI() {
        GUI_init();
    }

    public void GUI_init() {
        jframe.setTitle("회원관리");
        jframe.setBounds(50, 50, 1600, 900);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jpanel.setBackground(Color.WHITE);
        jframe.getContentPane().add(jpanel);
        jpanel.setLayout(null);
        
        JLabel titleLabel = new JLabel("니방내방");
        titleLabel.setIcon(new ImageIcon(MainBoardUI.class.getResource("/Project/logo_small.png")));
        titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
        titleLabel.setBounds(20, 15, 187, 67);
        jpanel.add(titleLabel);
        
        JLabel nameLabel = new JLabel();
        nameLabel.setIcon(new ImageIcon(MainBoardUI.class.getResource("/Project/personn.png")));
        nameLabel.setText(CurrentUser.getName());
        nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
        nameLabel.setBounds(1220, 20, 250, 60);
        jpanel.add(nameLabel);
        
        JButton movePage1 = new JButton("내방 점검하기");
        movePage1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		roomCheck r = new roomCheck();
				r.setVisible(true);
				jframe.setVisible(false);
        	}
        });
        movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
        movePage1.setFocusPainted(false);
        movePage1.setContentAreaFilled(false);
        movePage1.setBorderPainted(false);
        movePage1.setBackground(Color.BLUE);
        movePage1.setBounds(300, 20, 200, 60);
        jpanel.add(movePage1);
        
        JButton movePage2 = new JButton("니방 랜덤매칭");
        movePage2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		randomMatching r = new randomMatching();
				r.setVisible(true);
				jframe.setVisible(false);
        	}
        });
        movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
        movePage2.setFocusPainted(false);
        movePage2.setContentAreaFilled(false);
        movePage2.setBorderPainted(false);
        movePage2.setBackground(Color.LIGHT_GRAY);
        movePage2.setBounds(700, 20, 200, 60);
        jpanel.add(movePage2);
        
        JButton movePage3 = new JButton("니방 찾아보기");
        movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
        movePage3.setFocusPainted(false);
        movePage3.setContentAreaFilled(false);
        movePage3.setBorderPainted(false);
        movePage3.setBackground(Color.LIGHT_GRAY);
        movePage3.setBounds(900, 20, 200, 60);
        jpanel.add(movePage3);
        
        JButton movePage4 = new JButton("내방 소개하기");
        movePage4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		uploadMyroomUI u = new uploadMyroomUI();
        		u.setVisible(true);
        		jframe.setVisible(false);
        	}
        });
        movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
        movePage4.setFocusPainted(false);
        movePage4.setContentAreaFilled(false);
        movePage4.setBorderPainted(false);
        movePage4.setBackground(Color.LIGHT_GRAY);
        movePage4.setBounds(500, 20, 200, 60);
        jpanel.add(movePage4);
        
        JButton moveMail = new JButton();
        moveMail.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mailInboxUI m;
				try {
					m = new mailInboxUI();
					m.setVisible(true);
					jframe.setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        moveMail.setIcon(new ImageIcon(MainBoardUI.class.getResource("/Project/mail.png")));
        moveMail.setFocusPainted(false);
        moveMail.setContentAreaFilled(false);
        moveMail.setBorderPainted(false);
        moveMail.setBounds(1490, 20, 75, 60);
        jpanel.add(moveMail);
        
        JPanel line1 = new JPanel();
        line1.setBackground(Color.BLACK);
        line1.setBounds(0, 96, 1600, 1);
        jpanel.add(line1);
        
        JPanel pointPanel = new JPanel();
        pointPanel.setForeground(new Color(0, 102, 102));
        pointPanel.setBackground(new Color(0, 102, 102));
        pointPanel.setBounds(915, 87, 175, 10);
        jpanel.add(pointPanel);
        t4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        t4.setBounds(1058, 180, 300, 40);
        jpanel.add(t4);
        ㅣ4.setForeground(Color.GRAY);
        ㅣ4.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4.setBounds(966, 180, 80, 40);
        jpanel.add(ㅣ4);

        jpanel.add(btn2 = new JButton("출력하기"));
        btn2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        btn2.setFocusPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);
        btn2.setBounds(666, 775, 250, 50);

        jpanel.add(btn5 = new JButton("검색"));
        btn5.setBackground(Color.WHITE);
        btn5.setFocusPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(false);
        btn5.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        
        scrollPane.setBounds(90,244,940,520);
        jpanel.add(scrollPane);
        ta.setEditable(false);
        ta.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
        scrollPane.setViewportView(ta);
        ta.setBackground(Color.WHITE);
        
        JRadioButton smokecheckbox = new JRadioButton(" 비흡연자");
        smokecheckbox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        smokecheckbox.setBackground(Color.WHITE);
        smokecheckbox.setBounds(1058, 240, 130, 40);
        jpanel.add(smokecheckbox);
        jamcheckbox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        jamcheckbox.setBackground(Color.WHITE);
        jamcheckbox.setBounds(1058, 290, 140, 40);
        
        jpanel.add(jamcheckbox);
        dptbox.setBackground(new Color(220, 220, 220));
        dptbox.setModel(new DefaultComboBoxModel(new String[] {"전체", "인문대", "사회과학대", "자연과학대", "경영대", "공과대", "전자정보대", "농생대", "사범대", "생과대", "수의대", "의과대", "자율", "전체", "인문대", "사회과학대", "자연과학대", "경영대", "공과대", "전자정보대", "농생대", "사범대", "생과대", "수의대", "의과대", "자율전공", "전체"}));
        dptbox.setToolTipText("");
        dptbox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        dptbox.setBounds(1332, 240, 138, 40);
        
        jpanel.add(dptbox);
        dptbox.addItem("전체");
        dptbox.addItem("인문대");
        dptbox.addItem("사회과학대");
        dptbox.addItem("자연과학대");
        dptbox.addItem("경영대");
        dptbox.addItem("공과대");
        dptbox.addItem("전자정보대");
        dptbox.addItem("농생대");
        dptbox.addItem("사범대");
        dptbox.addItem("생과대");
        dptbox.addItem("수의대");
        dptbox.addItem("의과대");
        dptbox.addItem("자율");
        dptbox.addItem("전체");
        hakbunBox.setBackground(new Color(220, 220, 220));
        
        hakbunBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "14", "15", "16", "17", "18", "19", "20", "21"}));
        hakbunBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));        
        hakbunBox.setBounds(1332, 290, 138, 40);
        jpanel.add(hakbunBox);
        ageBox.setBackground(new Color(220, 220, 220));
        
        
        ageBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"}));
        ageBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        ageBox.setBounds(1332, 340, 138, 40);
        jpanel.add(ageBox);
        
        JLabel ㅣ4_1 = new JLabel("\uB2E8\uACFC\uB300");
        ㅣ4_1.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_1.setBounds(1220, 240, 100, 40);
        jpanel.add(ㅣ4_1);
        
        JLabel ㅣ4_2 = new JLabel("\uD559\uBC88");
        ㅣ4_2.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_2.setBounds(1220, 290, 100, 40);
        jpanel.add(ㅣ4_2);
        
        JLabel ㅣ4_3 = new JLabel("\uB098\uC774");
        ㅣ4_3.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3.setBounds(1220, 340, 100, 40);
        jpanel.add(ㅣ4_3);
        ㅣ4_3_1.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_1.setBounds(1220, 490, 100, 40);
        
        jpanel.add(ㅣ4_3_1);
        ㅣ4_3_2.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_2.setBounds(1220, 540, 100, 40);
        
        jpanel.add(ㅣ4_3_2);
        ㅣ4_3_3.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_3.setBounds(1220, 740, 100, 40);
        
        jpanel.add(ㅣ4_3_3);
        ㅣ4_3_4.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_4.setBounds(1220, 588, 100, 40);
        
        jpanel.add(ㅣ4_3_4);
        ㅣ4_3_5.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_5.setBounds(1220, 390, 100, 40);
        
        jpanel.add(ㅣ4_3_5);
        ㅣ4_3_6.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_6.setBounds(1220, 440, 100, 40);
        
        jpanel.add(ㅣ4_3_6);
        ㅣ4_3_4_1.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_4_1.setBounds(1220, 640, 100, 40);
        
        jpanel.add(ㅣ4_3_4_1);
        ㅣ4_3_4_2.setFont(new Font("야놀자 야체 B", Font.BOLD, 35));
        ㅣ4_3_4_2.setBounds(1220, 690, 100, 40);
        
        jpanel.add(ㅣ4_3_4_2);
        heatBox.setBackground(new Color(230, 230, 230));
        heatBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC801\uAC8C\uD0D0", "\uBCF4\uD1B5", "\uB9CE\uC774\uD0D0"}));
        heatBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        heatBox.setBounds(1332, 390, 138, 40);
        
        jpanel.add(heatBox);
        coldBox.setBackground(new Color(230, 230, 230));
        coldBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC801\uAC8C\uD0D0", "\uBCF4\uD1B5", "\uB9CE\uC774\uD0D0"}));
        coldBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        coldBox.setBounds(1332, 440, 138, 40);
        
        jpanel.add(coldBox);
        sleepBox.setBackground(new Color(230, 230, 230));
        sleepBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        sleepBox.setModel(new DefaultComboBoxModel(new String[] {"전체", "22시", "23시", "0시", "1시", "2시", "3시 이후"}));
        sleepBox.setBounds(1332, 490, 138, 40);
        
        jpanel.add(sleepBox);
        wakeBox.setBackground(new Color(230, 230, 230));
        wakeBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "7\uC2DC", "8\uC2DC", "9\uC2DC", "10\uC2DC", "11\uC2DC", "\uC624\uD6C4"}));
        wakeBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        wakeBox.setBounds(1332, 540, 138, 40);
        
        jpanel.add(wakeBox);
        showerBox.setBackground(new Color(230, 230, 230));
        showerBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        showerBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC544\uCE68", "\uC800\uB141", "\uC720\uB3D9\uC801"}));
        showerBox.setBounds(1332, 590, 138, 40);
        
        jpanel.add(showerBox);
        callBox.setBackground(new Color(230, 230, 230));
        callBox.setModel(new DefaultComboBoxModel(new String[] {"전체", "반대", "상관없음", "찬성\t", "간단용무만"}));
        callBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        callBox.setBounds(1332, 640, 138, 40);
        
        jpanel.add(callBox);
        eatBox.setBackground(new Color(230, 230, 230));
        eatBox.setModel(new DefaultComboBoxModel(new String[] {"전체", "불가", "냄새 X", "가능"}));
        eatBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        eatBox.setBounds(1332, 690, 138, 40);
        
        jpanel.add(eatBox);
        soolBox.setBackground(new Color(230, 230, 230));
        soolBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC548\uBA39\uC74C", "\uAC00\uB054\uBA39\uC74C", "\uC790\uC8FC\uBA39\uC74C"}));
        soolBox.setFont(new Font("야놀자 야체 B", Font.PLAIN, 35));
        soolBox.setBounds(1332, 740, 138, 40);
        
        jpanel.add(soolBox);
        line2_1.setBackground(Color.LIGHT_GRAY);
        line2_1.setBounds(80, 230, 1400, 1);
        
        jpanel.add(line2_1);
        line2_2.setBackground(Color.LIGHT_GRAY);
        line2_2.setBounds(80, 800, 574, 1);
        
        jpanel.add(line2_2);
        infoLabel_1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 50));
        infoLabel_1.setBounds(80, 150, 280, 80);
        
        jpanel.add(infoLabel_1);
        line2_2_1.setBackground(Color.LIGHT_GRAY);
        line2_2_1.setBounds(928, 800, 552, 1);
        
        jpanel.add(line2_2_1);

        
        scrollPane.setVisible(true); 
        btn5.setBounds(1370, 180, 100, 40);
    
  

        Controller dao = new Controller();
      
     
     // 회원 목록 출력
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readMember();

                ta.append( "ID" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부"+ "\t" + "코골이" + "\t" + "단과대"+ "\t" + "더위"+ "\t" + "추위"+ "\t" + "취침시간"+ "\t" + "기상시간"+ "\t" + "샤워시간"+ "\t" + "실내통화"+ "\t" + "실내취식"+ "\t" + "술\t\n");
                ta.append( "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
         
                
                String gender_a="a";
                String dom_a="a";
                String smoking_a="a";
                String jam_a="a";
                String hakbun_a ="a";
                String age_a ="a";
                String heat_a="a";
                String cold_a="a";
                String sleep_a="a";
                String wake_a="a";
                String shower_a="a";
                String call_a="a";
                String eat_a="a";
                String sool_a="a";
                

                
                switch(CurrentUser.getGender()) {
                       case 1:
                    	   gender_a="남자";
                    	   break;
                       case 2:
                    	   gender_a="여자";
                    	   break;
                       default:
                    	   break;
                }
                
                switch(CurrentUser.getDom()) {
                
                      case 1:
             	         dom_a="개성재";
             	         break;
                      case 2:
                         dom_a="계영원";
             	         break;
                      case 3:
                         dom_a="양성재";
              	         break;
                      case 4:
                         dom_a="양진재";
              	         break;
                      case 5:
                        dom_a="양현재";
              	        break;
                      default:
             	        break;
                }
              
                	             
                
                for (int i = 0; i < arr.size(); i++) {
                	
                	
                	 if(smokecheckbox.isSelected())
                        smoking_a="비흡연";
                     else
                        smoking_a=arr.get(i).smoking;
                    
                     
                     if(jamcheckbox.isSelected())
                        jam_a="x";
                     else
                        jam_a=arr.get(i).jam;
                     
                     if(hakbunBox.getSelectedItem() == "14")
                     	hakbun_a = "14";
                     else if(hakbunBox.getSelectedItem() == "15")
                     	hakbun_a = "15";
                     else if(hakbunBox.getSelectedItem() == "16")
                     	hakbun_a = "16";
                     else if(hakbunBox.getSelectedItem() == "17")
                     	hakbun_a = "17";
                     else if(hakbunBox.getSelectedItem() == "18")
                     	hakbun_a = "18";
                     else if(hakbunBox.getSelectedItem() == "19")
                     	hakbun_a = "19";
                     else if(hakbunBox.getSelectedItem() == "20")
                     	hakbun_a = "20";
                     else if(hakbunBox.getSelectedItem() == "21")
                     	hakbun_a = "21";
                     else if(hakbunBox.getSelectedItem() == "전체")
                      	hakbun_a = arr.get(i).hakbun;
                     
                     
                     if(ageBox.getSelectedItem() == "1996")
                    	 age_a = "1996";
                     else if(ageBox.getSelectedItem() == "1997")
                    	 age_a = "1997";
                     else if(ageBox.getSelectedItem() == "1998")
                    	 age_a = "1998";
                     else if(ageBox.getSelectedItem() == "1999")
                    	 age_a = "1999";
                     else if(ageBox.getSelectedItem() == "2000")
                    	 age_a = "2000";
                     else if(ageBox.getSelectedItem() == "2001")
                    	 age_a = "2001";
                     else if(ageBox.getSelectedItem() == "2002")
                    	 age_a = "2002";
                     else if(ageBox.getSelectedItem() == "2003")
                    	 age_a = "2003";
                     else if(ageBox.getSelectedItem() == "전체")
                    	 age_a = arr.get(i).age;
                     
                     
                     if(heatBox.getSelectedItem() == "적게탐")
                    	 heat_a = "적게탐";
                     else if(heatBox.getSelectedItem() == "보통")
                    	 heat_a = "보통";
                     else if(heatBox.getSelectedItem() == "많이탐")
                    	 heat_a = "많이탐";
                     else if(heatBox.getSelectedItem() == "전체")
                    	 heat_a = arr.get(i).heat;
                     
                     if(coldBox.getSelectedItem() == "적게탐")
                    	 cold_a = "적게탐";
                     else if(coldBox.getSelectedItem() == "보통")
                    	 cold_a = "보통";
                     else if(coldBox.getSelectedItem() == "많이탐")
                    	 cold_a = "많이탐";
                     else if(coldBox.getSelectedItem() == "전체")
                    	 cold_a = arr.get(i).cold;
                    
                     if(sleepBox.getSelectedItem() == "22시")
                    	 sleep_a = "22시";
                     else if(sleepBox.getSelectedItem() == "23시")
                    	 sleep_a = "23시";
                     else if(sleepBox.getSelectedItem() == "24시")
                    	 sleep_a = "23시";
                     else if(sleepBox.getSelectedItem() == "0시")
                    	 sleep_a = "0시";
                     else if(sleepBox.getSelectedItem() == "1시")
                    	 sleep_a = "1시";
                     else if(sleepBox.getSelectedItem() == "2시")
                    	 sleep_a = "2시";
                     else if(sleepBox.getSelectedItem() == "3시")
                    	 sleep_a = "3시";
                     else if(sleepBox.getSelectedItem() == "전체")
                    	 sleep_a = arr.get(i).sleep;
                     
                     if(wakeBox.getSelectedItem() == "7시")
                    	 wake_a = "7시";
                     else if(wakeBox.getSelectedItem() == "8시")
                    	 wake_a = "8시";
                     else if(wakeBox.getSelectedItem() == "9시")
                    	 wake_a = "9시";
                     else if(wakeBox.getSelectedItem() == "10시")
                    	 wake_a = "10시";
                     else if(wakeBox.getSelectedItem() == "11시")
                    	 wake_a = "11시";
                     else if(wakeBox.getSelectedItem() == "오후")
                    	 wake_a = "오후";
                     else if(wakeBox.getSelectedItem() == "전체")
                    	 wake_a = arr.get(i).wake;
                     
                     if(showerBox.getSelectedItem() == "아침")
                    	 shower_a = "아침";
                     else if(showerBox.getSelectedItem() == "저녁")
                    	 shower_a = "저녁";
                     else if(showerBox.getSelectedItem() == "유동적")
                    	 shower_a = "유동적";
                     else if(showerBox.getSelectedItem() == "전체")
                    	 shower_a = arr.get(i).shower;
                     
                     if(callBox.getSelectedItem() == "반대")
                    	 call_a = "반대";
                     else if(callBox.getSelectedItem() == "상관없음")
                    	 call_a = "상관없음";
                     else if(callBox.getSelectedItem() == "찬성")
                    	 call_a = "찬성";
                     else if(callBox.getSelectedItem() == "간단용무만")
                    	 call_a = "간단한 용무만";
                     else if(callBox.getSelectedItem() == "전체")
                    	 call_a = arr.get(i).call;
                     
                     if(eatBox.getSelectedItem() == "불가")
                    	 eat_a = "불가";
                     else if(eatBox.getSelectedItem() == "냄새 X")
                    	 eat_a = "냄새 X";
                     else if(eatBox.getSelectedItem() == "가능")
                    	 eat_a = "가능";
                     else if(eatBox.getSelectedItem() == "전체")
                    	 eat_a = arr.get(i).eat;
                     
                     if(soolBox.getSelectedItem() == "안먹음")
                    	 sool_a = "안먹음";
                     else if(soolBox.getSelectedItem() == "가끔먹음")
                    	 sool_a = "가끔먹음";
                     else if(soolBox.getSelectedItem() == "자주먹음")
                    	 sool_a = "자주먹음";
                     else if(soolBox.getSelectedItem() == "전체")
                    	 sool_a = arr.get(i).sool;
                     
                     
                     
                     if(dptbox.getSelectedItem() == "전체") {
                        if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getHakbun() == hakbun_a && arr.get(i).getAge() == age_a && arr.get(i).getHeat() == heat_a && arr.get(i).getCold() == cold_a && arr.get(i).getSleep() == sleep_a && arr.get(i).getWake() == wake_a && arr.get(i).getShower() == shower_a && arr.get(i).getCall() == call_a  && arr.get(i).getEat() == eat_a && arr.get(i).getSool() == sool_a)
            		    	 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ " \t " + arr.get(i).getHeat() + " \t " + arr.get(i).getCold() + " \t " + arr.get(i).getSleep()  + " \t " + arr.get(i).getWake() +  " \t " + arr.get(i).getShower() + " \t " + arr.get(i).getCall() + " \t " + arr.get(i).getEat() + " \t " + arr.get(i).getSool() +"\n"  );
                     }
                    
                     else
                    	if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getDpt() == dptbox.getSelectedItem() && arr.get(i).getHakbun() == hakbun_a && arr.get(i).getAge() == age_a && arr.get(i).getHeat() == heat_a  && arr.get(i).getCold() == cold_a && arr.get(i).getSleep() == sleep_a && arr.get(i).getWake() == wake_a && arr.get(i).getShower() == shower_a && arr.get(i).getCall() == call_a && arr.get(i).getEat() == eat_a && arr.get(i).getSool() == sool_a)
           		    	   ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
               		        + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+" \t " + arr.get(i).getHeat() + " \t " + arr.get(i).getCold() + " \t " + arr.get(i).getSleep() + " \t " + arr.get(i).getWake()+  " \t " + arr.get(i).getShower()+" \t " + arr.get(i).getCall() + " \t " + arr.get(i).getEat() + " \t " + arr.get(i).getSool() + "\n");
                	               		    
           		    
           		              		   
           		 }
                
                	
        }});

       

        // 회원 검색
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                String content = t4.getText();

                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.searchMember(content);
                ta.append("\n");

                ta.append( "ID" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부"+ "\t" + "코골이" + "\t" + "단과대"+ "\t" + "더위"+ "\t" + "추위"+ "\t" + "취침시간"+ "\t" + "기상시간"+ "\t" + "샤워시간"+ "\t" + "실내통화"+ "\t" + "실내취식"+ "\t" + "술\t\n");
                ta.append( "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
                		+ "---------------------------------------------------------------------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
   		    	            ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
              		        + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+" \t " + arr.get(i).getHeat() + " \t " + arr.get(i).getCold() + " \t " + arr.get(i).getSleep() + " \t " + arr.get(i).getWake()+  " \t " + arr.get(i).getShower()+" \t " + arr.get(i).getCall() + " \t " + arr.get(i).getEat() + " \t " + arr.get(i).getSool() + "\n");
                }

               
                t4.setText("");
            }
        });
    }
}

