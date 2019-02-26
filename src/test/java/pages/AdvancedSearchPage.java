package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdvancedSearchPage {

    public AdvancedSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[text()='Erweiterte Suche']")
    WebElement buttonAdvancedSearch;

    public void clickAdvancedSearch(){
        buttonAdvancedSearch.click();
    }
}
