package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class rightClick {

    public static void main(String[] args) {
        String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete'"));

        Actions act = new Actions(driver);
       // act.contextClick(driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"))).build().perform();
        act.contextClick().build().perform();
    }
}
