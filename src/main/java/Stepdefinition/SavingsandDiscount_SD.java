package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.SavingsandDiscount_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.When;

public class SavingsandDiscount_SD {
    public TextContextSetUp textContextSetUp;
    public SavingsandDiscount_SD (TextContextSetUp textContextSetUpn){
        this.textContextSetUp=textContextSetUpn;
    }


    @When("User should able to select No to all fields at savings and discount screen")
            public void User_should_able_to_select_No_to_all_fields_at_savings_and_discount_screen () {

        SavingsandDiscount_POJ savingsanddiscount_POJ = textContextSetUp.pageObjectmanager_POJ.getsavingsanddiscount_POJ();
        savingsanddiscount_POJ.selectWinterTyresNo();
        savingsanddiscount_POJ.selectAntiTheftTracking();
        savingsanddiscount_POJ.selectAntiTheftTracking30days();
        savingsanddiscount_POJ.selectMyAdvantageNo();
        CommonItems_POJ commonItems_POJ = textContextSetUp.pageObjectmanager_POJ.getcommonitems_POJ();
        commonItems_POJ.clickOnNextBtn();
    }

}


