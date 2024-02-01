package Structural.adapter_pattern;

public class Demo {
    public static void main(String[] args) {
        EncryptedClientService encryptedClientService = new EncryptionAdapter();
        PaymentService2 ps2 = new PaymentService2(encryptedClientService);

        ps2.makePayment();
    }
}
