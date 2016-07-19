package demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultMovieService implements MovieService {

    private Map<String,ParentalControlLevels> existingParentalControlLevels = new ConcurrentHashMap();

    public DefaultMovieService(){

        existingParentalControlLevels.put("boysFromBrazil", ParentalControlLevels.LEVEL_18);
        existingParentalControlLevels.put("predator",ParentalControlLevels.LEVEL_15);
        existingParentalControlLevels.put("theTwoRonnies",ParentalControlLevels.LEVEL_PG);
        existingParentalControlLevels.put("skyfall",ParentalControlLevels.LEVEL_12);
        existingParentalControlLevels.put("bugsBunny",ParentalControlLevels.LEVEL_U);

    }

    @Override
    public String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException {
        ParentalControlLevels level = existingParentalControlLevels.get(movieId);
        if(level == null){
            throw new TitleNotFoundException();
        }

        return level.toString();
    }
}
