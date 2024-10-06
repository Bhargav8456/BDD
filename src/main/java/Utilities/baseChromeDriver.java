package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseChromeDriver {
    public  WebDriver driver;

    public WebDriver WebDriverManager(){
    if (driver == null){
        System.setProperty("Webdriver.chrome.driver","/src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tdinsurance.com/");
        driver.manage().window().maximize();
    }
    return driver;


    }
}
