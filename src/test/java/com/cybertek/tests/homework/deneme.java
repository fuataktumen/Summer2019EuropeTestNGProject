package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class deneme {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void AfterMethod() throws InterruptedException {

        Thread.sleep(3000);


    }

    @Test
    public void Test1() throws InterruptedException {
        WebElement intable = driver.findElement(By.id("table1"));
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='table1']//th"));

        System.out.println(column.size());

        for (WebElement numberscolumn : column) {

            System.out.println(numberscolumn.getText());
        }
    }

    @Test

    public void test2() {
        List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println(row.size());
        for (WebElement rowsNumber : row
        ) {
            System.out.println(rowsNumber.getText());
        }


    }

    @Test

    public void test3() {


        List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        for (int i = 1; i <=row.size() ; i++) {
            String str = "//table[@id='table1']/tbody/tr[" + i + "]";
            WebElement singlerow = driver.findElement(By.xpath(str));
            System.out.println(singlerow.getText());
        }


    }

    @Test
    public void test4() {

        int rowNumber = getRowNumber();
        System.out.println(rowNumber);
        int columnNumber = getColumnNumber();
        System.out.println(columnNumber);

        for (int i = 1; i <= rowNumber; i++) {

            for (int j = 1; j <= columnNumber ; j++) {

                String all = "//table[@id='table1']//tbody/tr[" + i + "]/td[" + j + "]";
                WebElement allwriting =  driver.findElement(By.xpath(all));
                System.out.println(allwriting.getText());
            }

        }

    }

    @Test

    public int getRowNumber() {
        List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']//tr"));

        return row.size();

    }

    @Test

    public int getColumnNumber() {
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='table1']//th"));

        return column.size();

    }

}