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
        t4.setBounds(161, 622, 89, 33);
        jpanel.add(t4);
        ㅣ4.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4.setBounds(84, 616, 80, 40);
        jpanel.add(ㅣ4);

        jpanel.add(btn2 = new JButton("현재회원전체출력"));
        btn2.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        btn2.setBounds(82, 665, 278, 59);

        jpanel.add(btn5 = new JButton("검색"));
        btn5.setFont(new Font("나눔고딕", Font.BOLD, 12));
       // jpanel.add(ta);
        
        JLabel label = new JLabel("회원정보출력");
        label.setFont(new Font("나눔고딕", Font.PLAIN, 36));
        label.setBounds(86, 50, 375, 65);
        jpanel.add(label);
        
        
        
        scrollPane.setBounds(86,103,762,492);
        jpanel.add(scrollPane);
        scrollPane.setViewportView(ta);
        ta.setBackground(Color.WHITE);
        
        JRadioButton smokecheckbox = new JRadioButton("\uBE44\uD761\uC5F0\uC790");
        smokecheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        smokecheckbox.setBackground(Color.WHITE);
        smokecheckbox.setBounds(856, 103, 121, 23);
        jpanel.add(smokecheckbox);
        jamcheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        jamcheckbox.setBackground(Color.WHITE);
        jamcheckbox.setBounds(856, 128, 121, 23);
        
        jpanel.add(jamcheckbox);
        dptbox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC778\uBB38\uB300", "\uC0AC\uD68C\uACFC\uD559\uB300", "\uC790\uC5F0\uACFC\uD559\uB300", "\uACBD\uC601\uB300", "\uACF5\uACFC\uB300", "\uC804\uC790\uC815\uBCF4\uB300", "\uB18D\uC0DD\uB300", "\uC0AC\uBC94\uB300", "\uC0DD\uACFC\uB300", "\uC218\uC758\uB300", "\uC758\uACFC\uB300", "\uC790\uC728", "\uC804\uCCB4", "\uC804\uCCB4", "14", "15", "16", "17", "18", "19", "20", "21", "\uC804\uCCB4", "\uC778\uBB38\uB300", "\uC0AC\uD68C\uACFC\uD559\uB300", "\uC790\uC5F0\uACFC\uD559\uB300", "\uACBD\uC601\uB300", "\uACF5\uACFC\uB300", "\uC804\uC790\uC815\uBCF4\uB300", "\uB18D\uC0DD\uB300", "\uC0AC\uBC94\uB300", "\uC0DD\uACFC\uB300", "\uC218\uC758\uB300", "\uC758\uACFC\uB300", "\uC790\uC728", "\uC804\uCCB4", "\uC804\uCCB4", "14", "15", "16", "17", "18", "19", "20", "21"}));
        dptbox.setToolTipText("sss");
        dptbox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        dptbox.setBounds(929, 330, 111, 25);
        
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
        hakbunBox.setBounds(929, 377, 111, 25);
        jpanel.add(hakbunBox);
        
        
        ageBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"}));
        ageBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        ageBox.setBounds(929, 427, 110, 25);
        jpanel.add(ageBox);
        
        JLabel ㅣ4_1 = new JLabel("\uB2E8\uACFC\uB300");
        ㅣ4_1.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_1.setBounds(848, 318, 80, 40);
        jpanel.add(ㅣ4_1);
        
        JLabel ㅣ4_2 = new JLabel("\uD559\uBC88");
        ㅣ4_2.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_2.setBounds(848, 368, 80, 40);
        jpanel.add(ㅣ4_2);
        
        JLabel ㅣ4_3 = new JLabel("\uB098\uC774");
        ㅣ4_3.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4_3.setBounds(848, 418, 80, 40);
        jpanel.add(ㅣ4_3);

        
        scrollPane.setVisible(true); 
        btn5.setBounds(262, 618, 60, 40);
    
  

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

          
               
                	
               
                
                for (int i = 0; i < arr.size(); i++) {
                	
                	
                	 if(smokecheckbox.isSelected())
                        smoking_a="비흡연";
                     else
                        smoking_a=arr.get(i).smoking;
                    
                     
                     if(jamcheckbox.isSelected())
                        jam_a="x";
                     else
                        jam_a=arr.get(i).jam;
                     
                     
                    
                     if(dptbox.getSelectedItem() == "전체" && hakbunBox.getSelectedItem() == "전체" && ageBox.getSelectedItem() == "전체") {
                    	 if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a)
               		    	 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                   		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                    	 
                     }
                     
                     
                     else if(dptbox.getSelectedItem() == "전체") {
                    	 if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getHakbun() == hakbun_a && arr.get(i).getAge() == age_a)
               		    	 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                   		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                    	 
                     }
                     
                     else if(hakbunBox.getSelectedItem() == "전체") {
                    	 if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getDpt() == dptbox.getSelectedItem() && arr.get(i).getAge() == age_a)
               		    	 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                   		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                    	 
                     }
                     
                     else if(ageBox.getSelectedItem() == "전체") {
                    	 if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getDpt() == dptbox.getSelectedItem() && arr.get(i).getHakbun() == hakbun_a)
               		    	 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                   		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                    	 
                     }
                     
                    
                     
                	
                	                  	               	 
                     else if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a && arr.get(i).getDpt() == dptbox.getSelectedItem() && arr.get(i).getHakbun() == hakbun_a && arr.get(i).getAge() == age_a)
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

