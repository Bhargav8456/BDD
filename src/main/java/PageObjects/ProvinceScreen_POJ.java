package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProvinceScreen_POJ {

    public WebDriver driver;

    public ProvinceScreen_POJ (WebDriver driver){
        this.driver=driver;
    }

    By provinceDD = By.xpath("//a[contains(@id,'changeQuoterProvince')]");
    By selectProvince = By.xpath("//select[contains(@aria-labelledby,'quoterEngine.question.quotersProvinceList-title-label undefined')]");
    By AcceptAllBtn = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");
    By vehicleYear = By.id("quoterEngine.question.carYear.button");
    By vehicleMake = By.id("quoterEngine.question.carMake.button");
    By vehicleModel = By.id("quoterEngine.question.carModel.button");

    public void clickOnProvinceURL (){
        driver.findElement(provinceDD).click();
    }

    public void selectProvinceFromDD (){
        WebElement DropDown = driver.findElement(selectProvince);
        Select DD = new Select(DropDown);
        DD.selectByVisibleText("Ontario");
    }

    public void clickonAcceptAllBtn (){
        driver.findElement(AcceptAllBtn).click();
    }

    public void slectVehicleYear (){
        WebElement Dropdown = driver.findElement(vehicleYear);
        Select DD = new Select(Dropdown);
        DD.selectByVisibleText("2024");
    }

    public void selectVehicleMake (){
        WebElement DropDown = driver.findElement(vehicleMake);
        Select DD = new Select(DropDown);
        DD.selectByVisibleText("CHEVROLET");
    }

    public void selectvehicleModel (){
        WebElement DropDown = driver.findElement(vehicleModel);
        Select DD = new Select(DropDown);
        DD.selectByVisibleText("TRAX RS 4DR 2WD");
    }






}
