package tests;

import org.junit.Test;
import pages.LoginPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PurchaseTest extends TestBase{

    @Test
    public void purchaseTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        String message = loginPage
                .enterUsernamePassword("standard_user", "secret_sauce")
                .addItemToTheCart("bike-light")
                .goToCart()
                .clickCheckout()
                .enterUserDetails("Test", "Test", "19900")
                .clickContinue()
                .clickFinish()
                .getThanksMessage();

        assertThat(message, equalTo("THANK YOU FOR YOUR ORDER"));
    }

}
