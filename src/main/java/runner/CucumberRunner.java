package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by artoves on 18/06/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber.html"},
        //format = {"pretty","json:target/cucumber.json"},
        features = {"src/test/java/features"},
        glue = "stepdefs"
//        ,tags = {"@Single"}
)
public class CucumberRunner {
}
