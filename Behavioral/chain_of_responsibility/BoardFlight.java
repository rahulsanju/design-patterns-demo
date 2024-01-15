package Behavioral.chain_of_responsibility;

public class BoardFlight extends Check {
    @Override
    public void checkPassenger(boolean validIdentityDocs, boolean validTravelDocs, boolean containsNoProhibitedItems){
        System.out.println("Passenger boarded the flight");
    }
}
