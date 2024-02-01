package Structural.adapter_pattern;

public class Client {
    private int id;
    private String name;
    private int cardDetails;

    public Client getClient(){
        return this;
    }

    public void receiveAcknowledgement(Message m){
        System.out.println("Client:\nAcknowledgement Received!");
    }

}
