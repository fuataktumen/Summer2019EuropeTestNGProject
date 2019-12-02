package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NegativeTestCaseVyTrack {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser");
        WebElement logİN = driver.findElement(By.id("_submit"));
        logİN.click();

        String expectedResult= "Invalid user name or password.";
        WebElement messageElement = driver.findElement(By.xpath("//div[text()='Invalid user name or password.']"));
        String actualResult=messageElement.getText();
        if(expectedResult.equals(actualResult)) {
            System.out.println("PASS");
        }else {

            System.out.println("FAIL");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedResult = " + expectedResult);
        }

    }
}
