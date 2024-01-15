package Behavioral.chain_of_responsibility;

public class Airport {
    public static void main(String[] args) {
        ChainOfResponsibility chain = new ChainOfResponsibility();

        chain.doChaining().checkPassenger(true, true, false);
    }
}
