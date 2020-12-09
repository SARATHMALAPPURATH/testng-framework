package com.teksenz.demo;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1,testName = "Login test with valid user ans password")
    public void loginTest(){
        System.out.println("Login test with valid user ans password");
    }

    @Test(priority = 2, testName = "Login test with valid user ans password")
    public void loginWithInvalidUser(){
        System.out.println("Login test with invalid user");
    }

    @Test(priority = 3,testName = "Verify home page title")
    public void homePageTest(){
        System.out.println("This is a home page test");
    }

    @Test(priority = 4, testName = "Verify logout")
    public void logOutTest(){
        System.out.println("This is a log out test");
    }

}
