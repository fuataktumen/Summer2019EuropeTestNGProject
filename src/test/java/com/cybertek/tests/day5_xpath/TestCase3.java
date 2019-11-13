package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        WebElement SearchInput= driver.findElement(By.id("searchInput"));
        SearchInput.sendKeys("selenium webdriver");
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
        WebElement searchResult = driver.findElement(By.xpath("//a[@title='Selenium (software)']"));
        searchResult.click();

        String expectedResult = "https://en.wikipedia.org/wiki/Selenium_(software";
        String actualResult =  driver.getCurrentUrl();

        if(expectedResult.equals(actualResult)){

            System.out.println("PASS");
        }else{

            System.out.println("FAİL");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedResult = " + expectedResult);
        }

    }
}
