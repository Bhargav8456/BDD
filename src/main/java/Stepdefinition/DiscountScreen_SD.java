package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.DiscountScreen_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.Given;

public class DiscountScreen_SD {
    public TextContextSetUp textContextSetUp;
    public DiscountScreen_SD (TextContextSetUp textcontextsetUp) {
        this.textContextSetUp = textcontextsetUp;
    }

    @Given("User should able to add {string} at discount screen")
    public void User_should_able_to_add_at_discount_screen (String name) throws InterruptedException {
        DiscountScreen_POJ discountScreen_POJ = textContextSetUp.pageObjectmanager_POJ.getdiscountScreen_POJ();
        discountScreen_POJ.enterDiscount(name);
        CommonItems_POJ commonItems_POJ = textContextSetUp.pageObjectmanager_POJ.getcommonitems_POJ();
        commonItems_POJ.clickOnNextBtn();
        Thread.sleep(5000);
    }
}

