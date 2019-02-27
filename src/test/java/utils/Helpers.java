package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    public void waitTextNotToBePreset(WebElement element, String text, WebDriver driver){

    WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.not(
            ExpectedConditions.textToBePresentInElement(element,text)));
    }

    public void waitElementToBePreset(WebElement element, WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf((element)));
    }
}
