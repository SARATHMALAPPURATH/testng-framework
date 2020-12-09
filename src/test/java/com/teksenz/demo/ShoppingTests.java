package com.teksenz.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTests {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before shopping Class executed...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Shopping Class method executed...");
    }
    @Test
    public void productSearch(){
        System.out.println("searching for a product");
    }
    @Test
    public void addProductToShoppingCart(){
        System.out.println("Adding to product to shopping cart");
    }

}
