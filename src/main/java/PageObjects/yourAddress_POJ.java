package PageObjects;

import Utilities.TextContextSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class yourAddress_POJ {
    public WebDriver driver;

    public yourAddress_POJ (WebDriver driver){
        this.driver = driver;
    }

    By Address = By.xpath("//input[@id='quoterEngine.question.address_address']");

    public void enterAddress(String enterText) throws InterruptedException {
        driver.findElement(Address).sendKeys(enterText);
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB);
        action.sendKeys(Keys.ENTER);
        action.perform();
        Thread.sleep(2000);
    }
}
