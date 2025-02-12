package org.example.services;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void end(){
        System.out.println("this will run after all test cases runs");
    }

    @BeforeEach
    public void beforeEachtt(){
        System.out.println("Before Each");
    }
    @AfterEach
    public  void afteree(){
        System.out.println("After Each");
    }

    @Test
    void addTest(){
        System.out.println("First test case");
        int res = Calculator.add(12,45);
        int exp = 57;
        Assertions.assertEquals(exp,res,"Test Case Failed");
    }

    @Test
    @Disabled
    void productTest(){
        System.out.println("Second Test case");
        int res = Calculator.product(2,5);
        int exp = 10;
        Assertions.assertEquals(exp,res);
    }
  
}