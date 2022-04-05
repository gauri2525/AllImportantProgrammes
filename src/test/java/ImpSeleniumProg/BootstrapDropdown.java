package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.Set;

public class BootstrapDropdown {

    public static void main(String[] args) {

        // disable browser notification and launch chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);

        driver.get("https://www.hdfcbank.com/");

        //Allow cookies

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Object Cookie  : allCookies){
            System.out.println("HDFC site cookies are : " + Cookie);
            System.out.println("HDFC site total cookies are : " + allCookies.size());
        }

        driver.manage().window().maximize();
        WebElement closeSummerPopup= driver.findElement(By.xpath("//img[@class='closeSummer']"));
        closeSummerPopup.click();

    }
}
