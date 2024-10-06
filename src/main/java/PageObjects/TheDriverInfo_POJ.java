package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TheDriverInfo_POJ {
    public WebDriver driver;

    public TheDriverInfo_POJ (WebDriver driver){
        this.driver=driver;
    }

    By useYourInfo = By.xpath("//button[text()='Use your information ']");
    By firstName = By.xpath("//input[contains(@id,'quoterEngine.question.firstName')]");
    By lastName = By.xpath("//input[contains(@id,'quoterEngine.question.lastName')]");
    By DOBYear = By.xpath("//select[contains(@id,'quoterEngine.question.dateOfBirth.year')]");
    By DOBMonth = By.xpath("//select[contains(@id,'quoterEngine.question.dateOfBirth.month')]");
    By DOBDay = By.xpath("//select[contains(@id,'quoterEngine.question.dateOfBirth.day')]");
    By genderMale = By.xpath("//button[contains(@id,'quoterEngine.question.genderFastTrack.M')]");
    By maritalSingle = By.xpath("//button[contains(@id,'quoterEngine.question.maritalStatusFastTrack.S')]");

    public void selectUseYourInfo (){
        driver.findElement(useYourInfo).click();
    }

    public void enterFirstName (String fName){
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastName (String LName){
        driver.findElement(lastName).sendKeys(LName);
    }

    public void selectDOBYear (){
        WebElement DropDown = driver.findElement(DOBYear);
        Select DD = new Select (DropDown);
        DD.selectByVisibleText("1996");
    }

    public void selectDOBMonth (){
        WebElement DropDown = driver.findElement(DOBMonth);
        Select DD = new Select(DropDown);
        DD.selectByValue("2");
    }

    public void selectDOBDay (){
        WebElement DropDown = driver.findElement(DOBDay);
        Select DD = new Select(DropDown);
        DD.selectByVisibleText("8");
    }

    public void selectGenderMale (){
        driver.findElement(genderMale).click();
    }

    public void maritalSingle (){
        driver.findElement(maritalSingle).click();
    }
}
