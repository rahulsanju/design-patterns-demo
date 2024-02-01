package Structural.adapter_pattern;

public class PaymentService2 {
    EncryptedClientService encryptedClientService;

    public PaymentService2(EncryptedClientService service){
        this.encryptedClientService = service;
    }

    public void makePayment(){
        System.out.println("PaymentService:");
        System.out.println("Payment Started..");
        EncryptedClient c = encryptedClientService.getClient();
        System.out.println("## Payment Done ##");
        encryptedClientService.sendConfirmation(new EncryptedMessage(), c);
    }
}
