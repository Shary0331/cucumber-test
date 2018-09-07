package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.NavigationUtil;

import java.io.IOException;

public class LoginPageFactory extends NavigationUtil {

    //Define web elements at class level
    @FindBy(id = "MainContent_txtUserName")
    WebElement userNameBox;

    @FindBy(id = "MainContent_txtPassword")
    WebElement passwordBox;

    @FindBy(id = "MainContent_btnLogin")
    WebElement loginButton;

    //Steps
    public void setUserName(String username) {
        userNameBox.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void clickSubmit() {
        loginButton.click();
    }

    //Actions
    public void Login(String username, String password) {
        setUserName(username);
        setPassword(password);
        clickSubmit();
    }

    public LoginPageFactory() throws IOException {
        super();
    }
}
