package demo;

public class NotAllowedException extends RuntimeException {
    private static final String DISALLOWED = "You may not watch the movie";

    public NotAllowedException(){
        super(DISALLOWED);
    }
}
