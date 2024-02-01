package Structural.adapter_pattern;

public class NStreamingService {

    private ClientService clientService = new ClientService();

    public Client getClient() {
        return clientService.getClient();
    }

    public void sendAcknowledgement(Message m, Client c){
        clientService.receiveAcknowledgement(m, c);
    }
}
