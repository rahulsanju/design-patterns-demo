package Structural.adapter_pattern;

public class ClientService {
    public Client getClient(){
        return new Client();
    }

    public void receiveAcknowledgement(Message m, Client c){
        c.receiveAcknowledgement(m);
    }
}
