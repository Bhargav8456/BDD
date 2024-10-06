package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehicleUseScreen_POJ {
    public WebDriver driver;

   public VehicleUseScreen_POJ (WebDriver driver){
       this.driver=driver;
   }

   By optionOne = By.xpath("//input[contains(@name,'radio-list-5000')]");

   public void selectOptionOne () {
       driver.findElement(optionOne).click();
    }

}
