package tests;

import org.junit.Test;
import pages.CartPage;
import pages.CheckoutStepOnePage;
import pages.InventoryPage;
import pages.LoginPage;

public class PurchaseTest extends TestBase{

    @Test
    public void purchaseTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(driver);

        loginPage
                .enterUsernamePassword("standard_user", "secret_sauce")
                .addItemToTheCart("bike-light")
                .goToCart()
                .clickCheckout()
                .enterUserDetails("Test", "Test", "19900")
                .clickContinue();

    }

}
