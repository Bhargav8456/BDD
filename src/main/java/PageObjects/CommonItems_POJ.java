package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonItems_POJ {

    public WebDriver driver;

    public CommonItems_POJ (WebDriver driver ){
        this.driver = driver;
    }

    By CarQuote = By.xpath("//a[contains(@data-link-text,'Car Quote')]");
    By nextBtn = By.xpath("//button[contains(@id,'quoterEngine.footerButton.next')]");


    public void selectCarQuote () {
        driver.findElement(CarQuote).click();
    }

    public void clickOnNextBtn (){
        driver.findElement(nextBtn).click();
    }

}
