package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactoryOld {

    private static WebDriver driver;

    public static WebDriver open(String browserType) {

        if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setCapability("marionette", true);
            driver = new FirefoxDriver(firefoxOptions);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        } else if (browserType.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//            driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        } else {
            System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("test-type");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");
//            options.addArguments("--js-flags=--expose-gc");
            options.addArguments("--enable-precise-memory-info");
            options.addArguments("--disable-default-apps");
            options.addArguments("test-type=browser");
            options.addArguments("disable-infobars");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return driver;
    }

}

