package Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainBoardUI extends JFrame{
    JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextArea ta = new JTextArea();
    JButton btn1, btn2, btn3, btn4, btn5;
    JLabel ��1 = new JLabel("�̸� : ");
    JLabel ��2 = new JLabel("������� : ");
    JLabel ��3 = new JLabel("��ȭ��ȣ : ");
    JLabel ��4 = new JLabel("�˻����� : ");

    MainBoardUI() {
        GUI_init();
    }

    public void GUI_init() {
        jframe.setTitle("ȸ������");
        jframe.setBounds(50, 50, 480, 450);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jpanel.setLayout(null);
        jframe.add(jpanel);

        t1.setBounds(75, 25, 70, 25);
        jpanel.add(t1);
        ��1.setBounds(37, 21, 70, 30);
        jpanel.add(��1);

        t2.setBounds(213, 25, 70, 25);
        jpanel.add(t2);
        ��2.setBounds(150, 21, 70, 30);
        jpanel.add(��2);

        t3.setBounds(352, 25, 80, 25);
        jpanel.add(t3);
        ��3.setBounds(290, 21, 70, 30);
        jpanel.add(��3);

        t4.setBounds(213, 105, 80, 25);
        jpanel.add(t4);
        ��4.setBounds(150, 100, 70, 30);
        jpanel.add(��4);

        JScrollPane jsp = new JScrollPane(ta);
        jsp.setBounds(23, 145, 420, 250);
        jpanel.add(jsp);

        jpanel.add(btn1 = new JButton("�Է�"));
        btn1.setBounds(40, 60, 80, 30);

        jpanel.add(btn2 = new JButton("���"));
        btn2.setBounds(145, 60, 80, 30);

        jpanel.add(btn3 = new JButton("����"));
        btn3.setBounds(250, 60, 80, 30);

        jpanel.add(btn4 = new JButton("����"));
        btn4.setBounds(350, 60, 80, 30);

        jpanel.add(btn5 = new JButton("�˻�"));
        btn5.setBounds(300, 100, 80, 30);

        Controller dao = new Controller();


        // ȸ�� �߰�
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                String birth = t2.getText();
                String tel = t3.getText();

                dao.insertMember(new Model(name, birth, tel));

                ta.append("�Է� �Ϸ� \n");

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // ȸ�� ��� ���
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.readMember();

                ta.append("\t" + "name" + "\t" + "birth" + "\t" + "tel\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()
                            + "\n");
                }
            }
        });

        // ȸ�� ����
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                String birth = t2.getText();
                String tel = t3.getText();

                dao.updateMember(name, tel);
                ta.append("���� �Ϸ� \n");

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // ȸ�� ����
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");

                String name = t1.getText();
                dao.deleteMember(name);
                ta.append("���� �Ϸ� \n");

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        // ȸ�� �˻�
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                String content = t4.getText();

                ArrayList<Model> arr = new ArrayList<Model>();
                arr = dao.searchMember(content);
                ta.append(" \n");

                ta.append("\t" + "name" + "\t" + "birth" + "\t" + "tel\n");
                ta.append("\t" + "------------------------------------------------------------\n");

                for (int i = 0; i < arr.size(); i++) {
                    ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()
                            + "\n");
                }

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
    }
}

