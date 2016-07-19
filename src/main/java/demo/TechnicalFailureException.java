package demo;

public class TechnicalFailureException extends Exception {

    private static final String MESSAGE ="Sorry, an error occurred, please try again later, or quote code : 1234";
    public TechnicalFailureException(){
        super(MESSAGE);
    }
}
