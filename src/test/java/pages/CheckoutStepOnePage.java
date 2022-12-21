package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage extends PageBase{
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
    private WebElement zipCodeTextBox;

    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckoutStepOnePage enterUserDetails(String firstName, String lastName, String zipCode) {
        firstNameTextBox.sendKeys(firstName);
        lastNameTextBox.sendKeys(lastName);
        zipCodeTextBox.sendKeys(zipCode);
        return PageFactory.initElements(driver, CheckoutStepOnePage.class);
    }

    public CheckoutStepTwoPage clickContinue() {
        continueButton.click();
        return PageFactory.initElements(driver, CheckoutStepTwoPage.class);
    }



}
