package com.cybertek.tests.day12_webTables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class enterKey {

    @Test
    public void StaleTest() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://google.com");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Selenium" + Keys.ENTER);
        WebElement results = driver.findElement(By.id("resultStats"));
        Assert.assertTrue(results.isDisplayed());
        //go to google second time
        driver.navigate().back();
        input = driver.findElement(By.name("q"));
        input.sendKeys("Java" + Keys.ENTER);
    }
}






