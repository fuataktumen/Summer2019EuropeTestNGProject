package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework_Apple {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/");

        WebElement learnMoreButton = driver.findElement(By.xpath("//a[contains(@href,'iphone-11-pro')][text()='Learn more']"));
        learnMoreButton.click();

    }
}
