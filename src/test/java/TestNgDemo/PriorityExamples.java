package TestNgDemo;

import org.testng.annotations.Test;

public class PriorityExamples {

    @Test (priority = 0)
    void testOne(){
        System.out.println("This is TestOne method");
    }

    @Test (priority = 1)
    void testTwo(){
        System.out.println("This is TestTwo method");
    }

    @Test (priority = 2,enabled = false)
    void testThree(){
        System.out.println("This is TestThree method");
    }

    @Test (priority = 3)
    void testFour(){
        System.out.println("This is TestFour method");
    }
}
