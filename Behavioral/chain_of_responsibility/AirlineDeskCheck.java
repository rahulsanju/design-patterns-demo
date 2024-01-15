package Behavioral.chain_of_responsibility;

public class AirlineDeskCheck extends Check {

    @Override
    public void checkPassenger(boolean validIdentityDocs, boolean validTravelDocs, boolean containsNoProhibitedItems){
        if (validTravelDocs){
            System.out.println("Airline Desk Check completed");
            System.out.println("Passenger's baggage is checked-in");
            nextCheck.checkPassenger(validIdentityDocs, validTravelDocs, containsNoProhibitedItems);
        }else{
            System.out.println("Airline Desk Check Failed");
        }

    }
}
