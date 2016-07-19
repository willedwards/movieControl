/*
    Generated by Atomist on 13 07 2016 
*/
package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

public class MoviesServiceTest {

	private MovieService movieService = new DefaultMovieService();

	@Test
	public void bugsBunnyIsValidULevelRating() throws Exception {
		assertEquals(ParentalControlLevels.LEVEL_U.toString(),movieService.getParentalControlLevel("bugsBunny"));
	}

	@Test
	public void boysFromBrazilIsLevelRating18() throws Exception {
		assertEquals(ParentalControlLevels.LEVEL_18.toString(),movieService.getParentalControlLevel("boysFromBrazil"));
	}

	@Test
	public void theTwoRonniesIsLevelPG() throws Exception {
		assertEquals(ParentalControlLevels.LEVEL_PG.toString(),movieService.getParentalControlLevel("theTwoRonnies"));
	}

	@Test(expected = TitleNotFoundException.class)
	public void noMatchingTitle() throws Exception {
		movieService.getParentalControlLevel("titleDoesNotExist");
	}

}
