package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase_6_28112019 {

    @Test
    public void Test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.tempmailaddress.com/");
        WebElement email  = driver.findElement(By.cssSelector(".emailZobrazeni.text-center"));



        String emailemail=email.getText();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.name("full_name")).sendKeys("FuatAktumen");
        driver.findElement(By.name("email")).sendKeys(emailemail);
        driver.findElement(By.name("wooden_spoon")).click();
        String expectedText = "Thank you for signing up. Click the button below to return to the home page.";
        WebElement messageText = driver.findElement(By.name("signup_message"));
        String actualText = messageText.getText();
        Assert.assertTrue(actualText.equals(expectedText));
        driver.navigate().to("https://www.tempmailaddress.com/");
        WebElement VerifyEmail = driver.findElement(By.xpath("//tr[@data-href='2'][1]"));
        String expectedURL = "https://www.tempmailaddress.com/window/id/2";
       VerifyEmail.click();
       String actualURL = driver.getCurrentUrl();
       Assert.assertTrue(actualURL.equals(expectedURL));
       WebElement VerifyLast = driver.findElement(By.id("odesilatel"));
       Assert.assertTrue(VerifyLast.isDisplayed());
       WebElement VerifyLastText = driver.findElement(By.id("predmet"));
        System.out.println(VerifyLastText.isDisplayed());










    }
}
