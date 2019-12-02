package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.get("https://www.ebay.com/");
        WebElement inputSearch = driver.findElement(By.xpath("//input[@label='Search for anything']"));
        inputSearch.sendKeys("selenium");
        WebElement clickSearch = driver.findElement(By.id("gh-btn"));
        clickSearch.click();

       String expectedResult= "https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=selenium&_sacat=0";
        String actualResult= driver.getCurrentUrl();
        if(expectedResult.equals(actualResult)){

            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedResult = " + expectedResult);





        }

    }
}
