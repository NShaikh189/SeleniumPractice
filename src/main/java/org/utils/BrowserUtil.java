package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
    WebDriver driver;

        public WebDriver launchBrowser(String browserName) {
        if (browserName.length() > 0)
            switch (browserName.trim().toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;

                default:
                    System.out.println("Invalid Browser");
                    break;
            }

        return driver;
    }

    public void launchUrl(String url)
    {
        driver.navigate().to(url);
    }

    public void closeBrowser()
    {
        driver.close();
    }

    public void quitBrowser()
    {
        driver.quit();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }


    public String getUrl()
    {
        return driver.getCurrentUrl();
    }
}
