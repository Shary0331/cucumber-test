package CucumberFramework.stepFiles;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.DriverFactory;
import utilities.NavigationUtil;

public class MasterHooks extends DriverFactory {

    @Before
    public void setup() {
        driver = getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        NavigationUtil.captureScreenshot(driver, scenario);
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }
}
