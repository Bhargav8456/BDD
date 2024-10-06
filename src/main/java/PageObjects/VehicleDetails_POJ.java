package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehicleDetails_POJ {
    public WebDriver driver;
    public VehicleDetails_POJ (WebDriver driver){
        this.driver = driver;
    }

    By vehicleConditionPurchased = By.xpath("//button[contains(@id,'quoterEngine.question.carCondition.used')]");
    By vehicleOwnedOrLeased = By.xpath("//button[contains(@id,'quoterEngine.question.ownedOrLeased.owned')]");


    public void selectVehicleConditionPurchased (){
        driver.findElement(vehicleConditionPurchased).click();
    }

    public void SelectVehicleOwnedOrLeased (){
        driver.findElement(vehicleOwnedOrLeased).click();
    }



}
