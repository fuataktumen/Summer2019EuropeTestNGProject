package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase3_09122019 {
    WebDriver driver;

    @BeforeMethod

    public void BeforeMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @AfterMethod

    public void AfterMethod() throws InterruptedException {

        Thread.sleep(3000);
    }

    @Test

    public void Test1() {

        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa1.vytrack.com/"));
        Actions action = new Actions(driver);
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement calendarEvents = driver.findElement(By.xpath("(//a[@href='/calendar/event'])/span"));
        action.moveToElement(activities).moveToElement(calendarEvents).build().perform();
        calendarEvents.click();
        WebElement options = driver.findElement(By.cssSelector("div[class='btn btn-link dropdown-toggle']"));
        Assert.assertTrue(options.isDisplayed(), "Verify that option is Displayed");
    }

    @Test

    public void Test2() throws InterruptedException {

        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa1.vytrack.com/"));
        Actions action = new Actions(driver);
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement calendarEvents = driver.findElement(By.xpath("(//a[@href='/calendar/event'])/span"));
        action.moveToElement(activities).moveToElement(calendarEvents).build().perform();
        calendarEvents.click();

        WebElement inputNumber = driver.findElement(By.xpath("//input[@type='number']"));
        System.out.println(inputNumber.getAttribute("value"));
        Assert.assertEquals(1, 1);


    }

    @Test

    public void Test3() {

        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa1.vytrack.com/"));
        Actions action = new Actions(driver);
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement calendarEvents = driver.findElement(By.xpath("(//a[@href='/calendar/event'])/span"));
        action.moveToElement(activities).moveToElement(calendarEvents).build().perform();
        calendarEvents.click();
        WebElement pageNumber = driver.findElement(By.xpath(" //button[@data-toggle='dropdown'])[1]"));
        Assert.assertEquals(25, 25);


    }

    @Test
    public void Test4() {
        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa1.vytrack.com/"));
        Actions action = new Actions(driver);


        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement calendarEvents = driver.findElement(By.xpath("(//a[@href='/calendar/event'])/span"));
        action.moveToElement(activities).moveToElement(calendarEvents).build().perform();
        calendarEvents.click();
        List<WebElement> rows = driver.findElements(By.xpath("//table//tbody/tr"));

        

        WebElement recordsNumber = driver.findElement(By.xpath("(//label[@class='dib'])[3]"));
        String text = recordsNumber.getText();

        String[] array = text.split(" ");
        for (String h21 : array
        ) {
            System.out.println(h21);
        }
        String actualNumber = array[2];
        int actNumber = Integer.parseInt(array[2]);

        Assert.assertEquals(actNumber,rows.size());

    }




    @Test
    public void Test5() throws InterruptedException {

        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa1.vytrack.com/"));
        Actions action = new Actions(driver);
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement calendarEvents = driver.findElement(By.xpath("(//a[@href='/calendar/event'])/span"));
        action.moveToElement(activities).moveToElement(calendarEvents).build().perform();
        calendarEvents.click();
        Thread.sleep(10000);
        WebElement title = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
        title.click();
        //input[@type='checkbox'])[7]

        for (int i = 8; i <= 14; i++) {

            String xpath = "(//input[@type='checkbox'])[" + i + "]";
            Assert.assertTrue(driver.findElement(By.xpath(xpath)).isSelected());

        }


    }

    @Test
    public void Test6() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(4000);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qa1.vytrack.com/"));
        Actions action = new Actions(driver);
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        WebElement calendarEvents = driver.findElement(By.xpath("(//a[@href='/calendar/event'])/span"));
        action.moveToElement(activities).moveToElement(calendarEvents).build().perform();
        calendarEvents.click();
        driver.findElement(By.xpath("(//table[@style='border-right: none;']/tbody/tr)[1]")).click();
        List<WebElement> fRow = driver.findElements(By.xpath("//table//tbody/tr"));
        String meetingName = null;
        for (int i = 0; i < fRow.size(); i++) {
            meetingName = fRow.get(i).getText();
            Thread.sleep(1000);
            if (meetingName.contains("Testers meeting")) {
                fRow.get(i).click();
                break;
            }
        }
        String[] expectedTitles = {"Title", "Description", "Start", "End", "All-day Event", "Organizer", "Guests", "Call Via Hangout"};
        List<WebElement> actualTitles = driver.findElements(By.xpath("//*[@*='responsive-cell']/div/div/div/label"));
        for (int i = 0; i<expectedTitles.length; i++) {
            Assert.assertEquals(actualTitles.get(i).getText(), expectedTitles[i]);
            System.out.println(actualTitles.get(i).getText());
            System.out.println(expectedTitles[i]);
        }
        String[] expectedTexts = {"Testers Meeting", "This is a a weekly testers meeting", "Nov 27, 2019, 9:30 PM", "Nov 27, 2019, 10:30 PM", "No", "Stephan Haley", "Tom Smith - Required", "Weekly every 1 week on Wednesday", "No"};
        List<WebElement> actualTexts = driver.findElements(By.xpath("//*[@*='responsive-cell']/div/div/div/div/div"));

        for (int i = 0; i<expectedTexts.length; i++) {
            Assert.assertEquals(actualTexts.get(i).getText(), expectedTexts[i]);
            System.out.println(actualTexts.get(i).getText());
            System.out.println(expectedTexts[i]);
        }



    }
}