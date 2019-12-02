package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PositiveTestCaseVyTrack {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user10");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement logİN = driver.findElement(By.id("_submit"));
        logİN.click();
        String expectedURL = "https://qa1.vytrack.com/";
        String actualResult = driver.getCurrentUrl();
        if(expectedURL.equals(actualResult)){

            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedURL = " + expectedURL);
        }
    }
}
