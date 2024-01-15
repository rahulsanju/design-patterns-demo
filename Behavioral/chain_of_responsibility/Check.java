package Behavioral.chain_of_responsibility;

public abstract class Check {
    public Check nextCheck;

    public void setNextCheck(Check nextCheck){
        this.nextCheck = nextCheck;
    }

    public void checkPassenger(boolean validIdentityDocs, boolean validTravelDocs, boolean containsNoProhibitedItems){}
}

