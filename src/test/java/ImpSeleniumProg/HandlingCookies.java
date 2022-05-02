package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.Set;

public class HandlingCookies {

    public static void main(String[] args) {

        // disable browser notification and launch chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");

        //How to capture cookies from the browser?
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Total number of cookies " +cookies.size());

        //How to print cookies from the browser?
        for ( Cookie cookie: cookies){
            System.out.println(cookie.getName() +":"+ cookie.getValue());
        }

        //How to add cookie to the browser?
        //Adding 2 cookies
        Cookie cookieobje = new Cookie("Mycookie123" , "123456");
        Cookie cookieobje1 = new Cookie("Mycookie12345" , "123456");
        driver.manage().addCookie(cookieobje);
        driver.manage().addCookie(cookieobje1);
        cookies = driver.manage().getCookies();
        System.out.println("Total number of cookies after adding one more cookie " +cookies.size());

        //how to delete specific cookie from the browser?
        driver.manage().deleteCookie(cookieobje);
        cookies = driver.manage().getCookies();
        System.out.println("Total number of cookies after deletion " +cookies.size());

        //Deleting cookie using deleteCookieNamed() method
        driver.manage().deleteCookieNamed("Mycookie12345");
        cookies = driver.manage().getCookies();
        System.out.println("Total number of cookies after deletion " +cookies.size());

        //Deleting all cookies
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Total number of cookies after deleting all cookies " +cookies.size());
    }




}
