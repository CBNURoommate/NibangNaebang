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
    private final JComboBox showerBox = new JComboBox();
    private final JComboBox callBox = new JComboBox();
    private final JComboBox eatBox = new JComboBox();
    private final JComboBox soolBox = new JComboBox();

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
        wakeBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "7\uC2DC", "8\uC2DC", "9\uC2DC", "10\uC2DC", "11\uC2DC", "\uC624\uD6C4"}));
        wakeBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        wakeBox.setBounds(1061, 391, 112, 25);
        
        jpanel.add(wakeBox);
        showerBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        showerBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC544\uCE68", "\uC800\uB141", "\uC720\uB3D9\uC801"}));
        showerBox.setBounds(1062, 436, 111, 25);
        
        jpanel.add(showerBox);
        callBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uBC18\uB300", "\uC0C1\uAD00\uC5C6\uC74C", "\uCC2C\uC131\t", "\uAC04\uB2E8\uD55C\uC6A9\uBB34"}));
        callBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        callBox.setBounds(1062, 480, 111, 25);
        
        jpanel.add(callBox);
        eatBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uBD88\uAC00", "\uB0C4\uC0C8x", "\uAC00\uB2A5"}));
        eatBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        eatBox.setBounds(1062, 527, 111, 25);
        
        jpanel.add(eatBox);
        soolBox.setModel(new DefaultComboBoxModel(new String[] {"\uC804\uCCB4", "\uC548\uBA39\uC74C", "\uAC00\uB054\uBA39\uC74C", "\uC790\uC8FC\uBA39\uC74C"}));
        soolBox.setFont(new Font("나눔고딕", Font.BOLD, 12));
        soolBox.setBounds(1062, 572, 111, 23);
        
        jpanel.add(soolBox);

        
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

                ta.append( "id" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부"+ "\t" + "코골이" + "\t" + "단과대"+ "\t" + "더위"+ "\t" + "추위"+ "\t" + "취침시간"+ "\t" + "기상시간"+ "\t" + "샤워시간"+ "\t" + "실내통화"+ "\t" + "실내취식"+ "\t" + "술\t\n");
                ta.append( "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
                		+ "-------------------------------------------------------------------------------------------------------------------\n");
         
                
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
                     else if(callBox.getSelectedItem() == "간단한용무")
                    	 call_a = "간단한용무";
                     else if(callBox.getSelectedItem() == "전체")
                    	 call_a = arr.get(i).call;
                     
                     if(eatBox.getSelectedItem() == "불가")
                    	 eat_a = "불가";
                     else if(eatBox.getSelectedItem() == "냄새x")
                    	 eat_a = "냄새x";
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

                ta.append( "id" + "\t" + "이름" + "\t" + "성별"+ "\t" + "기숙사"+ "\t" + "학번"+ "\t" + "나이"+ "\t" + "흡연여부"+ "\t" + "코골이" + "\t" + "단과대"+ "\t" + "더위"+ "\t" + "추위"+ "\t" + "취침시간"+ "\t" + "기상시간"+ "\t" + "샤워시간"+ "\t" + "실내통화"+ "\t" + "실내취식"+ "\t" + "술\n");
                ta.append( "-------------------------------------------------------------------------------------------------------------------------------------"
                		+ "----------------------------------------------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                	ta.append(arr.get(i).getID() + " \t " + arr.get(i).getName() + " \t " + arr.get(i).getGender()+ "\t " + arr.get(i).getDom()
                         	+ " \t " + arr.get(i).getHakbun() + " \t " + arr.get(i).getAge() + " \t " + arr.get(i).getSmoking()+ " \t " + arr.get(i).getJam()+" \t " + arr.get(i).getDpt()+ "\n");
                }

               
                t4.setText("");
            }
        });
    }
}

