package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");

        WebElement inputSearch= driver.findElement(By.id("twotabsearchtextbox"));
        inputSearch.sendKeys("SELENİUM");


        driver.findElement(By.xpath("//*[@value='Go']")).click();
        Thread.sleep(2000);
        WebElement result = driver.findElement(By.xpath("//span[contains(text(), 'results for')]"));
        System.out.println(result.getText());

        WebElement messageElement =  driver.findElement(By.xpath("//span[contains(text(), 'results for')]"));
       String actualResult= messageElement.getText();

       String expectedResult= "1-16 of over 1,000 results for";

       if(actualResult.equals(expectedResult)){

           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
           System.out.println("expectedResult = " + expectedResult);
           System.out.println("actualResult = " + actualResult);
       }
        //         //span[contains(text(),'results for')]

    }
}
