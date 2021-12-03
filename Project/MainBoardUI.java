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
        dptbox.setToolTipText("sss");
        dptbox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        dptbox.setBounds(860, 332, 111, 25);
        
        jpanel.add(dptbox);
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
                
                if(dptbox.getSelectedItem() == "경영대")
            	   dpt_a = "경영대";
                else
                   dpt_a = "사회과학대";
          
          
                if(smokecheckbox.isSelected())
                   smoking_a="비흡연";
                else
                   smoking_a="흡연";
               
                
                if(jamcheckbox.isSelected())
                   jam_a="x";
                else
                   jam_a="o";
                	
               
                
                for (int i = 0; i < arr.size(); i++) {
                	
                	 if(!smokecheckbox.isSelected() && !jamcheckbox.isSelected()) {
                		 if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a)
                		 ta.append( arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                         + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + " \t " + arr.get(i).getJam() + " \t " + arr.get(i).getDpt()+ "\n");
                	 }
                     else
                        if(arr.get(i).getGender() == gender_a && arr.get(i).getDom() == dom_a && arr.get(i).getSmoking() == smoking_a && arr.get(i).getJam() == jam_a)
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

