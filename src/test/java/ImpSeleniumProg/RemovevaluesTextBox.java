package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RemovevaluesTextBox {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter Text into search box
        WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys("QA Interview question");
        Thread.sleep(5000);

        // Remove value present in the search box using clear() method
        searchbox.clear();

        //Again enter new value into the search box
        searchbox.sendKeys("Selenium Interview question");
        Thread.sleep(5000);

        // Remove value present in the search box without using clear() method
        searchbox.sendKeys(Keys.CONTROL + "a" + Keys.DELETE
        );

        // Verify Tooltip of Google Apps link.

        WebElement googleappslink = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));

        String Actualtooltip = googleappslink.getAttribute("aria-label");
        String Expectedtooltip = "Google Apps";

        if (Expectedtooltip.equalsIgnoreCase(Actualtooltip)) {

            System.out.println("Tooltip of Google apps link is correctly displayed");
        } else {
            System.out.println("Tooltip of Google apps link is incorrectly displayed");
        }

        System.out.println("Actual Google App link's tooltip is " + Actualtooltip);

        // Verify SearchBox Text Box is enabled or not

        if (searchbox.isDisplayed()) {
            System.out.println("SearchBox is displayed correctly");
            if (searchbox.isEnabled()) {
                System.out.println("SearchBox is enabled");
            } else {
                System.out.println("SearchBox is disabled");
            }
        } else {
            System.out.println("SearchBox is not displayed");
        }


        // Verify Google app link is a link or not.
        String googleappslink_tag_name = googleappslink.getTagName();
        if (googleappslink_tag_name.equals("a")){
            System.out.println("googleappslink is a link");

        }
        else{
            System.out.println("googleappslink is not a link");
        }
    }
}