package org.example;

import org.OpenCartLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.BrowserUtil;
import org.utils.ElementUtil;

public class OpenCartLoginPageTest {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtil bu = new BrowserUtil();
        driver = bu.launchBrowser("Chrome");
        bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        OpenCartLoginPage lp = new OpenCartLoginPage(driver);

        lp.doLogin("Shweta@gmail.com","shweta@123");

        Thread.sleep(5000);
        bu.closeBrowser();
    }
}
