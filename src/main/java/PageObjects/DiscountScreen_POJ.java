package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DiscountScreen_POJ {
    public WebDriver driver;

    public DiscountScreen_POJ (WebDriver drivers){
        this.driver=drivers;
    }

    By typeDiscount = By.xpath("//input[@id='quoterEngine.question.groupSelection-input']");

    public void enterDiscount (String name) throws InterruptedException  {
        driver.findElement(typeDiscount).sendKeys(name);
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(2000);
    }
}

