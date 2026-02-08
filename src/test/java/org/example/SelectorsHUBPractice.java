package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.BrowserUtil;
import org.utils.ElementUtil;

import java.time.Duration;

public class SelectorsHUBPractice {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        BrowserUtil browserUtil = new BrowserUtil();

        driver = browserUtil.launchBrowser("chrome");
        ElementUtil elementUtil = new ElementUtil(driver);

        browserUtil.launchUrl("https://selectorshub.com/xpath-practice-page/");

        if(elementUtil.isPageLoaded(3)) {
            By userEmail = By.name("email");
            By password = By.id("pass");
            By company = By.name("company");
            By mobileNumber = By.name("mobile number");
            By country = By.xpath("//label[text()='Country']/input");
            //  By submit = By.xpath("//button[@value = 'Submit']");


            elementUtil.doSendKeys(userEmail, "abc@gmail.com");
            elementUtil.doSendKeys(password, "#1243@Test");
            elementUtil.doSendKeys(company, "CTS");
            elementUtil.doSendKeys(mobileNumber, "342423423");
            elementUtil.doSendKeys(country, "India");

//        WebElement submitButton = driver.findElement(submit);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.elementToBeClickable(submit))
//        .click();
        }
        else {
            System.out.println("Page not loaded");
        }
            Thread.sleep(3000);

        driver.quit();
    }

}



