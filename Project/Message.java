/*
 * package Project;
 * 
 * import java.awt.Color; import java.sql.Connection; import
 * java.sql.DriverManager; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement;
 * import java.util.ArrayList;
 * 
 * import javax.swing.JFrame; import javax.swing.JPanel; import
 * javax.swing.JScrollPane; import javax.swing.JTextArea;
 * 
 * import javax.swing.JButton; import javax.swing.JLabel; import
 * javax.swing.JTextField; import javax.swing.event.CaretListener; import
 * java.awt.Font; import javax.swing.JRadioButton; import javax.swing.JComboBox;
 * import javax.swing.JCheckBox; import javax.swing.JTable;
 * 
 * //
 * 
 * //import javax.swing.text.View; // //public class Message { // // public
 * static void main(String[] args) { // // MessageUI gui = new MessageUI(); // }
 * // // //}
 * 
 * public class Message { public static void main(String[] args) {
 * 
 * // CurrentUser user = new CurrentUser(); // String receiverid = user.getId();
 * String receiverid = "5678";
 * 
 * JTextArea ta = new JTextArea(); JFrame jframe = new JFrame(); JPanel jpanel =
 * new JPanel(); Connection conn = null;
 * 
 * public JScrollPane scrollPane = new
 * JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.
 * HORIZONTAL_SCROLLBAR_ALWAYS); ta.setBackground(Color.WHITE);
 * scrollPane.setBounds(86,103,762,492); jpanel.add(scrollPane);
 * scrollPane.setViewportView(ta);
 * 
 * try { conn = DriverManager.getConnection(
 * "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com",
 * "admin", "singapore"); } catch (Exception e) { e.printStackTrace(); }
 * 
 * ArrayList<MessageArray> arr = new ArrayList<MessageArray>();
 * System.out.println(arr); try { ResultSet strs; Statement st; st =
 * conn.createStatement(); strs =
 * st.executeQuery("select * from Test.msgtable where receiverid like '%" +
 * receiverid + "%';"); //int cnt = 1; while (strs.next()) { if
 * (strs.getString(1) == receiverid) arr.add(new MessageArray(strs.getString(1),
 * strs.getString(2), strs.getString(3), strs.getString(4), strs.getInt(5)));
 * //System.out.println(cnt + " \t "); //cnt++; } } catch (SQLException e) {
 * e.printStackTrace(); } // finally { // try { // st.close(); // } catch
 * (Exception e) { // e.printStackTrace(); // } // }
 * 
 * // return arr; System.out.
 * println("ReceiverID \t SenderID \t Sendtime \t Constext \t Receiverchecked \n"
 * ); System.out.println(
 * "-----------------------------------------------------------------------------------\n"
 * );
 * 
 * for (int i = 0; i < arr.size(); i++) {
 * 
 * ta.append(i + " \t " + arr.get(i).getReceiverID() + " \t " +
 * arr.get(i).getSenderID() + " \t " + arr.get(i).getSendtime() + " \t " +
 * arr.get(i).getConstext() + " \t " + arr.get(i).getReceiverchecked()); } } }
 */