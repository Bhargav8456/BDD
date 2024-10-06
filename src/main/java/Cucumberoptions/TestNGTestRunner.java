package Cucumberoptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions
        (features = "src/main/java/feature",glue = "Stepdefinition", monochrome = true, dryRun = true)

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
