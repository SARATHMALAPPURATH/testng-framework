package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite executed");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite executed");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test executed");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test executed");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class method executed...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class method executed...");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method executed...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method executed...");
    }

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
