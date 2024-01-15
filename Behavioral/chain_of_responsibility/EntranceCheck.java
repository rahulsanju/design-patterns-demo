package Behavioral.chain_of_responsibility;

public class EntranceCheck extends Check {

    @Override
    public void checkPassenger(boolean validIdentityDocs, boolean validTravelDocs, boolean containsNoProhibitedItems){
        if (validIdentityDocs){
            System.out.println("Entrance Check Passed");
            nextCheck.checkPassenger(validIdentityDocs, validTravelDocs, containsNoProhibitedItems);
        }else{
            System.out.println("Entrance Check Failed");
        }
    }
}
