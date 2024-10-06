package Stepdefinition;

import PageObjects.CommonItems_POJ;
import PageObjects.TheDriverInfo_POJ;
import Utilities.TextContextSetUp;
import io.cucumber.java.en.When;

public class TheDriverInfo_SD {
    public TextContextSetUp textContextSetUp;

    public TheDriverInfo_SD (TextContextSetUp textContextSetUp) {
        this.textContextSetUp = textContextSetUp;
    }
@When("User should able select required fields and Fname {string} Lname {string} at The Driver screen")
    public void User_should_able_select_required_fields_and_Fname_Lname_at_The_Driver_screen (String FName, String LName){
    TheDriverInfo_POJ theDriverInfo_POJ = textContextSetUp.pageObjectmanager_POJ.gettheDriverInfo_POJ();
    theDriverInfo_POJ.selectUseYourInfo();
    theDriverInfo_POJ.enterFirstName(FName);
    theDriverInfo_POJ.enterLastName(LName);
    theDriverInfo_POJ.selectDOBYear();
    theDriverInfo_POJ.selectDOBMonth();
    theDriverInfo_POJ.selectDOBDay();
    theDriverInfo_POJ.selectGenderMale();
    theDriverInfo_POJ.maritalSingle();
    CommonItems_POJ commonItemsPoj = textContextSetUp.pageObjectmanager_POJ.getcommonitems_POJ();
    commonItemsPoj.clickOnNextBtn();

}
}
