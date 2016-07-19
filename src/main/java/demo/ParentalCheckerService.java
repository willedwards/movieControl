package demo;


public interface ParentalCheckerService {

    void checkMovieById(String id) throws TechnicalFailureException, TitleNotFoundException;

    void setLevel(ParentalControlLevels newLevel);
}
