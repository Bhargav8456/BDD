package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.yourAddress_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.When;

public class yourAddress_SD {
    public TextContextSetUp textcontextSetUp;

    public yourAddress_SD (TextContextSetUp textcontextSetUp){
        this.textcontextSetUp=textcontextSetUp;
    }
    @When("User able to add address successfully {string}")
    public void User_able_to_add_address_successfully (String Address) throws InterruptedException {
        yourAddress_POJ youraddress_POJ = textcontextSetUp.pageObjectmanager_POJ.getYouraddress_POJ();
        youraddress_POJ.enterAddress(Address);
        CommonItems_POJ commonItems_Poj = textcontextSetUp.pageObjectmanager_POJ.getcommonitems_POJ();
        commonItems_Poj.clickOnNextBtn();
    }
}
