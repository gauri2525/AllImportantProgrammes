package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ActiveElementMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://omayo.blogspot.com/");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys("QA JOB openings");  //

        //WebElement searchbox= driver.findElement(By.xpath("//input[@name='q']"));
        //searchbox.sendKeys("QA Interview question");


    }
}
