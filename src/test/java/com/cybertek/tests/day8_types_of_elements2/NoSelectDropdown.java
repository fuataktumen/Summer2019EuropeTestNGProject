package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test

    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        driver.findElement(By.id("dropdownMenuLink")).click();

        List<WebElement> ListOfSite = driver.findElements(By.className("dropdown-item"));

        ListOfSite.get(3).click();


    }



}
