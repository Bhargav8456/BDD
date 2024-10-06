package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.ProvinceScreen_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProvinceScreen_SD {

   public TextContextSetUp textContextSetUp;

    public ProvinceScreen_SD (TextContextSetUp textContextSetUps) {

        this.textContextSetUp = textContextSetUps;

    }

    @Given("User should able to launch ON province car quoter screen")
        public void User_should_able_to_launch_ON_province_car_quoter_screen()  {
    }

    @When("User should select all mandatory selections at all screen")
    public void User_should_select_all_mandatory_selections_at_all_screen() throws InterruptedException {
        CommonItems_POJ commonitems_POJ = textContextSetUp.pageObjectmanager_POJ.getcommonitems_POJ();
        commonitems_POJ.selectCarQuote();
        Thread.sleep(4000);
        ProvinceScreen_POJ provincescreen_Poj = textContextSetUp.pageObjectmanager_POJ.getprovincescreen_POJ();
        provincescreen_Poj.clickOnProvinceURL();
        Thread.sleep(5000);
        provincescreen_Poj.selectProvinceFromDD();
        provincescreen_Poj.clickonAcceptAllBtn();
        provincescreen_Poj.slectVehicleYear();
        Thread.sleep(4000);
        provincescreen_Poj.selectVehicleMake();
        Thread.sleep(4000);
        provincescreen_Poj.selectvehicleModel();
        Thread.sleep(3000);
        commonitems_POJ.clickOnNextBtn();
        Thread.sleep(5000);









    }
}
