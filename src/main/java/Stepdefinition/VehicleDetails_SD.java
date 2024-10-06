package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.VehicleDetails_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class VehicleDetails_SD {

    public TextContextSetUp textContextSetUp;

    public VehicleDetails_SD (TextContextSetUp textContextSetUp){
        this.textContextSetUp = textContextSetUp;
    }

    @When("User should able to select Used and Owned car at Vehicle Details Screen")
    public void User_should_able_to_select_Used_and_Owned_car_at_Vehicle_Details_Screen(){

        VehicleDetails_POJ vehicledetails_POJ = textContextSetUp.pageObjectmanager_POJ.getvehicledetails_POJ();
        vehicledetails_POJ.selectVehicleConditionPurchased();
        vehicledetails_POJ.SelectVehicleOwnedOrLeased();
        CommonItems_POJ commonitems_POJ = textContextSetUp.pageObjectmanager_POJ.getcommonitems_POJ();
        commonitems_POJ.clickOnNextBtn();
    }
}
