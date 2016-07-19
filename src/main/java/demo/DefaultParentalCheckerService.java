package demo;

public class DefaultParentalCheckerService implements ParentalCheckerService {

    private ParentalControlLevels currentLevel;
    private final MovieService movieService;


    public DefaultParentalCheckerService(ParentalControlLevels initialLevel, MovieService movieService){
        currentLevel = initialLevel;
        this.movieService = movieService;
    }

    @Override
    public void checkMovieById(String id) throws TechnicalFailureException, TitleNotFoundException {
            if(id == null || id.isEmpty()){
                throw new TitleNotFoundException();
            }

            String movieLevelString = movieService.getParentalControlLevel(id);
            ParentalControlLevels movieLevel = ParentalControlLevels.valueOf(movieLevelString);

           if(currentLevel.compareTo(movieLevel) < 0){
               throw new NotAllowedException();
           }
    }

    @Override
    public void setLevel(ParentalControlLevels newLevel) {
        this.currentLevel = newLevel;
    }
}
