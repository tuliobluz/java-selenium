package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SingletonBrowserClass {

    // instance of singleton class
    private static SingletonBrowserClass instanceOfSingletonBrowserClass=null;

    private WebDriver driver;

    // Constructor
    private SingletonBrowserClass(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // TO create instance of class
    public static SingletonBrowserClass getInstanceOfSingletonBrowserClass(){
        if(instanceOfSingletonBrowserClass==null){
            instanceOfSingletonBrowserClass = new SingletonBrowserClass();
        }
        return instanceOfSingletonBrowserClass;
    }

    // To get driver
    public WebDriver getDriver()
    {
        return driver;
    }
}