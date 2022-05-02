package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleLinks {

    public static void main(String[] args) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();

        // click on Today's Deal link using LinkText() or PartialLinkTet() methods
         //driver.findElement(By.linkText("Today's Deals")).click();
         //driver.findElement(By.partialLinkText("Deals")).click();
        //driver.close();

        //How to capture all the links
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links on the page are: " + links.size());
        for ( WebElement link:links ){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }


    }
}
