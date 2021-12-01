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

public class MainBoardUI {
    JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();
    JTextField t4 = new JTextField();
    JTextArea ta = new JTextArea();
    int smokecheck = 0;

    JButton  btn2, btn5;
    JLabel ㅣ4 = new JLabel("ID \uAC80\uC0C9");
    public JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private final JRadioButton mancheckbox = new JRadioButton("\uB0A8\uC790");
    private final JRadioButton girlcheckbox = new JRadioButton("\uC5EC\uC790");

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
        t4.setBounds(881, 196, 89, 40);
        jpanel.add(t4);
        ㅣ4.setFont(new Font("나눔고딕", Font.BOLD, 23));
        ㅣ4.setBounds(792, 196, 80, 40);
        jpanel.add(ㅣ4);

        jpanel.add(btn2 = new JButton("현재회원전체출력"));
        btn2.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        btn2.setBounds(792, 255, 278, 59);

        jpanel.add(btn5 = new JButton("검색"));
       // jpanel.add(ta);
        
        JLabel label = new JLabel("회원정보출력");
        label.setFont(new Font("나눔고딕", Font.PLAIN, 36));
        label.setBounds(130, 86, 375, 105);
        jpanel.add(label);
        
        
        
        scrollPane.setBounds(86,178,694,492);
        jpanel.add(scrollPane);
        scrollPane.setViewportView(ta);
        ta.setBackground(Color.WHITE);
        
        JRadioButton smokecheckbox = new JRadioButton("\uD761\uC5F0\uC790");
        smokecheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        smokecheckbox.setBackground(Color.WHITE);
        smokecheckbox.setBounds(792, 355, 121, 23);
        jpanel.add(smokecheckbox);
        mancheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        mancheckbox.setBackground(Color.WHITE);
        mancheckbox.setBounds(792, 391, 121, 23);
        
        jpanel.add(mancheckbox);
        girlcheckbox.setFont(new Font("나눔고딕", Font.BOLD, 16));
        girlcheckbox.setBackground(Color.WHITE);
        girlcheckbox.setBounds(792, 426, 121, 23);
        
        jpanel.add(girlcheckbox);
        scrollPane.setVisible(true); 
        btn5.setBounds(982, 195, 89, 40);
        
  

        Controller dao = new Controller();
      
     
     // 회원 목록 출력
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readMember();

                ta.append("\t" + "id" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부\n");
                ta.append("\t" + "--------------------------------------------------------------------------------------------"
                		+ "-----------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                	 
                	 if(smokecheckbox.isSelected()) {
                		 if(mancheckbox.isSelected()) {
                		     if(arr.get(i).getSmoking() == "흡연" && arr.get(i).getGender()=="남자" )
                                ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                    		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                		 }
                		 
                		 if(girlcheckbox.isSelected()) {
                			 if(arr.get(i).getSmoking() == "흡연" && arr.get(i).getGender()=="여자" )
                                 ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                     		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                			 
                		 }
                		 
                		 else if(arr.get(i).getSmoking() == "흡연")
                			    ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                        		     + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");		 
                		    	 
                	 }
                	 else if(mancheckbox.isSelected()) {
                		 if(girlcheckbox.isSelected()) {
                			 ta.append("\t 성별을 잘못 선택하셨습니다.\n");
                		 }
                		 else if(arr.get(i).getGender()=="남자")
                		  ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                            + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                	 }
                	 else if(girlcheckbox.isSelected()) {
                		 if(arr.get(i).getGender()=="여자")
                		  ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                            + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                	 }
                	 
                	 else if(smokecheckbox.isSelected()) {
                		 if(mancheckbox.isSelected()) {
                			 if(girlcheckbox.isSelected()) {
                				 ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                                 + " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                			 }
                			 
                		 }
                	 }
                	 
                	 
                	 
                	 else {
                		  ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                         	+ " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                	 }
                		                	
                	
                	
                     }
                }
            
        });

       

        // 회원 검색
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                String content = t4.getText();

                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.searchMember(content);
                ta.append(" \n");

                ta.append("\t" + "id" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부\n");
                ta.append("\t" + "--------------------------------------------------------------------------------------------"
                		+ "-----------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                	ta.append("\t" + arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                         	+ " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()  + "\n");
                }

               
                t4.setText("");
            }
        });
    }
}
