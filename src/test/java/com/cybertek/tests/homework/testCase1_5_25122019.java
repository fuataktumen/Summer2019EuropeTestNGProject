package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class testCase1_5_25122019 {

    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod

    public void AfterMethod() throws InterruptedException {
        Thread.sleep(3000);


    }

    @Test
    public void Test1() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        WebElement dateOfBirthday = driver.findElement(By.name("birthday"));
        dateOfBirthday.sendKeys("wrong_dob");
        dateOfBirthday.click();
        String expectedText = "The date of birth is not valid";
        WebElement invalidBirthday = driver.findElement(By.xpath("//*[text()='The date of birth is not valid']"));
        String actaulText = invalidBirthday.getText();
        if (expectedText.equals(actaulText)) {

            System.out.println("PASS");

        } else {

            System.out.println("FAIL");
            System.out.println("actaulText = " + actaulText);
            System.out.println("expectedText = " + expectedText);

        }


    }

    @Test
    public void Test2() {

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        WebElement Cplus = driver.findElement(By.id("inlineCheckbox1"));
        WebElement Java = driver.findElement(By.id("inlineCheckbox2"));
        WebElement JavaScript = driver.findElement(By.id("inlineCheckbox3"));
        Cplus.click();
        Java.click();
        JavaScript.click();
        Assert.assertTrue(Java.isSelected(), "Java is selected");
        Assert.assertTrue(JavaScript.isSelected(), "JavaScript is selected");
        Assert.assertTrue(Cplus.isSelected(), "Cplus is selected");


    }

    @Test
    public void Test3() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        WebElement inputFirstname = driver.findElement(By.name("firstname"));
        inputFirstname.sendKeys("A");
        String expectedText = "first name must be more than 2 and less than 64 characters long";
        WebElement invalidFirstName = driver.findElement(By.xpath("//*[text()='first name must be more than 2 and less than 64 characters long']"));
        String actualText = invalidFirstName.getText();

        if (expectedText.equals(actualText)) {

            System.out.println("PASS");

        } else {

            System.out.println("FAIL");
            System.out.println("actaulText = " + actualText);
            System.out.println("expectedText = " + expectedText);

        }
    }

    @Test

    public void Test4(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        WebElement inputLastname = driver.findElement(By.name("lastname"));
        inputLastname.sendKeys("A");
        String expectedText = "The last name must be more than 2 and less than 64 characters long";
        WebElement invalidLastName = driver.findElement(By.xpath("//small[@data-bv-for='lastname'][2]"));
        String actualText= invalidLastName.getText();

        if (expectedText.equals(actualText)) {

            System.out.println("PASS");

        } else {

            System.out.println("FAIL");
            System.out.println("actaulText = " + actualText);
            System.out.println("expectedText = " + expectedText);

        }


    }
       @Test
    public void Test5(){
           driver.get("https://practice-cybertekschool.herokuapp.com/");
           driver.findElement(By.linkText("Registration Form")).click();
           WebElement inputFirstname = driver.findElement(By.name("firstname"));
           inputFirstname.sendKeys("Fuat");
           WebElement inputLastname = driver.findElement(By.name("lastname"));
           inputLastname.sendKeys("Aktumen");
           WebElement username = driver.findElement(By.name("username"));
           username.sendKeys("aktumen");
           WebElement email = driver.findElement(By.name("email"));
           email.sendKeys("faktumen@cybertekschool.com");
           WebElement password = driver.findElement(By.name("password"));
           password.sendKeys("12131213");
           WebElement phoneNumber = driver.findElement(By.name("phone"));
           phoneNumber.sendKeys("234-345-4568");
           driver.findElement(By.name("gender")).click();
           WebElement birthday = driver.findElement(By.name("birthday"));
           birthday.sendKeys("04/02/1979");
           WebElement department = driver.findElement(By.name("department"));
           Select departmentList = new Select(department);
           departmentList.selectByVisibleText("MCR");
           WebElement JobTitle = driver.findElement(By.name("job_title"));
           Select jobTitleList = new Select(JobTitle);
           jobTitleList.selectByVisibleText("QA");
           driver.findElement(By.id("inlineCheckbox2")).click();
           driver.findElement(By.id("wooden_spoon")).click();
           String expectedText = "You've successfully completed registration!";
           WebElement text = driver.findElement(By.xpath("//*[@class='alert-heading']/following-sibling::p"));
           String actualText = text.getText();

           if (expectedText.equals(actualText)) {

               System.out.println("PASS");

           } else {

               System.out.println("FAIL");
               System.out.println("actaulText = " + actualText);
               System.out.println("expectedText = " + expectedText);

           }





       }
}