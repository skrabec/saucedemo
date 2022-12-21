package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase{

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement usernameTextBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public InventoryPage enterUsernamePassword(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginButton.click();
        return PageFactory.initElements(driver, InventoryPage.class);
    }
}
