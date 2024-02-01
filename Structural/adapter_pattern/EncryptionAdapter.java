package Structural.adapter_pattern;

public class EncryptionAdapter implements EncryptedClientService{

    private NStreamingService nStreamingService = new NStreamingService();
    @Override
    public EncryptedClient getClient() {
        return encryptClient(nStreamingService.getClient());
    }

    @Override
    public void sendConfirmation(EncryptedMessage message, EncryptedClient c) {
        nStreamingService.sendAcknowledgement(decryptMessage(message),decryptClient(c));
    }

    private EncryptedClient encryptClient(Client c){
        //Encryption Logic
        return new EncryptedClient();
    }

    private Client decryptClient(EncryptedClient c){
        return new Client();
    }

    private Message decryptMessage(EncryptedMessage m){
        // Decryption Logic
        return new Message();
    }
}
