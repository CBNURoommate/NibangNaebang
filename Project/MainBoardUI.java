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
import java.awt.Color;
import java.awt.Font;

public class MainBoardUI {
    JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextArea ta = new JTextArea();

    JButton btn1, btn2, btn3, btn4, btn5;
    JLabel ㅣ1 = new JLabel("이름 : ");
    JLabel ㅣ2 = new JLabel("생년월일 : ");
    JLabel ㅣ3 = new JLabel("전화번호 : ");
    JLabel ㅣ4 = new JLabel("검색내용 : ");
    public JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

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
        t1.setBounds(130, 716, 70, 25);
        jpanel.add(t1);
        ㅣ1.setBounds(95, 713, 70, 30);
        jpanel.add(ㅣ1);
        t2.setBounds(275, 716, 70, 25);
        jpanel.add(t2);
        ㅣ2.setBounds(212, 713, 70, 30);
        jpanel.add(ㅣ2);
        t3.setBounds(421, 716, 80, 25);
        jpanel.add(t3);
        ㅣ3.setBounds(357, 713, 70, 30);
        jpanel.add(ㅣ3);
        t4.setBounds(574, 716, 80, 25);
        jpanel.add(t4);
        ㅣ4.setBounds(513, 713, 70, 30);
        jpanel.add(ㅣ4);

        jpanel.add(btn1 = new JButton("입력"));
        btn1.setBounds(298, 762, 80, 30);

        jpanel.add(btn2 = new JButton("현재회원전체출력"));
        btn2.setFont(new Font("나눔고딕", Font.PLAIN, 36));
        btn2.setBounds(694, 703, 331, 59);

        jpanel.add(btn3 = new JButton("수정"));
        btn3.setBounds(390, 762, 80, 30);

        jpanel.add(btn4 = new JButton("삭제"));
        btn4.setBounds(482, 762, 80, 30);

        jpanel.add(btn5 = new JButton("검색"));
       // jpanel.add(ta);
        
        JLabel label = new JLabel("회원정보출력");
        label.setFont(new Font("나눔고딕", Font.PLAIN, 36));
        label.setBounds(86, 88, 375, 105);
        jpanel.add(label);
        
        
        
        scrollPane.setBounds(86,178,939,497);
        jpanel.add(scrollPane);
        scrollPane.setViewportView(ta);
        ta.setBackground(Color.LIGHT_GRAY);
        scrollPane.setVisible(true); 
        btn5.setBounds(574, 762, 80, 30);
        
  

        Controller dao = new Controller();


        // 회원 추가
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                String birth = t2.getText();
                String tel = t3.getText();
                String a="a";
                String b="b";
                String c="c";
                String d="d";
                
                dao.insertMember(new Model(name, birth, tel,a,b,c,d));

                ta.append("입력 완료 \n");

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // 회원 목록 출력
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readMember();

                ta.append("\t" + "id" + "\t" + "passwd" + "\t" + "name"+ "\t" + "gender"+ "\t" + "dom"+ "\t" + "hakbun"+ "\t" + "age\n");
                ta.append("\t" + "--------------------------------------------------------------------------------------------"
                		+ "-----------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                	
                	if(arr.get(i).getA() == "1") 
                         ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()+ "\t " + "남자"
                    		+ " \t " + arr.get(i).getB() + " \t " + arr.get(i).getC() + " \t " + arr.get(i).getD()  + "\n");
                	
                	
                	else
                		 ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()+ " \t " + arr.get(i).getA()
                         		+ " \t " + arr.get(i).getB() + " \t " + arr.get(i).getC() + " \t " + arr.get(i).getD()  + "\n");
                     	}
                }
            
        });

        // 회원 수정 arr.get(i).getA()
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                String birth = t2.getText();
                String tel = t3.getText();

                dao.updateMember(name, tel);
                ta.append("수정 완료 \n");

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // 회원 삭제
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                dao.deleteMember(name);
                ta.append("삭제 완료 \n");

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
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

                ta.append("\t" + "id" + "\t" + "passwd" + "\t" + "name"+ "\t" + "gender"+ "\t" + "dom"+ "\t" + "hakbun"+ "\t" + "age\n");
                ta.append("\t" + "--------------------------------------------------------------------------------------------"
                		+ "-----------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                	ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()+ " \t " + arr.get(i).getA()
                     		+ " \t " + arr.get(i).getB() + " \t " + arr.get(i).getC() + " \t " + arr.get(i).getD()  + "\n");
                }

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
    }
}
