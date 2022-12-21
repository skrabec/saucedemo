package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends PageBase{
    @FindBy(xpath = "//*[text()='THANK YOU FOR YOUR ORDER']")
    private WebElement thanksMessageText;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getThanksMessage () {
        String thanksMessage = thanksMessageText.getText();
        return thanksMessage;
    }
}
