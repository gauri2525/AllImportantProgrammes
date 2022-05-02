package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AutoCompleteGooglePlaceDropdown {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();

         //Clicking on the Live posting FAQ link
        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

        //Inspect autocomplete search box
        WebElement searchBox= driver.findElement(By.id("autocomplete"));

        searchBox.clear();

        searchBox.sendKeys("Toronto");
        Thread.sleep(3000);

        String text;

        do
        {searchBox.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(3000);
           text=searchBox.getAttribute("value");
            if(text.equals("Toronto, OH, USA")){
                searchBox.sendKeys(Keys.ENTER);
                break;
            }
            Thread.sleep(3000);
        }
        while(!text.isEmpty());

        driver.close();
    }
}
