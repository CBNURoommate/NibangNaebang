package Project;

public class MessageArray {
	String receiverid;
	String senderid;
	String sendtime ;
	String constext;
	int receiverchecked;
    

    public MessageArray(String receiverid, String senderid, String sendtime ,String constext, int receiverchecked) 
    {
        this.receiverid = receiverid;
        this.senderid = senderid;
        this.sendtime = sendtime;
        this.constext = constext;
        this.receiverchecked = receiverchecked;
    }

    public String getReceiverID() {
        return receiverid;
    }

    public String getSenderID() {
        return senderid;
    }
    
    public String getSendtime() {
        return sendtime;
    }

    public String getConstext() {
        return constext;
    }
    
    public int getReceiverchecked() {
        return receiverchecked;
    }

    
}
