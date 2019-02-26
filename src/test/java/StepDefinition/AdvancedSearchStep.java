package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import utils.SingletonBrowserClass;
import pages.AdvancedSearchPage;

public class AdvancedSearchStep {

    SingletonBrowserClass sbc= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
    WebDriver driver = sbc.getDriver();

    AdvancedSearchPage searchPage;

    @Given("The user goes to Search Page")
    public void the_user_goes_to_Search_Page() {
        driver.get("https://www.autohero.com/de/search/");

    }

    @When("The user fills the advanced filters")
    public void the_user_fills_the_advanced_filters() {
        searchPage = new AdvancedSearchPage(driver);
        searchPage.clickAdvancedSearch();
    }

    @Then("The user should see cars that fit on the search")
    public void the_user_should_see_cars_that_fit_on_the_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}