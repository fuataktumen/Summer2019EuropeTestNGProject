package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {


        WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();


        }

        @AfterMethod
        public void tearDownMethod() throws InterruptedException {
            Thread.sleep(3000);


        }

        @Test
        public void Test1() {
            driver.get("http://practice.cybertekschool.com/upload");
            String projectPath = System.getProperty("user.dir");
            String relativePath = "src/test/resources/testfile.txt";
            String filePath = projectPath+"/"+relativePath;
            driver.findElement(By.name("file")).sendKeys(filePath);
            //clicking the upload button
            driver.findElement(By.id("file-submit")).click();
            //getting text of webelement
            String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
            //verify file name is displayed in the next page
            Assert.assertEquals(actualFilename,"testfile.txt","Verify the file name");


        }


    }