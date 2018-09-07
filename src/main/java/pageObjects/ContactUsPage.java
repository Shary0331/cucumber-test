package pageObjects;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.NavigationUtil;

import java.io.IOException;
import java.util.List;

public class ContactUsPage extends NavigationUtil {

    public @FindBy(xpath = "//input[@name='first_name']")
    WebElement textField_FirstName;

    public @FindBy(xpath = "//input[@name='last_name']")
    WebElement textField_LastName;

    public @FindBy(xpath = "//input[@name='email']")
    WebElement textField_EmailAddress;

    public @FindBy(xpath = "//textarea[@name='message']")
    WebElement textField_Comments;

    public @FindBy(xpath = "//input[@type='submit']")
    WebElement button_Submit;

    public ContactUsPage() throws IOException {
        super();
    }

    public ContactUsPage getContactUsPage() throws IOException {
        getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        return new ContactUsPage();
    }

    public ContactUsPage enterFirstName(String name) throws Exception {
        sendKeysToWebElement(textField_FirstName, name);
        return new ContactUsPage();
    }

    public ContactUsPage enterLastName(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textField_LastName, data.get(row).get(column));
        return new ContactUsPage();
    }

    public ContactUsPage enterEmailAddress(String email) throws Exception {
        sendKeysToWebElement(textField_EmailAddress, email);
        return new ContactUsPage();
    }

    public ContactUsPage enterComment(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textField_Comments, data.get(row).get(column));
        return new ContactUsPage();
    }

    public ContactUsPage clickSubmitButton() throws Exception {
        waitAndClickElement(button_Submit);
        return new ContactUsPage();
    }

    public ContactUsPage confirmContactUsFormSubbmitionWasSuccesful() throws Exception {
        WebElement thanksContactUsPage = getDriver().findElement(By.xpath("//*[@id=\"contact_reply\"]/h1"));
        WaitUntilWebElementIsVisible(thanksContactUsPage);
        Assert.assertEquals("thankyouforyourmessage!", thanksContactUsPage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
        return new ContactUsPage();
    }



}
