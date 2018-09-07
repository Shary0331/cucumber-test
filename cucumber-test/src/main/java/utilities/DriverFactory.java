package utilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public static RemoteWebDriver remoteWebDriver;
    public static NavigationUtil navigationUtil;
    public static ContactUsPage contactUsPage;
    public static ProductPage productPage;
    public static LoginPage loginPage;
    public static LoginPageFactory loginPageFactory;
    public static DashboardPage dashboardPage;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public WebDriver getDriver() {

        try {
            // Read Config
            Properties properties = new Properties();
//            FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"  + File.separator + "resources"  + File.separator + "config.properties");
            FileInputStream fi = new FileInputStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
            properties.load(fi);
            String browserName = properties.getProperty("browser");
            String profile = System.getProperty("profileId");
//            logger.info("Current profile: " + profile);
//            logger.info("Browser type: " + browserName);
//            ReadConfigFile file = new ReadConfigFile();
//            String browserName = file.getBrowser();

            switch (browserName) {

                case "firefox":
                    // code
                    if (null == driver) {
                        System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.setCapability("marionette", true);
                        if (profile.equals("remote")) {
                            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);

                        } else {
                            driver = new FirefoxDriver(firefoxOptions);
                        }
                        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                        driver.manage().window().maximize();
                    }
                    break;

                case "chrome":
                    // code
                    if (null == driver) {
                        System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("start-maximized");
                        options.addArguments("--disable-notifications");
                        options.addArguments("disable-infobars");
                        Capabilities capabilities = DesiredCapabilities.chrome();
                        if (profile.equals("remote")) {
                            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
                        } else {
                            driver = new ChromeDriver(options);
                        }
                        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                        driver.manage().window().maximize();
                    }
                    break;

                case "ie":
                    // code
                    if (null == driver) {
                        InternetExplorerOptions options = new InternetExplorerOptions();
                        options.setCapability("ignoreZoomSetting", true);
                        System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
                        if (profile.equals("remote")) {
                            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
                            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                        } else {
                            driver = new InternetExplorerDriver(options);
                            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                        }
                        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                        driver.manage().window().maximize();
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Unable to load browser: " + e.getMessage());
        } finally {
            contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
            productPage = PageFactory.initElements(driver, ProductPage.class);
            navigationUtil = PageFactory.initElements(driver, NavigationUtil.class);
            loginPage = PageFactory.initElements(driver, LoginPage.class);
            loginPageFactory = PageFactory.initElements(driver, LoginPageFactory.class);
            dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        }
        return driver;
    }
}


