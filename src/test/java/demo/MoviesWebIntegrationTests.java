/*
    Generated by Atomist on 13 07 2016 
*/
package demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;
//Ran out of time.
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MoviesApplication.class)
@WebIntegrationTest(randomPort = true)
public class MoviesWebIntegrationTests {

  private static final int PORT = 8080;

    // Parameterize tests like this
    private static final String AN_APP_PATH = "http://localhost:" + PORT + "/path";
 
    // Use this to run tests
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void sampleTest() {
        // Use RestTemplate to hit chosen URLs
    }
 }