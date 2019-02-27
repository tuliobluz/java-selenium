package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.SearchPage;
import utils.Helpers;
import utils.SingletonBrowserClass;

import java.util.List;


public class SearchStep {

    SingletonBrowserClass sbc= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
    WebDriver driver = sbc.getDriver();

    SearchPage searchPage;
    Helpers helpers = new Helpers();

    Integer year = 2014;

    @Given("The user goes to Search Page")
    public void the_user_goes_to_Search_Page() {

        driver.get("https://www.autohero.com/de/search/");
    }

    @When("The user order the list by price descending")
    public void the_user_order_the_list_by_price_descending() {

        searchPage = new SearchPage(driver);
        searchPage.selectOrder();

        helpers.waitTextNotToBePreset(searchPage.loading,"Lädt...", driver);

    }

    @When("The user fills the search")
    public void the_user_fills_the_search() {

        searchPage = new SearchPage(driver);
        searchPage.clickDateFrom();
        searchPage.selectDateFrom(year);

        helpers.waitElementToBePreset(searchPage.filter, driver);
    }

    @Then("The user should see cars that fit on the search order by price descending")
    public void the_user_should_see_cars_that_fit_on_the_search_order_by_price_descending() {

        searchPage = new SearchPage(driver);
        List<Integer> prices = helpers.convertListPrice(searchPage.listOfCar);
        List<Integer> years = helpers.convertListYear(searchPage.listOfYear);

        for(int i = 0; i < (prices.size()-1); i++){
            Assert.assertTrue( "Ordenation is not working",prices.get(i) >= prices.get(i+1));
        }
        for(int i = 0; i < (years.size()-1); i++){
            Assert.assertTrue( "Filtering of year is not working", years.get(i) >= year);
        }
    }

    @After
    public void tearDown(){

        driver.close();
    }
}