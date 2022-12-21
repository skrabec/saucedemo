package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends PageBase{
    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public CheckoutStepOnePage clickCheckout() {
        checkoutButton.click();
        return PageFactory.initElements(driver, CheckoutStepOnePage.class);
    }


}