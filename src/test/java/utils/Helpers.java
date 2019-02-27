package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> convertListPrice(List<WebElement> list){

        List<Integer> listConverted = new ArrayList<Integer>();
        //Convert list of String to list of integer
        for(WebElement e : list){
            String priceString = e.getText().replace("€", "").replace(".","").trim();
            listConverted.add(Integer.parseInt(priceString));
        }

        return listConverted;
    }

    public List<Integer> convertListYear(List<WebElement> list){

        List<Integer> listConverted = new ArrayList<Integer>();
        //Convert list of String to list of integer
        for(WebElement e : list){
            String priceString[] = e.getText().split("/");
            System.out.println(priceString[1]);
            listConverted.add(Integer.parseInt(priceString[1]));
        }

        return listConverted;
    }
}
