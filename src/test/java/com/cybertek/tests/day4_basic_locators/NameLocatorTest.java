package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput = driver.findElement(By.name("full_name"));

        fullnameInput.sendKeys("Mike Smith");

        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("MikeSmith@gmail.com");

        WebElement signupButton = driver.findElement(By.name("wooden_spoon"));

        signupButton.click();

       WebElement messageElement = driver.findElement(By.name("signup_message"));

       String actualMessage = messageElement.getText();

       String expectedMessage= "Thank you for signing up. Click the button below to return to the home page.";

        if(expectedMessage.equals(actualMessage)){

            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);





    }



}}
