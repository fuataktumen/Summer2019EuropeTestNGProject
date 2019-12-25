package com.cybertek.tests.homework;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 extends TestBase {

    LoginPage LG = new LoginPage();
    String username= ConfigurationReader.get("user_name");
    String password = ConfigurationReader.get("password");



}
