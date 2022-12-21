package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends PageBase{
    @FindBy(xpath = "//*[text()='THANK YOU FOR YOUR ORDER']")
    private WebElement thanksMessage;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean CheckThanksMessage() {
        try {
            boolean result = thanksMessage.isDisplayed();
            return result;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
