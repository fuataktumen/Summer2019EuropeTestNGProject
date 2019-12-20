package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase9_12_30112019 {

    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void AfterMethod() throws InterruptedException {
        Thread.sleep(3000);


    }

    @Test
    public void test(){
       driver.get("https://practice-cybertekschool.herokuapp.com");
       driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("200")).click();
        WebElement message = driver.findElement(By.xpath("//*[contains(text(),'This page returned a 200')]"));
        String expectedText = "This page returned a 200 status code.";
        String actualResult = message.getText();
       if(expectedText.equals(actualResult)){

           System.out.println("PASS");
       } else{

           System.out.println("FAIL");
           System.out.println("actualResult = " + actualResult);
           System.out.println("expectedText = " + expectedText);
       }
    }
}
