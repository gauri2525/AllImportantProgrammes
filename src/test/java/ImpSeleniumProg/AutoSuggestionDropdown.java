package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestionDropdown {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();

        //Inspect search box and enter "selenium" keyword and select selenium download option
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium");

        //Fetch all auto suggested options
        List<WebElement> autoOptions = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));

        System.out.println("Total auto suggested options are : " + autoOptions.size());


        for ( WebElement option:autoOptions){
            if(option.getText().contains("download")){
                option.click();
                break;
            }

        }


    }
}
