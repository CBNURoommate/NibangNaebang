package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private final JRadioButton jamcheckbox = new JRadioButton("\uCF54\uACE8\uC774x");
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
    private final JComboBox whenshowerBox = new JComboBox();
    private final JComboBox callBox = new JComboBox();
    private final JComboBox eatBox = new JComboBox();
    private final JComboBox comboBox_2 = new JComboBox();

    MainBoardUI() {
        GUI_init();
    }

    public void GUI_init() {
        jframe.setTitle("회원관리");
        jframe.setBounds(50, 50, 1600, 900);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jpanel.setBackground(Color.WHITE);
        jframe.getContentPane().add(jpanel);
        jpanel.setLayout(null);
        t4.setBounds(754, 67, 89, 33);
        jpanel.add(t4);
        ㅣ4.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4.setBounds(662, 59, 80, 40);
        jpanel.add(ㅣ4);

        jpanel.add(btn2 = new JButton("현재회원전체출력"));
        btn2.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        btn2.setBounds(635, 637, 278, 59);

        jpanel.add(btn5 = new JButton("검색"));
        btn5.setFont(new Font("나눔고딕", Font.BOLD, 12));
       // jpanel.add(ta);
        
        JLabel label = new JLabel("회원정보출력");
        label.setFont(new Font("나눔고딕", Font.BOLD, 36));
        label.setBounds(86, 54, 210, 40);
        jpanel.add(label);
        
        
        
        scrollPane.setBounds(86,103,827,492);
        jpanel.add(scrollPane);
        scrollPane.setViewportView(ta);
        ta.setBackground(Color.WHITE);
        
        JRadioButton smokecheckbox = new JRadioButton("\uBE44\uD761\uC5F0\uC790");
        smokecheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        smokecheckbox.setBackground(Color.WHITE);
        smokecheckbox.setBounds(824, 608, 89, 23);
        jpanel.add(smokecheckbox);
        jamcheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        jamcheckbox.setBackground(Color.WHITE);
        jamcheckbox.setBounds(738, 608, 80, 23);
        
        jpanel.add(jamcheckbox);
        dptbox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC778\uBB38\uB300", "\uC0AC\uD68C\uACFC\uD559\uB300", "\uC790\uC5F0\uACFC\uD559\uB300", "\uACBD\uC601\uB300", "\uACF5\uACFC\uB300", "\uC804\uC790\uC815\uBCF4\uB300", "\uB18D\uC0DD\uB300", "\uC0AC\uBC94\uB300", "\uC0DD\uACFC\uB300", "\uC218\uC758\uB300", "\uC758\uACFC\uB300", "\uC790\uC728"}));
        dptbox.setToolTipText("sss");
        dptbox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        dptbox.setBounds(1062, 104, 111, 25);
        
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
        
        hakbunBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "14", "15", "16", "17", "18", "19", "20", "21"}));
        hakbunBox.setFont(new Font("나눔고딕", Font.BOLD, 12));        
        hakbunBox.setBounds(1062, 151, 111, 25);
        jpanel.add(hakbunBox);
        
        
        ageBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"}));
        ageBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        ageBox.setBounds(1063, 201, 110, 25);
        jpanel.add(ageBox);
        
        JLabel ㅣ4_1 = new JLabel("\uB2E8\uACFC\uB300");
        ㅣ4_1.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_1.setBounds(977, 103, 71, 33);
        jpanel.add(ㅣ4_1);
        
        JLabel ㅣ4_2 = new JLabel("\uD559\uBC88");
        ㅣ4_2.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_2.setBounds(1000, 151, 51, 33);
        jpanel.add(ㅣ4_2);
        
        JLabel ㅣ4_3 = new JLabel("\uB098\uC774");
        ㅣ4_3.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3.setBounds(1000, 201, 51, 28);
        jpanel.add(ㅣ4_3);
        ㅣ4_3_1.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_1.setBounds(959, 345, 89, 23);
        
        jpanel.add(ㅣ4_3_1);
        ㅣ4_3_2.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_2.setBounds(959, 393, 89, 23);
        
        jpanel.add(ㅣ4_3_2);
        ㅣ4_3_3.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_3.setBounds(1025, 572, 22, 23);
        
        jpanel.add(ㅣ4_3_3);
        ㅣ4_3_4.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_4.setBounds(959, 436, 89, 30);
        
        jpanel.add(ㅣ4_3_4);
        ㅣ4_3_5.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_5.setBounds(1000, 246, 48, 33);
        
        jpanel.add(ㅣ4_3_5);
        ㅣ4_3_6.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_6.setBounds(1000, 299, 51, 23);
        
        jpanel.add(ㅣ4_3_6);
        ㅣ4_3_4_1.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_4_1.setBounds(959, 483, 89, 22);
        
        jpanel.add(ㅣ4_3_4_1);
        ㅣ4_3_4_2.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3_4_2.setBounds(959, 527, 89, 23);
        
        jpanel.add(ㅣ4_3_4_2);
        heatBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC801\uAC8C\uD0D0", "\uBCF4\uD1B5", "\uB9CE\uC774\uD0D0"}));
        heatBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        heatBox.setBounds(1062, 251, 111, 25);
        
        jpanel.add(heatBox);
        coldBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC801\uAC8C\uD0D0", "\uBCF4\uD1B5", "\uB9CE\uC774\uD0D0"}));
        coldBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        coldBox.setBounds(1062, 297, 111, 25);
        
        jpanel.add(coldBox);
        sleepBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        sleepBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "22\uC2DC", "23\uC2DC", "0\uC2DC", "1\uC2DC", "2\uC2DC", "3\uC2DC"}));
        sleepBox.setBounds(1062, 342, 111, 25);
        
        jpanel.add(sleepBox);
        wakeBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "7", "8", "9", "10", "11", "\uC624\uD6C4"}));
        wakeBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        wakeBox.setBounds(1061, 391, 112, 25);
        
        jpanel.add(wakeBox);
        whenshowerBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        whenshowerBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC544\uCE68", "\uC800\uB141", "\uC720\uB3D9\uC801"}));
        whenshowerBox.setBounds(1062, 436, 111, 25);
        
        jpanel.add(whenshowerBox);
        callBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uBC18\uB300", "\uC0C1\uAD00\uC5C6\uC74C", "\uCC2C\uC131\t", "\uAC04\uB2E8\uD55C\uC6A9\uBB34"}));
        callBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        callBox.setBounds(1062, 480, 111, 25);
        
        jpanel.add(callBox);
        eatBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uBD88\uAC00", "\uB0C4\uC0C8x", "\uAC00\uB2A5"}));
        eatBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        eatBox.setBounds(1062, 527, 111, 25);
        
        jpanel.add(eatBox);
        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC548\uBA39\uC74C", "\uAC00\uB054\uBA39\uC74C", "\uC790\uC8FC\uBA39\uC74C"}));
        comboBox_2.setFont(new Font("나눔고딕", Font.BOLD, 12));
        comboBox_2.setBounds(1062, 572, 111, 23);
        
        jpanel.add(comboBox_2);

        
        scrollPane.setVisible(true); 
        btn5.setBounds(855, 63, 60, 40);
    
  

        Controller dao = new Controller();
      
     
     // 회원 목록 출력
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readMember();

                ta.append( "id" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부"+ "\t" + "코골이"+ "\t" + "단과대\n");
                ta.append( "------------------------------------------------------------------------------------------------------------------------------------"
                		+ "-----------------------------------------------------\n");
         
                
                String gender_a="a";
                String dom_a="a";
                String smoking_a="a";
                String jam_a="a";
                String dpt_a="a";
                String hakbun_a ="a";
                String age_a ="a";

                
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
                     
                     
                    if(dptbox.getSelectedItem() == "전체") {
                        if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getHakbun() == hakbun_a && arr.get(i).getAge() == age_a)
            		    	 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                    }
                    else
                    	if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getDpt() == dptbox.getSelectedItem() && arr.get(i).getHakbun() == hakbun_a && arr.get(i).getAge() == age_a)
           		    	   ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
               		        + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                	               		    
           		    
           		              		   
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

                ta.append( "id" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부"+ "\t" + "코골이" + "\t" + "단과대\n");
                ta.append( "-------------------------------------------------------------------------------------------------------------------------------------"
                		+ "-----------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                	ta.append(arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                         	+ " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()+ " \t " + arr.get(i).getJam()+" \t " + arr.get(i).getDpt()+ "\n");
                }

               
                t4.setText("");
            }
        });
    }
}

