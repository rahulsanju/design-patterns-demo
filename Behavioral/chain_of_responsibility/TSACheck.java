package Behavioral.chain_of_responsibility;

public class TSACheck extends Check {

    @Override
    public void checkPassenger(boolean validIdentityDocs, boolean validTravelDocs, boolean containsNoProhibitedItems){
        if (containsNoProhibitedItems){
            System.out.println("TSACheck is Completed");
            nextCheck.checkPassenger(validIdentityDocs, validTravelDocs, containsNoProhibitedItems);
        }else{
            System.out.println("TSA Check Failed");
        }
    }
}
