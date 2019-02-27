package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SearchPage {

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="sort")
    WebElement orderByList;

    @FindBy(name="yearRange.min")
    WebElement selectDate;

    @FindBys({
            @FindBy(css=".totalPrice___3yfNv")
    })
    public List<WebElement> listOfCar;

    @FindBys({
            @FindBy(xpath="//a[@data-qa-selector='ad']/ul/li[1]")
    })
    public List<WebElement> listOfYear;


    @FindBy(xpath="//div[@data-qa-selector='filter-year']")
    WebElement buttonDateFrom;

    @FindBy(xpath="//div[@data-qa-selector='results-amount']")
    public WebElement loading;

    @FindBy(xpath="//li[@data-qa-selector='active-filter']")
    public WebElement filter;

    public void clickDateFrom(){
        buttonDateFrom.click();
    }

    public void selectOrder(){
        orderByList.sendKeys("Höchster Preis");
    }

    public void selectDateFrom(Integer year){

        String yearSelect = Integer.toString(year);
        selectDate.sendKeys(yearSelect);
    }
}
