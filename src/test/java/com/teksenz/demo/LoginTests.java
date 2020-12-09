package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1,testName = "Login test with valid user ans password")
    public void loginTest(){
        System.out.println("Login test with valid user ans password");
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(exp,act,"The words dont match");
    }

    @Test(priority = 2, testName = "Login test with invalid user ans password")
    public void loginWithInvalidUser(){
        System.out.println("Login test with invalid user");
        Assert.fail("Invalid user login test failed");
    }

    @Test(priority = 3,testName = "Verify home page title")
    public void homePageTest(){
        System.out.println("This is a home page test");
        String exp = "Homepage";
        String act ="Homepage";
        Assert.assertTrue(exp==act, "Homepage title is incorrect");
    }

    @Test(priority = 4, testName = "Verify logout")
    public void logOutTest(){
        System.out.println("This is a log out test");
    }

}
