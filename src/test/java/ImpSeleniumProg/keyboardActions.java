package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class keyboardActions {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();

        Actions act= new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.SPACE).perform();
        Thread.sleep(3000);

        driver.quit();


    }
}
