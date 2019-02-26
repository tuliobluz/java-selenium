package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class AdvancedSearchPage {

    public AdvancedSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[@data-qa-selector='advanced-search-button']")
    WebElement buttonAdvancedSearch;

    @FindBy(xpath="//a[@data-qa-selector='advanced-search-button-apply']")
    WebElement buttonResults;

    @FindBy(name="sort")
    WebElement orderByList;

    @FindBys({
            @FindBy(css=".totalPrice___3yfNv")
    })
    public List<WebElement> listOfCar;

    @FindBy(xpath="//div[@data-qa-selector='results-amount']")
    public WebElement loading;

    public void clickAdvancedSearch(){
        buttonAdvancedSearch.click();
    }

    public void clickResults(){
        buttonResults.click();
    }

    public void selectOrder(){
        orderByList.sendKeys("Höchster Preis");
    }
}
