package demo;

public class TitleNotFoundException extends Exception {

    private static final String MESSAGE = "Sorry, no matching movie was not found";

    public TitleNotFoundException() {
        super(MESSAGE);
    }
}
