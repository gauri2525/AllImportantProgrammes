package TestNgDemo;

import org.testng.annotations.*;

public class TC2 {

    @BeforeTest
    void beforeTest(){
        System.out.println("this method will execute before the test");
    }

    @AfterClass
    void afterTest(){
        System.out.println("this method will execute after the test");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("this method will execute before the class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this method will execute after the class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this method will execute before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this method will execute after every test method");
    }

    @Test
    void test3(){

        System.out.println("this is test3 function");
    }

    @Test
    void test4(){

        System.out.println("this is test4 function");
    }
}

