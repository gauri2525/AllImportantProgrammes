package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class InnerFrames {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        WebElement iframeButton=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        iframeButton.click();

        //Inspect outer frame and switch on it
        WebElement outerFrame= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);

        //Inspect inner frame and switch in it
        WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);

        //Inspect text element inside frame and enter text into it
        WebElement textElement=driver.findElement(By.xpath("//input[@type='text']"));
        textElement.sendKeys("welcome");

    }
}
