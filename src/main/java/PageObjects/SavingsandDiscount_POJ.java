package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavingsandDiscount_POJ {
    public WebDriver driver;

    public SavingsandDiscount_POJ (WebDriver driver){
        this.driver=driver;
    }

    By winterTyresNo = By.id("quoterEngine.question.winterTiresQuestion.false");
    By antiTheftTracking = By.xpath("//button[@id='quoterEngine.question.antiTheftQuestion.false']");
    By antiTheftTracking30days = By.xpath("//button[@id='quoterEngine.question.antiTheft30DaysQuestion.false']");
    By myAdvantageNo = By.xpath("//button[@id='quoterEngine.question.ubiDiscount.false']");

    public void selectWinterTyresNo (){

        driver.findElement(winterTyresNo).click();
    }

    public void selectAntiTheftTracking (){

        driver.findElement(antiTheftTracking).click();
    }

    public void selectAntiTheftTracking30days (){

        driver.findElement(antiTheftTracking30days).click();
    }

    public void selectMyAdvantageNo (){

        driver.findElement(myAdvantageNo).click();
    }

}
