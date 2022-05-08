package TestNgDemo;

import org.testng.annotations.*;

public class TC1 {

    @BeforeSuite
    void beforeTestSuite(){
        System.out.println("this method will execute before the Test Suite");
    }

    @AfterSuite
    void afterTestSuite(){
        System.out.println("this method will execute after the Test Suite");
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

}

