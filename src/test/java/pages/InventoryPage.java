package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage extends PageBase{
    private static final String ADD_TO_CART_LOCATOR = "//button[@id='add-to-cart-sauce-labs-%s']";

    @FindBy(xpath = "//*[@class='inventory_container']")
    private WebElement productInventory;

    @FindBy(xpath = "//*[@class='shopping_cart_badge']")
    private WebElement cartIcon;


    public InventoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String viewInventory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(productInventory));
        return productInventory.getText();
    }

    public InventoryPage addItemToTheCart(String productName) {
        String xpathOfElementToBeAdded = String.format(ADD_TO_CART_LOCATOR, productName);
        WebElement addToCartButton = driver.findElement(By.xpath(xpathOfElementToBeAdded));
        addToCartButton.click();
        return PageFactory.initElements(driver, InventoryPage.class);
    }

    public CartPage goToCart() {
        cartIcon.click();
        return PageFactory.initElements(driver, CartPage.class);
    }

}
