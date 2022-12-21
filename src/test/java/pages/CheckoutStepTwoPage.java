package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;

public class CheckoutStepTwoPage extends PageBase {
    @FindBy(xpath = "//*[@id='finish']")
    private WebElement finishButton;

    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckoutCompletePage clickFinish() {
        finishButton.click();
        return PageFactory.initElements(driver, CheckoutCompletePage.class);

    }
}
