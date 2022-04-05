package TestNgDemo;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority=1)
    void setup() {
        System.out.println("opening browser");

    }

    @Test(priority=2)
    void login() {

        System.out.println("login into application");
    }

    @Test(priority=3)
    void teardown() {

        System.out.println("closing browser");

    }
}
