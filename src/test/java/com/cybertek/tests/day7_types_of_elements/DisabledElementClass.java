package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementClass {

    @Test
    public void Test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButtonButton = driver.findElement(By.id("green"));
        System.out.println("is element Enabled: " + greenButtonButton.isEnabled());
        Assert.assertFalse(greenButtonButton.isEnabled(),"Verify that green button is not enabled");
        greenButtonButton.click();



    }
    @Test
    public void Test2 (){
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dynamic_controls");

    WebElement inputBox = driver.findElement(By.cssSelector("[type=text]"));
    System.out.println("is input Enabled: " + inputBox.isEnabled());
    inputBox.sendKeys("Mike Smith");


}
}
