package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");
        WebElement inputSearch = driver.findElement(By.xpath("//input[@label='Search for anything']"));
        inputSearch.sendKeys("selenium");
        WebElement clickSearch = driver.findElement(By.id("gh-btn"));
        clickSearch.click();
        System.out.println("2,160 results for selenium");




    }
}
