package org.example;

import org.pages.OpenCartLoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.utils.BrowserUtil;

public class OpenCartLoginPageTest {

    static WebDriver driver;

    @Test
    public void doLoginTest() throws InterruptedException {
        BrowserUtil bu = new BrowserUtil();
        driver = bu.launchBrowser("Chrome");
        bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        OpenCartLoginPage lp = new OpenCartLoginPage(driver);

        lp.doLogin("testautomation001@opencart.com","Selenium12345");

        Thread.sleep(5000);
        bu.closeBrowser();
    }
}
