package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectorsHUBPractice {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new ChromeDriver();
        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");

        By userEmail = By.name("email");
        By password = By.id("pass");
        By company = By.name("company");
        By mobileNumber = By.name("mobile number");
        By country = By.xpath("//label[text()='Country']/input");
        By submit = By.xpath("//button[@value = 'Submit']");
                //By.xpath("//button[text()='Submit']");

        driver.findElement(userEmail).sendKeys("abc@gmail.com");
        driver.findElement(password).sendKeys("#1243@Test");
        driver.findElement(company).sendKeys("CTS");
        driver.findElement(mobileNumber).sendKeys("342423423");
        driver.findElement(country).sendKeys("India");

        WebElement submitButton = driver.findElement(submit);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(submit))
        .click();

        Thread.sleep(3000);

        driver.quit();
    }
}
