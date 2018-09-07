package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MaintainWindow {

    public static String getMainWindowHandle(WebDriver driver) {
        return driver.getWindowHandle();
    }

    //To close all the other windows except the main window.
    public static boolean closeAllOtherWindows(String openWindowHandle, WebDriver driver) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String currentWindowHandle : allWindowHandles) {
            if (!currentWindowHandle.equals(openWindowHandle)) {
                driver.switchTo().window(currentWindowHandle);
                driver.close();
            }
        }

        driver.switchTo().window(openWindowHandle);
        return driver.getWindowHandles().size() == 1;
    }
}
