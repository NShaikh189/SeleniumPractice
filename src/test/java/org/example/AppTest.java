package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {

        ChromeOptions co = new ChromeOptions();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://cricbuzz.com");
        Thread.sleep(5000);

        driver.close();
       // driver.quit();
        System.out.println("Finished");
        }
}
