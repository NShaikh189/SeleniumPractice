package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.BrowserUtil;
import org.utils.ElementUtil;

import java.time.Duration;
import java.util.List;

public class SelectorsHUBPractice {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtil browserUtil = new BrowserUtil();

        driver = browserUtil.launchBrowser("chrome");
        ElementUtil elementUtil = new ElementUtil(driver);

        browserUtil.launchUrl("https://selectorshub.com/xpath-practice-page/");

        if (elementUtil.isPageLoaded(3)) {
//            By userEmail = By.name("email");
//            By password = By.id("pass");
//            By company = By.name("company");
//            By mobileNumber = By.name("mobile number");
//            By country = By.xpath("//label[text()='Country']/input");
//            //  By submit = By.xpath("//button[@value = 'Submit']");
//            By firstCrush = By.cssSelector("#inp_val");
//            //By downloadLink = By.linkText("Download Link");
//            //  By downloadLink = By.xpath("//*[@id='content']/div[2]/div/div[2]/div/div[1]/div[2]/div/div/span/a");
//
//            elementUtil.doSendKeys(userEmail, "abc@gmail.com");
//            elementUtil.doSendKeys(password, "#1243@Test");
//            elementUtil.doSendKeys(company, "CTS");
//            elementUtil.doSendKeys(mobileNumber, "342423423");
//            elementUtil.doSendKeys(country, "India");
//            elementUtil.doSendKeys(firstCrush, "Hoor");
            //elementUtil.doClick(downloadLink);
//            String text = driver.findElement(downloadLink).getText();
//            System.out.println(text);
//            Actions act = new Actions(driver);
//            act.scrollToElement(driver.findElement(downloadLink)).click().build().perform();
//            System.out.println(browserUtil.getPageTitle());
//        WebElement submitButton = driver.findElement(submit);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.elementToBeClickable(submit))
//        .click();

/*
            By downloadLink = By.partialLinkText("DownLoad");

            WebElement link = driver.findElement(downloadLink);

            String parent = driver.getWindowHandle();

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", link);

            for (String win : driver.getWindowHandles()) {
                if (!win.equals(parent)) {
                    driver.switchTo().window(win);
                    break;
                }
            }

            System.out.println("New Page Title: " + driver.getTitle());
        }
        else {
            System.out.println("Page not loaded");
        }
            Thread.sleep(3000);
*/


            getUsersData();
            driver.quit();
        }

    }
    public static void getUsersData ()
        {
            Actions act = new Actions(driver);
            By userData = By.xpath("(//table[@class='table hover']/tbody/tr)");

            List<WebElement> userTable = driver.findElements(userData);

            for (int i = 0; i < userTable.size(); i++) {
                WebElement row = userTable.get(i).findElement(By.xpath("./td[2]"));
                act.scrollToElement(driver.findElement(By.xpath("//h6[text()='User Table']"))).build().perform();
                String name = row.getText();
                System.out.println(name);
            }
        }

}


