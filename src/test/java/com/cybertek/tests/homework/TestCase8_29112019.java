package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase8_29112019 {

    @Test
    public void test1(){

       WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/autocomplete']")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        driver.findElement(By.cssSelector("[type='button']")).click();
        String expectedText = "You selected: United States of America";
        WebElement messageText = driver.findElement(By.id("result"));
        String ActualText = messageText.getText();
        Assert.assertEquals(ActualText,expectedText,"equal or not");
        Assert.assertTrue(ActualText.equals(expectedText));


    }
}
