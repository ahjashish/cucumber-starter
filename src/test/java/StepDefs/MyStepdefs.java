package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import service.NavigationService;

/**
 * Created by artoves on 18/06/16.
 */
@ContextConfiguration("classpath:cucumber.xml")
public class MyStepdefs {

    private NavigationService petsNavigationService;

    @Autowired
    public MyStepdefs(NavigationService petsNavigationService) {
        this.petsNavigationService = petsNavigationService;
    }

    public MyStepdefs() {
    }

    @When("^I press \"([^\"]*)\"$")
    public void i_press(String arg1) throws Throwable {
        petsNavigationService.pressButon();
    }

    @Then("^I should go to the \"([^\"]*)\" page$")
    public void i_should_go_to_the_page(String pageName) throws Throwable {
        petsNavigationService.redirectToPage(pageName);
        Assert.assertTrue(pageName.equals("Register"));
    }

    @Given("^I am on the \"([^\"]*)\" page$")
    public void iAmOnThePage(String pageName) throws Throwable {
        petsNavigationService.navigateToPage(pageName);
        Assert.assertTrue(pageName.equals("New Pet"));
    }
}
