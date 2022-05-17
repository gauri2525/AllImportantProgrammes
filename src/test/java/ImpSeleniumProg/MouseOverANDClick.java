package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseOverANDClick {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktopMenu=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));

        WebElement macOption= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions act= new Actions(driver);
        act.moveToElement(desktopMenu).moveToElement(macOption).click().perform();



    }
}
