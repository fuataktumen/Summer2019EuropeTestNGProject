package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(1,1);

        System.out.println("Second Assertion");
        Assert.assertEquals("title","title");


    }

    @Test
    public void test2(){
     String actualTitle = "Cybertek" ;
     String expectedTitle = "C";
        System.out.println("First Assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with C");



    }
    @Test
    public void test3(){
        String email= "faktumen@gmail.com";
        String expectedMail= "@";
        Assert.assertTrue(email.contains(expectedMail),"Verify email contains @");



    }


}
