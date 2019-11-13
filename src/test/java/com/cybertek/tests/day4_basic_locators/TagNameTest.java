package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Mike Smith with tagname");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@gmail.com");

        WebElement signUpButton = driver.findElement(By.tagName("button"));
        signUpButton.click();

        WebElement messageElement = driver.findElement(By.tagName("h3"));
        String message = messageElement.getText();
        System.out.println(message);

    }
}
