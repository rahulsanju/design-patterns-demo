package Behavioral.chain_of_responsibility;

public class ChainOfResponsibility {
    public Check doChaining(){
        Check entranceCheck = new EntranceCheck();

        Check airlineDeskCheck = new AirlineDeskCheck();
        entranceCheck.setNextCheck(airlineDeskCheck);

        Check tsaCheck = new TSACheck();
        airlineDeskCheck.setNextCheck(tsaCheck);

        Check boardFlight = new BoardFlight();
        tsaCheck.setNextCheck(boardFlight);

        return entranceCheck;
    }
}
