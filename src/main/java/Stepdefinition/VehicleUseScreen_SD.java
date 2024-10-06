package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.VehicleUseScreen_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.When;

public class VehicleUseScreen_SD {
    public TextContextSetUp textcontextsetUp;

    public VehicleUseScreen_SD (TextContextSetUp textcontextsetUp){
        this.textcontextsetUp=textcontextsetUp;
    }

    @When("User should able to select 0 to 5000 km at vehicle use screen")
    public void User_should_able_to_select_0_to_5000_km_at_vehicle_use_screen () throws InterruptedException {
        VehicleUseScreen_POJ vehicleusescreen_POJ = textcontextsetUp.pageObjectmanager_POJ.getvehicleusescreen_POJ();
        vehicleusescreen_POJ.selectOptionOne();
        CommonItems_POJ commonitems_POJ = textcontextsetUp.pageObjectmanager_POJ.getcommonitems_POJ();
        commonitems_POJ.clickOnNextBtn();
        Thread.sleep(2000);
        commonitems_POJ.clickOnNextBtn();
    }

}
