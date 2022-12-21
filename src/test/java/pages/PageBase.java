package pages;

import org.openqa.selenium.WebDriver;

public class PageBase {
    public static String url = "https://www.saucedemo.com/";
    public WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver =driver;
    }
}
