package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.NavigationUtil;

import java.io.IOException;

public class ProductPage extends NavigationUtil {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public @FindBy(css = "#container-special-offers")
    WebElement button_SpecialOffers;

    public @FindBy(css = "#container-product2")
    WebElement button_Laptops;

    public @FindBy(xpath = "//button[text()='Proceed']")
    WebElement button_Proceed_Popup;

    public @FindBy(xpath = ".//*[@id='myModal']//b[contains(text(), 'NEWCUSTOMER')]")
    WebElement voucherNumber;

    public ProductPage() throws IOException {
        super();
    }

    public void getProductPage(String url) throws IOException {
        getDriver().get(url);
        new ProductPage();
    }

    public void clickProceedButton_Popup() throws IOException {
        waitAndClickElement(button_Proceed_Popup);
        new ProductPage();
    }

    public String printSpecialOfferVoucherCode() throws IOException {
        WaitUntilWebElementIsVisible(voucherNumber);
        String voucherCode = voucherNumber.getText();
        logger.info("Voucher code: " + voucherCode);
        return voucherCode;
    }

}
