package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager_POJ {
    public WebDriver driver;
    public ProvinceScreen_POJ provincescreen_POJ;
    public CommonItems_POJ commonitems_POJ;
    public VehicleDetails_POJ vehicledetails_POJ;
    public VehicleUseScreen_POJ vehicleusescreen_POJ;
    public SavingsandDiscount_POJ savingsanddiscount_POJ;
    public DiscountScreen_POJ discountScreen_POJ;
    public TheDriverInfo_POJ thedriverInfo_POJ;
    public yourAddress_POJ youraddress_POJ;

    public PageObjectManager_POJ (WebDriver driver){
        this.driver=driver;
}

public CommonItems_POJ getcommonitems_POJ () {
        commonitems_POJ = new CommonItems_POJ(driver);
        return commonitems_POJ;
}

public ProvinceScreen_POJ getprovincescreen_POJ (){
     provincescreen_POJ = new ProvinceScreen_POJ(driver);
    return provincescreen_POJ;
}

public VehicleDetails_POJ getvehicledetails_POJ () {
    vehicledetails_POJ = new VehicleDetails_POJ (driver);
    return vehicledetails_POJ;
}

public VehicleUseScreen_POJ getvehicleusescreen_POJ(){
    vehicleusescreen_POJ = new VehicleUseScreen_POJ(driver);
    return vehicleusescreen_POJ;
}

public SavingsandDiscount_POJ getsavingsanddiscount_POJ (){
    savingsanddiscount_POJ = new SavingsandDiscount_POJ(driver);
    return  savingsanddiscount_POJ;
}

public DiscountScreen_POJ getdiscountScreen_POJ (){
    discountScreen_POJ = new DiscountScreen_POJ(driver);
    return discountScreen_POJ;
}

public TheDriverInfo_POJ gettheDriverInfo_POJ (){
    thedriverInfo_POJ = new TheDriverInfo_POJ(driver);
    return thedriverInfo_POJ;
}

public yourAddress_POJ getYouraddress_POJ (){
    youraddress_POJ = new yourAddress_POJ(driver);
    return youraddress_POJ;
}
}
