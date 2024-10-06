package Utilities;

import PageObjects.PageObjectManager_POJ;

public class TextContextSetUp {

    public PageObjectManager_POJ pageObjectmanager_POJ;
    public baseChromeDriver BaseChromeDriver;


    public TextContextSetUp () {
        BaseChromeDriver = new baseChromeDriver();
        pageObjectmanager_POJ = new PageObjectManager_POJ (BaseChromeDriver.WebDriverManager());



    }

}
