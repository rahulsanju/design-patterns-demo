package Structural.adapter_pattern;

public interface EncryptedClientService {
    public EncryptedClient getClient();

    void sendConfirmation(EncryptedMessage message, EncryptedClient c);
}
