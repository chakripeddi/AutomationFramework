
package com.example.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BaseClass {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static SoftAssert softAssert;

    public static void initializeBroweser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://git-backpage-wizard.lovable.app/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        softAssert = new SoftAssert();
        
    }

 
    public static void quitDriver() {
        driver.quit();
        
    }
}
