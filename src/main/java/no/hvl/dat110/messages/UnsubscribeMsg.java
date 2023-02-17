package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

    public UnsubscribeMsg(String user, String topic) {

    }

    @Override
	public String toString(){
        return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topic=" + getTopic() +"]";
    }
}
