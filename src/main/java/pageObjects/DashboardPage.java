package pageObjects;

import org.openqa.selenium.By;
import utilities.NavigationUtil;

import java.io.IOException;

public class DashboardPage extends NavigationUtil {

    public void changePassword() {
        getDriver().findElement(By.linkText("Change password")).click();
    }

    public String confMessage() {
        return getDriver().findElement(By.id("conf_message")).getText();
    }

    public String getTitle() {
        return getDriver().getTitle();
    }

    public DashboardPage() throws IOException {
        super();
    }
}
