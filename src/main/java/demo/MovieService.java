package demo;


public interface MovieService {

    String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException;
}
