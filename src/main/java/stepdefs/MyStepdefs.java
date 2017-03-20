package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import service.NavigationService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by artoves on 18/06/16.
 */
@ContextConfiguration("classpath:cucumber.xml")
public class MyStepdefs {

    private NavigationService petsNavigationService;

    private List<String> keywords = new ArrayList<String>();

    @Autowired
    public MyStepdefs(NavigationService petsNavigationService) {
        this.petsNavigationService = petsNavigationService;
    }

    public MyStepdefs() {
    }

    @When("^I press \"([^\"]*)\"$")
    public void iPress(String arg1) throws Throwable {
        petsNavigationService.pressButon();
    }

    @Then("^I should go to the \"([^\"]*)\" page$")
    public void iShouldGoToThePage(String pageName) throws Throwable {
        petsNavigationService.redirectToPage(pageName);
        Assert.assertTrue(keywords.contains(pageName));
    }

    @Given("^I am on the \"([^\"]*)\" page$")
    public void iAmOnThePage(String pageName) throws Throwable {
        petsNavigationService.navigateToPage(pageName);
        Assert.assertTrue(keywords.contains(pageName));
    }

    @Given("^\"([^\"]*)\" is added to the list$")
    public void isAddedToTheList(String keyword) throws Throwable {
        keywords.clear();
        keywords.add("New Pet");
        keywords.add("Register");
        keywords.add("Newer Pets");
        keywords.add("Submit");
        keywords.add("Register Newer Pets");
        keywords.add("Old Pets");
        keywords.add("Register Old Pets");
        keywords.add("Submit Pets");

        keywords.add(keyword);
    }

    @When("^I try to register multiple pets$")
    public void iTryToRegisterMultiplePets(List<String> pets) throws Throwable {
        for (String pet : pets) {
            System.out.println(pet);
        }
    }

    @When("^I try to register multiple pets with names$")
    public void iTryToRegisterMultiplePetsWithNames(Map<String, String> pets) throws Throwable {
        Iterator iterator = pets.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
